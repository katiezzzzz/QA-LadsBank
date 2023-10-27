package com.qa;

import com.qa.exceptions.InvalidAmountException;
import com.qa.exceptions.NotEnoughBalanceException;

import java.io.NotActiveException;

public abstract class BankAccount {
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

    public abstract String withdraw(double withdrawAmount) throws NotEnoughBalanceException, InvalidAmountException;

    public String deposit(double depositAmount) throws InvalidAmountException {
        if (depositAmount <= 0)
            throw new InvalidAmountException("Sorry, the amount you are withdrawing is invalid");
        return "Deposit Successful!";
    }
}
