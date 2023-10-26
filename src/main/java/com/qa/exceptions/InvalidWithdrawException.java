package com.qa.exceptions;

public class InvalidWithdrawException extends Exception{
    public InvalidWithdrawException() {
        super("Invalid withdraw amount");
    }

    public InvalidWithdrawException(String customMessage) {
        super(customMessage);
    }
}