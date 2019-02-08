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

		System.out.println("\n***Testing: boolean endsWithStar(String s)***");
		System.out.println("true = " + stringTool.endsWithStar("abcd*"));
		System.out.println("false = " + stringTool.endsWithStar(""));

		System.out.println("\n***Testing: boolean endsWithTwoStars(String s)***");
		System.out.println("true = " + stringTool.endsWithTwoStars("abcd**"));
		System.out.println("false = " + stringTool.endsWithTwoStars("*"));
		System.out.println("false = " + stringTool.endsWithTwoStars(""));

		System.out.println("\n***Testing: String last4(String s)***");
		System.out.println("3456 = " + stringTool.last4("1234 5678 9012 3456"));

		System.out.println("\n***Testing: String last5(String s)***");
		System.out.println("23456 = " + stringTool.last5("1234 5678 9012 3456"));

		System.out.println("\n***Testing: String scroll(String s)***");
		System.out.println("23451 = " + stringTool.scroll("12345"));

		System.out.println("\n***Testing: String convertName(String s)***");
		System.out.println("Albert Einstein = " + stringTool.convertName("Einstein, Albert"));
		
		System.out.println("\n***Testing: String removeDashes(String s)***");
		System.out.println("987654321 = " + stringTool.removeDashes("987-65-4321"));
		
		System.out.println("\n***Testing: String dateStr(String s)***");
		System.out.println("31-05-2019 = " + stringTool.dateStr("05/31/2019"));
		System.out.println("03-05-2019 = " + stringTool.dateStr("5/3/2019"));
		
		System.out.println("\n***Testing: String negativeBits(String s)***");
		System.out.println("100001111000 = " + stringTool.negativeBits("011110000111"));
		System.out.println("01010 = " + stringTool.negativeBits("   10101      "));
		
		System.out.println("\n***Testing: String containsSameChar(String s)***");
		System.out.println("true = " + stringTool.containsSameChar("dddddddd"));
		System.out.println("false = " + stringTool.containsSameChar("Ccccccc"));
		System.out.println("false = " + stringTool.containsSameChar("vbnnnnn"));
		
		System.out.println("\n***Testing: String removeComments(String s)***");
		System.out.println("John was a good man = " + stringTool.removeComments("John was /*not*/ a good man"));
		System.out.println("John was a good man = " + stringTool.removeComments("John was a good man"));
		
		System.out.println("\n***Testing: String caesar(String s)***");
		System.out.println("Otms bfx f ltti rfs = " + stringTool.caesar("John was a good man", 5));
		System.out.println("Kpio, xbt b hppe nbo. = " + stringTool.caesar("John, was a good man.", 1));
		
		System.out.println("\n***Testing: boolean isPalindrome(String s)***");
		System.out.println("true = " + stringTool.isPalindrome("RaceCar"));
		System.out.println("true = " + stringTool.isPalindrome("racecar"));
		System.out.println("false = " + stringTool.isPalindrome("bananas"));
		System.out.println("true = " + stringTool.isPalindrome("nurses run"));
		
		System.out.println("\n***Testing: boolean validPassword(String s)***");
		System.out.println("true = " + stringTool.validPassword("asuASIUbd1287"));
		System.out.println("false = " + stringTool.validPassword("asjdhasu328"));
		System.out.println("false = " + stringTool.validPassword("AASDJASJD0921"));
		System.out.println("false = " + stringTool.validPassword("asdfjioeJASd"));
		System.out.println("false = " + stringTool.validPassword("asAS12"));
	}

}