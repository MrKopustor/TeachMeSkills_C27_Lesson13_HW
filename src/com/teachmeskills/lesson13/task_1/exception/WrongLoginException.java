package com.teachmeskills.lesson13.task_1.exception;

/**
 * Create exception WrongLoginException
 */
public class WrongLoginException extends Exception {

    private int wrongLoginCodeException;

    public WrongLoginException(String message, int wrongLoginCodeException) {
        super(message);
        this.wrongLoginCodeException = wrongLoginCodeException;
    }
}
