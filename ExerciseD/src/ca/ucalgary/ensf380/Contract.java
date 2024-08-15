
package ca.ucalgary.ensf380;

/**
 * <h1> Contract.java </h1>
 * <p>
 * This class is designed be to run with the main MyBook.java file.
 * It is part of Lab 3 Exercise D.
 * </p>
 * <p>
 * <b>Note:</b>This file represents the Contract class.
 * </p>
 *
 * <p><b>Submission Date:</b>August 14, 2024</p>
 *
 * @author Ahmed Abdullah
 * @version 1.0
 */

public class Contract {
	private String date;
	private Publisher publisherInfo;
	private Author[] authorInfo;
	
	//Constructor
	public Contract(String date, Publisher publisherInfo, Author[] authorInfo) {
        this.date = date;
        this.publisherInfo = publisherInfo;
        this.authorInfo = authorInfo;
    }

    public String printContract() {
    	return "Method printContract called from Contract";
    }

    // Getters and Setters
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Publisher getPublisherInfo() {
        return publisherInfo;
    }

    public void setPublisherInfo(Publisher info) {
        this.publisherInfo = info;
    }

    public Author[] getAuthorInfo() {
        return authorInfo;
    }

    public void setAuthorInfo(Author[] info) {
        this.authorInfo = info;
    }

}
