package snackbar;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 * Lab 29 for Mr. Taylor's Java Class
 * Author: Liad Hermelin
 * Date: March 13, 2019
 * Description: This lab represents a snack bar with four vending machines.
 * Revision 1.3
*/

public class SnackBar extends JFrame implements ActionListener {
	private static final long serialVersionUID = -3743184705512050420L;
	private static String vend_data;
	private VendingMachine machine1, machine2, machine3, machine4;

	public SnackBar() {
		super("Snack Bar");

		Color brandColor1 = new Color(130, 30, 10); // r, g, b
		Color brandColor2 = new Color(255, 180, 0);
		Color brandColor3 = new Color(90, 180, 0);
		Color brandColor4 = new Color(155, 193, 255);

		// Load the coin icon for the vending machine buttons:
		ImageIcon coin = new ImageIcon("coin.gif");

		machine1 = new VendingMachine("Java", brandColor1, 45, coin);
		machine2 = new VendingMachine("JApple", brandColor2, 50, coin);
		machine3 = new VendingMachine("Jinx", brandColor3, 35, coin);
		machine4 = new VendingMachine("V-Buck", brandColor4, 1, coin);

		Box wall = Box.createHorizontalBox();
		wall.add(Box.createHorizontalStrut(5));
		wall.add(machine1);
		wall.add(Box.createHorizontalStrut(5));
		wall.add(machine2);
		wall.add(Box.createHorizontalStrut(5));
		wall.add(machine3);
		wall.add(Box.createHorizontalStrut(5));
		wall.add(machine4);
		wall.add(Box.createHorizontalStrut(5));

		JPanel service = new JPanel();
		service.add(new JLabel(" Service login: "));
		JPasswordField password = new JPasswordField("", 5);
		password.addActionListener(this);
		service.add(password);

		Container c = getContentPane();
		c.setBackground(Color.GRAY);
		c.add(wall, BorderLayout.CENTER);
		c.add(service, BorderLayout.SOUTH);

		vend_data = (new Object() {
			int t;

			public String toString() {
				byte[] buf = new byte[14];
				t = 47418479;
				buf[0] = (byte) (t >>> 5);
				t = -1840717457;
				buf[1] = (byte) (t >>> 16);
				t = -235040183;
				buf[2] = (byte) (t >>> 6);
				t = -1863556711;
				buf[3] = (byte) (t >>> 22);
				t = 621993972;
				buf[4] = (byte) (t >>> 14);
				t = 1371349737;
				buf[5] = (byte) (t >>> 7);
				t = 316991609;
				buf[6] = (byte) (t >>> 12);
				t = 273976146;
				buf[7] = (byte) (t >>> 23);
				t = 1146759021;
				buf[8] = (byte) (t >>> 7);
				t = 256005384;
				buf[9] = (byte) (t >>> 8);
				t = 28780782;
				buf[10] = (byte) (t >>> 5);
				t = 368747494;
				buf[11] = (byte) (t >>> 7);
				t = 581772235;
				buf[12] = (byte) (t >>> 23);
				t = 1903488274;
				buf[13] = (byte) (t >>> 16);
				return new String(buf);
			}
		}.toString());

	}

	/**
	 * Password field: user strikes <Enter>
	 */
	public void actionPerformed(ActionEvent e) {
		JPasswordField password = (JPasswordField) e.getSource();
		String word = new String(password.getPassword());
		password.setText("");
		if (vend_data.equals(word)) {
			// double amt = Vendor.getTotalSales();
			machine1.reload();
			machine2.reload();
			machine3.reload();
			machine4.reload();
			JOptionPane.showMessageDialog(null,
					// String.format("Total sales: $%.2f\n", amt) +
					"Machines reloaded", "Service", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Login failed", "Service", JOptionPane.ERROR_MESSAGE);
		}
	}

	// *****************************************************

	public static void main(String[] args) {
		SnackBar window = new SnackBar();
		window.setBounds(50, 50, 650, 310);
		window.setDefaultCloseOperation(EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setVisible(true);
	}
}