package org.currency.provide.amount;

import org.currency.exchange.ExchangeRate;
import org.currency.provide.exchange.SEK;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AmountTest {

    @Test
    void AmountReturnsCorrectValue() {
        Amount a = new Amount();
        assertThat(a.amount(200)).isEqualTo(200);
    }

    @Test
    void FromSEKToUSDExchangeCorrectlyWithAmountMethod() {
        Amount sek = new Amount();
        ExchangeRate exchange = new SEK();
        double money = sek.amount(10) * exchange.rate().get("USD");

        assertThat(money).isEqualTo(1.0617149);

    }
}
