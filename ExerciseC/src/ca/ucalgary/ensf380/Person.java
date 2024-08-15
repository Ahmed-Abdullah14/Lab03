
package ca.ucalgary.ensf380;

/**
 * <h1> Person.java </h1>
 * <p>
 * This class is designed be to run with the main University.java file.
 * It is part of Lab 3 Exercise C.
 * </p>
 * <p>
 * <b>Note:</b>This file represents the abstract Person class.
 * </p>
 *
 * <p><b>Submission Date:</b>August 14, 2024</p>
 *
 * @author Ahmed Abdullah
 * @version 1.0
 */

public abstract class Person {
	protected String name;
	protected String phoneNumber;
	protected String emailAddress;
	protected Address address;
	private static int lastPersonalNumber = 0;
	
	// Constructor
	public Person(String name, String phoneNumber, String emailAddress, Address address) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.address = address;
	}
	
	// Setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	// Getters
	public String getName() {
		return name;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public Address getAddress() {
		return address;
	}
	
	// Other Methods
	protected static String nextPersonalNumber(short type) {
		lastPersonalNumber++;
		return String.valueOf(lastPersonalNumber);
	}
	
	public boolean hasValidAddress() {
		if (address.validate()) {
			return true;
		} else {
			return false;
		}
	}
	
	

}
