package dancestudio;

// Represents a display panel for a dance group

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

public class DanceFloor extends JPanel {
	private static final long serialVersionUID = -7863256056946209401L;

	// Constructor
	public DanceFloor() {
		setBackground(Color.WHITE);
	}

	// Called from DanceGroup
	public void update(StudentGroup students) {
		this.students = students;
		repaint();
	}

	private StudentGroup students;

	// Called when this panel needs to be repained
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (students != null)
			students.draw(g);
	}
}
