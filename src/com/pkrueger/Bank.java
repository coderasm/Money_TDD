package com.pkrueger;

/**
 * Created by pkrueger on 4/8/2015.
 */
public class Bank {
    public Money reduce(Expression source, String to) {
        return source.reduce(to);
    }

    public void addRate(String toCurrency, String fromCurrency, int ratio) {

    }
}
