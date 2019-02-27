package fractions;

/*
 * Lab 28 for Mr. Taylor's Java Class
 * Author: Liad Hermelin
 * Date: February 27, 2019
 * Description: This lab represents a fraction with an int numerator and int denominator 
 * and provides methods for adding and multiplying fractions.
 * Revision 1.3
*/

public class TestFractions {
	public static void testConstructors() {
		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction(7);
		Fraction f3 = new Fraction(12, -20);
		Fraction f4 = new Fraction(f3);
		Fraction f5 = new Fraction(1.65);

		System.out.println("f1 = " + f1);
		System.out.println("f2 = " + f2);
		System.out.println("f3 = " + f3);
		System.out.println("f4 = " + f4);
		System.out.println("f5 = " + f5);
		System.out.println();
	}

	public static void testArithmetic() {
		Fraction f1 = new Fraction(1, 2);
		Fraction f2 = new Fraction(1, 3);

		Fraction sum = f1.add(f2);
		System.out.println(f1 + " + " + f2 + " = " + sum);

		Fraction product = f1.multiply(f2);
		System.out.println(f1 + " * " + f2 + " = " + product);

		System.out.println();
	}

	public static void testValues() {
		Fraction f = new Fraction(2, 3);
		System.out.println(f + " = " + f.getValue());
		System.out.println();
	}

	public static void main(String[] args) {
		testConstructors();
		testArithmetic();
		testValues();
	}
}
