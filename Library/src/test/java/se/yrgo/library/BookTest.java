package se.yrgo.library;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import se.yrgo.library.models.Book;

/**
 * The {@code BookTest} class contains unit tests for the {@code Book} class.
 * It tests the equality of two books based on their attributes.
 * This class uses JUnit 5 for testing.
 *
 * @author Your Name
 * @version 1.0
 */
class BookTest {

	private Book book1;
	private Book book2;

	/**
	 * Constructs a new {@code BookTest} object and initializes two books for testing.
	 */
	public BookTest() {
		book1 = new Book(1, "Clean Agile", "Robert C.Martin", "9780135781869", "Education", 240);
		book2 = new Book(2, "Pride and Prejudice", "Jane Austen", "9780135781881", "Entertainment", 300);
	}

	/**
	 * Tests the equality of two identical books.
	 * Verifies that the equals method returns true.
	 */
	@Test
	public void test2EqualBooks() {
		assertEquals(book1, book1);
	}

	/**
	 * Tests the non-equality of two different books.
	 * Verifies that the equals method returns false.
	 */
	@Test
	public void test2NonEqualBooks() {
		assertNotEquals(book1, book2);
	}
}
