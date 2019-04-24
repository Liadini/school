package dancestudio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class Band implements ActionListener {
//	private EasySound[] beat;
	private StudentGroup students;
	private Dance dance;
	private Timer clock;
	private int beatCount;

	public Band(StudentGroup group) {
		students = group;

		// FIX PCM_UNSIGNED BUG
//		beat = new EasySound[3];
//		beat[1] = new EasySound("beat1.wav");
//		beat[2] = new EasySound("beat2.wav");
//		beat[1].play();
//		beat[2].play();
	}

	public void play(Dance dance) {
		this.dance = dance;
		clock = new Timer(dance.getTempo(), this);
		clock.start();
		beatCount = 0;
	}

	public void stop() {
		clock.stop();
	}

	public void actionPerformed(ActionEvent e) {
		int i = dance.getBeat(beatCount);
//		if (i > 0)
//			beat[i].play();
		students.makeNextStep();
		beatCount++;
	}
}
