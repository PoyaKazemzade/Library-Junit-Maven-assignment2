package se.yrgo.library.models;

/**
 * The {@code Material} class is an abstract class representing a generic library material
 * with basic information such as ID, title, branch, and borrower.
 * This class serves as a base class for specific material types like books.
 *
 * @author Your Name
 * @version 1.0
 */
public abstract class Material {

	private int id;
	private String title;
	private String branch;
	private Customer borrower;

	/**
	 * Constructs a new {@code Material} object with the specified parameters.
	 *
	 * @param id     The unique identifier of the material.
	 * @param title  The title of the material.
	 * @param branch The branch of the library where the material is located.
	 */
	public Material(int id, String title, String branch) {
		this.id = id;
		this.title = title;
		this.branch = branch;
	}

	/**
	 * Returns the title of the material.
	 *
	 * @return The title of the material.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Returns the ID of the material.
	 *
	 * @return The ID of the material.
	 */
	public int getID() {
		return id;
	}

	/**
	 * Relocates the material to a new branch.
	 *
	 * @param newBranch The new branch where the material is relocated.
	 */
	public void relocate(String newBranch) {
		this.branch = newBranch;
	}

	/**
	 * Lends the material to a customer.
	 *
	 * @param customer The customer to whom the material is lent.
	 * @return {@code true} if the material is successfully lent, {@code false} otherwise.
	 */
	public boolean lend(Customer customer) {
		if (borrower == null) {
			borrower = customer;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Gets the loan period for the material.
	 * This method must be overridden by subclasses.
	 *
	 * @return The loan period for the material.
	 */
	public abstract int getLoanPeriod();

	/**
	 * Returns a string representation of the material.
	 *
	 * @return A string representation of the material.
	 */
	@Override
	public String toString() {
		return title;
	}

	/**
	 * Checks if this material is equal to another object based on its ID.
	 *
	 * @param obj The object to compare.
	 * @return {@code true} if the objects are equal, {@code false} otherwise.
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		if (getClass() == obj.getClass())
		{
			Material otherClass = (Material)obj;
			if (id == otherClass.id) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
}
