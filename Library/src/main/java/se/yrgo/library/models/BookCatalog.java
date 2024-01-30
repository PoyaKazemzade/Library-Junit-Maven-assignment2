package se.yrgo.library.models;

/**
 * The {@code BookCatalog} class represents a catalog of books in the library.
 * It manages an array of books and provides methods for retrieving information about the books.
 *
 * @author Your Name
 * @version 1.0
 * @see Book
 */
public class BookCatalog {

	/**
	 * An array to store books in the catalog.
	 */
	private Book[] bookArray = new Book[100];

	/**
	 * The next available position in the array to add a new book.
	 */
	private int nextPosition = 0;

	/**
	 * Returns the array of books in the catalog.
	 *
	 * @return The array of books in the catalog.
	 */
	public Book[] getBookArray() {
		return bookArray;
	}

	/**
	 * Returns the number of books currently in the catalog.
	 *
	 * @return The number of books in the catalog.
	 */
	public int getNumberOfBooks() {
		return nextPosition;
	}

	/**
	 * Adds a new book to the catalog.
	 *
	 * @param newBook The book to be added to the catalog.
	 */
	public void addBook(Book newBook) {
		bookArray[nextPosition] = newBook;
		nextPosition++;
	}

	/**
	 * Finds a book in the catalog based on its title.
	 *
	 * @param title The title of the book to be searched.
	 * @return The book with the specified title.
	 * @throws BookNotFoundException If the book with the specified title is not found in the catalog.
	 */
	public Book findBook(String title) throws BookNotFoundException {
		title = title.trim();

		for (int counter = 0; counter < nextPosition; counter++) {
			if (bookArray[counter].getTitle().equalsIgnoreCase(title)) {
				return bookArray[counter];
			}
		}
		throw new BookNotFoundException();
	}
}
