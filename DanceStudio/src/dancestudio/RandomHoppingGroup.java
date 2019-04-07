package dancestudio;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class RandomHoppingGroup implements StudentGroup {
	private RandomHopper maleDancer;
	private Image leftMansShoe, rightMansShoe;

	private DanceFloor danceFloor;

	private enum State {
		READY, MOVING, STOPPED
	}

	private State currentState;

	// Constructor
	public RandomHoppingGroup(DanceFloor df) {
		danceFloor = df;
		leftMansShoe = (new ImageIcon("leftshoe.gif")).getImage();
		rightMansShoe = (new ImageIcon("rightshoe.gif")).getImage();
	}

	// Sets up this group of participants
	public void setup(int floorDir, Dance steps1, Dance steps2) {
		int x = danceFloor.getWidth() / 2;
		int y = danceFloor.getHeight() / 2;
		if (floorDir == 0) {
			maleDancer = new RandomHopper(x, y + Dancer.PIXELS_PER_INCH * 12, leftMansShoe, rightMansShoe);
			maleDancer.turnLeft();
		} else {
			maleDancer = new RandomHopper(x, y - Dancer.PIXELS_PER_INCH * 12, leftMansShoe, rightMansShoe);
			maleDancer.turnRight();
		}
		currentState = State.READY;
		danceFloor.update(this);
	}

	// Moves the group by one step
	public void makeNextStep() {
		if (currentState == State.READY) {
			maleDancer.firstStep();
			currentState = State.MOVING;
		} else if (currentState == State.MOVING) {
			maleDancer.nextStep();
		} else if (currentState == State.STOPPED) { // never happens
			maleDancer.turnAround();
			currentState = State.READY;
		}

		danceFloor.update(this);
	}

	// Draws this group
	public void draw(Graphics g) {
		maleDancer.draw(g);
	}
}