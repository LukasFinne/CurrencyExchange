package org.currency.provide.sek;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ExchangeRateTests {

    @Test
    void SEKToUSDExchangeCorrectAmount(){
        ToUSD usd = new ToUSD();
        double SEK = 10.0;
        var sum = SEK*usd.Rate().get("USD");
        assertThat(sum).isEqualTo(1.0617149);
    }

}
