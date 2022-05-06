package org.currency.consumer;

import org.currency.exchange.ExchangeRate;
import org.currency.menu.Command;

import java.util.ServiceLoader;
import java.util.ServiceLoader.Provider;

public class Main {
    public static void main(String[] args) {
        ServiceLoader<ExchangeRate> serviceLoader = ServiceLoader.load(ExchangeRate.class);

        serviceLoader.stream().map(ServiceLoader.Provider::get)
                .filter(exchangeRate -> exchangeRate.getClass().getSimpleName().startsWith("USD"))
                .findFirst().ifPresent(ExchangeRate::startExchange);

    }
}