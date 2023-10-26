package com.qa;

import com.qa.exceptions.InvalidWithdrawException;
import com.qa.exceptions.NotEnoughBalanceException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BankAccountTest {

//    TEST BELOW IS FINISHED AND WORKING CORRECTLY
    @Test
    public void add_new_account_balance_results_in_new_user_balance() {
//        Triple 'A' pattern - Arrange, Act, Assert
        double expectedBalance = 10.30;
        double minBalance = 2.50;
        String name = "Harry Potter";

        BankAccount testAccount = new BankAccount(expectedBalance, minBalance, name);

        double actualBalance = testAccount.getBalance();

        assertEquals(expectedBalance, actualBalance);
    }

//    TEST BELOW HAS CORRECT NAME BUT OTHERWISE IS UNFINISHED
//    @Test
//    public void add_new_account_minimum_balance_results_in_new_user_minimum_balance() {
////        Triple 'A' pattern - Arrange, Act, Assert
//        double balance = 10.30;
//        double minBalance = 2.50;
//        String expectedAccountName = "Harry Potter";
//
//        BankAccount testAccount = new BankAccount(balance, minBalance, expectedAccountName);
//
//        String actualName = testAccount.getAccountHolderName();
//
//        assertEquals(expectedAccountName, actualName);
//    }

//    TEST BELOW IS FINISHED AND RUNS CORRECTLY
        @Test
        public void add_new_account_name_results_in_new_user_name() {
//        Triple 'A' pattern - Arrange, Act, Assert
            double balance = 10.30;
            double minBalance = 2.50;
            String expectedAccountName = "Harry Potter";

            BankAccount testAccount = new BankAccount(balance, minBalance, expectedAccountName);

            String actualName = testAccount.getAccountHolderName();

            assertEquals(expectedAccountName, actualName);
        }

//        TEST BELOW IS FINISHED AND RUNS CORRECTLY
    @Test
    public void successful_withdraw_amount_results_in_less_money() throws InvalidWithdrawException, NotEnoughBalanceException {
//        Triple 'A' pattern - Arrange, Act, Assert
        double balance = 100.30;
        double minBalance = 2.50;
        String name = "Harry Potter";

        BankAccount testAccount = new BankAccount(balance, minBalance, name);

        String actualMessage = testAccount.withdraw(40.30);

        assertEquals("Withdraw successful", actualMessage);
    }
// TEST BELOW IS MOSTLY FINISHED BUT SHOULD CORRECTLY TEST FOR ERROR THROWN INSTEAD OF ASSERT EQUALS
    @Test
    public void unsuccessful_withdraw_invalid_negative_withdraw_amount_results_in_same_balance() throws InvalidWithdrawException, NotEnoughBalanceException {
//        Triple 'A' pattern - Arrange, Act, Assert
        double balance = 100.30;
        double minBalance = 20 ;
        String name = "Harry Potter";

        final BankAccount testAccount = new BankAccount(balance, minBalance, name);

        final double withdrawAmount = -10;

        assertThrows(InvalidWithdrawException.class, () -> testAccount.withdraw(withdrawAmount));

//        String actualMessage = testAccount.withdraw(withdrawAmount);

//        assertEquals("Sorry, the amount you are withdrawing is invalid", actualMessage);

    }

// TEST BELOW HAS CORRECT NAME BUT NOT YET FINISHED

//    @Test
//    public void unsuccessful_withdraw_not_enough_balance_results_in_same_balance() throws InvalidWithdrawException, NotEnoughBalanceException {
////        Triple 'A' pattern - Arrange, Act, Assert
//        double balance = 100.30;
//        double minBalance = ;
//        String name = "Harry Potter";
//
//        BankAccount testAccount = new BankAccount(balance, minBalance, name);
//
//        String actualMessage = testAccount.withdraw(40.30);
//
//        assertEquals(, actualMessage);
//    }
}
