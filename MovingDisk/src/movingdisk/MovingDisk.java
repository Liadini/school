package movingdisk;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/*
 * Lab 15 for Mr. Taylor's Java Class
 * Author: Liad Hermelin
 * Date: October 17, 2018
 * Description: This lab represents a moving disk mimicing the sun
 * Revision 2.1
*/

public class MovingDisk extends JPanel implements ActionListener {
	private static final long serialVersionUID = -1709005630379547873L;
	private int time;

	public MovingDisk() {
		time = 0;
		Timer clock = new Timer(30, this);
		clock.start();
	}

	public void paintComponent(Graphics g) // draws whatever is specified in the curly brackets
	{
		int x = 150 - (int) (100 * Math.cos(0.005 * Math.PI * time));
		int y = (130 - (int) (75 * Math.sin(0.005 * Math.PI * time)));
		int r = 20;

		Color sky;
		if (y > 130)
			sky = Color.BLACK;
		else if (y > 80)
			sky = Color.PINK;
		else
			sky = Color.CYAN;
		setBackground(sky);
		super.paintComponent(g);

		g.setColor(Color.ORANGE);
		g.fillOval(x - r, y - r, 2 * r, 2 * r);
	}

	public void actionPerformed(ActionEvent e) {
		time++;
		repaint();
	}

	public static void main(String[] args) {
		JFrame window = new JFrame("Moving Disk");
		window.setSize(300, 150);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = window.getContentPane();
		c.add(new MovingDisk());
		window.setResizable(false);
		window.setVisible(true);
	}
}