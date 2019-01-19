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
			String[] gradeArray = new String[numOfClasses];
			
			for (int i = 0; i<numOfClasses; i++) {
				System.out.print("Enter letter grade in class " + (i+1) + " ---> ");
				gradeArray[i] = kboard.next();
			}
			
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