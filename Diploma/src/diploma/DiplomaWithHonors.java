package diploma;

/*
 * Lab 31 for Mr. Taylor's Java Class
 * Author: Liad Hermelin
 * Date: April 1, 2018
 * Description: This lab represents a Diploma.
 * Revision 4.3
*/

public class DiplomaWithHonors extends Diploma {
	
	// Creates a diplomawithhonors with a name and subject
	public DiplomaWithHonors(String name, String subject) {
		super(name, subject + "\n*** with honors ***");
	}

}