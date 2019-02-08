package craps;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * Author: Liad Hermelin
 * Date: January 12, 2019
 * Description: This project represents a game of craps.
 * Revision 4.6
 */

public class CrapsTest1 extends JFrame implements ActionListener {
	private static final long serialVersionUID = 7110562897368096888L;
	private CrapsGame game;
	private JTextField input;
	private JTextArea display;

	public CrapsTest1() {
		super("Craps: Test 1");

		Container localContainer = getContentPane();
		localContainer.setLayout(new FlowLayout());

		localContainer.add(new JLabel("Next roll:"));
		this.input = new JTextField(5);
		this.input.setBackground(Color.YELLOW);
		this.input.addActionListener(this);
		localContainer.add(this.input);

		this.display = new JTextArea(10, 20);
		this.display.setEditable(false);
		this.display.setBackground(Color.WHITE);
		localContainer.add(new JScrollPane(this.display, 22, 31));

		this.game = new CrapsGame();
	}

	public void actionPerformed(ActionEvent paramActionEvent) {
		String str = this.input.getText().trim();
		int i = Integer.parseInt(str);
		int j = this.game.processRoll(i);
		int k = this.game.getPoint();
		this.input.setText("");
		this.display.append(i + ":  Result = " + j + " Point = " + k + "\n");
	}

	public static void main(String[] paramArrayOfString) {
		CrapsTest1 localCrapsTest1 = new CrapsTest1();
		localCrapsTest1.setBounds(100, 100, 300, 240);
		localCrapsTest1.setDefaultCloseOperation(3);
		localCrapsTest1.setResizable(false);
		localCrapsTest1.setVisible(true);
	}
}