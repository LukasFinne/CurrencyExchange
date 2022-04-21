package org.currency.provide.sek;

import org.currency.exchange.ExchangeRate;

import java.util.HashMap;

public class ToUSD implements ExchangeRate {
    @Override
    public HashMap<String, Double> Rate() {
        HashMap<String,Double> map = new HashMap<>();
        map.put("USD",0.10617149);
        return map;
    }
}
