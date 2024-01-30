package se.yrgo.library.models;

import se.yrgo.library.utilities.LoanStatus;

import java.time.LocalDate;

/**
 * The {@code Loan} class represents a loan transaction in the library, where a customer
 * borrows a book with a specified due date and loan status.
 *
 * @author Your Name
 * @version 1.0
 */
public class Loan {

  private int ID;
  private Customer customer;
  private Book book;
  private LocalDate dueDate;
  private LoanStatus status;

  /**
   * Constructs a new {@code Loan} object with the specified parameters.
   *
   * @param ID       The unique identifier for the loan.
   * @param customer The customer who borrowed the book.
   * @param book     The book that was borrowed.
   */
  public Loan(int ID, Customer customer, Book book) {
    this.ID = ID;
    this.customer = customer;
    this.book = book;
    dueDate = LocalDate.now().plusDays(14);
    status = LoanStatus.CURRENT;
  }

  /**
   * Returns a string representation of the loan.
   *
   * @return A string representation of the loan.
   */
  @Override
  public String toString() {
    return "Loan [ID=" + ID + ", customer=" + customer.getMailingName() + ", book=" + book.getTitle() + "]";
  }

  /**
   * Generates a hash code for the loan based on its ID.
   *
   * @return The hash code for the loan.
   */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ID;
    return result;
  }

  /**
   * Checks if this loan is equal to another object based on its ID.
   *
   * @param obj The object to compare.
   * @return {@code true} if the objects are equal, {@code false} otherwise.
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null || getClass() != obj.getClass())
      return false;
    Loan other = (Loan) obj;
    return ID == other.ID;
  }

  /**
   * Returns the customer associated with the loan.
   *
   * @return The customer associated with the loan.
   */
  public Customer getCustomer() {
    return customer;
  }

  /**
   * Returns the book associated with the loan.
   *
   * @return The book associated with the loan.
   */
  public Book getBook() {
    return book;
  }

  /**
   * Returns the due date of the loan.
   *
   * @return The due date of the loan.
   */
  public LocalDate getDueDate() {
    return dueDate;
  }

  /**
   * Returns the status of the loan.
   *
   * @return The status of the loan.
   */
  public LoanStatus getStatus() {
    return status;
  }

  /**
   * Ends the loan by updating the return date and setting the status to historic.
   */
  public void endLoan() {
    //returnDate = new Date();
    status = LoanStatus.HISTORIC;
  }
}
