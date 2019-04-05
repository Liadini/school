package dancestudio;

import java.awt.Image;
import java.util.Random;

public class RandomHopper extends Hopper {
	private int stepLength;
	private int stepsCount;
	private Random r;

	public RandomHopper(int x, int y, Image leftPic, Image rightPic) {
		super(x, y, leftPic, rightPic);
		stepLength = PIXELS_PER_INCH * 12;
	}

	// Makes next step
	@Override
	public void nextStep() {
		switch(r.nextInt(3)) {
		case 0:
			getLeftFoot().turn(90);
			getRightFoot().turn(90);
			break;
		case 1:
			getLeftFoot().turn(180);
			getRightFoot().turn(180);
			break;
		case 2:
			getLeftFoot().turn(270);
			getRightFoot().turn(270);
			break;
		case 3:
			getLeftFoot().moveForward(2 * stepLength);
			getRightFoot().moveForward(2 * stepLength);
			break;
		}

		stepsCount++;
	}

}
