package ca.ucalgary.ensf380;

/**
 * <h1> Category.java </h1>
 * <p>
 * This class is designed be to run with the main MyBook.java file.
 * It is part of Lab 3 Exercise D.
 * </p>
 * <p>
 * <b>Note:</b>This file represents the Category class.
 * </p>
 *
 * <p><b>Submission Date:</b>August 14, 2024</p>
 *
 * @author Ahmed Abdullah
 * @version 1.0
 */

public class Category {
	private Category subCategory;
	private Category superCategory;
	private String category;
	
	public String sort() {
		return "Method sort called from Category";
	}
	
	public Category getSubCategory() {
		return subCategory;
	}
	
	public void setSubCategory(Category sub) {
		this.subCategory = sub;
	}
	
	public Category getSuperCategory() {
		return superCategory;
	}
	
	public void setSuperCategory(Category superr) {
		this.superCategory = superr;
	}
	
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String cat) {
		this.category = cat;
	}

}
