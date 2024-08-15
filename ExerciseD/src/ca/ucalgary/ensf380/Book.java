
package ca.ucalgary.ensf380;

/**
 * <h1> Book.java </h1>
 * <p>
 * This class is designed be to run with the main MyBook.java file.
 * It is part of Lab 3 Exercise D.
 * </p>
 * <p>
 * <b>Note:</b>This file represents the abstract Book class.
 * </p>
 *
 * <p><b>Submission Date:</b>August 14, 2024</p>
 *
 * @author Ahmed Abdullah
 * @version 1.0
 */

public abstract class Book {
	private String isbn;
	private int publicationYear;
	private int pages;
	
	// Default Constructor
	public Book() {
		
	}
	// Constructor
	public Book(String isbn, int pages) {
		this.isbn = isbn;
		this.pages = pages;
	}
	
	// Getters and Setters
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public int getPublicationYear() {
		return publicationYear;
	}
	
	public void setPublicationYear(int year) {
		this.publicationYear = year;
	}
	
	public int getPages() {
		return pages;
	}
	
	public void setPages(int pages) {
		 this.pages = pages;
	}

}
