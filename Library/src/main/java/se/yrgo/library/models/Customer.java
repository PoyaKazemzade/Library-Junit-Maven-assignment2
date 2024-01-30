package se.yrgo.library.models;

import java.util.Date;
import java.util.GregorianCalendar;
import se.yrgo.library.utilities.GenderType;

/**
 * The {@code Customer} class represents a library customer with personal information
 * such as name, address, contact details, and membership details.
 *
 * @author Your Name
 * @version 1.0
 */

public class Customer {

	private String title;
	private String firstName;
	private String surname;
	private String address;
	private String phoneNumber;
	private String email;
	private int customerNumber;
	private GenderType gender;
	private boolean isvalid;
	private Date expiryDate;

	/**
	 * Constructs a new {@code Customer} object with the specified parameters.
	 *
	 * @param title         The title of the customer (e.g., Mr, Mrs, Ms).
	 * @param firstName     The first name of the customer.
	 * @param surname       The surname of the customer.
	 * @param address       The address of the customer.
	 * @param phoneNumber   The phone number of the customer.
	 * @param email         The email address of the customer.
	 * @param customerNumber The unique identifier for the customer.
	 * @param gender        The gender of the customer.
	 */
	public Customer(String title, String firstName, String surname, String address,
			String phoneNumber, String email, int customerNumber, GenderType gender) {

		setName(title, firstName, surname);
		this.address = address;
		this.phoneNumber=phoneNumber;
		this.email = email;
		this.customerNumber = customerNumber;
		this.gender = gender;
		this.isvalid = true;
		GregorianCalendar gCal = new GregorianCalendar();
		gCal.add(GregorianCalendar.YEAR, 1);
		this.expiryDate = gCal.getTime();
	}

	/**
	 * Returns the first name of the customer.
	 *
	 * @return The first name of the customer.
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Returns the surname of the customer.
	 *
	 * @return The surname of the customer.
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * Sets the surname of the customer.
	 *
	 * @param surname The new surname of the customer.
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}


	private void setName(String title, String firstName, String surname) {
		this.title = title;
		this.firstName = firstName;
		this.surname = surname;
	}

	/**
	 * Returns the full mailing name of the customer.
	 *
	 * @return The full mailing name of the customer.
	 */
	public String getMailingName() {
		StringBuilder sb = new StringBuilder(title);
		sb.append(" ");
		sb.append(firstName.substring(0,1));
		sb.append(" ");
		sb.append(surname);
		
		return sb.toString(); 
	}

	/**
	 * Returns the gender of the customer.
	 *
	 * @return The gender of the customer.
	 */
	public GenderType getGender() {
		return gender;
	}

	/**
	 * Returns the expiry date of the customer's membership.
	 *
	 * @return The expiry date of the customer's membership.
	 */
	public Date getExpiryDate() {
		return expiryDate;
	}

	@Override
	public String toString() {
		return getMailingName();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + customerNumber;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result
				+ ((expiryDate == null) ? 0 : expiryDate.hashCode());
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + (isvalid ? 1231 : 1237);
		result = prime * result
				+ ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (customerNumber != other.customerNumber)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (expiryDate == null) {
			if (other.expiryDate != null)
				return false;
		} else if (!expiryDate.equals(other.expiryDate))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (gender != other.gender)
			return false;
		if (isvalid != other.isvalid)
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	
}
