package rainbow;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * Lab 16 for Mr. Taylor's Java Class
 * Author: Liad Hermelin
 * Date: October 31, 2018
 * Description: This lab represents a rainbow
 * Revision 2.0
*/

public class Rainbow extends JPanel {
	private static final long serialVersionUID = 4959211181313777222L;
	
	// Declare skyColor:
	private final Color skyColor = Color.CYAN; // skyColor is cyan

	public Rainbow() {
		setBackground(skyColor); // background is skyColor
	}

	// Draws the rainbow.
	public void paintComponent(Graphics g) // draws whatever is specified in the curly brackets
	{
		super.paintComponent(g);
		int width = getWidth(); // width is width of window
		int height = getHeight(); // height is height of window

		int xCenter = width / 2; // xCenter is half of width
		int yCenter = height * 3 / 4; // yCenter is 3/4 of height
		int largeRadius = width / 4; // largeRadius is 1/4 of width
		int radius2 = largeRadius * 6 / 7; // radius2 is 6/7 of largeRadius
		int radius3 = largeRadius * 5 / 7; // radius3 is 5/7 of largeRadius
		int radius4 = largeRadius * 4 / 7; // radius4 is 4/7 of largeRadius
		int radius5 = largeRadius * 3 / 7; // radius5 is 3/7 of largeRadius
		int radius6 = largeRadius * 2 / 7; // radius6 is 2/7 of largeRadius
		int radius7 = largeRadius / 7; // radius7 is 1/7 of largeRadius

		g.setColor(Color.RED); // color is now red
		g.fillArc(xCenter - largeRadius, yCenter - largeRadius, largeRadius * 2, largeRadius * 2, 0, 180); // fills 180
																											// degree
																											// arc that
																											// is
																											// inscribed
																											// in a
																											// rectangle
																											// that is
																											// largeRadius*2
																											// by
																											// largeRadius*2
																											// and
																											// starts at
																											// (xCenter-largeRadius,
																											// yCenter-largeRadius)

		g.setColor(Color.ORANGE); // color is now orange
		g.fillArc(xCenter - radius2, yCenter - radius2, radius2 * 2, radius2 * 2, 0, 180); // fills 180 degree arc that
																							// is inscribed in a
																							// rectangle that is
																							// radius2*2 by radius2*2
																							// and starts at
																							// (xCenter-radius2,
																							// yCenter-radius2)

		g.setColor(Color.YELLOW); // color is now yellow
		g.fillArc(xCenter - radius3, yCenter - radius3, radius3 * 2, radius3 * 2, 0, 180); // fills 180 degree arc that
																							// is inscribed in a
																							// rectangle that is
																							// radius3*2 by radius3*2
																							// and starts at
																							// (xCenter-radius3,
																							// yCenter-radius3)

		g.setColor(Color.GREEN); // color is now green
		g.fillArc(xCenter - radius4, yCenter - radius4, radius4 * 2, radius4 * 2, 0, 180); // fills 180 degree arc that
																							// is inscribed in a
																							// rectangle that is
																							// radius4*2 by radius4*2
																							// and starts at
																							// (xCenter-radius4,
																							// yCenter-radius4)

		g.setColor(Color.BLUE); // color is now blue
		g.fillArc(xCenter - radius5, yCenter - radius5, radius5 * 2, radius5 * 2, 0, 180); // fills 180 degree arc that
																							// is inscribed in a
																							// rectangle that is
																							// radius5*2 by radius5*2
																							// and starts at
																							// (xCenter-radius5,
																							// yCenter-radius5)

		g.setColor(Color.MAGENTA); // color is now magenta
		g.fillArc(xCenter - radius6, yCenter - radius6, radius6 * 2, radius6 * 2, 0, 180); // fills 180 degree arc that
																							// is inscribed in a
																							// rectangle that is
																							// radius6*2 by radius6*2
																							// and starts at
																							// (xCenter-radius6,
																							// yCenter-radius6)

		g.setColor(Color.CYAN); // color is now cyan
		g.fillArc(xCenter - radius7, yCenter - radius7, radius7 * 2, radius7 * 2, 0, 180); // fills 180 degree arc that
																							// is inscribed in a
																							// rectangle that is
																							// radius7*2 by radius7*2
																							// and starts at
																							// (xCenter-radius7,
																							// yCenter-radius7)
	}

	public static void main(String[] args) // creates a JFrame to show the object
	{
		JFrame window = new JFrame("Rainbow"); // creates new JFrame called "rainbow"
		window.setBounds(300, 300, 300, 200); // JFrame size is 300 by 200 and starts at 300, 300
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // JFrame exits on close
		Container c = window.getContentPane();
		c.add(new Rainbow()); // Rainbow is added
		window.setVisible(true); // window is visible
		window.setResizable(true); // window is resizable
	}
}