
package ca.ucalgary.ensf380;

/**
 * <h1> Student.java </h1>
 * <p>
 * This class is designed be to run with the main University.java file.
 * It is part of Lab 3 Exercise C.
 * </p>
 * <p>
 * <b>Note:</b>This file represents the Student class.
 * </p>
 *
 * <p><b>Submission Date:</b>August 14, 2024</p>
 *
 * @author Ahmed Abdullah
 * @version 1.0
 */

public class Student extends Person{
	private String studentNumber;
	private Professor supervisor;
	private double averageMark;
	
	// Constructor
	public Student(String name, String phoneNumber, String emailAddress, Address address, String studentNumber, Professor supervisor, double averageMark) {
		// Super Constructor of Person class
		super(name, phoneNumber, emailAddress, address);
		this.studentNumber = studentNumber;
		this.supervisor = supervisor;
		this.averageMark = averageMark;
	}
	
	// Setters
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	public void setSupervisor(Professor supervisor) {
		this.supervisor = supervisor;
	}
	
	public void setAverageMark(double averageMark) {
		this.averageMark = averageMark;
	}
	
	// Getters
	public String getStudentNumber() {
		return studentNumber;
	}
	
	public Professor getSupervisor() {
		return supervisor;
	}
	
	public double getAverageMarks() {
		return averageMark;
	}
	
	// Other Methods
	public boolean isEligibleToEnroll() {
		return (averageMark > 50)  ? true: false;
	}

}
