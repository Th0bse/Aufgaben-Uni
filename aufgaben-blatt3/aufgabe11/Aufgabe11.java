package p2Blatt03;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Aufgabe11 extends JFrame {

	private Container c;
	private JLabel label;
	private JTextField in;
	private JTextField out;
	private JCheckBox checkLog;
	private JCheckBox checkSqrt;
	private ButtonGroup group = new ButtonGroup();
	private JButton button;
	
	public Aufgabe11() {
		c = getContentPane();
		c.setLayout(new GridLayout(2, 3));
		label = new JLabel("Argument");
		in = new JTextField();
		out = new JTextField();
		checkLog = new JCheckBox("Logarithmus");
		checkSqrt = new JCheckBox("Quadratwurzel");
		group.add(checkLog);
		group.add(checkSqrt);
		group.setSelected(checkLog.getModel(), true);
		button = new JButton("Berechnen");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (group.getSelection() == checkLog.getModel()) {
					out.setText(Double.toString(Math.log((Double.parseDouble(in.getText())))));
				} else if (group.getSelection() == checkSqrt.getModel()) {
					out.setText(Double.toString(Math.sqrt(Double.parseDouble(in.getText()))));
				}
				
			}
		});
		c.add(label);
		c.add(checkLog);
		c.add(button);
		c.add(in);
		c.add(checkSqrt);
		c.add(out);
	}
	
	public static void main(String[] args) {
		Aufgabe11 f = new Aufgabe11();
		f.setTitle("Aufgabe11");
		f.setSize(400, 150);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
