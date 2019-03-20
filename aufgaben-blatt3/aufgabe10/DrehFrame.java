package p2Blatt03;

import java.awt.Container;

import javax.swing.JFrame;

public class DrehFrame extends JFrame {

	private Container c;
	private DrehPanel panel;

	public DrehFrame() {
		c = getContentPane();
		panel = new DrehPanel();
		c.add(panel);
	}

	public static void main(String[] args) {
		DrehFrame f = new DrehFrame();
		f.setTitle("DrehFrame");
		f.setSize(400, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
