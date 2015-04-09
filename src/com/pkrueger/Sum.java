package com.pkrueger;

/**
 * Created by pkrueger on 4/8/2015.
 */
public class Sum implements Expression {
    public Money augend;
    public Money addend;

    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(String toCurrency) {
        int amount = augend.amount + addend.amount;
        return new Money(amount, toCurrency);
    }
}
