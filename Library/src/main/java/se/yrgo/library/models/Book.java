package se.yrgo.library.models;

/**
 * The {@code Book} class represents a book in the library, extending the {@code Material} class.
 * It contains information about the author, ISBN, and number of pages.
 *
 * @author Your Name
 * @version 1.0
 * @see Material
 */
public class Book extends Material {

	/**
	 * The author of the book.
	 */
	private String author;

	/**
	 * The International Standard Book Number (ISBN) of the book.
	 */
	private String isbn;

	/**
	 * The number of pages in the book.
	 */
	private int noOfPages;

	/**
	 * Constructs a new {@code Book} object with the specified parameters.
	 *
	 * @param id         The unique identifier of the book.
	 * @param title      The title of the book.
	 * @param author     The author of the book.
	 * @param isbn       The ISBN of the book.
	 * @param branch     The branch of the library where the book is located.
	 * @param noOfPages  The number of pages in the book.
	 */
	public Book(int id, String title, String author, String isbn, String branch, int noOfPages) {
		super(id, title, branch);
		this.author = author;
		this.isbn = isbn;
		this.noOfPages = noOfPages;
	}

	/**
	 * Returns the author of the book.
	 *
	 * @return The author of the book.
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Returns the ISBN of the book.
	 *
	 * @return The ISBN of the book.
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * Sends the book for repair.
	 */
	public void sendForRepair() {
		System.out.println("Book has been sent for repair");
	}

	/**
	 * Returns the loan period for the book.
	 *
	 * @return The loan period for the book in days.
	 */
	public int getLoanPeriod() {
		return 21;
	}
}
