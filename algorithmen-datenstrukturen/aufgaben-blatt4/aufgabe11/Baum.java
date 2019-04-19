package Aufgabe11;

public class Baum<T> {

	private Baum<T> l;
	private Baum<T> r;
	private T value;

	public Baum(T value) {
		this.value = value;
	}

	public Baum<T> setL(T value) {
		l = new Baum<T>(value);
		return l;
	}

	public Baum<T> setR(T value) {
		r = new Baum<T>(value);
		return r;
	}

	public T maxRecursive() {
		if (r != null) {
			return r.maxRecursive();
		} else {
			return value;
		}

	}

	public T maxIterative() {
		Baum<T> x = this;
		while (x.r != null) {
			x = x.r;
		}
		return x.value;

	}

	@Override
	public String toString() {
		String s = "";
		if (l != null)
			s += l.toString();
		if (r != null)
			s += r.toString();
		s += value;
		return s;
	}

}
