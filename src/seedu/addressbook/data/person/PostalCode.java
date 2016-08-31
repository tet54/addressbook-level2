package seedu.addressbook.data.person;

/**
 * Represents a Person's postal code in the address book. Guarantees: immutable
 */
public class PostalCode {
	private String postalCode = "";

	/**
	 * constructor
	 */
	public PostalCode(String postalCode) {
		this.postalCode = postalCode.trim();
	}

	@Override
	public String toString() {
		return postalCode;
	}

}
