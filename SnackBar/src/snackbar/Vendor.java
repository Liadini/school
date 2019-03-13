package snackbar;

/*
 * Lab 29 for Mr. Taylor's Java Class
 * Author: Liad Hermelin
 * Date: March 13, 2019
 * Description: This lab represents a snack bar with four vending machines.
 * Revision 1.3
*/

public class Vendor {

	private int price, stock, deposit, change;

	public Vendor(int price, int num) {
		this.price = price;
		this.stock = num;
	}

	/**
	 * Adds a specified amount (in cents) to the deposited amount.
	 * 
	 * @param input - int number of cents to add to the deposit
	 */
	public void addMoney(int input) {
		deposit += input;
	}

	/**
	 * Implements a sale. If there are items in stock and the deposited amount is
	 * greater than or equal to the single item price, then adjusts the stock and
	 * calculates and sets change and returns true; otherwise refunds the whole
	 * deposit (moves it into change)
	 * 
	 * @return boolean did sale succeed
	 */
	public boolean makeSale() {
		if (stock > 0 && deposit > price) {
			stock--;
			calculateChange();
			deposit = 0;
			return true;
		} else {
			calculateChange();
			deposit = 0;
			return false;
		}
	}

	/**
	 * Helper method for calculating change
	 */
	private void calculateChange() {
		if (stock > 0 && deposit > price)
			change = deposit - price;
		else
			change = deposit;
	}

// GETTERS AND SETTERS

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getPrice() {
		return price;
	}

	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	public int getChange() {
		return change;
	}

}
