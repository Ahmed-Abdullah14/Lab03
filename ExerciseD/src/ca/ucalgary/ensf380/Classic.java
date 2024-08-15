
package ca.ucalgary.ensf380;

/**
 * <h1> Classic.java </h1>
 * <p>
 * This class is designed be to run with the main MyBook.java file.
 * It is part of Lab 3 Exercise D.
 * </p>
 * <p>
 * <b>Note:</b>This file represents the Classic class.
 * </p>
 *
 * <p><b>Submission Date:</b>August 14, 2024</p>
 *
 * @author Ahmed Abdullah
 * @version 1.0
 */

public class Classic extends Hardcover{
	private int origPubYear = 1860;
	private Author theAuthor;
	private Publisher[] bookPublisher;
	
	public String createNotes() {
		return "Method createNotes called from Classic";
		
	}
	
	// Getters and Setters
	public int getOrigPubYear() {
		return origPubYear;
	}
	
	public void setOrigPubYear(int year) {
		this.origPubYear = year;
	}
	
	public Author getTheAuthor() {
		return theAuthor;
	}
	
	public void setTheAuthor(Author author) {
		this.theAuthor = author;
	}
	
	public Publisher[] getBookPublisher() {
		return bookPublisher;
	}
	
	public void setBookPublisher(Publisher[] pub) {
		this.bookPublisher = pub;
	}

	@Override
	public String binding() {
		return "Method binding called from Classic";
	}
}
