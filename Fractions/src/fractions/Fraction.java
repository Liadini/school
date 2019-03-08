package fractions;

/*
 * Lab 28 for Mr. Taylor's Java Class
 * Author: Liad Hermelin
 * Date: February 27, 2019
 * Description: This lab represents a fraction with an int numerator and int denominator 
 * and provides methods for adding and multiplying fractions.
 * Revision 1.3
*/

public class Fraction {
	// *** instance variables ***
	private int num;
	private int denom;

	// *** Constructors ***

	public Fraction() { // no-args constructor
		num = 0;
		denom = 1;
	}

	public Fraction(int n) {
		num = n;
		denom = 1;
	}

	public Fraction(int n, int d) {
		if (d != 0) {
			num = n;
			denom = d;
			reduce();
		} else {
			throw new IllegalArgumentException("Fraction construction error: denominator is 0");
		}
	}

	public Fraction(double x) {
		if (x == 0) {
			num = 0;
			reduce();
			return;
		}
		String input = "" + x;
		int beforeDec = Integer.parseInt(input.substring(0, input.indexOf('.')));
		input = input.substring(input.indexOf(".") + 1);
		char firstNumAfterDec = input.charAt(0);
		int count = 0;
		if (input.length() > 4) {
			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) != firstNumAfterDec)
					continue;
				count++;
			}
			if (count == input.length()) {
				num = Integer.parseInt("" + firstNumAfterDec) + beforeDec * 9;
				denom = 9;
				reduce();
				return;
			}
		}
		num = (int) (10000000.0 * x + 0.5);
		denom = 10000000;
		reduce();
	}

	public Fraction(Fraction other) { // copy constructor
		num = other.num;
		denom = other.denom;
	}

	// *** public methods ***

	// Returns the sum of this fraction and other
	public Fraction add(Fraction f) {
		return new Fraction(num * f.denom + denom * f.num, denom * f.denom);
	}

	// Returns the sum of this fraction and m
	public Fraction add(int m) {
		return new Fraction(num + m * denom, denom);
	}

	// Returns the product of this fraction and other
	public Fraction multiply(Fraction f) {
		return new Fraction(num * f.num, denom * f.denom);
	}

	// Returns the product of this fraction and m
	public Fraction multiply(int m) {
		return new Fraction(num * m, denom);
	}

	public Fraction subtract(Fraction f) {
		return new Fraction(num * f.denom - denom * f.num, denom * f.denom);
	}

	public Fraction subtract(int m) {
		return new Fraction(num - m * denom, denom);
	}

	public Fraction divide(Fraction f) {
		return new Fraction(num * f.denom, denom * f.num);
	}

	public Fraction divide(int m) {
		return new Fraction(num, denom * m);
	}

	// Returns the value of this fraction as a double
	public double getValue() {
		return (double) num / (double) denom;
	}

	// Returns a string representation of this fraction
	public String toString() {
		return num + "/" + denom;
	}

	// *** private methods ***

	// Reduces this fraction by the gcf and makes denom > 0
	private void reduce() {
		if (num == 0) {
			denom = 1;
			return;
		}

		if (denom < 0) {
			num = -num;
			denom = -denom;
		}

		int q = gcf(Math.abs(num), denom);
		num /= q;
		denom /= q;
	}

	// Returns the greatest common factor of two positive integers
	private int gcf(int n, int d) {
		if (n <= 0 || d <= 0) {
			throw new IllegalArgumentException("gcf precondition failed: " + n + ", " + d);
		}

		if (n % d == 0)
			return d;
		else if (d % n == 0)
			return n;
		else
			return gcf(n % d, d % n);
	}
}
