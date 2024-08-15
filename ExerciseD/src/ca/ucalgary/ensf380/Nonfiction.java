package ca.ucalgary.ensf380;

/**
 * <h1> Nonfiction.java </h1>
 * <p>
 * This class is designed be to run with the main MyBook.java file.
 * It is part of Lab 3 Exercise D.
 * </p>
 * <p>
 * <b>Note:</b>This file represents the Nonfiction class.
 * </p>
 *
 * <p><b>Submission Date:</b>August 14, 2024</p>
 *
 * @author Ahmed Abdullah
 * @version 1.0
 */

public class Nonfiction extends Paperback {
	private Category deweyClassification;
	
	public String topic() {
		return "Method topic called from Nonfiction";
	}
	
	// Getters and Setters
	public Category getDeweyClassification() {
		return deweyClassification;
	}
	
	public void setDeweyClassification(Category cat) {
		this.deweyClassification = cat;
	}

}
