
package ca.ucalgary.ensf380;

/**
 * <h1> Series.java </h1>
 * <p>
 * This class is designed be to run with the main MyBook.java file.
 * It is part of Lab 3 Exercise D.
 * </p>
 * <p>
 * <b>Note:</b>This file represents the Series class.
 * </p>
 *
 * <p><b>Submission Date:</b>August 14, 2024</p>
 *
 * @author Ahmed Abdullah
 * @version 1.0
 */

public class Series {
	private String seriesName;
	
	public String theme() {
		return "Method theme called from Series";
		
	}
	
	// Getters and Setters
	public String getSeriesName() {
		return seriesName;
	}
	
	public void setSeriesName(String name) {
		this.seriesName = name;
	}

}
