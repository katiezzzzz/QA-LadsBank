package com.qa;

import com.qa.exceptions.InvalidAmountException;

public abstract class BankAccount {
    public BankAccount() {
        this(0, 0, "Unknown");
    }
    public BankAccount(double balance, double minimumBalance, String accountHolderName) {
        this.balance = balance;
        this.minimumBalance = minimumBalance;
        this.accountHolderName = accountHolderName;
    }

    private double balance;
    private double minimumBalance;
    private String accountHolderName;
    private double maxWithdrawAmount = this.getBalance() - this.getMinimumBalance();

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

    public double getMaxWithdrawAmount() {
        return maxWithdrawAmount;
    }
    public void setMaxWithdrawAmount(double maxWithdrawAmount) {
        this.maxWithdrawAmount = maxWithdrawAmount;
    }

    public abstract String withdraw(double withdrawAmount) throws InvalidAmountException;

    public String deposit(double depositAmount) throws InvalidAmountException {
        if (depositAmount <= 0)
            throw new InvalidAmountException("Sorry, the amount you are withdrawing is invalid");
        return "Deposit Successful!";
    }


}
