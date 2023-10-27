package com.qa;

import com.qa.exceptions.InvalidAmountException;
import com.qa.exceptions.NotEnoughBalanceException;

public class CurrentAccount extends BankAccount{

    public CurrentAccount() {
        super();
    }
    public CurrentAccount(double balance, double minimumBalance, String accountHolderName) {
        super(balance, minimumBalance, accountHolderName);
    }

    double maxWithdrawAmount;

    public double getMaxWithdrawAmount() {
        return maxWithdrawAmount;
    }
    public void setMaxWithdrawAmount(double maxWithdrawAmount) {
        this.maxWithdrawAmount = maxWithdrawAmount;
    }

    public String withdraw(double withdrawAmount) throws NotEnoughBalanceException, InvalidAmountException {
        double currentBalance = this.getBalance();
        if (withdrawAmount <= 0 || withdrawAmount > this.getMaxWithdrawAmount())
            throw new InvalidAmountException("Sorry, the amount you are withdrawing is invalid");
        if (currentBalance <= withdrawAmount)
            throw new NotEnoughBalanceException(String.format("Sorry, you don't have enough money in your account and your current balance is: %.2f", this.getBalance()));
        this.setBalance(currentBalance - withdrawAmount);
        return "Withdraw successful";
    }
}
