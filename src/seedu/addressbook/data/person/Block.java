package seedu.addressbook.data.person;

/**
 * Represents a Person's block number in the address book. Guarantees: immutable
 */
public class Block {
	private String block = "";

	/**
	 * constructor
	 */
	public Block(String block) {
		this.block = block.trim();
	}

	@Override
	public String toString() {
		return block;
	}

}
