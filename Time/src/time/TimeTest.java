package time;

public class TimeTest {

	public static void main(String[] args) {
		Time t1 = new Time();
		Time t2 = new Time(13,5);
		Time t3 = new Time(24,0);
//		Time t4 = new Time(-1,30);
		System.out.println("T1 = " + t1);
		System.out.println("T2 = " + t2);
		System.out.println("T3 = " + t3);
//		System.out.println("T4 = " + t4);
	}
	
}
