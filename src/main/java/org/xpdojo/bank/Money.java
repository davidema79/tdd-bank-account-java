package org.xpdojo.bank;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Objects;

/**
 * Immutable class to represent Money as a concept.
 * This class should have no accessor methods.
 */
public class Money {
    private final BigDecimal amount;
    private final Currency currency;

    public static Money getInstance(String amount){
        return new Money(new BigDecimal(amount));
    }

    public Money(BigDecimal amount){
        this.amount = amount;
        this.currency = Currency.getInstance("GBP");
    }

    public Currency getCurrency() {
        return currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return Objects.equals(amount, money.amount) && Objects.equals(currency, money.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency);
    }
}
