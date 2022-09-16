package com.techelevator.exceptions;

public class BadStringException extends Exception {
    private String yourBadStringMessage;

    public BadStringException(String message, String yourBadStringMessage) {
        super(message);
        this.yourBadStringMessage = yourBadStringMessage;
    }

    public String getYourBadStringMessage() {
        return yourBadStringMessage;
    }
}
