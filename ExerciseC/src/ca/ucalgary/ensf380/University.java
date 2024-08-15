
package ca.ucalgary.ensf380;

/**
 * <h1> University.java </h1>
 * <p>
 * This class is designed for running a sample scenario using the other classes in the package.
 * It is part of Lab 3 Exercise C.
 * </p>
 * <p>
 * <b>Note:</b>This file represents the main function
 * </p>
 *
 * <p><b>Submission Date:</b>August 14, 2024</p>
 *
 * @author Ahmed Abdullah
 * @version 1.0
 */

public class University {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Add a new professor
		Address professorAddress = new Address("1460 Toronto Crescent", "Calgary", "AB", "T4C 0V7", "Canada");
		Professor professor1 = new Professor("Alice Winston", "403-343-2323", "aliceWh@ucalgary.ca", professorAddress, "P001", 120000.00);
		
		// Add a new Student
        Address studentAddress = new Address("1490 Brentwood Drive", "Calgary", "AB", "T2K 3V9", "Canada");
        Student student1 = new Student("Jacob Ray", "403-122-1243", "jacobR@ucalgary.ca", studentAddress, "S001", professor1, 45.00);
        
        // Get professor Details
        System.out.println("Professor Details:");
        System.out.println("Name: " + professor1.getName());
        System.out.println("Teaching ID: " + professor1.getTeacherNumber());
        System.out.println("Phone: " + professor1.getPhoneNumber());
        System.out.println("Email: " + professor1.getEmailAddress());
        System.out.println("Salary: $" + professor1.getSalary());
        System.out.println("Address: " + professor1.getAddress().outputAsLabel());
        
        // Increase Professors Salary
        System.out.println();
        professor1.setSalary(150000);
        System.out.println("New Salary: $" + professor1.getSalary());
        
        // Update Professors Phone Number
        professor1.setPhoneNumber("403-121-6705");
        System.out.println("New Phone Number: " + professor1.getPhoneNumber());
        
        // Check if professors Address is valid
        System.out.println("Is Professor's Address valid? " + professor1.hasValidAddress());
        
        // Get Student Details
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + student1.getName());
        System.out.println("Student ID: " + student1.getStudentNumber());
        System.out.println("Supervisor: " + student1.getSupervisor().getName());
        System.out.println("Grade Average: " + student1.getAverageMarks());
        
        // Check if student is eligible to enroll
        System.out.println("Is Student Eligible to Enroll: " + student1.isEligibleToEnroll());
        
        System.out.println();
        
        // Set new average for the student
        student1.setAverageMark(70.0);
        System.out.println("New Grade Average: " + student1.getAverageMarks());
        // Check if Student is eligible to enroll now
        System.out.println("Is Student Eligible to Enroll Now: " + student1.isEligibleToEnroll());
        
    }

}
