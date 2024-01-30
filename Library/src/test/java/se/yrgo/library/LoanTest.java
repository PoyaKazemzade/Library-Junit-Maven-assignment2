package se.yrgo.library;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import se.yrgo.library.models.*;
import se.yrgo.library.utilities.GenderType;

import java.time.LocalDate;

/**
 * The {@code LoanTest} class contains unit tests for the {@code Loan} class.
 * It tests the due date functionality of a loan.
 * This class uses JUnit 5 for testing.
 *
 * @author Your Name
 * @version 1.0
 */
public class LoanTest {

	private LocalDate testDueDate = LocalDate.now().plusDays(14);

	//VG
	/**
	 * Tests the due date of a loan by creating a loan and verifying the due date.
	 * Verifies that the due date is set correctly based on the current date.
	 */
	@Test
	public void testDueDate() {
		Customer customer = new Customer("Mr", "Michael", "Smith", "1 The High Street", "1234", "a@b.com", 1, GenderType.MALE);
		Book book = new Book(1, "An Introduction to Java", "Matt Green Croft", "12345", "Any-town Branch", 400);
		Loan loan = new Loan(1, customer, book);

		assertEquals(testDueDate, loan.getDueDate());
	}
}
