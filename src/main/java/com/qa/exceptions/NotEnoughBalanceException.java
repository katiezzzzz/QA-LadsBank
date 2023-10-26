package com.qa.exceptions;

public class NotEnoughBalanceException extends Exception{
    public NotEnoughBalanceException() {
        super("You don't have enough balance in your account");
    }

    public NotEnoughBalanceException(String customMessage) {
        super(customMessage);
    }
}
