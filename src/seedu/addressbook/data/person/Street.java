package seedu.addressbook.data.person;

/**
 * Represents a Person's street in the address book. Guarantees: immutable
 */
public class Street {
	private String street = "";

	/**
	 * constructor
	 * @return 
	 */
	public Street(String street) {
		this.street = street.trim();
	}

	@Override
	public String toString() {
		return street;
	}

}