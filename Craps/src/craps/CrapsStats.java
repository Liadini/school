package craps;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * Author: Liad Hermelin
 * Date: January 12, 2019
 * Description: This project represents a game of craps.
 * Revision 4.6
 */

public class CrapsStats extends JFrame implements ActionListener {
	private CrapsGame game;
	private JTextField numberIn;
	private JTextField statsOut;

	public CrapsStats() {
		super("Craps test");

		Container localContainer = getContentPane();
		localContainer.setLayout(new FlowLayout());

		localContainer.add(new JLabel("Number of games to run:"));

		this.numberIn = new JTextField(5);
		this.numberIn.addActionListener(this);
		localContainer.add(this.numberIn);

		this.statsOut = new JTextField(18);
		this.statsOut.setEditable(false);
		localContainer.add(this.statsOut);

		this.game = new CrapsGame();
	}

	public void actionPerformed(ActionEvent paramActionEvent) {
		String str = this.numberIn.getText();
		int i = Integer.parseInt(str);
		int k = 0;
		int m = 0;
		Die localDie1 = new Die();
		Die localDie2 = new Die();
		while (k < i) {
			localDie1.roll();
			localDie2.roll();
			int n = localDie1.getNumDots() + localDie2.getNumDots();
			int j = this.game.processRoll(n);
			if (j != 0) {
				k++;
			}
			if (j > 0) {
				m++;
			}
		}
		this.numberIn.setText("");
		this.statsOut.setText(" Games: " + k + " Wins: " + m);
	}

	public static void main(String[] paramArrayOfString) {
		CrapsStats localCrapsStats = new CrapsStats();
		localCrapsStats.setBounds(100, 100, 300, 100);
		localCrapsStats.setDefaultCloseOperation(3);
		localCrapsStats.setResizable(false);
		localCrapsStats.setVisible(true);
	}
}