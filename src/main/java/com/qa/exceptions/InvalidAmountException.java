package com.qa.exceptions;

public class InvalidAmountException extends Exception{
    public InvalidAmountException() {
        super("Invalid withdraw amount");
    }

    public InvalidAmountException(String customMessage) {
        super(customMessage);
    }
}