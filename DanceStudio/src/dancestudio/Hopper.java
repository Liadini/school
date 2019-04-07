package dancestudio;

// Represents a Biped that hops with both feet

import java.awt.Image;

public class Hopper extends Biped {
	private int stepsCount, stepLength;

	// Constructor
	public Hopper(int x, int y, Image leftPic, Image rightPic) {
		super(x, y, leftPic, rightPic); // must be the first statement
		stepLength = PIXELS_PER_INCH * 12;
	}

	// Makes first step
	@Override
	public void firstStep() {
		getLeftFoot().moveForward(stepLength);
		getRightFoot().moveForward(stepLength);
		stepsCount = 1;
	}

	// Makes next step
	@Override
	public void nextStep() {
		getLeftFoot().moveForward(2 * stepLength);
		getRightFoot().moveForward(2 * stepLength);

		stepsCount++;
	}

	// Stops this walker
	@Override
	public void stop() {

	}

	// Returns the distance walked
	@Override
	public int distanceTraveled() {
		return stepsCount * stepLength;
	}
}
