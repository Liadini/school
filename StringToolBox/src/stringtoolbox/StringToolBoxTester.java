package stringtoolbox;

/*
 * Lab 26 for Mr. Taylor's Java Class
 * Author: Liad Hermelin
 * Date: February 1, 2019
 * Description: This lab represents a tester for String methods. For my experimentation, I changed
 * as many methods as I could to only include a single return statement (but kept the original solution).
 * Revision 2.1
*/

public class StringToolBoxTester {

	// tester method for StringToolBox
	public static void main(String[] args) {

		StringToolBox stringTool = new StringToolBox();

		System.out.println("***Testing: String nameEcho(String s)***");
		System.out.println("Fred JONES = " + stringTool.nameEcho("Fred Jones"));

		System.out.println("***Testing: boolean endsWithStar(String s)***");
		System.out.println("true = " + stringTool.endsWithStar("abcd*"));
		System.out.println("false = " + stringTool.endsWithStar(""));

		System.out.println("***Testing: boolean endsWithTwoStars(String s)***");
		System.out.println("true = " + stringTool.endsWithTwoStars("abcd**"));
		System.out.println("false = " + stringTool.endsWithTwoStars("*"));
		System.out.println("false = " + stringTool.endsWithTwoStars(""));

		System.out.println("***Testing: String last4(String s)***");
		System.out.println("3456 = " + stringTool.last4("1234 5678 9012 3456"));

		System.out.println("***Testing: String last5(String s)***");
		System.out.println("23456 = " + stringTool.last5("1234 5678 9012 3456"));

		System.out.println("***Testing: String scroll(String s)***");
		System.out.println("23451 = " + stringTool.scroll("12345"));

		System.out.println("***Testing: String convertName(String s)***");
		System.out.println("Albert Einstein = " + stringTool.convertName("Einstein, Albert"));
		
		System.out.println("***Testing: String removeDashes(String s)***");
		System.out.println("987654321 = " + stringTool.removeDashes("987-65-4321"));
		
		System.out.println("***Testing: String dateStr(String s)***");
		System.out.println("31-05-2019 = " + stringTool.dateStr("05/31/2019"));
		System.out.println("03-05-2019 = " + stringTool.dateStr("5/3/2019"));
		
		System.out.println("***Testing: String negativeBits(String s)***");
		System.out.println("100001111000 = " + stringTool.negativeBits("011110000111"));
		System.out.println("01010 = " + stringTool.negativeBits("   10101      "));
		
		System.out.println("***Testing: String containsSameChar(String s)***");
		System.out.println("true = " + stringTool.containsSameChar("dddddddd"));
		System.out.println("false = " + stringTool.containsSameChar("Ccccccc"));
		System.out.println("false = " + stringTool.containsSameChar("vbnnnnn"));
		
		System.out.println("***Testing: String removeComments(String s)***");
		System.out.println("John was a good man = " + stringTool.removeComments("John was /*not*/ a good man"));
		System.out.println("John was a good man = " + stringTool.removeComments("John was a good man"));
	}

}