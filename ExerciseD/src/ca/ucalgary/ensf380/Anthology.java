
package ca.ucalgary.ensf380;

/**
 * <h1> Anthology.java </h1>
 * <p>
 * This class is designed be to run with the main MyBook.java file.
 * It is part of Lab 3 Exercise D.
 * </p>
 * <p>
 * <b>Note:</b>This file represents the Anthology class.
 * </p>
 *
 * <p><b>Submission Date:</b>August 14, 2024</p>
 *
 * @author Ahmed Abdullah
 * @version 1.0
 */

public class Anthology extends Fiction {
	private Story[] stories;
	
	public String storyOrder() {
		return "Method storyOrder called from Anthology";
	}
	
	//Getters and Setters
	public Story[] getStory(){
		return stories;
	}
	
	public void setStory(Story[] stories) {
		this.stories = stories;
	}

	@Override
	public String coverArt() {
		return "Method coverArt called from Anthology";
	}

}
