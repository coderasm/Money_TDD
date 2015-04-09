package com.pkrueger;

/**
 * Created by pkrueger on 4/8/2015.
 */
public interface Expression {
    Money reduce(Bank bank, String toCurrency);

    Expression plus(Expression addend);

    Expression times(int multiplier);
}
