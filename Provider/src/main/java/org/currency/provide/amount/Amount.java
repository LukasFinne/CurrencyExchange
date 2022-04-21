package org.currency.provide.amount;

import org.currency.amount.CurrencyAmount;

public class Amount implements CurrencyAmount {
    @Override
    public double amount(double amount) {
        return amount;
    }
}
