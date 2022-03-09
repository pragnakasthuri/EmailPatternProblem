package com.bridgelabz;
/**
 * Validate Email Address with regex
 * In third let's validate the mandatory part abc
 */

import java.util.ArrayList;
import java.util.regex.Pattern;

public class EmailPatternValidation {
    /**
     * Creating isValidEmail method to validate the email address using regex
     * and returns true or false
     *
     * @param email - Takes the given email
     * @return true if it matches else false
     */
    public static boolean isValidEmail(String email) {
        /**
         * Regex to check first mandatory part i.e; abc
         */
        String emailRegex = "^[a-zA-Z]*$";
        /**
         * Compiling the ReGex
         */
        Pattern pattern = Pattern.compile(emailRegex);
        /**
         * If the email is empty return false
         */
        if (email == null)
            return false;
        /**
         * Return if the email matched the Regex
         */
        return pattern.matcher(email).matches();
    }

    /**
     * Main method from where the execution gets started
     *
     * @param args - default java param
     */
    public static void main(String[] args) {
        /**
         * PROCEDURE:
         * 1.Creating an Array list to store the email Addresses which need to be validated
         * 2.Adding the email addresses to list which need to be validated
         * 3.Iterating and printing valid message if the email addresses entered are valid
         * else prints not valid message
         */

        /**
         * 1.Creating an Array list to store the email Addresses which need to be validated
         */
        ArrayList<String> emailAddressList = new ArrayList<>();
        /**
         * 2.Adding the email addresses to list which need to be validated
         */
        emailAddressList.add("abc");
        emailAddressList.add("a2sd");
        /**
         * 3.Iterating and printing valid message if the email addresses entered are valid
         * else prints not valid message
         */
        for (String emailAddress : emailAddressList) {
            if (isValidEmail(emailAddress))
                System.out.println(emailAddress + " - Valid");
            else
                System.out.println(emailAddress + " - Not valid");
        }
    }
}

