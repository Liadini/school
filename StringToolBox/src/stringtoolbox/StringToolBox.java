package stringtoolbox;

/*
 * Lab 26 for Mr. Taylor's Java Class
 * Author: Liad Hermelin
 * Date: February 1, 2019
 * Description: This lab represents a tester for String methods.
 * Revision 2.1
*/

public class StringToolBox {
	
	public String nameEcho(String s) {
		int spaceIndex = s.indexOf(" ");
		String firstName = s.substring(0, spaceIndex), lastName = s.substring(spaceIndex);
		lastName = lastName.toUpperCase();
		return firstName + lastName;
	}
	
	public boolean endsWithStar(String s) {
		if (!s.equals(""))
			return s.endsWith("*");
		else
			return false;
	}

	public boolean endsWithTwoStars(String s) {
		if (s.length() > 1)
			return s.endsWith("**");
		else
			return false;
	}

	public String last4(String s) {
		return s.substring(s.length() - 5);
	}

	public String last5(String s) {
		return s.substring(s.length() - 6).replace(" ", "");
	}

	public String scroll(String s) {
		return s.substring(1) + s.substring(0, 1);
	}

	public String convertName(String s) {
		int commaIndex = s.indexOf(",");
		String lastName = s.substring(0, commaIndex);
		String firstName = s.substring(commaIndex + 1);
		return firstName + " " + lastName;
	}
}