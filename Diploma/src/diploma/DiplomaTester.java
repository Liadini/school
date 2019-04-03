package diploma;

/*
 * Lab 31 for Mr. Taylor's Java Class
 * Author: Liad Hermelin
 * Date: April 1, 2018
 * Description: This lab represents a Diploma.
 * Revision 4.3
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
		Diploma diploma3 = new DiplomaWithHonors("Liad Hermelin", "Epic Gaming");
		System.out.println(diploma1);
		System.out.println(diploma2);
		System.out.println(diploma3);
	}
	
}