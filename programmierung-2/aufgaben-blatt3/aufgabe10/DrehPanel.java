package p2Blatt03;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class DrehPanel extends JPanel {

	public final double SCHRITTEWITE = Math.PI / 60;
	private GeoObjekt drehObjekt = new Strecke(new Punkt(0, 0), new Punkt(100, 100));
	private JButton buttonLinks;
	private JButton buttonRechts;
	private JButton buttonStrecke;
	private JButton buttonDreieck;

	public DrehPanel() {
		this.setLayout(new FlowLayout());
		buttonLinks = new JButton("Links");
		buttonLinks.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				drehObjekt.drehen(SCHRITTEWITE * -1);
				repaint();
			}

		});
		buttonRechts = new JButton("Rechts");
		buttonRechts.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				drehObjekt.drehen(SCHRITTEWITE);
				repaint();
			}

		});
		buttonStrecke = new JButton("Strecke");
		buttonStrecke.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				drehObjekt = erzeugeStrecke();
				repaint();
			}

		});
		buttonDreieck = new JButton("Dreieck");
		buttonDreieck.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				drehObjekt = erzeugeDreieck();
				repaint();
			}

		});
		add(buttonLinks);
		add(buttonRechts);
		add(buttonStrecke);
		add(buttonDreieck);
	}

	private Strecke erzeugeStrecke() {
		return new Strecke(new Punkt(0, 0), new Punkt(100, 100));
	}

	private Dreieck erzeugeDreieck() {
		return new Dreieck(new Punkt(0, 0), new Punkt(50, -66), new Punkt(100, 0));
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		drehObjekt.zeichnen(g, this.getWidth() / 2, this.getHeight() / 2);
	}

}
