import org.currency.currency.ExchangeRate;
import org.currency.provide.sek.USD;

module org.currency.provider {
    requires org.currency.currencies;
    provides ExchangeRate with USD;
}