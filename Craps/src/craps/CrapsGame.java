package craps;

/*
 * Author: Liad Hermelin
 * Date: January 12, 2019
 * Description: This project represents a game of craps.
 * Revision 4.6
 */

public class CrapsGame {
	private int point = 0;

	public int processRoll(int paramInt) {
		int i;
		if (this.point == 0) {
			if ((paramInt == 7) || (paramInt == 11)) {
				i = 1;
			} else if ((paramInt == 2) || (paramInt == 3) || (paramInt == 12)) {
				i = -1;
			} else {
				i = 0;
				this.point = paramInt;
			}
		} else if (paramInt == this.point) {
			i = 1;
			this.point = 0;
		} else if (paramInt == 7) {
			i = -1;
			this.point = 0;
		} else {
			i = 0;
		}
		return i;
	}

	public int getPoint() {
		return this.point;
	}
}