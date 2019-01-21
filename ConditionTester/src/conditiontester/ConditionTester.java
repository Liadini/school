package conditiontester;

import java.awt.Color;

/*
 * Lab 20 for Mr. Taylor's Java Class
 * Author: Liad Hermelin
 * Date: November 28, 2018
 * Description: This lab represents a tester for simple boolean methods.
 * Revision 2.1
*/

public class ConditionTester {
	// This method tests if the points x and y fit in the specified rectangle, then
	// returns the result of the test
	public boolean isPointInRectangle(int x, int y, int rectX, int rectY, int rectWidth, int rectHeight) {
		if ((x >= rectX && x <= rectWidth - 1 + rectX) && (y >= rectY && y <= rectHeight - 1 + rectY)) {
			return true;
		} else {
			return false;
		}
	}

	// This method tests if the specified year is a leap year, then returns the
	// result
	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}

	// This method tests if the specified number has two ending zeroes (no more, no
	// less), then returns the result
	public boolean hasTwoEndingZeros(int x) {
		if (x % 100 == 0 && x % 1000 != 0) {
			return true;
		} else {
			return false;
		}
	}

	// This method tests if the first specified date is later than the second
	// specified date
	public boolean isLater(int month1, int day1, int year1, int month2, int day2, int year2) {
		if (year1 > year2)
			return true;
		else if (year1 == year2) {
			if (month1 > month2)
				return true;
			else if (month1 == month2) {
				if (day1 > day2)
					return true;
				else
					return false;
			} else
				return false;
		} else
			return false;
	}

	// This method finds the total cost of a certain number of 2 different textbooks
	public static double getOrderTotal(int bp, int nb) {
		double orderTotal;
		if (bp == 1 && nb == 1)
			orderTotal = 37.95;
		else if (bp + nb >= 3 && bp + nb < 12)
			orderTotal = 15.95 * (double) (bp + nb);
		else if (bp + nb >= 12)
			orderTotal = 14.0 * (double) (bp + nb);
		else
			orderTotal = (double) bp * 18.95 + (double) nb * 21.95;
		return orderTotal;
	}

	// This method takes in an RGB spectrum, then finds the color closest to the
	// specified numbers
	public Color bestMatch(int r, int g, int b) {
		Color finalColor;
		if (r > g && r > b)
			finalColor = (Color.RED);
		else if (g > r && g > b)
			finalColor = (Color.GREEN);
		else if (b > r && b > g)
			finalColor = (Color.BLUE);
		else if (r == g && r > b)
			finalColor = (Color.YELLOW);
		else if (g == b && g > r)
			finalColor = (Color.CYAN);
		else if (r == b && r > g)
			finalColor = (Color.MAGENTA);
		else
			finalColor = (Color.GRAY);
		return finalColor;
	}

	public int findBestFit(int size1, int size2, int space) {
		int bestFit = 0;
		if (size1 + size2 > space) {
			if (size1 > size2 && size1 <= space)
				bestFit = 1;
			else if (size2 > size1 && size2 <= space)
				bestFit = 2;
			else if (size1 == size2) {
				if (size1 > space)
					bestFit = 0;
				else if (size1 <= space && size1 > space / 2)
					bestFit = 1;
				else if (size1 <= space / 2)
					bestFit = 3;
			} else if (size1 > space && size2 <= space)
				bestFit = 2;
			else if (size2 > space && size1 <= space)
				bestFit = 1;
		} else if (size1 + size2 <= space)
			bestFit = 3;
		else if (size1 > space && size2 > space)
			bestFit = 0;
		else if (size1 == space && size1 > size2 || size1 == size2 && size1 == space)
			bestFit = 1;
		else if (size2 == space && size2 > size1)
			bestFit = 2;
		return bestFit;
	}
}