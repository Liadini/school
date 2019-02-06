package stringtoolbox;

/*
 * Lab 26 for Mr. Taylor's Java Class
 * Author: Liad Hermelin
 * Date: February 1, 2019
 * Description: This lab represents a tester for String methods. For my experimentation, I changed
 * as many methods as I could to only include a single return statement (but kept the original solution).
 * Revision 2.1
*/

public class StringToolBox {

	// returns firstname [space] capital LASTNAME
	public String nameEcho(String s) {
		return s.substring(0, s.indexOf(" ")) + s.substring(s.indexOf(" ")).toUpperCase();
//		int spaceIndex = s.indexOf(" ");
//		String firstName = s.substring(0, spaceIndex), lastName = s.substring(spaceIndex);
//		lastName = lastName.toUpperCase();
//		return firstName + lastName;
	}

	// true if specified string ends with a star
	public boolean endsWithStar(String s) {
		return (s.length() > 0 && s.endsWith("*"));
//		if (!s.equals(""))
//			return s.endsWith("*");
//		else
//			return false;
	}

	// true if specified string ends with two stars
	public boolean endsWithTwoStars(String s) {
		return (s.length() > 1 && s.endsWith("**"));
//		if (s.length() > 1)
//			return s.endsWith("**");
//		else
//			return false;
	}

	// returns last 4 characters of specified string
	public String last4(String s) {
		return s.substring(s.length() - 5);
	}

	// returns last 5 characters of specified string
	public String last5(String s) {
		return s.substring(s.length() - 6).replace(" ", "");
	}

	// returns specified string with first letter moved to the end
	public String scroll(String s) {
		return s.substring(1) + s.substring(0, 1);
	}

	// takes lastname, firstname and converts it to firstname lastname
	public String convertName(String s) {
		return s.substring(s.indexOf(",") + 1) + " " + s.substring(0, s.indexOf(","));
//		int commaIndex = s.indexOf(",");
//		String lastName = s.substring(0, commaIndex);
//		String firstName = s.substring(commaIndex + 1);
//		return firstName + " " + lastName;
	}

	// removes all dashes from specified string
	public String removeDashes(String s) {
		return s.replace("-", "");
	}

	// converts mm/dd/yyyy to dd-mm-yyyy
	public String dateStr(String s) {
//		return s.substring(s.indexOf("/") + 1, s.indexOf("/", s.indexOf("/") + 1)) + "-"
//				+ s.substring(0, s.indexOf("/")) + "-" + s.substring(s.indexOf("/", s.indexOf("/") + 1) + 1); // doesn't work with added zeros
		int firstSlashIndex = s.indexOf("/");
		int secondSlashIndex = s.indexOf("/", firstSlashIndex + 1);
		String mm = s.substring(0, firstSlashIndex);
		String dd = s.substring(firstSlashIndex + 1, secondSlashIndex);
		String yyyy = s.substring(secondSlashIndex + 1);
		if (mm.length() < 2)
			mm = "0" + mm;
		if (dd.length() < 2)
			dd = "0" + dd;
		return dd + "-" + mm + "-" + yyyy;
	}

	// switches 0s and 1s
	public String negativeBits(String s) {
		return s.replace("0", "a").replace("1", "0").replace("a", "1").trim();
//		s = s.replace("0", "a");
//		s = s.replace("1", "b");
//		s = s.replace("a", "1");
//		s = s.replace("b", "0");
//		return s.trim();
	}
	
	// returns true if all characters in specified string are the same
	public boolean containsSameChar(String s) {
		return s.length() - s.replaceAll(s.charAt(0) + "", "").length() == s.length();
//		String char = s.charAt(0) + "";
//		int count = s.length() - s.replaceAll(char,"").length();
//		return count == s.length();
	}
	
	// removes any /*...*/ comments from specified string
	public String removeComments(String s) {
		if (!s.contains("/*") || !s.contains("*/"))
			return s;
		else {
			return s.replace(s.substring(s.indexOf("/*"), s.indexOf("*/") + 2), "").replace("  ", " ");
//			int firstIndex = s.indexOf("/*");
//			int lastIndex = s.indexOf("*/");
//			String remove = s.substring(firstIndex, lastIndex + 2);
//			return s.replace(remove, "").replace("  ", " ");
		}
	}

}