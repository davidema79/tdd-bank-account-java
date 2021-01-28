package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
	//@Disabled
    public void depositAnAmountToIncreaseTheBalance() {
        final Account account = new Account();

        final Money newTotal= account.deposit(Money.getInstance("100"));

        assertThat(newTotal).isNotNull().isEqualTo(Money.getInstance("100"));
    }
}
