package com.pkrueger;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Hashtable;

/**
 * Created by pkrueger on 4/8/2015.
 */
public class Bank {

    private Hashtable<Pair, Integer> rates = new Hashtable<Pair, Integer>();

    public Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    public void addRate(String fromCurrency, String toCurrency, int rate) {
        rates.put(new Pair(fromCurrency, toCurrency), new Integer(rate));
    }

    public int rate(String fromCurrency, String toCurrency) {
        if(fromCurrency.equals(toCurrency))
            return 1;
        Integer rate = (Integer) rates.get(new Pair(fromCurrency, toCurrency));
        return rate.intValue();
    }
}
