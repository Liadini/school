package dancestudio;

import java.awt.Image;

public class Alternator extends Biped {
	private int stepsCount, stepLength;
	private boolean rightFoot = true;

	public Alternator(int x, int y, Image leftPic, Image rightPic) {
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
		if (stepsCount % 2 != 0 && rightFoot) {
			getRightFoot().moveForward(stepLength);
			rightFoot = !rightFoot;
		} else if (stepsCount % 2 != 0 && !rightFoot) {
			getLeftFoot().moveForward(stepLength);
			rightFoot = !rightFoot;
		} else {
			getLeftFoot().moveForward(stepLength);
			getRightFoot().moveForward(stepLength);
		}
		stepsCount++;
	}

	@Override
	public void stop() {

	}

	@Override
	public int distanceTraveled() {
		return 0;
	}

}
