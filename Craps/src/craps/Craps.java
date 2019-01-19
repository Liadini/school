package craps;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/*
 * Author: Liad Hermelin
 * Date: January 12, 2019
 * Description: This project represents a game of craps.
 * Revision 4.6
 */

public class Craps extends JFrame {
	public Craps() {
		super("Craps");

		DisplayPanel localDisplayPanel = new DisplayPanel();
		CrapsTable localCrapsTable = new CrapsTable(localDisplayPanel);
		ControlPanel localControlPanel = new ControlPanel(localCrapsTable);

		JPanel localJPanel = new JPanel();
		localJPanel.setLayout(new BorderLayout());
		localJPanel.setBorder(new EmptyBorder(0, 5, 0, 5));
		localJPanel.add(localDisplayPanel, "North");
		localJPanel.add(localCrapsTable, "Center");
		localJPanel.add(localControlPanel, "South");

		Container localContainer = getContentPane();
		localContainer.add(localJPanel, "Center");
	}

	public static void main(String[] paramArrayOfString) {
		Craps localCraps = new Craps();
		localCraps.setBounds(100, 100, 320, 240);
		localCraps.setDefaultCloseOperation(3);
		localCraps.setVisible(true);
	}
}