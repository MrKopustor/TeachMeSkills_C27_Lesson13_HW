package com.teachmeskills.lesson13.task_1.util;

/**
 * Create class Util
 * Auxiliary class
 * Create method countNumberPassword
 * search 1+ digits
 */
public class Util {
    public static int countNumberPassword(String password) {
        int count = 0;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }
}
