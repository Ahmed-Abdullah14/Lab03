
package ca.ucalgary.ensf380;

/**
 * <h1> Publisher.java </h1>
 * <p>
 * This class is designed be to run with the main MyBook.java file.
 * It is part of Lab 3 Exercise D.
 * </p>
 * <p>
 * <b>Note:</b>This file represents the Publisher class.
 * </p>
 *
 * <p><b>Submission Date:</b>August 14, 2024</p>
 *
 * @author Ahmed Abdullah
 * @version 1.0
 */

public class Publisher {
	private String name;
	private String address;
	private Classic[] classicsCatalog;
	
	public Publisher(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public String printLetterhead() {
		return "Method printLetterhead called from Publisher";
	}
	
	//Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Classic[] getClassicsCatalog() {
        return classicsCatalog;
    }

    public void setClassicsCatalog(Classic[] classicsCatalog) {
        this.classicsCatalog = classicsCatalog;
    }

}
