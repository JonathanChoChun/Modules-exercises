package com.techelevator;

public class AnswerOutOfRangeException extends Exception{
    private String message;

    public AnswerOutOfRangeException (String message) {
        super(message);
    }
}
