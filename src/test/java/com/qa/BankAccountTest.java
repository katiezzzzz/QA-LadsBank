package com.qa;

import com.qa.exceptions.InvalidAmountException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CurrentAccountTest {

//    TEST BELOW IS FINISHED AND WORKING CORRECTLY
    @Test
    @DisplayName("Add new account balance")
    public void add_new_account_balance_results_in_new_user_balance() {
//        Triple 'A' pattern - Arrange, Act, Assert
        double expectedBalance = 10.30;
        double minBalance = 2.50;
        String name = "Harry Potter";

        CurrentAccount testAccount = new CurrentAccount(expectedBalance, minBalance, name);

        double actualBalance = testAccount.getBalance();

        assertEquals(expectedBalance, actualBalance);
    }


    @Test
    @DisplayName("Add new account minimum balance")
    public void add_new_account_minimum_balance_results_in_new_user_minimum_balance() {

        double balance = 10.30;
        double expectedMinBalance = 2.50;
        String name = "Harry Potter";

        CurrentAccount testAccount = new CurrentAccount(balance, expectedMinBalance, name);

        double actualMinBalance= testAccount.getMinimumBalance();

        assertEquals(expectedMinBalance, actualMinBalance);
    }

//    TEST BELOW IS FINISHED AND RUNS CORRECTLY
        @Test
        @DisplayName("Add new account name")
        public void add_new_account_name_results_in_new_user_name() {

            double balance = 10.30;
            double minBalance = 2.50;
            String expectedAccountName = "Harry Potter";

            CurrentAccount testAccount = new CurrentAccount(balance, minBalance, expectedAccountName);

            String actualName = testAccount.getAccountHolderName();

            assertEquals(expectedAccountName, actualName);
        }

//        TEST BELOW IS FINISHED AND RUNS CORRECTLY
    @Test
    @DisplayName("Successful withdraw")
    public void successful_withdraw_amount_results_in_less_money() throws InvalidAmountException {

        double balance = 100.30;
        double minBalance = 2.50;
        String name = "Harry Potter";

        CurrentAccount testAccount = new CurrentAccount(balance, minBalance, name);

        String actualMessage = testAccount.withdraw(40.30);

        assertEquals("Withdraw successful", actualMessage);
    }

    @Test
    @DisplayName("Unsuccessful withdraw - invalid withdraw amount")
    public void unsuccessful_withdraw_invalid_negative_withdraw_amount_results_in_same_balance() throws InvalidAmountException{
        double balance = 100.30;
        double minBalance = 20 ;
        String name = "Harry Potter";

        final CurrentAccount testAccount = new CurrentAccount(balance, minBalance, name);

        final double withdrawAmount = -10;

        assertThrows(InvalidAmountException.class, () -> testAccount.withdraw(withdrawAmount));

    }


    @Test
    @DisplayName("Unsuccessful withdraw - not enough balance")
    public void unsuccessful_withdraw_not_enough_balance_results_in_same_balance() throws InvalidAmountException {

        double balance = 20;
        double minBalance = 5;
        String name = "Harry Potter";

        CurrentAccount testAccount = new CurrentAccount(balance, minBalance, name);


        assertThrows(InvalidAmountException.class, () -> testAccount.withdraw(40));
    }

    @Test
    @DisplayName("Successful Deposit")
    public void successful_deposit_positive_value() throws InvalidAmountException {

        double balance = 20;
        double minBalance = 20;
        String name = "Harry Potter";

        CurrentAccount testAccount = new CurrentAccount(balance, minBalance, name);

        double depositAmount = 10;
        String actualMessage = testAccount.deposit(depositAmount);
        String expectedMessage = "Deposit Successful!";

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    @DisplayName("Unsuccessful Deposit")
    public void unsuccessful_deposit_negative_or_zero_amount() throws InvalidAmountException{
        double balance = 20;
        double minBalance = 20;
        String name = "Harry Potter";

        CurrentAccount testAccount = new CurrentAccount(balance, minBalance, name);

        assertThrows(InvalidAmountException.class, () -> testAccount.deposit(-10));


    }
}
