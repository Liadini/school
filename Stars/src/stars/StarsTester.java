package stars;

import java.util.Scanner;

/*
 * Lab 25 for Mr. Taylor's Java Class
 * Author: Liad Hermelin
 * Date: December 22, 2018
 * Description: This lab represents a shape creator, using for loops.
 * Revision 2.1
*/

public class StarsTester {

	// The menu for the stars lab
	public static void main(String[] args) throws InterruptedException {
		Stars starTester = new Stars();
		Scanner kboard = new Scanner(System.in);
		boolean shouldContinue = true;
		do {
			System.out.println("~~~~~ WELCOME TO STAR LABORATORIES ~~~~~");
			System.out.print("Enter the name of a shape, or 'quit' ---> ");
			switch (kboard.next().toUpperCase()) {
			case "PRINT":
			case "LINE":
			case "LN":
				System.out.print("What should the length of the line be? ---> ");
				starTester.printStars(kboard.nextInt());
				Thread.sleep(1000);
				break;
			case "SQUARE":
			case "SQ":
				System.out.print("What should the side length of the square be? ---> ");
				starTester.printStarSquare(kboard.nextInt());
				Thread.sleep(1000);
				break;
			case "GRID":
			case "GRD":
			case "G":
				System.out.print("What should the side length of the grid be? ---> ");
				starTester.printStarGrid(kboard.nextInt());
				Thread.sleep(1000);
				break;
			case "TRIANGLE":
			case "TRI":
			case "TR":
			case "T":
				System.out.print("What should the height of the triangle be? ---> ");
				starTester.printStarTriangle(kboard.nextInt());
				Thread.sleep(1000);
				break;
			case "INVERTED TRIANGLE":
			case "INVERTEDTRIANGLE":
			case "INV TRIANGLE":
			case "INV TRI":
			case "I T":
			case "IT":
				System.out.print("What should the height of the triangle be? ---> ");
				starTester.printStarInvertedTriangle(kboard.nextInt());
				Thread.sleep(1000);
				break;
			case "PYRAMID":
			case "PRMD":
			case "PMD":
			case "PYR":
			case "PY":
			case "P":
				System.out.print("What should the height of the pyramid be? ---> ");
				starTester.printStarPyramid(kboard.nextInt());
				Thread.sleep(1000);
				break;
			case "DIAMOND":
			case "DIAM":
			case "DMND":
			case "DMN":
			case "DM":
			case "D":
				System.out.print("What should the height of the diamond be? ---> ");
				starTester.printStarDiamond(kboard.nextInt());
				Thread.sleep(1000);
				break;
			case "QUIT":
			case "EXIT":
			case "STOP":
			case "Q":
				System.out.println("Quitting now");
				shouldContinue = false;
				kboard.close();
				break;
			default:
				System.out.println("That wasn't an option. Try again!\n");
				break;
			}
		} while (shouldContinue);
	}

}
