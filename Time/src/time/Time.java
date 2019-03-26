package time;

/*
 * Lab 30 for Mr. Taylor's Java Class
 * Author: Liad Hermelin
 * Date: March 12, 2019
 * Description: This lab represents the time.
 * Revision 3.4
*/

public class Time {

	private int hours, mins;

	private boolean AM_PM;
	private boolean isAM;

	public Time() {
		hours = 0;
		mins = 0;
	}

	public Time(int m) {
		hours = m / 60;
		mins = m % 60;
	}

	public Time(int h, int m) {
		if (h >= 0 && h < 24 && m >= 0 && m < 60) {
			hours = h;
			mins = m;
		} else if (m >= 60) {
			hours = h + m / 60;
			mins = m % 60;
		} else {
			throw new IllegalArgumentException("Invalid Time");
		}
	}

	public Time(int h, int m, boolean isAM) {
		hours = h;
		mins = m;
		if (!isAM)
			hours += 12;
	}

	public Time(Time t) {
		hours = t.hours;
		mins = t.mins;
		AM_PM = false;
	}

	public void increment() {
		this.mins++;
		if (this.mins == 60) {
			this.mins = 0;
			hours++;
		}
		if (this.hours == 24) {
			this.hours = 0;
		}
	}

	@Override
	public String toString() {
		String minStr = mins + "";
		if (minStr.length() <= 1)
			minStr = 0 + minStr;

		if (!AM_PM) {
			return hours + ":" + minStr;
		} else {
			if (isAM)
				return hours + ":" + minStr + " AM";
			else
				return (hours - 12) + ":" + minStr + " PM";
		}
	}

	public int compareTo(Time t) {
		if (this.toMins() > t.toMins())
			return 1;
		else if (this.toMins() == t.toMins())
			return 0;
		return -1;
	}

	public int elapsedSince(Time t) {
		if (this.compareTo(t) == 1)
			return this.toMins() - t.toMins();
		else
			return Math.abs(t.toMins() - 1440 - this.toMins());
	}

	public void setPrintAMPM(boolean isAMPM) {
		AM_PM = isAMPM;
	}

	private int toMins() {
		return hours * 60 + mins;
	}

}