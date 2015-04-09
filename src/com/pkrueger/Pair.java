package com.pkrueger;

/**
 * Created by pkrueger on 4/9/2015.
 */
public class Pair {
    private String fromCurrency;
    private String toCurrency;

    Pair(String fromCurrency, String toCurrency) {
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
    }

    public  boolean equals(Object object) {
        Pair pair = (Pair) object;
        return fromCurrency.equals(pair.fromCurrency) && toCurrency.equals(pair.toCurrency);
    }

    public int hashCode() {
        return 0;
    }
}
