package com.qa;

import com.qa.exceptions.InvalidAmountException;

public class SavingsAccount extends BankAccount {
//    constructor calls parent
    public SavingsAccount(double balance, double minimumBalance, String accountHolderName) {
        this(balance, minimumBalance, accountHolderName, 2);
    }
    public SavingsAccount(double balance, double minimumBalance, String accountHolderName, double interestRate) {
        super(balance, minimumBalance, accountHolderName);
        this.setInterestRate(interestRate);
    }

//    create interest rate
    private double interestRate;

//    getter interest rate
    public double getInterestRate() {
        return interestRate;
    }

//    setter interest rate
    public void setInterestRate(double interestRate) {
        if (interestRate >= 0) {
            this.interestRate = interestRate;
        }
    }

//    withdraw abstract method overriden
    @Override
    public String withdraw(double withdrawAmount) throws InvalidAmountException {
        double currentBalance = this.getBalance();
        if (withdrawAmount <= 0 || withdrawAmount > (this.getBalance() - this.getMinimumBalance()))
            throw new InvalidAmountException("Sorry, the amount you are withdrawing is invalid");
        this.setBalance(currentBalance - withdrawAmount);
        double originalInterestRate = this.getInterestRate();
        this.setInterestRate(0.5 * originalInterestRate);
        return String.format("Withdraw successful and your interest rate has gone down from %.2f", originalInterestRate)
                + "%" + String.format(" to %.2f", this.getInterestRate()) + "%";
    }

//    interest rate

//    decrease rate by 50% if withdraw over amount

//    no maximum withdraw
}
