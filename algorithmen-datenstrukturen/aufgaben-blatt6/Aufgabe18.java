package Blatt6;

import java.util.HashSet;
import java.util.Iterator;

public class Aufgabe18 {

	public static void main(String[] args) {
		int n = 10000000;
		HashSet<Integer> t = new HashSet<>();
		for (int i = 2; i < n + 1; i++) {
			t.add(i);
		}
		HashSet<Integer> s = new HashSet<>();

		int p = 2;
		do {
			int i = 2;
			while (p * i <= n) {
				s.add(p * i);
				i++;
			}
			if (p == 2) {
				p = 3;
			} else {
				do {
					p = p + 2;
				} while (s.contains(p));
			}
		} while (!(p * p > n));
		t.removeAll(s);
		int i = 0;
		Iterator<Integer> it = t.iterator();
		while (it.hasNext()) {
			if (i == 10) {
				System.out.println();
				i = 0;
			}
			System.out.print(it.next() + " ");
			i++;
		}
	}
}
