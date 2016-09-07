package seedu.addressbook.data.tag;
import seedu.addressbook.data.person.Person;

/**
 * Each Tagging object will represent an adding or deleting 
 * of a tag for a specific person that happened during that session
 * Guarantees: immutable
 */
public class Tagging {

	private Person person;
	private Tag tag;
	private String tagAction;
	
	public Tagging(Person person, Tag tag, String tagAction){
		this.person = person;
		this.tag = tag;
		if (tagAction.equals("ADD")){
			this.tagAction = "+";
		}
		else if (tagAction.equals("REMOVE")){
			this.tagAction = "-";
		}
	}
	
	public String toString(){
		return tagAction + " " + person.getName() + " " + tag;
	}
}
