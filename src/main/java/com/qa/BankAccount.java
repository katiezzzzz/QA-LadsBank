package com.qa;

import com.qa.exceptions.InvalidWithdrawException;
import com.qa.exceptions.NotEnoughBalanceException;

import java.io.NotActiveException;

public class BankAccount {
    public BankAccount() {
        this(0, 0, "Unknown");
    }
    public BankAccount(double balance, double minimumBalance, String accountHolderName) {
        this.balance = balance;
        this.minimumBalance = minimumBalance;
        this.accountHolderName = accountHolderName;
    }

    double balance;
    double minimumBalance;
    String accountHolderName;



    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }
    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String withdraw(double amount) throws NotEnoughBalanceException, InvalidWithdrawException {
        double currentBalance = this.getBalance();
        if (amount <= 0)
            throw new InvalidWithdrawException("Sorry, the amount you are withdrawing is invalid");
        if (currentBalance <= amount)
            throw new NotEnoughBalanceException(String.format("Sorry, you don't have enough money in your account and your current balance is: %.2f", this.getBalance()));
        this.setBalance(currentBalance - amount);
        return "Withdraw successful";
    }
    public static String deposit(double depositAmount) throws InvalidWithdrawException {
        return "Deposit Successful!";
    }
}
