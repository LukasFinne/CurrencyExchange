import org.currency.amount.CurrencyAmount;
import org.currency.convert.CurrencyConversion;
import org.currency.exchange.ExchangeRate;
import org.currency.provide.amount.Amount;
import org.currency.provide.convert.CurrencyConverter;
import org.currency.provide.exchange.EUR;
import org.currency.provide.exchange.SEK;
import org.currency.provide.exchange.USD;

module org.currency.provider {
    exports org.currency.provide.amount;
    exports org.currency.provide.exchange;
    requires org.jetbrains.annotations;
    requires org.currency.currencies;
    provides ExchangeRate with SEK, USD, EUR;
    provides CurrencyAmount with Amount;
    provides CurrencyConversion with CurrencyConverter;
}