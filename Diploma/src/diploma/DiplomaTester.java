package diploma;

/*
 * Lab 31 for Mr. Taylor's Java Class
 * Author: Liad Hermelin
 * Date: April 1, 2018
 * Description: This lab represents a Diploma.
 * Revision 4.2
*/

public class DiplomaTester {
	
	// runs test method
	public static void main(String[] args) {
		test();
	}
	
	// tests Diploma and DiplomaWithHonors classes
	public static void test() {
		Diploma diploma1 = new Diploma("Murray Smith", "Gardening");
		Diploma diploma2 = new DiplomaWithHonors("Lisa Smith", "Evolutionary Psychology");
		System.out.println(diploma1);
		System.out.println(diploma2);
	}
	
}