package creatingconditions;

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
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter '1' to test if a specified point falls inside of a specified rectangle!");
		System.out.println("Enter '2' to test if a specified year ends up being a leap year!");
		System.out.println("Enter '3' to test if a specified number end in two zeroes (no more, no less)!");
		System.out.println("Enter '4' to test if a specified date is later than another specified date!");
		System.out.println("Enter '5' to find the total cost of a specified number of two different textbooks!");
		System.out.println("Enter '6' to find the best color match for a specified RGB spectrum!");
		System.out.println("Enter '7' to find if two specified files fit on a specified disk!");

		int num = keyboard.nextInt();

		switch (num) {
		case 1:
			Scanner kboard1 = new Scanner(System.in);

			System.out.print("Enter the x-value of the point --> ");
			int case1num1 = kboard1.nextInt();

			System.out.print("Enter the y-value of the point --> ");
			int case1num2 = kboard1.nextInt();

			System.out.print("Enter the starting x-value of the rectangle --> ");
			int case1num3 = kboard1.nextInt();

			System.out.print("Enter the starting y-value of the rectangle --> ");
			int case1num4 = kboard1.nextInt();

			System.out.print("Enter the width of the rectangle --> ");
			int case1num5 = kboard1.nextInt();

			System.out.print("Enter the height of the rectangle --> ");
			int case1num6 = kboard1.nextInt();

			ConditionTester tester1 = new ConditionTester();
			boolean result1 = tester1.isPointInRectangle(case1num1, case1num2, case1num3, case1num4, case1num5,
					case1num6);

			System.out.println("The result of the test: " + result1);
			break;
		case 2:
			Scanner kboard2 = new Scanner(System.in);

			System.out.print("Enter a year --> ");
			int case2num1 = kboard2.nextInt();

			ConditionTester tester2 = new ConditionTester();
			boolean result2 = tester2.isLeapYear(case2num1);

			System.out.println("The result of the test: " + result2);
			break;
		case 3:
			Scanner kboard3 = new Scanner(System.in);

			System.out.print("Enter a caseber --> ");
			int case3num1 = kboard3.nextInt();

			ConditionTester tester3 = new ConditionTester();
			boolean result3 = tester3.hasTwoEndingZeros(case3num1);

			System.out.println("The result of the test: " + result3);
			break;
		case 4:
			Scanner kboard4 = new Scanner(System.in);

			System.out.print("Enter the first month --> ");
			int case4num1 = kboard4.nextInt();

			System.out.print("Enter the first day --> ");
			int case4num2 = kboard4.nextInt();

			System.out.print("Enter the first year --> ");
			int case4num3 = kboard4.nextInt();

			System.out.print("Enter the second month --> ");
			int case4num4 = kboard4.nextInt();

			System.out.print("Enter the second day --> ");
			int case4num5 = kboard4.nextInt();

			System.out.print("Enter the second year --> ");
			int case4num6 = kboard4.nextInt();

			ConditionTester tester4 = new ConditionTester();
			boolean result4 = tester4.isLater(case4num1, case4num2, case4num3, case4num4, case4num5, case4num6);

			System.out.println("The result of the test: " + result4);
			break;
		case 5:
			Scanner kboard5 = new Scanner(System.in);

			System.out.print("Enter the caseber of 'Be Prepared' textbooks --> ");
			int case5num1 = kboard5.nextInt();

			System.out.print("Enter the caseber of 'Next Best' textbooks --> ");
			int case5num2 = kboard5.nextInt();

			ConditionTester tester5 = new ConditionTester();
			double result5 = tester5.getOrderTotal(case5num1, case5num2);

			System.out.println("Your total cost is $" + result5);
			break;
		case 6:
			Scanner kboard6 = new Scanner(System.in);

			System.out.print("Enter the red component of the RGB spectrum --> ");
			int case6num1 = kboard6.nextInt();

			System.out.print("Enter the green component of the RGB spectrum --> ");
			int case6num2 = kboard6.nextInt();

			System.out.print("Enter the blue component of the RGB spectrum --> ");
			int case6num3 = kboard6.nextInt();

			ConditionTester tester6 = new ConditionTester();
			Color result6 = tester6.bestMatch(case6num1, case6num2, case6num3);

			System.out.println("The color closest to your input is " + result6);
			break;
		case 7:
			Scanner kboard7 = new Scanner(System.in);

			System.out.print("Enter the first file size --> ");
			int case7num1 = kboard7.nextInt();

			System.out.print("Enter the second file size --> ");
			int case7num2 = kboard7.nextInt();

			System.out.print("Enter the total disk space available --> ");
			int case7num3 = kboard7.nextInt();

			ConditionTester tester7 = new ConditionTester();
			int result7 = tester7.findBestFit(case7num1, case7num2, case7num3);

			System.out.println("The combination of files that fit on the disk are " + result7);
			break;
		default:
			System.out.println("That wasn't one of the options, silly!");
		}
	}
}