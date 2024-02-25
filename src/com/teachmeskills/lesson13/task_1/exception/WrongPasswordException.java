package com.teachmeskills.lesson13.task_1.exception;

/**
 * Create exception WrongPasswordException
 */
public class WrongPasswordException extends Exception {

    private int wrongPasswordCodeException;

    public WrongPasswordException(String message, int wrongPasswordCodeException) {
        super(message);
        this.wrongPasswordCodeException = wrongPasswordCodeException;
    }
}
