package dancestudio;

import java.awt.*;
import javax.swing.*;

public class DanceLesson extends JFrame {
	private static final long serialVersionUID = -7284150222898343885L;

	public DanceLesson(StudentGroup students, DanceFloor danceFloor) {
		super("Step By Step Dance Studio");

		Container c = getContentPane();
		c.setBackground(Color.WHITE);

		c.add(danceFloor, BorderLayout.CENTER);
		ControlPanel controls = new ControlPanel(students);
		c.add(controls, BorderLayout.EAST);

		setBounds(100, 100, 640, 480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		students.setup(0, null, null);
	}
}
