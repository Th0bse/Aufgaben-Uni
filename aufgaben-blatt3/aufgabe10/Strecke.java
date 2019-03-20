package p2Blatt03;

import java.awt.Graphics;

public class Strecke implements GeoObjekt {

	private Punkt punkt1;
	private Punkt punkt2;

	public Strecke(Punkt punkt1, Punkt punkt2) {
		this.punkt1 = punkt1;
		this.punkt2 = punkt2;
	}

	@Override
	public void drehen(double phi) {
		punkt1.drehen(phi);
		punkt2.drehen(phi);

	}

	@Override
	public void zeichnen(Graphics g, int xNull, int yNull) {
		g.drawLine((int) punkt1.getX() + xNull, (int) punkt1.getY() + yNull, (int) punkt2.getX() + xNull, (int) punkt2.getY() + yNull);

	}

}
