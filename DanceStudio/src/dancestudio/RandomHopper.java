package dancestudio;

import java.awt.Image;
import java.util.Random;

public class RandomHopper extends Hopper {
	private int stepLength;
	private Random r;

	public RandomHopper(int x, int y, Image leftPic, Image rightPic) {
		super(x, y, leftPic, rightPic);
		stepLength = PIXELS_PER_INCH * 12;
		r = new Random();
	}

	// Makes next step
	@Override
	public void nextStep() {
		switch(r.nextInt(4)) {
		case 0:
			turnLeft();
			break;
		case 1:
			turnRight();
			break;
		case 2:
			turnAround();
			break;
		case 3:
			break;
		}
		getLeftFoot().moveForward(2 * stepLength);
		getRightFoot().moveForward(2 * stepLength);
	}

}
