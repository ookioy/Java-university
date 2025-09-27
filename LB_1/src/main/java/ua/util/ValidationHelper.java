package ua.util;

import java.time.LocalDate;

/**
 * Package-private helper class providing basic validation methods.
 * This class is not visible outside the ua.util package.
 * Methods are static and meant to be used internally by other classes (e.g., Utils).
 */
class ValidationHelper {

    /**
     * Checks if a string is not null and not empty (ignores whitespace).
     *
     * @param value the string to check
     * @return true if string is not null and contains non-space characters
     */
    static boolean isNotNullOrEmpty(String value) {
        return value != null && !value.trim().isEmpty();
    }

    /**
     * Checks if an email has a valid basic format.
     *
     * @param email the email string to check
     * @return true if email matches the basic regex pattern
     */
    static boolean isValidEmail(String email) {
        return email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.[a-z]{2,}$");
    }

    /**
     * Checks if a date is today or in the future (not in the past).
     *
     * @param date the date to validate
     * @return true if the date is today or later
     */
    static boolean isNotDateInThePast(LocalDate date) {
        return date != null && (date.isEqual(LocalDate.now()) || date.isAfter(LocalDate.now()));
    }
}
