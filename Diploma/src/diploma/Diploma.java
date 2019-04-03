package diploma;

/*
 * Lab 31 for Mr. Taylor's Java Class
 * Author: Liad Hermelin
 * Date: April 1, 2018
 * Description: This lab represents a Diploma.
 * Revision 4.3
*/

public class Diploma {

	private String name;
	private String subject;

	// Creates a diploma with a name and subject
	public Diploma(String name, String subject) {
		this.name = name;
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "This certifies that\n" + name + "\nhas completed a course in " + subject;
	}

}