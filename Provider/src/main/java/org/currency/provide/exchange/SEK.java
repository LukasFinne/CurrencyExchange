package org.currency.provide.exchange;

import org.currency.exchange.ExchangeRate;
import org.currency.provide.menu.ExchangeMenu;

import java.util.HashMap;

public class SEK implements ExchangeRate {

    @Override
    public HashMap<String, Double> rate() {
        HashMap<String,Double> map = new HashMap<>();
        map.put("USD",0.10617149);
        map.put("EUR", 0.097307791);
        return map;
    }

    @Override
    public void startExchange() {
        ExchangeMenu exchangeMenu = new ExchangeMenu(this);
        exchangeMenu.execute();
    }
}
