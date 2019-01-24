package stars;

import java.util.Scanner;

public class StarsTester {

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
				System.out.print("How many stars should be in the line? ---> ");
				starTester.printStars(kboard.nextInt());
				Thread.sleep(1000);
				break;
			case "SQUARE":
			case "SQ":
				System.out.print("What should be the side length of the square? ---> ");
				starTester.printStarSquare(kboard.nextInt());
				Thread.sleep(1000);
				break;
			case "GRID":
			case "GRD":
			case "G":
				System.out.print("What should be the side length of the grid? ---> ");
				starTester.printStarGrid(kboard.nextInt());
				Thread.sleep(1000);
				break;
			case "TRIANGLE":
			case "TRI":
			case "TR":
			case "T":
				System.out.print("How many rows in the triangle? ---> ");
				starTester.printStarTriangle(kboard.nextInt());
				Thread.sleep(1000);
				break;
			case "INVERTED TRIANGLE":
			case "INVERTEDTRIANGLE":
			case "INV TRIANGLE":
			case "INV TRI":
			case "I T":
			case "IT":
				System.out.print("How many rows in the triangle? ---> ");
				starTester.printStarInvertedTriangle(kboard.nextInt());
				Thread.sleep(1000);
				break;
			case "PYRAMID":
			case "PRMD":
			case "PMD":
			case "PYR":
			case "PY":
			case "P":
				System.out.print("How many rows in the pyramid? ---> ");
				starTester.printStarPyramid(kboard.nextInt());
				Thread.sleep(1000);
				break;
			case "DIAMOND":
			case "DIAM":
			case "DMND":
			case "DMN":
			case "DM":
			case "D":
				System.out.print("What will the height of the diamond be? ---> ");
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
