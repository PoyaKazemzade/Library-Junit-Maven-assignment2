package se.yrgo.library;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import se.yrgo.library.models.*;

/**
 * The {@code BookCatalogTest} class contains unit tests for the {@code BookCatalog} class.
 * It tests methods such as adding a book, finding a book, and handling different cases.
 * This class uses JUnit 5 for testing.
 *
 * @author Your Name
 * @version 1.0
 */
public class BookCatalogTest {

	private BookCatalog bc;
	private Book book1;

	/**
	 * Constructs a new {@code BookCatalogTest} object and initializes the book catalog and a book.
	 */
	public BookCatalogTest() {
		bc = new BookCatalog();
		book1 = new Book(1, "Learning Java", "", "", "", 0);
		bc.addBook(book1);
	}

	/**
	 * Tests the {@code addBook} method in the {@code BookCatalog} class.
	 * Verifies that the number of books in the catalog is increased after adding a book.
	 */
	@Test
	public void testAddABook() {
		assertEquals(1, bc.getNumberOfBooks());
	}

	/**
	 * Tests the {@code findBook} method in the {@code BookCatalog} class.
	 * Verifies that the method does not throw an exception when finding an existing book.
	 */
	@Test
	public void testFindBook() {
		assertDoesNotThrow(() -> bc.findBook("Learning Java"));
	}

	/**
	 * Tests the {@code findBook} method in the {@code BookCatalog} class,
	 * ignoring the case of the search query.
	 * Verifies that the method does not throw an exception when finding an existing book.
	 */
	@Test
	public void testFindBookIgnoringCase() {
		assertDoesNotThrow(() -> bc.findBook("learning java"));
	}

	/**
	 * Tests the {@code findBook} method in the {@code BookCatalog} class,
	 * handling extra spaces in the search query.
	 * Verifies that the method does not throw an exception when finding an existing book.
	 */
	@Test
	public void testFindBookWithExtraSpaces() {
		assertDoesNotThrow(() -> bc.findBook("     learning java    "));
	}

	//VG
	/**
	 * Tests the {@code findBook} method in the {@code BookCatalog} class
	 * when searching for a book that does not exist.
	 * Verifies that the method throws a {@code BookNotFoundException}.
	 */
	@Test
	public void testFindBookThatDoesntExist() {
		assertThrows(BookNotFoundException.class, () -> bc.findBook("Clean Agile"));
	}
}
