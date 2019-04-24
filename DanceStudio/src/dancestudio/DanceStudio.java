package dancestudio;

public class DanceStudio {
	public static void main(String[] args) {
		DanceFloor danceFloor = new DanceFloor();
		StudentGroup students = new RandomHoppingGroup(danceFloor);
		new DanceLesson(students, danceFloor);
	}
}
