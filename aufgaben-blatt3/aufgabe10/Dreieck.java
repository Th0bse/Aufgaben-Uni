package p2Blatt03;

import java.awt.Graphics;

public class Dreieck implements GeoObjekt {

	protected Punkt punkt1;
	protected Punkt punkt2;
	protected Punkt punkt3;

	private Strecke strecke1;
	private Strecke strecke2;
	private Strecke strecke3;

	public Dreieck(Punkt punkt1, Punkt punkt2, Punkt punkt3) {
		this.punkt1 = punkt1;
		this.punkt2 = punkt2;
		this.punkt3 = punkt3;
		this.strecke1 = new Strecke(punkt1, punkt2);
		this.strecke2 = new Strecke(punkt2, punkt3);
		this.strecke3 = new Strecke(punkt3, punkt1);
	}

	@Override
	public void drehen(double phi) {
		punkt1.drehen(phi);
		punkt2.drehen(phi);
		punkt3.drehen(phi);
	}

	@Override
	public void zeichnen(Graphics g, int xNull, int yNull) {
		strecke1.zeichnen(g, xNull, yNull);
		strecke2.zeichnen(g, xNull, yNull);
		strecke3.zeichnen(g, xNull, yNull);
	}

}
