package seedu.addressbook.data.person;

/**
 * Represents a Person's unit number in the address book. Guarantees: immutable
 */
public class Unit {
	private String unit = "";

	/**
	 * constructor
	 */
	public Unit(String unit) {
		this.unit = unit.trim();
	}

	@Override
	public String toString() {
		return unit;
	}

}
