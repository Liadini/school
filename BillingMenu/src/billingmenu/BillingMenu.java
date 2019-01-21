package billingmenu;

import java.util.Scanner;

/*
 * S1 Final for Mr. Taylor's Java Class
 * Author: Liad Hermelin
 * Date: December 20, 2018
 * Description: This final represents a billing menu for Chili's.
 * Revision 3.0
*/

public class BillingMenu {
	private static double TIP_CONSTANT = 0.15;
	private static double TAX_CONSTANT = 0.0875;
	private static double price1 = 8.75;
	private static double price2 = 9.5;
	private static double price3 = 2.0;
	private static double price4 = 1.5;
	private static double price5 = 5.0;
	private static double count1 = 0;
	private static double count2 = 0;
	private static double count3 = 0;
	private static double count4 = 0;
	private static double count5 = 0;

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
			System.out.println("6) GET BILL");
			System.out.println("7) RESET TOTALS");
			System.out.println("8) QUIT");
			System.out.println("");
			System.out.print("Enter menu item number --> ");

			// Prompting user input
			Scanner kboard = new Scanner(System.in);
			int menuChoice = kboard.nextInt();

			// switch for selection (this switch also does all the math)
			switch (menuChoice) {
			case 1:
				System.out.println("Thank you for selecting:     Club Sandwich!");
				count1++;
				break;
			case 2:
				System.out.println("Thank you for selecting:     Mini Pizza!");
				count2++;
				break;
			case 3:
				System.out.println("Thank you for selecting:     Soda!");
				count3++;
				break;
			case 4:
				System.out.println("Thank you for selecting:     Coffee!");
				count4++;
				break;
			case 5:
				System.out.println("Thank you for selecting:     Ice Cream Sundae!");
				count5++;
				break;
			case 6:
				double subTotal = (count1 * price1 + count2 * price2 + count3 * price3 + count4 * price4 + count5 * price5);
				double tipTotal = (subTotal * TIP_CONSTANT);
				double taxTotal = (subTotal * TAX_CONSTANT);
				System.out.println("Club Sandwich Count:    " + (int)count1);
				System.out.println("Mini Pizza Count:       " + (int)count2);
				System.out.println("Soda Count:             " + (int)count3);
				System.out.println("Coffee Count:           " + (int)count4);
				System.out.println("Ice Cream Sundae Count: " + (int)count5);
				System.out.println("");
				System.out.println("Enter Party Size -----> ");
				int partySize = kboard.nextInt();
				if (partySize >= 6) {
					System.out.println("Subtotal:    $" + Math.round(subTotal * 100.0) / 100.0);
					System.out.println("Tip (15%):   $" + Math.round(tipTotal * 100.0) / 100.0);
					System.out.println("Tax (8.75%): $" + Math.round(taxTotal * 100.0) / 100.0);
					System.out.println("Total:       $" + Math.round((subTotal + tipTotal + taxTotal) * 100.0) / 100.0);
				}
				else {
					System.out.println("Subtotal:    $" + Math.round(subTotal * 100.0) / 100.0);
					System.out.println("Tax (8.75%): $" + Math.round(taxTotal * 100.0) / 100.0);
					System.out.println("Total:       $" + Math.round((subTotal + taxTotal) * 100.0) / 100.0);
				}
				System.out.println("Thank You for Dining at Chili's!");
				count1 = 0;
				count2 = 0;
				count3 = 0;
				count4 = 0;
				count5 = 0;
				System.out.println("");
				boolean hasAnswered = false;
				while (hasAnswered == false) {
					System.out.println("Would you like to perform another action? Y/N");
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
				break;
			case 7:
				count1 = 0;
				count2 = 0;
				count3 = 0;
				count4 = 0;
				count5 = 0;
				break;
			case 8:
				shouldContinue = false;
				kboard.close();
				break;
			default:
				System.out.println("I'm sorry, but that wasn't an option!");
				break;
			}

		}
	}
}