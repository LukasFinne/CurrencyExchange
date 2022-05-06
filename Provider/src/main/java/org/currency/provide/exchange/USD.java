package org.currency.provide.exchange;

import org.currency.exchange.ExchangeRate;
import org.currency.provide.menu.ExchangeMenu;

import java.util.HashMap;

public class USD implements ExchangeRate {
    @Override
    public HashMap<String, Double> rate() {
        HashMap<String, Double> map = new HashMap<>();
        map.put("SEK", 9.4920949);
        map.put("EUR", 0.92397515);
        return map;
    }

    @Override
    public void startExchange() {
        ExchangeMenu exchangeMenu = new ExchangeMenu(this);
        exchangeMenu.execute();
    }
}
