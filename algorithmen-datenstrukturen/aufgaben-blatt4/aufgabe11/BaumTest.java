package Aufgabe11;

public class BaumTest {

	public static void main(String[] args) {
		Baum<Integer> b = new Baum<>(7);
		Baum<Integer> x = b.setL(5);
		x.setL(2).setL(1);
		x.setR(6).setL(5);
		b.setR(8).setR(9);
		
		System.out.println(b.maxRecursive());
		System.out.println(b.maxIterative());
		System.out.println(b.toString());
	}
}
