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

	public String mark(char c) {
		return s.replace(c, '#');
	}

	public String allWordsWith(char c) {
		String[] words = s.split("\\s+");
		String result = "";
		for (int i = 0; i < words.length; i++) {
			if (!words[i].contains("" + c))
				continue;
			result += words[i] + "\n";
		}
		return result;
	}

//	public String allWordsWith(char letter) {
//		String answer = "";
//		int i = this.s.indexOf(letter);
//		while (i >= 0) {
//			int start = i;
//			while ((start >= 0) && ((Character.isLetter(this.s.charAt(start))) || (this.s.charAt(start) == '\'')
//					|| (this.s.charAt(start) == '-'))) {
//				start--;
//			}
//			int end = i;
//			while ((end < this.s.length()) && ((Character.isLetter(this.s.charAt(end))) || (this.s.charAt(end) == '\'')
//					|| (this.s.charAt(end) == '-'))) {
//				end++;
//			}
//			String word = this.s.substring(start + 1, end);
//			if ((!answer.contains("\n" + word + "\n")) && (!answer.startsWith(word + "\n"))
//					&& (!answer.endsWith("\n" + word))) {
//				answer = answer + word + "\n";
//			}
//			i = this.s.indexOf(letter, i + 1);
//		}
//		return answer;
//	}

}
