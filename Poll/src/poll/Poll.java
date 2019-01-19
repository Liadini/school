package poll;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

/*
 * Lab 18 for Mr. Taylor's Java Class
 * Author: Liad Hermelin
 * Date: November 2, 2018
 * Description: This lab represents a poll to vote for your favorite dessert.
 * Revision 2.1
*/

public class Poll extends JFrame {
	public Poll() {
		super("Vote for your favorite dessert!");

		Container c = getContentPane();
		c.setBackground(Color.WHITE);
		PollDisplayPanel chart = new PollDisplayPanel("Donuts", "Cake", "Pie");
		PollControlPanel controls = new PollControlPanel(chart);
		c.add(chart, BorderLayout.CENTER);
		c.add(controls, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		Poll w = new Poll();
		w.setBounds(300, 300, 400, 400);
		w.setDefaultCloseOperation(EXIT_ON_CLOSE);
		w.setVisible(true);
	}
}