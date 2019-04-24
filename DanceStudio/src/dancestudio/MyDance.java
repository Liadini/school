package dancestudio;

public class MyDance extends AbstractDance {

	private static DanceStep[] steps = { new DanceStep(0, 38, 0, 0, 0, 0, 0, 0), new DanceStep(0, 0, 0, 0, 0, 0, 0, 0),
			new DanceStep(0, 0, 0, 0, 0, 38, 29, 0), new DanceStep(0, 0, 29, 0, 0, 0, 0, 0),
			new DanceStep(0, 0, 0, 0, 0, -38, 0, 0), new DanceStep(0, 0, 0, 0, 0, 0, 0, 0),
			new DanceStep(0, -38, -29, 0, 0, 0, 0, 0), new DanceStep(0, 0, 0, 0, 0, 0, -29, 0), new DanceStep(0, 38, 0, 0, 0, 0, 0, 0),
			new DanceStep(0, 0, 0, 0, 0, 38, 29, 0), new DanceStep(0, 0, 29, 0, 0, 0, 0, 0),
			new DanceStep(0, 0, 0, 0, 0, -38, 0, 0), new DanceStep(0, -38, -29, 0, 0, 0, 0, 0),
			new DanceStep(0, 0, 0, 0, 0, 0, -29, 0)};

	private static int[] rhythm = { 2, 3, 2, 1 };
	
	public MyDance() {
		super(steps, rhythm);
	}

	@Override
	public String getName() {
		return "Spasm";
	}

	@Override
	public int getTempo() {
		return 50;
	}

}
