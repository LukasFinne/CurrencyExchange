import org.currency.exchange.ExchangeRate;
import org.currency.provide.sek.ToUSD;

module org.currency.provider {
    requires org.currency.currencies;
    provides ExchangeRate with ToUSD;
}