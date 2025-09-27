package ua.hotel_managment;

import java.time.LocalDate;

import ua.util.Utils;

/**
 * Represents a hotel guest with personal details and check-in date.
 * Provides validation for input data through setters.
 */
public class Guest {
	
	private String firstName;
	private String lastName;
	private String email;
	private LocalDate checkInDate; // registration date
	
	/**
	 * Constructor. Sets value to parameters of Guest by using setters. 
	 * @param firstName		guest's first name (can not be empty)
	 * @param lastName		guest's last name (can not be empty)
 	 * @param email			guest's email (must be valid format)
	 * @param checkInDate	guest's check in date (can not be null or in the past)
	 * @throws IllegalArgumentException if any value is invalid
	 */
	public Guest(String firstName, String lastName, String email, LocalDate checkInDate) {
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setCheckInDate(checkInDate);
	}
	
	/**
	 * Returns first name of the guest.
	 * @return firstName guest's first name
	 */
	public String getFirstName() { return firstName; }
	 
	/**
	 * Set first name of the guest.
	 * @param firstName first name
	 * @throws IllegalArgumentException if string is empty or combine only spaces
	 */
	public void setFirstName(String firstName) {
		if (!Utils.validateString(firstName)) {
			throw new IllegalArgumentException("First name can not be empty");
		}
	    this.firstName = firstName;
	}
	
	/**
	 * Returns last name of the guest.
	 * @return lastName guest's last name
	 */
	public String getLastName() { return lastName; }
	 
	/**
	 * Set last name of the guest.
	 * @param lastName last name
	 * @throws IllegalArgumentException if string is empty or combine only spaces
	 */
	public void setLastName(String lastName) {
		if (!Utils.validateString(lastName)) {
			throw new IllegalArgumentException("Last name can not be empty");
		}
	    this.lastName = lastName;
	}
	
	/**
	 * Returns email of the guest.
	 * @return email guest's email
	 */
	public String getEmail() { return email; }
	 
	/**
	 * Set email of the guest.
	 * @param email email
	 * @throws IllegalArgumentException if string does not match the format of email
	 */
	public void setEmail(String email) {
		if (!Utils.validateEmail(email)) {
			throw new IllegalArgumentException("Email does not match the format");
		}
	    this.email = email;
	}
	
	/**
	 * Returns check in date of the guest.
	 * @return checkIn guest's registration date
	 */
	public LocalDate getCheckInDate() { return checkInDate; }
	 
	/**
	 * Set check in date of the guest.
	 * @param checkIn registration date
	 * @throws IllegalArgumentException if registration date is in the past or null
	 */
	public void setCheckInDate(LocalDate checkInDate) {
		if (!Utils.validateRegistrationDate(checkInDate)) {
			throw new IllegalArgumentException("Check in date has not be in the past and be empty");
		}
	    this.checkInDate = checkInDate;
	}
	
	/**
	 * Returns a string representation of the Guest object.
	 * Includes the guest's first name, last name, email, and check-in date,
	 * each on a separate line.
	 *
	 * @return a formatted string with the guest's details
	 */
	@Override
	public String toString() {
	    StringBuilder stringBuilder = new StringBuilder();
	    
	    stringBuilder.append("Guest's first name: ").append(firstName).append("\n");
	    stringBuilder.append("Guest's last name: ").append(lastName).append("\n");
	    stringBuilder.append("Guest's email: ").append(email).append("\n");
	    stringBuilder.append("Guest's check-in date: ").append(checkInDate).append("\n");
	    
	    return stringBuilder.toString();
	}

	/**
	 * Compares this Guest to another object for equality.
	 * Two Guest objects are considered equal if they have the same email.
	 *
	 * @param obj the object to compare with
	 * @return true if the given object is a Guest with the same email, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
	    if (this == o) return true;
	    if (!(o instanceof Guest)) return false;
	    Guest guest = (Guest) o;
	    return email.equals(guest.email);
	}

	/**
	 * Returns a hash code value for the Guest object.
	 * This method is consistent with equals(), using the email field.
	 *
	 * @return hash code of the email
	 */
	@Override
	public int hashCode() {
	    return email.hashCode();
	}

	
}
