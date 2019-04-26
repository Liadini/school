package landscape;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Landscape extends JPanel {
	private static final long serialVersionUID = 5375446055759395579L;

	private int width = getWidth();
	private int height = getHeight();
	int xCenter = width / 2;
	int yCenter = height / 2;

	public Landscape() {
		
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.ORANGE);
		g.drawOval(600, 75, 100, 100);

		g.setColor(Color.BLACK);
		g.fillRect(200, 250, 50, 200);
		g.setColor(Color.GREEN);
		g.fillOval(150, 200, 150, 100);

		g.setColor(new Color(125, 0, 125));
		g.fillRect(550, 300, 150, 150);
		g.setColor(Color.BLUE);
		Polygon p = new Polygon();
		p.addPoint(550, 300);
		p.addPoint(700, 300);
		p.addPoint(620, 250);
		g.fillPolygon(p);

		g.setColor(Color.GREEN);
		g.drawLine(0, 450, 800, 450);
		g.setColor(new Color(125, 0, 125));
		g.setFont(new Font("Serif", 3, 40));
		g.drawString("Sunnyvale, CA: A Scenic Landscape", 100, 525);
	}

	public static void main(String[] args) {
		JFrame w = new JFrame("Scenic Landscape");
	    w.setBounds(100, 100, 800, 600);
	    w.setDefaultCloseOperation(3);
	    Landscape panel = new Landscape();
	    panel.setBackground(Color.WHITE);
	    w.add(panel);
	    w.setResizable(true);
	    w.setVisible(true);
	}

}
