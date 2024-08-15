/**
 * 
 */
package ca.ucalgary.ensf380;

/**
 * <h1> MyBook.java </h1>
 * <p>
 * This class is designed for running a sample scenario using the other classes in the package.
 * It is part of Lab 3 Exercise D.
 * </p>
 * <p>
 * <b>Note:</b>This file represents the main function
 * </p>
 *
 * <p><b>Submission Date:</b>August 14, 2024</p>
 *
 * @author Ahmed Abdullah
 * @version 1.0
 */

public class MyBook {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create Authors
        Author author1 = new Author("Jackob Henry", "1293 Northland Drive, Calgary, CA", 41);
        Author author2 = new Author("Ben Rowling", "523 Malbrough Way, Toronto, CA", 32);
        Author author3 = new Author("Elli Josh", "677 Carrigton Commons, Calgary, CA", 54);
        Author author4 = new Author("Jane Caleb", "701 Coopers Landing, Airdrie, CA", 73);

        // Create Publishers
        Publisher publisher1 = new Publisher("Dale Books", "2939 High Drive Blvd, Edmonton, CA");
        Publisher publisher2 = new Publisher("York Books", "324 York Way, Toronto, CA");
        Publisher publisher3 = new Publisher("Megg Publishing", "120 Shores Court, Calgary, CA");
        
        // Create a classic Books
        Classic classicBook = new Classic();
        classicBook.setIsbn("1203208218");
        classicBook.setPages(391);
        classicBook.setBookPublisher(new Publisher[]{publisher1, publisher2});
        classicBook.setTheAuthor(author2);
        classicBook.setPublicationYear(1990);
        
        //Create a Novel
        Series series = new Series();
        series.setSeriesName("Alex Rider");
        Novel novel = new Novel();
        novel.setIsbn("803489432");
        novel.setPages(342);
        novel.setMySeries(series);
        novel.setTheAuthor(new Author[]{author2, author4});
        novel.setPublicationYear(2005);
        
        // Create a contract
        Contract contract = new Contract("12-12-2021", publisher3, new Author[]{author1, author3});
        
        // Print Contract Details
        System.out.println("Contract Details: ");
        System.out.println("Date: " + contract.getDate());
        System.out.println("Publisher: " + contract.getPublisherInfo().getName());
        System.out.println();
        
        // Print Classic Book Details
        System.out.println("Classic Book Details:");
        System.out.println("ISBN: " + classicBook.getIsbn());
        System.out.println("Auhor: " + classicBook.getTheAuthor().getName());
        System.out.println("Publication Year: " + classicBook.getPublicationYear());
        System.out.println();
        
        //Print Novel Details
        System.out.println("Novel Details:");
        System.out.println("ISBN: " + novel.getIsbn());
        System.out.println("Series: " + novel.getMySeries().getSeriesName());
        System.out.println("Publication Year: " + novel.getPublicationYear());
        System.out.println();

      }

}
