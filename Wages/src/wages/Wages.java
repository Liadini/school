package wages;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * Lab 19 for Mr. Taylor's Java Class
 * Author: Liad Hermelin
 * Date: November 22, 2018
 * Description: This lab represents a calculator for your weekly wages based on your hourly rate and hours worked
 * Revision 2.1
*/

public class Wages extends JFrame implements ActionListener {
	private static final long serialVersionUID = 5911357621804951858L;
	private JTextField inputHours, inputRate, display;
	private DecimalFormat money = new DecimalFormat("$0.00");

	// Labels and adds all the buttons and panels
	public Wages() {
		super("Wages Calculator");

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 2));

		panel.add(new JLabel("   Hours worked:"));
		inputHours = new JTextField(5);
		inputHours.setHorizontalAlignment(JTextField.RIGHT);
		panel.add(inputHours);

		panel.add(new JLabel("   Hourly rate:"));
		inputRate = new JTextField(5);
		inputRate.setHorizontalAlignment(JTextField.RIGHT);
		panel.add(inputRate);

		panel.add(new JLabel("   Total wages:"));
		display = new JTextField(20);
		display.setHorizontalAlignment(JTextField.RIGHT);
		display.setEditable(false);
		display.setBackground(Color.yellow);
		panel.add(display);

		JButton calc = new JButton("Calculate wages");
		calc.addActionListener(this);

		Container c = getContentPane();
		c.add(panel, BorderLayout.CENTER);
		c.add(calc, BorderLayout.SOUTH);
	}

	// Finds the total wages based on hours worked and rate per hour
	public double totalWages(double hours, double rate) {
		if (rate > 23 && rate < 25)
			System.out.println("Your rate per hour is about average in the United States!");
		if (hours > 34.4)
			System.out.println("You work longer every week than the average American!");
		double wages;
		if (hours < 40) {
			wages = hours * rate;
		} else {
			wages = 40 * rate + (hours - 40) * rate * 1.5;
		}
		if (wages > 857) {
			System.out.println("You make more money every week than the average American!");
		}
		return wages;
	}

	// What to do when an action is performed
	public void actionPerformed(ActionEvent e) {
		String s = inputHours.getText();
		double hours = Double.parseDouble(s);
		s = inputRate.getText();
		double rate = Double.parseDouble(s);
		double wages = totalWages(hours, rate);
		display.setText(money.format(wages));
	}

	// Defines the window
	public static void main(String[] args) {
		Wages window = new Wages();
		window.setBounds(300, 300, 200, 150);
		window.setDefaultCloseOperation(EXIT_ON_CLOSE);
		window.setVisible(true);
	}
}