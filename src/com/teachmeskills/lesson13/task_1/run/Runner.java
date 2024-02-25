package com.teachmeskills.lesson13.task_1.run;

import java.util.Scanner;

import static com.teachmeskills.lesson13.task_1.service.UserRegistrationService.registerUser;

/**
 * Create class Runner
 * Call the scanner class
 * Enter login, password and confirmPassword
 * Call method registerUser
 */
public class Runner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter login");
        String login = scanner.nextLine();
        System.out.println("Enter password");
        String password = scanner.nextLine();
        System.out.println("Enter confirm password");
        String confirmPassword = scanner.nextLine();
        scanner.close();

        registerUser(login, password, confirmPassword);
    }
}
