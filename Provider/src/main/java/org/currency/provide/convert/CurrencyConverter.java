package org.currency.provide.convert;

import org.currency.convert.CurrencyConversion;

public class CurrencyConverter implements CurrencyConversion {
    @Override
    public double convert(double amount, double rate) {
        return amount * rate;
    }
}
