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
	public String nameEcho(String input) {
		return input.substring(0, input.indexOf(" ")) + input.substring(input.indexOf(" ")).toUpperCase();
//		int spaceIndex = s.indexOf(" ");
//		String firstName = s.substring(0, spaceIndex), lastName = s.substring(spaceIndex);
//		lastName = lastName.toUpperCase();
//		return firstName + lastName;
	}

	// true if specified string ends with a star
	public boolean endsWithStar(String input) {
		return (input.length() > 0 && input.endsWith("*"));
//		if (!s.equals(""))
//			return s.endsWith("*");
//		else
//			return false;
	}

	// true if specified string ends with two stars
	public boolean endsWithTwoStars(String input) {
		return (input.length() > 1 && input.endsWith("**"));
//		if (s.length() > 1)
//			return s.endsWith("**");
//		else
//			return false;
	}

	// returns last 4 characters of specified string
	public String last4(String input) {
		return input.substring(input.length() - 5);
	}

	// returns last 5 characters of specified string
	public String last5(String input) {
		return input.substring(input.length() - 6).replace(" ", "");
	}

	// returns specified string with first letter moved to the end
	public String scroll(String input) {
		return input.substring(1) + input.substring(0, 1);
	}

	// takes lastname, firstname and converts it to firstname lastname
	public String convertName(String name) {
		return name.substring(name.indexOf(",") + 1) + " " + name.substring(0, name.indexOf(","));
//		int commaIndex = s.indexOf(",");
//		String lastName = s.substring(0, commaIndex);
//		String firstName = s.substring(commaIndex + 1);
//		return firstName + " " + lastName;
	}

	// removes all dashes from specified string
	public String removeDashes(String input) {
		return input.replace("-", "");
	}

	// converts mm/dd/yyyy to dd-mm-yyyy
	public String dateStr(String date) {
		int firstSlashIndex = date.indexOf("/");
		int secondSlashIndex = date.indexOf("/", firstSlashIndex + 1);
		String mm = date.substring(0, firstSlashIndex);
		String dd = date.substring(firstSlashIndex + 1, secondSlashIndex);
		String yyyy = date.substring(secondSlashIndex + 1);
		if (mm.length() < 2)
			mm = "0" + mm;
		if (dd.length() < 2)
			dd = "0" + dd;
		return dd + "-" + mm + "-" + yyyy;
	}

	// switches 0s and 1s
	public String negativeBits(String input) {
		return input.replace("0", "a").replace("1", "0").replace("a", "1").trim();
//		s = s.replace("0", "a");
//		s = s.replace("1", "b");
//		s = s.replace("a", "1");
//		s = s.replace("b", "0");
//		return s.trim();
	}

	// returns true if all characters in specified string are the same
	public boolean containsSameChar(String input) {
		return input.length() - input.replaceAll(input.charAt(0) + "", "").length() == input.length();
//		String char = s.charAt(0) + "";
//		int count = s.length() - s.replaceAll(char,"").length();
//		return count == s.length();
	}

	// removes any /*...*/ comments from specified string
	public String removeComments(String input) {
		if (!input.contains("/*") || !input.contains("*/"))
			return input;
		else {
			return input.replace(input.substring(input.indexOf("/*"), input.indexOf("*/") + 2), "").replace("  ", " ");
//			int firstIndex = s.indexOf("/*");
//			int lastIndex = s.indexOf("*/");
//			String remove = s.substring(firstIndex, lastIndex + 2);
//			return s.replace(remove, "").replace("  ", " ");
		}
	}

	/**
	 * returns the specified string switched with the alphabet, shifted over n units
	 * 
	 * @param msg - the message to be encoded
	 * @param shift - the shift over the alphabet
	 * @return encoded message
	 */
	public String caesar(String msg, int shift) {
		String result = "";
	    int len = msg.length();
	    for(int i = 0; i < len; i++){
	    	if (!Character.isLetter(msg.charAt(i))) {
	    		result += msg.charAt(i);
	    		continue;
	    	}
	        char c = (char)(msg.charAt(i) + shift);
	        if (c > 'z')
	            result += (char)(msg.charAt(i) - (26-shift));
	        else
	            result += (char)(msg.charAt(i) + shift);
	    }
	    return result;
	}

	// returns true if the reversed string is equal to the specified string
	public boolean isPalindrome(String input) {
		return new StringBuilder(input.replace(" ", "")).reverse().toString().equalsIgnoreCase(input.replace(" ", ""));
	}

	/*
	 * returns true if the specified string contains no spaces, is longer than 7
	 * characters, has both lowercase and uppercase characters, and contains numbers
	 */
	public boolean validPassword(String pass) {
		return !pass.contains(" ") && pass.length() > 7 && !pass.toLowerCase().equals(pass) && !pass.toUpperCase().equals(pass)
				&& pass.matches(".*\\d+.*");
	}

}