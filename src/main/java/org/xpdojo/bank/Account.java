package org.xpdojo.bank;

import java.math.BigDecimal;

public class Account {

    private Money balance = Money.getInstance("0");

    public Money deposit(final Money money) {
        if(money.getAmount().compareTo(BigDecimal.ZERO) < 0){
            throw new IllegalArgumentException("Negative amount of money cannot be deposited.");
        }
        final BigDecimal newAmount = balance.getAmount().add(money.getAmount());
        balance = new Money(newAmount);
        return balance;
    }

}
