package diploma;

/*
 * Lab 31 for Mr. Taylor's Java Class
 * Author: Liad Hermelin
 * Date: April 1, 2018
 * Description: This lab represents a Diploma.
 * Revision 4.2
*/

public class DiplomaWithHonors extends Diploma {

	// Creates a diplomawithhonors with a default name and default subject
	public DiplomaWithHonors() {
		super();
	}
	
	// Creates a diplomawithhonors with a name and default subject
	public DiplomaWithHonors(String name) {
		super(name);
	}
	
	// Creates a diplomawithhonors with a name and subject
	public DiplomaWithHonors(String name, String subject) {
		super(name, subject);
	}
	
	@Override
	public String toString() {
		return "This certifies that\n" + name + "\nhas completed a course in " + subject + "\n*** with honors ***";
	}

}