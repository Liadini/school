package craps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/*
 * Author: Liad Hermelin
 * Date: January 12, 2019
 * Description: This project represents a game of craps.
 * Revision 4.6
 */

public class ControlPanel extends JPanel implements ActionListener {
	private static final long serialVersionUID = -3117442342866334971L;
	private CrapsTable table;

	public ControlPanel(CrapsTable paramCrapsTable) {
		this.table = paramCrapsTable;
		JButton localJButton = new JButton("Roll");
		localJButton.addActionListener(this);
		add(localJButton);
	}

	public void actionPerformed(ActionEvent paramActionEvent) {
		if (!this.table.diceAreRolling()) {
			this.table.rollDice();
		}
	}
}