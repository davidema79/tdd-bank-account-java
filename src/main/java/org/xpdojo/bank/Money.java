package org.xpdojo.bank;

import java.math.BigDecimal;
import java.util.Currency;

/**
 * Immutable class to represent Money as a concept.
 * This class should have no accessor methods.
 */
public class Money {
    final BigDecimal amount;
    final Currency currency;

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
}
