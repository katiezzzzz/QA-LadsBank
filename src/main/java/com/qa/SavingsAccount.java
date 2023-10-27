package com.qa;

import com.qa.exceptions.InvalidAmountException;
import com.qa.exceptions.NotEnoughBalanceException;

public class SavingsAccount extends BankAccount {
//    constructor calls parent
    public SavingsAccount(double balance, double minimumBalance, String accountHolderName, double interestRate) {
        super(balance, minimumBalance, accountHolderName);
        this.interestRate = interestRate;
    }

//    create interest rate
    private double interestRate = 3;

//    getter interest rate
    public double getInterestRate() {
        return interestRate;
    }

//    setter interest rate
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

//    withdraw abstract method overriden
    @Override
    public String withdraw(double withdrawAmount) throws NotEnoughBalanceException, InvalidAmountException {
        double currentBalance = this.getBalance();
        if (withdrawAmount <= 0)
            throw new InvalidAmountException("Sorry, the amount you are withdrawing is invalid");
        if (currentBalance <= withdrawAmount)
            throw new NotEnoughBalanceException(String.format("Sorry, you don't have enough money in your account and your current balance is: %.2f", this.getBalance()));
        this.setBalance(currentBalance - withdrawAmount);
        return "Withdraw successful";
    }

//    interest rate

//    decrease rate by 50% if withdraw over amount

//    no maximum withdraw
}
