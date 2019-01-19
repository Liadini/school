package craps;

/*
 * Author: Liad Hermelin
 * Date: January 12, 2019
 * Description: This project represents a game of craps.
 * Revision 4.6
 */

public class Die {
	private int numDots;

	public void roll() {
		this.numDots = ((int) (6.0D * Math.random()) + 1);
	}

	public int getNumDots() {
		return this.numDots;
	}
}