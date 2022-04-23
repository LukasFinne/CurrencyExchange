package org.currency.provide.exchange;

import org.currency.exchange.ExchangeRate;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ExchangeRateTests {

    @Test
    void SEKToUSDExchangeCorrectAmount(){
        ExchangeRate exchange = new SEK();
        double SEK = 10.0;
        var sum = SEK*exchange.rate().get("USD");
        assertThat(sum).isEqualTo(1.0617149);
    }

    @Test
    void SEKToEURExchangeCorrectAmount() {
        ExchangeRate exchange = new SEK();
        double SEK = 10.0;
        var sum = SEK * exchange.rate().get("EUR");
        assertThat(sum).isEqualTo(0.97307791);
    }

    @Test
    void USDToEURExchangeCorrectAmount() {
        ExchangeRate exchange = new USD();
        double USD = 10.0;
        var sum = USD * exchange.rate().get("EUR");
        assertThat(sum).isEqualTo(9.2397515);
    }

    @Test
    void USDToSEKExchangeCorrectAmount() {
        ExchangeRate exchange = new USD();
        double USD = 10.0;
        var sum = USD * exchange.rate().get("SEK");
        assertThat(sum).isEqualTo(94.920949);
    }

    @Test
    void EURToSEKExchangeCorrectAmount() {
        ExchangeRate exchange = new EUR();
        double EUR = 10.0;
        var sum = EUR * exchange.rate().get("SEK");
        assertThat(sum).isEqualTo(102.75976999999999);
    }

    @Test
    void EURToUSDExchangeCorrectAmount() {
        ExchangeRate exchange = new EUR();
        double EUR = 10.0;
        var sum = EUR * exchange.rate().get("USD");
        assertThat(sum).isEqualTo(10.820597000000001);
    }


}
