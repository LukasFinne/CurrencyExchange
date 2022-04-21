package org.currency.provide.exchange;

import org.currency.exchange.ExchangeRate;

import java.util.HashMap;

public class SEK implements ExchangeRate {
    @Override
    public HashMap<String, Double> rate() {
        HashMap<String,Double> map = new HashMap<>();
        map.put("USD",0.10617149);
        return map;
    }
}