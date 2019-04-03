package dancestudio;

import java.awt.Image;

public class Hopper extends Biped {
	private int stepLength;
	private int stepsCount;

	public Hopper(int x, int y, Image leftPic, Image rightPic) {
		super(x, y, leftPic, rightPic);
		stepLength = PIXELS_PER_INCH * 12;
	}

	@Override
	public void firstStep() {
		getLeftFoot().moveForward(stepLength);
		getRightFoot().moveForward(stepLength);
		stepsCount = 1;
	}

	@Override
	public void nextStep() {
		getLeftFoot().moveForward(stepLength);
		getRightFoot().moveForward(stepLength);
		stepsCount++;
	}

	@Override
	public void stop() {

	}

	@Override
	public int distanceTraveled() {
		return stepsCount * stepLength;
	}

}
