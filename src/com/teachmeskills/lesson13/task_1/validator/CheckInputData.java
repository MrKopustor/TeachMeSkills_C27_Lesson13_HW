package com.teachmeskills.lesson13.task_1.validator;

import com.teachmeskills.lesson13.task_1.constant.ConstAuthorization;
import com.teachmeskills.lesson13.task_1.exception.WrongLoginException;
import com.teachmeskills.lesson13.task_1.exception.WrongPasswordException;
import com.teachmeskills.lesson13.task_1.util.Util;

/**
 * Create class CheckInputData
 * Checking for validity of values
 */
public class CheckInputData {
    public static boolean checkInputData(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        if (login.length() > ConstAuthorization.LOGIN_LENGTH) {
            throw new WrongLoginException("The login must contain less than 20 characters", 1);
        }
        if (login.contains(" ")) {
            throw new WrongLoginException("The login must not contain a space", 2);
        }

        if (password.length() > ConstAuthorization.PASSWORD_LENGTH) {
            throw new WrongPasswordException("The password must contain less than 20 character", 100);
        }
        if (password.contains(" ") || confirmPassword.contains(" ")) {
            throw new WrongPasswordException("There must be no blank lines in the password", 101);
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("The passwords don't match", 102);
        }
        if (Util.countNumberPassword(password) < ConstAuthorization.MIN_NUMBER_PASSWORD) {
            throw new WrongPasswordException("The password must contain more than " + ConstAuthorization.MIN_NUMBER_PASSWORD + " numbers", 103);
        }
        return true;
    }
}
