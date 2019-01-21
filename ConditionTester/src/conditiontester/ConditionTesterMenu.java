package conditiontester;

import java.awt.Color;
import java.util.Scanner;

/*
 * Lab 20 for Mr. Taylor's Java Class
 * Author: Liad Hermelin
 * Date: November 28, 2018
 * Description: This lab represents a tester for simple boolean methods.
 * Revision 2.2
*/

public class ConditionTesterMenu {

	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		ConditionTester tester = new ConditionTester();
		boolean shouldContinue = true;
		do {
		System.out.println("Enter '1' to test if a specified point falls inside of a specified rectangle!");
		System.out.println("Enter '2' to test if a specified year ends up being a leap year!");
		System.out.println("Enter '3' to test if a specified number end in two zeroes (no more, no less)!");
		System.out.println("Enter '4' to test if a specified date is later than another specified date!");
		System.out.println("Enter '5' to find the total cost of a specified number of two different textbooks!");
		System.out.println("Enter '6' to find the best color match for a specified RGB spectrum!");
		System.out.println("Enter '7' to find if two specified files fit on a specified disk!");
		System.out.println("Enter '8' to quit!");

		int num = kboard.nextInt();

		switch (num) {
		case 1:
			System.out.print("Enter the x-value of the point --> ");
			int choice1 = kboard.nextInt();

			System.out.print("Enter the y-value of the point --> ");
			int choice2 = kboard.nextInt();

			System.out.print("Enter the starting x-value of the rectangle --> ");
			int choice3 = kboard.nextInt();

			System.out.print("Enter the starting y-value of the rectangle --> ");
			int choice4 = kboard.nextInt();

			System.out.print("Enter the width of the rectangle --> ");
			int choice5 = kboard.nextInt();

			System.out.print("Enter the height of the rectangle --> ");
			int choice6 = kboard.nextInt();

			boolean bResult = tester.isPointInRectangle(choice1, choice2, choice3, choice4, choice5, choice6);

			System.out.println("The result of the test: " + bResult);
			break;
		case 2:
			System.out.print("Enter a year --> ");
			choice1 = kboard.nextInt();

			bResult = tester.isLeapYear(choice1);

			System.out.println("The result of the test: " + bResult);
			break;
		case 3:
			System.out.print("Enter a number --> ");
			choice1 = kboard.nextInt();

			bResult = tester.hasTwoEndingZeros(choice1);

			System.out.println("The result of the test: " + bResult);
			break;
		case 4:
			System.out.print("Enter the first month --> ");
			choice1 = kboard.nextInt();

			System.out.print("Enter the first day --> ");
			choice2 = kboard.nextInt();

			System.out.print("Enter the first year --> ");
			choice3 = kboard.nextInt();

			System.out.print("Enter the second month --> ");
			choice4 = kboard.nextInt();

			System.out.print("Enter the second day --> ");
			choice5 = kboard.nextInt();

			System.out.print("Enter the second year --> ");
			choice6 = kboard.nextInt();

			bResult = tester.isLater(choice1, choice2, choice3, choice4, choice5, choice6);

			System.out.println("The result of the test: " + bResult);
			break;
		case 5:
			System.out.print("Enter the number of 'Be Prepared' textbooks --> ");
			choice1 = kboard.nextInt();

			System.out.print("Enter the number of 'Next Best' textbooks --> ");
			choice2 = kboard.nextInt();

			double dResult = tester.getOrderTotal(choice1, choice2);

			System.out.println("Your total cost is $" + dResult);
			break;
		case 6:
			Scanner kboard6 = new Scanner(System.in);

			System.out.print("Enter the red component of the RGB spectrum --> ");
			choice1 = kboard6.nextInt();

			System.out.print("Enter the green component of the RGB spectrum --> ");
			choice2 = kboard6.nextInt();

			System.out.print("Enter the blue component of the RGB spectrum --> ");
			choice3 = kboard6.nextInt();

			Color cResult = tester.bestMatch(choice1, choice2, choice3);

			System.out.println("The color closest to your input is " + cResult);
			break;
		case 7:
			System.out.print("Enter the first file size --> ");
			choice1 = kboard.nextInt();

			System.out.print("Enter the second file size --> ");
			choice2 = kboard.nextInt();

			System.out.print("Enter the total disk space available --> ");
			choice3 = kboard.nextInt();

			int result = tester.findBestFit(choice1, choice2, choice3);

			System.out.println("The combination of files that fit on the disk are " + result);
			break;
		case 8:
			shouldContinue = false;
			kboard.close();
			break;
		default:
			System.out.println("That wasn't one of the options, silly!");
		}
		} while (shouldContinue);
	}
}