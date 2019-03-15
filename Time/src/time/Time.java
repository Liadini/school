package time;

public class Time {

	private int hours, mins;

	public Time() {
		hours = 0;
		mins = 0;
	}

	public Time(int h, int m) {
		if (h >= 0 && h <= 24 && m >= 0 && m <= 60) {
			hours = h;
			mins = m;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public String toString() {
		if (hours > 9 && mins > 9)
			return hours + ":" + mins;
		else if (hours > 9 && mins < 10)
			return hours + ":0" + mins;
		else if (hours < 10 && mins > 9)
			return "0" + hours + ":" + mins;
		else
			return "0" + hours + ":0" + mins;
	}

}
