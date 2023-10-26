package com.qa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BankAccountTest {
        @Test
        public void add_new_account_results_in_new_user() {
//        Triple 'A' pattern - Arrange, Act, Assert
            double balance = 10.30;
            double minBalance = 2.50;
            String expectedAccountName = "Harry Potter";

            BankAccount testAccount = new BankAccount(balance, minBalance, expectedAccountName);

            String actualName = testAccount.getAccountHolderName();

            assertEquals(expectedAccountName, actualName);
        }
}
