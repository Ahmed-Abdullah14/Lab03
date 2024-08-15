/**
 * 
 */
package ca.ucalgary.ensf380;

/**
 * <h1> Story.java </h1>
 * <p>
 * This class is designed be to run with the main MyBook.java file.
 * It is part of Lab 3 Exercise D.
 * </p>
 * <p>
 * <b>Note:</b>This file represents the Story class.
 * </p>
 *
 * <p><b>Submission Date:</b>August 14, 2024</p>
 *
 * @author Ahmed Abdullah
 * @version 1.0
 */

public class Story {
	private Author[] theAuthors;
	
	public String plot() {
		return "Method plot called from Story";
	}
	
	public Author[] getTheAuthor() {
		return theAuthors;
	}
	
	public void setTheAuthor(Author[] authors) {
		this.theAuthors = authors;
	}

}
