package org.currency.provide.sek;

import org.currency.currency.ExchangeRate;

import java.util.HashMap;

public class USD implements ExchangeRate {
    @Override
    public HashMap<String, Double> Rate() {
        HashMap<String,Double> map = new HashMap<>();
        map.put("USD",0.10558);
        return map;
    }
}
