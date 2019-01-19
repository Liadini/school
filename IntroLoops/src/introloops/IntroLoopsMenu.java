package introloops;

import java.util.Scanner;

/*
 * Lab 24 for Mr. Taylor's Java Class
 * Author: Liad Hermelin
 * Date: December 12, 2018
 * Description: This lab represents a tester for loops.
 * Disclaimer: Although it may look like I just copied some of this content
 * from the internet, all of this is original work. I have just been learning
 * Java on my own outside of school.
 * Revision 8.0
*/

public class IntroLoopsMenu {

	// The main method which is the menu
	public static void main(String[] args) {
		boolean shouldContinue = true;
		IntroLoops looper1 = new IntroLoops();
		Scanner kboard = new Scanner(System.in);
		do {
			System.out.println("---MENU---");
			System.out.println("What would you like to see?");
			System.out.println("1) Division");
			System.out.println("2) Print Series of Numbers");
			System.out.println("3) Repeat Word");
			System.out.println("4) Print Index Line");
			System.out.println("5) Add Integers");
			System.out.println("6) Find Average");
			System.out.println("7) Compute Quotient Sum");
			System.out.println("8) Find Standard Deviation");
			System.out.println("9) QUIT");
			System.out.print("-----> ");
			String menuChoice = kboard.next();

			switch (menuChoice) {
			case ("division"):
			case ("1"):
				System.out.print("Enter numerator -----> ");
				int choice1 = kboard.nextInt();
				System.out.print("Enter denominator -----> ");
				int choice2 = kboard.nextInt();
				looper1.divide(choice1, choice2);
				break;
			case ("printseries"):
			case ("2"):
				System.out.print("Enter starting number -----> ");
				choice1 = kboard.nextInt();
				System.out.print("Enter ending number -----> ");
				choice2 = kboard.nextInt();
				looper1.printSeries(choice1, choice2);
				break;
			case ("repeatword"):
			case ("3"):
				System.out.print("Enter a word -----> ");
				String wordChoice = kboard.next();
				looper1.repeatWord(wordChoice);
				break;
			case ("printindexline"):
			case ("4"):
				System.out.print("Enter first word -----> ");
				String str1 = kboard.next();
				System.out.print("Enter second word -----> ");
				String str2 = kboard.next();
				looper1.printIndexLine(str1, str2);
				break;
			case ("addIntegers"):
			case ("5"):
				System.out.println("This program will add integers until you type 'stop'");
				looper1.addIntegers();
				break;
			case ("findAverage"):
			case ("6"):
				System.out.println("This program will take integers until you type 'stop'");
				looper1.findAverage();
				break;
			case ("computeQuotientSum"):
			case ("7"):
				System.out.print("Enter an end denominator -----> ");
				choice1 = kboard.nextInt();
				looper1.computeQuotientSum(choice1);
				break;
			case ("findStandardDeviation"):
			case ("8"):
				System.out.println("How many numbers will you input? -----> ");
				int i = kboard.nextInt();
				int[] array = new int[i];
				looper1.findStandardDeviation(array, i);
				break;
			case ("quit"):
			case ("9"):
				System.out.println("Thank you for choosing LIAD!");
				shouldContinue = false;
				break;
			default:
				System.out.println("Sorry, but that isn't an option!");
			}

		} while (shouldContinue);
	}

}