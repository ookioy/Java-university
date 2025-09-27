package ua.util;

import java.time.LocalDate;

/**
 * Public utility class that provides access to validation methods.
 * It acts as a facade to the internal ValidationHelper class.
 */
public class Utils {

    /**
     * Validates if the given email has a correct format.
     *
     * @param email the email string to validate
     * @return true if the email is valid
     */
    public static boolean validateEmail(String email) {
        return ValidationHelper.isValidEmail(email);
    }

    /**
     * Validates if a string is not null and not empty (ignores whitespace).
     *
     * @param text the string to validate
     * @return true if the string is valid
     */
    public static boolean validateString(String text) {
        return ValidationHelper.isNotNullOrEmpty(text);
    }

    /**
     * Validates if a registration date is today or in the future.
     *
     * @param date the registration date to validate
     * @return true if the date is valid
     */
    public static boolean validateRegistrationDate(LocalDate date) {
        return ValidationHelper.isNotDateInThePast(date);
    }
    
    /**
     * Validates if a number is positive number.
     *
     * @param number integer value to validate
     * @return true if the number is positive
     */
    public static boolean validatePositiveNumber(int number) {
    	return ValidationHelper.isPositiveNumber(number);
    }
    
    /**
     * Validates if a number is positive number.
     *
     * @param number double value to validate
     * @return true if the number is positive
     */
    public static boolean validatePositiveNumber(double number) {
    	return ValidationHelper.isPositiveNumber(number);
    }
}
