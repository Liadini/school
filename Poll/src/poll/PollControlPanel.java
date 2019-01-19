package poll;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/*
 * Lab 18 for Mr. Taylor's Java Class
 * Author: Liad Hermelin
 * Date: November 2, 2018
 * Description: This lab represents a poll to vote for your favorite dessert.
 * Revision 2.1
*/

public class PollControlPanel extends JPanel implements ActionListener

{
	private JButton button1, button2, button3;
	private PollDisplayPanel chartPanel;

	public PollControlPanel(PollDisplayPanel chart) {
		chartPanel = chart;

		button1 = new JButton("Donuts");
		button1.setPreferredSize(new Dimension(80, 30));
		button1.setToolTipText("Vote for Donuts");
		button1.addActionListener(this);

		button2 = new JButton("Cake");
		button2.setPreferredSize(new Dimension(80, 30));
		button2.setToolTipText("Vote for Cake");
		button2.addActionListener(this);

		button3 = new JButton("Pie");
		button3.setPreferredSize(new Dimension(80, 30));
		button3.setToolTipText("Vote for Pie");
		button3.addActionListener(this);

		add(button1);
		add(button2);
		add(button3);
	}

	/**
	 * Processes button events
	 */
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();

		if (button == button1) {
			chartPanel.vote1();
		} else if (button == button2) {
			chartPanel.vote2();
		} else if (button == button3) {
			chartPanel.vote3();
		}
		chartPanel.repaint();
	}

}