package org.currency.provide.exchange;

import org.currency.exchange.ExchangeRate;
import org.currency.provide.menu.ExchangeMenu;

import java.util.HashMap;

public class EUR implements ExchangeRate {
    @Override
    public HashMap<String, Double> rate() {
        HashMap<String, Double> map = new HashMap<>();
        map.put("SEK", 10.275977);
        map.put("USD", 1.0820597);
        return map;
    }

    @Override
    public void startExchange() {
        ExchangeMenu exchangeMenu = new ExchangeMenu(this);
        exchangeMenu.execute();
    }
}
