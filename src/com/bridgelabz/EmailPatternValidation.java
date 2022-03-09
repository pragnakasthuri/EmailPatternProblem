package com.bridgelabz;
/**
 * Validate Email Address with regex
 * 1.Validate first mandatory part i.e; abc
 * 2.Ensure @ and validate the mandatory second part i.e; bridgelabz
 * 3.Ensure "." after bridgelabz and validate the mandatory third part i.e; co
 * 4.Now validate optional part i.e; xyz in abc.xyz@bridgelabz.co
 * and make sure only following are valid special characters _,+,-,. preceding to xyz
 * 5.Finally, validate the expression with supporting optional parts i.e;
 * TLD only 2 characters
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
         * Regex to check first mandatory part i.e; abc, @, bridgelabz, ".", co and xyz and .in
         */
        String emailRegex = "^[A-Za-z]+(?:[-_+.a-zA-Z0-9]+)@([A-Za-z]+\\.)+[A-Za-z]{2,5}+(?:(\\.([A-Za-z]{2})))?$";
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
        emailAddressList.add("abc@bridgelabz.co.in");
        emailAddressList.add("abc@yahoo.com");
        emailAddressList.add("abc-100@yahoo.com");
        emailAddressList.add("abc.100@yahoo.com");
        emailAddressList.add("abc111@abc.com");
        emailAddressList.add("abc-100@abc.net");
        emailAddressList.add("abc.100@abc.com.au");
        emailAddressList.add("abc.xyz@bridgelabz.co.in");

        emailAddressList.add("abc.xyz@bridgelabz.co");
        emailAddressList.add("abc-xyz@bridgelabz.co.in");
        emailAddressList.add("abc_bridgelabz.company56");
        emailAddressList.add("ab33c@_bridgel4abz*gooogle");

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

