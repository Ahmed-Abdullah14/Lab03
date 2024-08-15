
package ca.ucalgary.ensf380;

/**
 * <h1> Professor.java </h1>
 * <p>
 * This class is designed be to run with the main University.java file.
 * It is part of Lab 3 Exercise C.
 * </p>
 * <p>
 * <b>Note:</b>This file represents the Professor class.
 * </p>
 *
 * <p><b>Submission Date:</b>August 14, 2024</p>
 *
 * @author Ahmed Abdullah
 * @version 1.0
 */

public class Professor extends Person{
	private String teacherNumber;
	private double salary;
	
	// Constructor
	public Professor(String name, String phoneNumber, String emailAddress, Address address, String teacherNumber, double salary) {
		// Super Constructor of Person class
		super(name, phoneNumber, emailAddress, address);
		this.teacherNumber = teacherNumber;
		this.salary = salary;
	}
	
	//Setters
	public void setTeacherNumber(String teacherNumber) {
		this.teacherNumber = teacherNumber;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//Getters
	public String getTeacherNumber() {
		return teacherNumber;
	}
	
	public double getSalary() {
		return salary;
	}

}
