
package ca.ucalgary.ensf380;

/**
 * <h1> Fiction.java </h1>
 * <p>
 * This class is designed be to run with the main MyBook.java file.
 * It is part of Lab 3 Exercise D.
 * </p>
 * <p>
 * <b>Note:</b>This file represents the abstract Fiction class.
 * </p>
 *
 * <p><b>Submission Date:</b>August 14, 2024</p>
 *
 * @author Ahmed Abdullah
 * @version 1.0
 */

public abstract class Fiction extends Paperback {
	
	public abstract String coverArt();
	
	public String genre() {
		return "Method genre called from Fiction";
		
	}

}
