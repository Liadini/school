package gpacalculator;

/*
 * S1 Final Practice for Mr. Taylor's Java Class
 * Author: Liad Hermelin
 * Date: December 14, 2018
 * Description: This project represents a GPA Calculator.
 * Revision 1.0
*/

public class GPACalculator {

	public double calculateGPA(String[] grade, int loopTimes) {
		double finalGPA = 0;
		int gradeTotal = 0;
		for (int x = 0; x < loopTimes; x++) {
			if ("A".equalsIgnoreCase(grade[x]))
				gradeTotal += 4;
			else if ("B".equalsIgnoreCase(grade[x]))
				gradeTotal += 3;
			else if ("C".equalsIgnoreCase(grade[x]))
				gradeTotal += 2;
			else if ("D".equalsIgnoreCase(grade[x]))
				gradeTotal += 1;
			else if ("F".equalsIgnoreCase(grade[x]))
				gradeTotal += 0;
		}
		finalGPA = (double) gradeTotal / (double) loopTimes;
		return Math.round(finalGPA * 100.0) / 100.0;
	}
}