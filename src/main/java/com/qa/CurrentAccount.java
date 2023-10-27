package com.qa;

import com.qa.exceptions.InvalidAmountException;

public class CurrentAccount extends BankAccount{

    public CurrentAccount() {
        super();
    }
    public CurrentAccount(double balance, double minimumBalance, String accountHolderName) {
        super(balance, minimumBalance, accountHolderName);
    }


    public String withdraw(double withdrawAmount) throws InvalidAmountException {
        double currentBalance = this.getBalance();
        if (withdrawAmount <= 0 || withdrawAmount > this.getMaxWithdrawAmount())
            throw new InvalidAmountException("Sorry, the amount you are withdrawing is invalid");
        this.setBalance(currentBalance - withdrawAmount);
        return "Withdraw successful";
    }
}
