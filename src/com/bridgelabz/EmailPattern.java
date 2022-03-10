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
import java.util.regex.Pattern;

public class EmailPattern {
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
        String emailRegex = "^[a-zA-Z0-9_+-]+(?:\\.[a-zA-Z0-9_+-]+)*@" +
                            "([a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}" +
                            "(?:(\\.([A-Za-z]{2})))?$";

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
}




