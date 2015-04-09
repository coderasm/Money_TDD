package com.pkrueger;

/**
 * Created by pkrueger on 4/8/2015.
 */
public class Money implements Expression {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && currency.equals(money.currency());
    }

    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    public String currency() {
        return currency;
    }

    public Expression times(int multiplier) {

        return new Money(amount * multiplier, currency);
    }

    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }

    public String toString() {
        return amount + " " + currency;
    }

    @Override
    public Money reduce(Bank bank, String toCurrency) {
        int rate = bank.rate(currency, toCurrency);
        return new Money(amount/rate, toCurrency);
    }
}
