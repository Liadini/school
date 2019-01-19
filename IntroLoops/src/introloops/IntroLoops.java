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

public class IntroLoops {

	// divide (m=numerator, n=denominator)
	public void divide(int numerator, int denominator) {
		int quotient = 0, remainder = 0, sum = 0;
		if (numerator > denominator) {
			while ((numerator - denominator) >= sum) {
				sum += denominator;
				quotient++;
				remainder = (numerator - sum);
			}
		} else if (numerator == denominator) {
			quotient = 1;
			remainder = 0;
		} else if (numerator < 0 || denominator < 0) {
			System.out.println("I'm sorry, but this calculator currently can't handle negative numbers");
		} else {
			quotient = 0;
			remainder = denominator;
		}
		System.out.println("Quotient: " + quotient + " Remainder: " + remainder + "\n");
	}

	//print a series of numbers between a starting and ending value
	public void printSeries(int start, int end) {
		System.out.print("\n");

		for (; start <= end; start++) {
			System.out.println("" + start);
		}
		System.out.print("\n");
	}

	// print a series of words (number of words = length of word)
	public void repeatWord(String word) {
		System.out.print("\n");
		int wordLength = word.length();

		for (int i = 0; i < wordLength; i++) {
			System.out.println("" + word);
		}
		System.out.print("\n");
	}

	// print two words, connected by dots, where total characters = 30
	public void printIndexLine(String word1, String word2) {
		System.out.print("\n");
		int totalWordLength = word1.length() + word2.length();
		System.out.print(word1);

		for (int i = 0; i < (30 - totalWordLength); i++) {
			System.out.print(".");
		}

		System.out.println(word2);
	}

	// adds integers until user inputs "stop"
	public void addIntegers() {
		boolean shouldContinue = true;
		int[] numberArray = new int[25];
		String[] stringArray = new String[25];
		int i = 0, sum = 0;
		Scanner keyboard = new Scanner(System.in);

		do {
			System.out.print("Enter a number/command ---> ");
			stringArray[i] = keyboard.next();
			if (isInteger(stringArray[i])) {
				numberArray[i] = Integer.parseInt(stringArray[i]);
				sum += numberArray[i];
				System.out.println("Current total: " + sum);
				i++;
			} else if (stringArray[i].equalsIgnoreCase("stop")) {
				System.out.println("Sum: " + sum + "\n");
				shouldContinue = false;
			} else {
				System.out.println("I'm sorry, that wasn't an option!");
			}
		} while (shouldContinue);
	}

	// finds average of all numbers until user inputs "stop"
	public void findAverage() {
		boolean shouldContinue = true;
		int[] numberArray = new int[25];
		String[] stringArray = new String[25];
		int i = 0, sum = 0;
		Scanner keyboard = new Scanner(System.in);

		do {
			System.out.print("Enter a number/command ---> ");
			stringArray[i] = keyboard.next();
			if (isInteger(stringArray[i])) {
				numberArray[i] = Integer.parseInt(stringArray[i]);
				sum += numberArray[i];
				System.out.println("Current total: " + sum);
				i++;
			} else if (stringArray[i].equalsIgnoreCase("stop")) {
				System.out.println("Average: " + (Math.round(((double) sum / (double) i) * 100.0) / 100.0) + "\n");
				shouldContinue = false;
			} else {
				System.out.println("I'm sorry, that wasn't an option!");
			}
		} while (shouldContinue);
	}

	// computes the sum of all the reciprocals of numbers from 1 to n
	public void computeQuotientSum(int n) {
		double sum = 0;
		for (; n > 0; n--) {
			sum += ((double) 1 / (double) n);
		}
		System.out.println("Sum: " + sum + "\n");
	}

	// finds standard deviation of all numbers inputed by the user
	public void findStandardDeviation(int[] intArray, int num) {
		int sum = 0, squareSum = 0;
		double average = 0, squareAverage = 0;
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < num; i++) {
			System.out.print("Number " + (i + 1) + " -----> ");
			intArray[i] = s.nextInt();
			sum += intArray[i];
			squareSum += intArray[i] * intArray[i];
		}
		average = (double) sum / (double) num;
		squareAverage = (double) squareSum / (double) num;
		double standardDeviation = Math.sqrt(squareAverage - (average * average));
		System.out.println("Standard Deviation: " + standardDeviation);
	}

	// method override
	public static boolean isInteger(String s) {
		return isInteger(s, 10);
	}

	// checks if a string is an integer
	public static boolean isInteger(String s, int radix) {
		Scanner sc = new Scanner(s.trim());
		if (!sc.hasNextInt(radix))
			return false;
		sc.nextInt(radix);
		return !sc.hasNext();
	}
}