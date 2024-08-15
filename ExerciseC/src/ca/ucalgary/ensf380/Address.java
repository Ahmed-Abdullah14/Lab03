
package ca.ucalgary.ensf380;

/**
 * <h1> Address.java </h1>
 * <p>
 * This class is designed be to run with the main University.java file.
 * It is part of Lab 3 Exercise C.
 * </p>
 * <p>
 * <b>Note:</b>This file represents the Address class.
 * </p>
 *
 * <p><b>Submission Date:</b>August 14, 2024</p>
 *
 * @author Ahmed Abdullah
 * @version 1.0
 */

public class Address {
	private String street;
	private String city;
	private String state;
	private String postalCode;
	private String country;
	
	// Constructor
	public Address(String street, String city, String state, String postalCode, String country) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.country = country;
	}
	
	// Setters
	public void setStreet(String street) {
		this.street = street;
	}
	
	public void setCity(String city) {
		this.city =  city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void setpostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	// Getters
	public String getStreet() {
		return street;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	
	public String getPostalCode() {
		return postalCode;
	}
	
	public String getCountry() {
		return country;
	}
	
	// Other Methods
	public boolean validate() {
		return street != null &&
	           city != null &&
	           state != null && 
	           postalCode != null && 
	           country != null;
	}
	
	public String outputAsLabel() {
		return String.format("\nStreet: %s\nCity: %s\nState: %s\nPostal Code: %s\nCountry: %s", street, city, state, postalCode, country);
	}

}
