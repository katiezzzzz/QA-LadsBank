package com.qa;

import com.qa.exceptions.InvalidAmountException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SavingsAccountTest {

    @Test
    @DisplayName("Add new account check interest rate")
    public void add_new_savings_account() {
        double Balance = 10.30;
        double minBalance = 2.50;
        String name = "Harry Potter";
        double expectedInterestRate = 2;

        SavingsAccount testAccount = new SavingsAccount(Balance, minBalance, name);

        double actualInterestRate = testAccount.getInterestRate();

        assertEquals(expectedInterestRate, actualInterestRate);
    }

    @Test
    @DisplayName("Add new account set and check interest rate")
    public void add_new_savings_account_and_set_interest_rate() {
        double Balance = 10.30;
        double minBalance = 2.50;
        String name = "Harry Potter";
        double expectedInterestRate = 5;

        SavingsAccount testAccount = new SavingsAccount(Balance, minBalance, name, expectedInterestRate);

        double actualInterestRate = testAccount.getInterestRate();

        assertEquals(expectedInterestRate, actualInterestRate);
    }


}
