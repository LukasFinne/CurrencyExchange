package org.currency.provide.exchange;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ExchangeRateTests {

    @Test
    void SEKToUSDExchangeCorrectAmount(){
        SEK exchange = new SEK();
        double SEK = 10.0;
        var sum = SEK*exchange.rate().get("USD");
        assertThat(sum).isEqualTo(1.0617149);
    }

}
