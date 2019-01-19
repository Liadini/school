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

	public double convertToCelsius(int fahrenheit) { // converts from fahrenheit to celsius
		double celsius = (fahrenheit - 32.0) * 5.0 / 9.0;
		return celsius;
	}

	public double convertToFahrenheit(int celsius) { // converts from celsius to fahrenheit
		double fahrenheit = celsius * 9.0 / 5.0 + 32.0;
		return fahrenheit;
	}

	public static void main(String[] args) { // takes in the user input and does the conversion
		Scanner kboard = new Scanner(System.in);
		System.out.println("Enter '1' for dog years to human years!");
		System.out.println("Enter '2' for human years to dog years!");
		System.out.println("Enter '3' for fahrenheit to celsius!");
		System.out.println("Enter '4' for celsius to fahrenheit!");
		int choice = kboard.nextInt();

		if (choice == 1) {
			Scanner keyboard = new Scanner(System.in);
			System.out.print("Enter a dog age ----->");
			int dog = keyboard.nextInt();
			DogYears converter = new DogYears();
			int human = converter.convertToHumanYears(dog);
			System.out.println(dog + " dog years is " + human + " human years");
		}

		if (choice == 2) {
			Scanner keyboard = new Scanner(System.in);
			System.out.print("Enter a human age ----->"); // human --> dog
			int human = keyboard.nextInt(); // human --> dog
			DogYears converter = new DogYears();
			int dog = converter.convertToDogYears(human); // human --> dog
			System.out.println(human + " human years is " + dog + " dog years");
		}

		if (choice == 3) {
			Scanner keyboard = new Scanner(System.in);
			System.out.print("Enter a temperature in fahrenheit ----->");
			int fahrenheit = keyboard.nextInt();
			DogYears converter = new DogYears();
			double celsius = converter.convertToCelsius(fahrenheit);
			System.out.println(fahrenheit + " degrees fahrenheit is " + celsius + " degrees celsius");
		}

		if (choice == 4) {
			Scanner keyboard = new Scanner(System.in);
			System.out.print("Enter a temperature in celsius ----->");
			int celsius = keyboard.nextInt();
			DogYears converter = new DogYears();
			double fahrenheit = converter.convertToFahrenheit(celsius);
			System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
		}

		if (choice > 4) {
			System.out.println("That wasn't one of the choices, silly!");
		}
	}

}