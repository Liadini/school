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
	// creates a time of 0:0
	public Time() {
		hours = 0;
		mins = 0;
	}

	// creates a time using a number of minutes
	public Time(int m) {
		hours = m / 60;
		mins = m % 60;
	}

	// creates a time of h:m
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

	// creates a time of h:m am/pm
	public Time(int h, int m, boolean isAM) {
		if (hours <= 0 || hours > 24) {
			throw new IllegalArgumentException("Invalid Hrs");
		}

		if (mins <= 0 || mins > 59) {
			throw new IllegalArgumentException("Invalid Mins");
		}
		hours = h;
		mins = m;
		if (!isAM && hours != 12)
			hours += 12;
		AM_PM = true;
	}

	// creates a clone of Time t
	public Time(Time t) {
		hours = t.hours;
		mins = t.mins;
		AM_PM = false;
	}

	// adds one minute to the current time
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
		if (minStr.length() == 1)
			minStr = 0 + minStr;

		if (!AM_PM) {
			return hours + ":" + minStr;
		} else {
			if (hours == 0) {
				return hours + 12 + ":" + minStr + " AM";
			} else if (hours < 12) {
				return hours + ":" + minStr + " AM";
			} else if (hours != 12) {
				return (hours - 12) + ":" + minStr + " PM";
			} else {
				return hours + ":" + minStr + " PM";
			}
		}
	}

	// returns 1 if this > t, 0 if this = t, -1 if this < t
	public int compareTo(Time t) {
		if (this.toMins() > t.toMins())
			return 1;
		else if (this.toMins() == t.toMins())
			return 0;
		return -1;
	}

	// returns the amount of time that has elapsed between this and t
	public int elapsedSince(Time t) {
		if (this.compareTo(t) == 1)
			return this.toMins() - t.toMins();
		else
			return Math.abs(t.toMins() - 1440 - this.toMins());
	}

	// sets print mode to AM/PM
	public void setPrintAMPM(boolean isAMPM) {
		AM_PM = isAMPM;
	}

	// converts current time to mins
	private int toMins() {
		return hours * 60 + mins;
	}

}