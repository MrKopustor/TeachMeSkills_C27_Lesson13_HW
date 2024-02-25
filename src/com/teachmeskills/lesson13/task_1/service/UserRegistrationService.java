package com.teachmeskills.lesson13.task_1.service;

import com.teachmeskills.lesson13.task_1.exception.WrongLoginException;
import com.teachmeskills.lesson13.task_1.exception.WrongPasswordException;
import com.teachmeskills.lesson13.task_1.validator.CheckInputData;

/**
 * Create class UserRegistrationService
 * Create method registerUser
 * Call exception WrongLoginException, WrongPasswordException
 */
public class UserRegistrationService {

    public static void registerUser(String login, String password, String confirmPassword) {

        try {
            CheckInputData.checkInputData(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Other type of Error!");
        }
    }
}
