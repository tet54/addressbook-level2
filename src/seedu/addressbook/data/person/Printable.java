package seedu.addressbook.data.person;

/**
 * Interface for printing Name, Phone, Email and Address
 * Guarantees: immutable
 */
public interface Printable {
	String getPrintableString();	
}
