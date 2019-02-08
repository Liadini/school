package craps;

import java.awt.Color;
import java.awt.Graphics;

/*
 * Author: Liad Hermelin
 * Date: January 12, 2019
 * Description: This project represents a game of craps.
 * Revision 4.6
 */

public class RollingDie extends Die {
	private static int tableLeft;
	private static int tableRight;
	private static int tableTop;
	private static int tableBottom;
	private int xCenter;
	private int yCenter;
	private double xSpeed;
	private double ySpeed;

	public static void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
		tableLeft = paramInt1;
		tableRight = paramInt2;
		tableTop = paramInt3;
		tableBottom = paramInt4;
	}

	public RollingDie() {
		this.xCenter = -1;
		this.yCenter = -1;
	}

	public void roll() {
		super.roll();
		int i = tableRight - tableLeft;
		int j = tableBottom - tableTop;
		this.xCenter = tableLeft;
		this.yCenter = (tableTop + j / 2);
		this.xSpeed = (i * (Math.random() + 1.0D) * 0.04D);
		this.ySpeed = (j * (Math.random() - 0.5D) * 2.0D * 0.04D);
	}

	public boolean isRolling() {
		return (this.xSpeed > 2.0D) || (this.xSpeed < -2.0D) || (this.ySpeed > 2.0D) || (this.ySpeed < -2.0D);
	}

	public void avoidCollision(RollingDie paramRollingDie) {
		if (paramRollingDie == this) {
			return;
		}
		while ((Math.abs(this.xCenter - paramRollingDie.xCenter) < 24)
				&& (Math.abs(this.yCenter - paramRollingDie.yCenter) < 24)) {
			move();
		}
	}

	private void move() {
		this.xCenter = ((int) (this.xCenter + this.xSpeed));
		this.yCenter = ((int) (this.yCenter + this.ySpeed));

		int i = 12;
		if (this.xCenter < tableLeft + i) {
			this.xCenter = (tableLeft + i);
			this.xSpeed = (-this.xSpeed);
		}
		if (this.xCenter > tableRight - i) {
			this.xCenter = (tableRight - i);
			this.xSpeed = (-this.xSpeed);
		}
		if (this.yCenter < tableTop + i) {
			this.yCenter = (tableTop + i);
			this.ySpeed = (-this.ySpeed);
		}
		if (this.yCenter > tableBottom - i) {
			this.yCenter = (tableBottom - i);
			this.ySpeed = (-this.ySpeed);
		}
	}

	public void draw(Graphics paramGraphics) {
		if ((this.xCenter < 0) || (this.yCenter < 0)) {
			return;
		}
		if (isRolling()) {
			move();
			drawRolling(paramGraphics);
			this.xSpeed *= 0.97D;
			this.ySpeed *= 0.97D;
		} else {
			drawStopped(paramGraphics);
		}
	}

	private void drawRolling(Graphics paramGraphics) {
		int i = this.xCenter - 12 + (int) (3.0D * Math.random()) - 1;
		int j = this.yCenter - 12 + (int) (3.0D * Math.random()) - 1;
		paramGraphics.setColor(Color.RED);
		if (i % 2 != 0) {
			paramGraphics.fillRoundRect(i, j, 24, 24, 6, 6);
		} else {
			paramGraphics.fillOval(i - 2, j - 2, 28, 28);
		}
		Die localDie = new Die();
		localDie.roll();
		drawDots(paramGraphics, i, j, localDie.getNumDots());
	}

	private void drawStopped(Graphics paramGraphics) {
		int i = this.xCenter - 12;
		int j = this.yCenter - 12;
		paramGraphics.setColor(Color.RED);
		paramGraphics.fillRoundRect(i, j, 24, 24, 6, 6);
		drawDots(paramGraphics, i, j, getNumDots());
	}

	private void drawDots(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3) {
		paramGraphics.setColor(Color.WHITE);

		int i = 6;
		int j = 3;
		int k = paramInt1 + j - 1;
		int m = paramInt1 + 3 * j;
		int n = paramInt1 + 5 * j + 1;
		int i1 = paramInt2 + j - 1;
		int i2 = paramInt2 + 3 * j;
		int i3 = paramInt2 + 5 * j + 1;
		switch (paramInt3) {
		case 1:
			paramGraphics.fillOval(m, i2, i, i);
			break;
		case 2:
			paramGraphics.fillOval(k, i1, i, i);
			paramGraphics.fillOval(n, i3, i, i);
			break;
		case 3:
			paramGraphics.fillOval(k, i1, i, i);
			paramGraphics.fillOval(m, i2, i, i);
			paramGraphics.fillOval(n, i3, i, i);
			break;
		case 4:
			paramGraphics.fillOval(k, i1, i, i);
			paramGraphics.fillOval(n, i1, i, i);
			paramGraphics.fillOval(k, i3, i, i);
			paramGraphics.fillOval(n, i3, i, i);
			break;
		case 5:
			paramGraphics.fillOval(k, i1, i, i);
			paramGraphics.fillOval(n, i1, i, i);
			paramGraphics.fillOval(m, i2, i, i);
			paramGraphics.fillOval(k, i3, i, i);
			paramGraphics.fillOval(n, i3, i, i);
			paramGraphics.fillOval(m, i2, i, i);
			break;
		case 6:
			paramGraphics.fillOval(k, i1, i, i);
			paramGraphics.fillOval(k, i2, i, i);
			paramGraphics.fillOval(k, i3, i, i);
			paramGraphics.fillOval(n, i1, i, i);
			paramGraphics.fillOval(n, i2, i, i);
			paramGraphics.fillOval(n, i3, i, i);
		}
	}
}