package org.currency.provide.convert;

import org.currency.provide.amount.Amount;
import org.currency.provide.exchange.SEK;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CurrencyConverterTest {

    @Test
    void convertMethodMultipliesCorrectly(){
     CurrencyConverter currencyConverter = new CurrencyConverter();

     assertThat(currencyConverter.convert(10,10)).isEqualTo(100);
    }

    @Test
    void convertMethodConvertToCorrectExchange(){
        CurrencyConverter currencyConverter = new CurrencyConverter();
        Amount SEK = new Amount();
        SEK exchange = new SEK();

        assertThat(currencyConverter.convert(SEK.amount(10),exchange.rate().get("USD"))).isEqualTo(1.0617149);
    }
}
