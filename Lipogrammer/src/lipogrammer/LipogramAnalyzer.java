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

}
