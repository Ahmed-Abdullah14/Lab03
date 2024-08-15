
package ca.ucalgary.ensf380;

/**
 * <h1> Novel.java </h1>
 * <p>
 * This class is designed be to run with the main MyBook.java file.
 * It is part of Lab 3 Exercise D.
 * </p>
 * <p>
 * <b>Note:</b>This file represents the Novel class.
 * </p>
 *
 * <p><b>Submission Date:</b>August 14, 2024</p>
 *
 * @author Ahmed Abdullah
 * @version 1.0
 */

public class Novel extends Fiction {
	private Author[] theAuthors;
	private Series mySeries;
	
	public String theme() {
		return "Method theme called from Novel";
	}
	
	//Getters and Setters
    public Author[] getTheAuthor() {
        return theAuthors;
    }

    public void setTheAuthor(Author[] authors) {
        this.theAuthors = authors;
    }

    public Series getMySeries() {
        return mySeries;
    }

    public void setMySeries(Series series) {
        this.mySeries = series;
    }

	@Override
	public String coverArt() {
		return "Method coverArt called from Novel";
	}

}
