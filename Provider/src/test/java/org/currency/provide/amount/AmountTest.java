package org.currency.provide.amount;

import org.currency.provide.sek.ToUSD;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AmountTest {

    @Test
    void AmountReturnsCorrectValue(){
        Amount a = new Amount();
        assertThat(  a.amount(200)).isEqualTo(200);
    }

    @Test
    void FromSEKToUSDExchangeCorrectlyWithAmountMethod(){
        Amount sek = new Amount();
        ToUSD usd = new ToUSD();
        double money = sek.amount(10)*usd.Rate().get("USD");

        assertThat(money).isEqualTo(1.0617149);

    }
}
