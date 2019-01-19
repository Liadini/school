package gpacalculator;

import java.util.Scanner;

/*
 * S1 Final Practice for Mr. Taylor's Java Class
 * Author: Liad Hermelin
 * Date: December 14, 2018
 * Description: This project represents a GPA Calculator.
 * Revision 1.0
*/

public class GPACalculatorMenu {
	static String str1, str2, str3, str4, str5, str6, str7;

	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		boolean shouldContinue = true;
		while (shouldContinue) {
			System.out.print("How many classes are you taking this semester? ---> ");
			int numOfClasses = kboard.nextInt();

			switch (numOfClasses) {
			case 1:
				System.out.print("Enter your letter grade in your first class ---> ");
				str1 = kboard.next();
				break;
			case 2:
				System.out.print("Enter your letter grade in your first class ---> ");
				str1 = kboard.next();
				System.out.print("Enter your letter grade in your second class ---> ");
				str2 = kboard.next();
				break;
			case 3:
				System.out.print("Enter your letter grade in your first class ---> ");
				str1 = kboard.next();
				System.out.print("Enter your letter grade in your second class ---> ");
				str2 = kboard.next();
				System.out.print("Enter your letter grade in your third class ---> ");
				str3 = kboard.next();
				break;
			case 4:
				System.out.print("Enter your letter grade in your first class ---> ");
				str1 = kboard.next();
				System.out.print("Enter your letter grade in your second class ---> ");
				str2 = kboard.next();
				System.out.print("Enter your letter grade in your third class ---> ");
				str3 = kboard.next();
				System.out.print("Enter your letter grade in your fourth class ---> ");
				str4 = kboard.next();
				break;
			case 5:
				System.out.print("Enter your letter grade in your first class ---> ");
				str1 = kboard.next();
				System.out.print("Enter your letter grade in your second class ---> ");
				str2 = kboard.next();
				System.out.print("Enter your letter grade in your third class ---> ");
				str3 = kboard.next();
				System.out.print("Enter your letter grade in your fourth class ---> ");
				str4 = kboard.next();
				System.out.print("Enter your letter grade in your fifth class ---> ");
				str5 = kboard.next();
				break;
			case 6:
				System.out.print("Enter your letter grade in your first class ---> ");
				str1 = kboard.next();
				System.out.print("Enter your letter grade in your second class ---> ");
				str2 = kboard.next();
				System.out.print("Enter your letter grade in your third class ---> ");
				str3 = kboard.next();
				System.out.print("Enter your letter grade in your fourth class ---> ");
				str4 = kboard.next();
				System.out.print("Enter your letter grade in your fifth class ---> ");
				str5 = kboard.next();
				System.out.print("Enter your letter grade in your sixth class ---> ");
				str6 = kboard.next();
				break;
			case 7:
				System.out.print("Enter your letter grade in your first class ---> ");
				str1 = kboard.next();
				System.out.print("Enter your letter grade in your second class ---> ");
				str2 = kboard.next();
				System.out.print("Enter your letter grade in your third class ---> ");
				str3 = kboard.next();
				System.out.print("Enter your letter grade in your fourth class ---> ");
				str4 = kboard.next();
				System.out.print("Enter your letter grade in your fifth class ---> ");
				str5 = kboard.next();
				System.out.print("Enter your letter grade in your sixth class ---> ");
				str6 = kboard.next();
				System.out.print("Enter your letter grade in your seventh class ---> ");
				str7 = kboard.next();
				break;
			}

			String[] gradeArray = { str1, str2, str3, str4, str5, str6, str7 };

			GPACalculator calc1 = new GPACalculator();
			double result = calc1.calculateGPA(gradeArray, numOfClasses);
			System.out.println("Your GPA this semester is: " + result);

			System.out.println("");
			boolean hasAnswered = false;
			while (hasAnswered == false) {
				System.out.println("Would you like to calculate another GPA? Y/N");
				String ans = kboard.next();
				if (ans.equalsIgnoreCase("Y") || ans.equalsIgnoreCase("Yes")) {
					shouldContinue = true;
					hasAnswered = true;
				} else if (ans.equalsIgnoreCase("N") || ans.equalsIgnoreCase("No")) {
					shouldContinue = false;
					hasAnswered = true;
				} else
					System.out.println("That wasn't an option!");
			}
		}
	}

}