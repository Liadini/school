package billingmenu;

import java.util.Scanner;

/*
 * S1 Final for Mr. Taylor's Java Class
 * Author: Liad Hermelin
 * Date: December 20, 2018
 * Description: This final represents a billing menu for Chili's.
 * Revision 2.0
*/

public class BillingMenu1 {
	static double price1 = 8.75;
	static double price2 = 9.5;
	static double price3 = 2.0;
	static double price4 = 1.5;
	static double price5 = 5.0;

	// The main method, which displays the menu and does all of the calculations, all in one.
	public static void main(String[] args) {
		boolean shouldContinue = true;
		while (shouldContinue) {
			
			// The menu (visual only)
			System.out.println("**** Welcome to Chili's ****");
			System.out.println("");
			System.out.println("1) Club Sandwich     $" + price1);
			System.out.println("2) Mini Pizza        $" + price2 + "0");
			System.out.println("3) Soda              $" + price3 + "0");
			System.out.println("4) Coffee            $" + price4 + "0");
			System.out.println("5) Ice Cream Sundae  $" + price5 + "0");
			System.out.println("");
			System.out.print("Enter menu item number --> ");

			// Prompting user input
			Scanner kboard = new Scanner(System.in);
			int menuChoice = kboard.nextInt();

			// switch for selection (this switch also does all the math)
			switch (menuChoice) {
			case 1:
				System.out.println("Thank you for selecting:     Club Sandwich!");
				System.out.print("Enter size of party -------> ");
				int partySize = kboard.nextInt();
				if (partySize >= 6) {
					System.out.println("Subtotal:                    $" + price1);
					System.out.println("Tip (15%):                   $" + Math.round((price1 * 0.15) * 100.0) / 100.0);
					System.out.println("Tax (8.75%):                 $" + Math.round((price1 * 0.0875) * 100.0) / 100.0);
					System.out.println("Total:                       $" + Math.round((price1 + price1 * .15 + price1 * 0.0875) * 100.0) / 100.0);
				}
				else {
					System.out.println("Subtotal:                    $" + price1);
					System.out.println("Tax (8.75%):                 $" + Math.round((price1 * 0.0875) * 100.0) / 100.0);
					System.out.println("Total:                       $" + Math.round((price1 + price1 * 0.0875) * 100.0) / 100.0);
				}
				break;
			case 2:
				System.out.println("Thank you for selecting:     Mini Pizza!");
				System.out.print("Enter size of party -------> ");
				partySize = kboard.nextInt();
				if (partySize >= 6) {
					System.out.println("Subtotal:                    $" + price2 + "0");
					System.out.println("Tip (15%):                   $" + Math.round((price2 * 0.15) * 100.0) / 100.0);
					System.out.println("Tax (8.75%):                 $" + Math.round((price2 * 0.0875) * 100.0) / 100.0);
					System.out.println("Total:                       $" + Math.round((price2 + price2 * .15 + price2 * 0.0875) * 100.0) / 100.0);
				}
				else {
					System.out.println("Subtotal:                    $" + price2 + "0");
					System.out.println("Tax (8.75%):                 $" + Math.round((price2 * 0.0875) * 100.0) / 100.0);
					System.out.println("Total:                       $" + Math.round((price2 + price2 * 0.0875) * 100.0) / 100.0);
				}
				break;
			case 3:
				System.out.println("Thank you for selecting:     Soda!");
				System.out.print("Enter size of party -------> ");
				partySize = kboard.nextInt();
				if (partySize >= 6) {
					System.out.println("Subtotal:                    $" + price3 + "0");
					System.out.println("Tip (15%):                   $" + Math.round((price3 * 0.15) * 100.0) / 100.0 + "0");
					System.out.println("Tax (8.75%):                 $" + Math.round((price3 * 0.0875) * 100.0) / 100.0);
					System.out.println("Total:                       $" + Math.round((price3 + price3 * .15 + price3 * 0.0875) * 100.0) / 100.0);
				}
				else {
					System.out.println("Subtotal:                    $" + price3 + "0");
					System.out.println("Tax (8.75%):                 $" + Math.round((price3 * 0.0875) * 100.0) / 100.0);
					System.out.println("Total:                       $" + Math.round((price3 + price3 * 0.0875) * 100.0) / 100.0);
				}
				break;
			case 4:
				System.out.println("Thank you for selecting:     Coffee!");
				System.out.print("Enter size of party -------> ");
				partySize = kboard.nextInt();
				if (partySize >= 6) {
					System.out.println("Subtotal:                    $" + price4 + "0");
					System.out.println("Tip (15%):                   $" + Math.round((price4 * 0.15) * 100.0) / 100.0);
					System.out.println("Tax (8.75%):                 $" + Math.round((price4 * 0.0875) * 100.0) / 100.0);
					System.out.println("Total:                       $" + Math.round((price4 + price4 * .15 + price4 * 0.0875) * 100.0) / 100.0);
				}
				else {
					System.out.println("Subtotal:                    $" + price4 + "0");
					System.out.println("Tax (8.75%):                 $" + Math.round((price4 * 0.0875) * 100.0) / 100.0);
					System.out.println("Total:                       $" + Math.round((price4 + price4 * 0.0875) * 100.0) / 100.0);
				}
				break;
			case 5:
				System.out.println("Thank you for selecting:     Ice Cream Sundae!");
				System.out.print("Enter size of party -------> ");
				partySize = kboard.nextInt();
				if (partySize >= 6) {
					System.out.println("Subtotal:                    $" + price5 + "0");
					System.out.println("Tip (15%):                   $" + Math.round((price5 * 0.15) * 100.0) / 100.0);
					System.out.println("Tax (8.75%):                 $" + Math.round((price5 * 0.0875) * 100.0) / 100.0);
					System.out.println("Total:                       $" + Math.round((price5 + price5 * .15 + price5 * 0.0875) * 100.0) / 100.0);
				}
				else {
					System.out.println("Subtotal:                    $" + price5 + "0");
					System.out.println("Tax (8.75%):                 $" + Math.round((price5 * 0.0875) * 100.0) / 100.0);
					System.out.println("Total:                       $" + Math.round((price5 + price5 * 0.0875) * 100.0) / 100.0);
				}
				break;
			default:
				System.out.println("I'm sorry, but that wasn't one of the options!");
				break;
			}
			
			System.out.println("");
			boolean hasAnswered = false;
			while (hasAnswered == false) {
				System.out.println("Would you like to order again? Y/N");
				String ans = kboard.next();
				if (ans.equalsIgnoreCase("Y")) {
					shouldContinue = true;
					hasAnswered = true;
				} else if (ans.equalsIgnoreCase("N")) {
					shouldContinue = false;
					hasAnswered = true;
				}
				else
					System.out.println("I'm sorry, but that wasn't an option!");
			}
		}
	}
}