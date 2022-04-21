package org.currency.provide.convert;

import org.currency.provide.amount.Amount;
import org.currency.provide.sek.ToUSD;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ConvertTest {

    @Test
    void convertMethodMultipliesCorrectly(){
     Convert convert = new Convert();

     assertThat(convert.convert(10,10)).isEqualTo(100);
    }

    @Test
    void convertMethodConvertToCorrectExchange(){
        Convert convert = new Convert();
        Amount amount = new Amount();
        ToUSD usd = new ToUSD();

        assertThat(convert.convert(amount.amount(10),usd.Rate().get("USD"))).isEqualTo(1.0617149);
    }
}
