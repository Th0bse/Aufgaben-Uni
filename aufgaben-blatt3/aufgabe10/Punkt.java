package p2Blatt03;

public class Punkt {

	private double x;
	private double y;
	
	public Punkt(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	public void drehen(double phi) {
		double xn = x * Math.cos(phi) - y * Math.sin(phi);
		double yn = x * Math.sin(phi) + y * Math.cos(phi);
		x = xn;
		y = yn;
	}
}
