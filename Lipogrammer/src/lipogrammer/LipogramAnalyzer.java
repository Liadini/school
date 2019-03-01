package lipogrammer;

/*
 * Lab 27 for Mr. Taylor's Java Class
 * Author: Liad Hermelin
 * Date: February 13, 2019
 * Description: This lab represents a helper for creating lipograms.
 * Revision 2.1
*/

public class LipogramAnalyzer {

	String s;

	public LipogramAnalyzer(String s) {
		this.s = s;
	}

	// returns the string with all specified characters replaced with a pound sign
	public String mark(char c) {
		return s.replace(c, '#');
	}

//	public String allWordsWith(char c) { //DOES NOT WORK WITH TESTER, 60%
//		String[] words = s.split("\\s+");
//		String result = "";
//		for (int i = 0; i < words.length; i++) {
//			if (!words[i].contains("" + c))
//				continue;
//			result += words[i] + "\n";
//		}
//		return result;
//	}

	// returns all words with the specified letter, seperated by a new line
	public String allWordsWith(char c) {
		String answer = "";
		int i = s.indexOf(c);
		while (i >= 0) {
			int start = i;
			while ((start >= 0) && ((Character.isLetter(s.charAt(start))) || (s.charAt(start) == '\'')
					|| (s.charAt(start) == '-'))) {
				start--;
			}
			int end = i;
			while ((end < s.length())
					&& ((Character.isLetter(s.charAt(end))) || (s.charAt(end) == '\'') || (s.charAt(end) == '-'))) {
				end++;
			}
			String word = s.substring(start + 1, end);
			if ((!answer.contains("\n" + word + "\n")) && (!answer.startsWith(word + "\n"))
					&& (!answer.endsWith("\n" + word))) {
				answer = answer + word + "\n";
			}
			i = s.indexOf(c, i + 1);
		}
		return answer;
	}

}
