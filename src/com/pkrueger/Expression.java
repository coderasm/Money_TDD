package com.pkrueger;

/**
 * Created by pkrueger on 4/8/2015.
 */
public interface Expression {
    Money reduce(String toCurrency);
}
