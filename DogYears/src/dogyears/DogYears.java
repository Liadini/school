package dogyears;

import java.util.Scanner;

/*
 * Lab 17 for Mr. Taylor's Java Class
 * Author: Liad Hermelin
 * Date: November 2, 2018
 * Description: This lab represents a calculator to convert from human to dog years
 * Revision 2.2
*/

public class DogYears {
	public final double DOG_TO_HUMAN = 16.0 / 3.0;
	public final double HUMAN_TO_DOG = 3.0 / 16.0;

	public int convertToHumanYears(int dog) { // converts from dog years to human years
		dog--;
		double human = 0.5 + (dog * DOG_TO_HUMAN + 13.0);
		return (int) human;
	}

	public int convertToDogYears(int human) { // converts from human years to dog years
		double dog = (human) * HUMAN_TO_DOG;
		if (human < 7) {
			dog++;
		}
		return (int) dog - 1;
	}

	public double convertToCelsius(double fahrenheit) { // converts from fahrenheit to celsius
		double celsius = (fahrenheit - 32.0) * 5.0 / 9.0;
		return Math.round(celsius * 100.0) / 100.0;
	}

	public double convertToFahrenheit(double celsius) { // converts from celsius to fahrenheit
		double fahrenheit = celsius * 9.0 / 5.0 + 32.0;
		return Math.round(fahrenheit * 100.0) / 100.0;
	}

	public static void main(String[] args) { // takes in the user input and does the conversion
		Scanner kboard = new Scanner(System.in);
		DogYears converter = new DogYears();
		boolean shouldContinue = true;
		do {
		System.out.println("Enter '1' for dog years to human years!");
		System.out.println("Enter '2' for human years to dog years!");
		System.out.println("Enter '3' for fahrenheit to celsius!");
		System.out.println("Enter '4' for celsius to fahrenheit!");
		System.out.println("Enter '5' to quit!");
		int choice = kboard.nextInt();

		switch (choice) {
		case 1:
			System.out.print("Enter a dog age ----->");
			int dog = kboard.nextInt();
			int human = converter.convertToHumanYears(dog);
			System.out.println(dog + " dog years is " + human + " human years");
			break;
		case 2:
			System.out.print("Enter a human age ----->");
			human = kboard.nextInt();
			dog = converter.convertToDogYears(human);
			System.out.println(human + " human years is " + dog + " dog years");
			break;
		case 3:
			System.out.print("Enter a temperature in fahrenheit ----->");
			double fahrenheit = kboard.nextDouble();
			double celsius = converter.convertToCelsius(fahrenheit);
			System.out.println(fahrenheit + " degrees fahrenheit is " + celsius + " degrees celsius");
			break;
		case 4:
			System.out.print("Enter a temperature in celsius ----->");
			celsius = kboard.nextInt();
			fahrenheit = converter.convertToFahrenheit(celsius);
			System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
			break;
		case 5:
			kboard.close();
			shouldContinue = false;
			break;
		default:
			System.out.println("That wasn't one of the choices, silly!");
		}
		} while (shouldContinue);
	}

}