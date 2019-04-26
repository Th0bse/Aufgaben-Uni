package Blatt6;

import java.util.Collection;
import java.util.HashSet;

public class Aufgabe17 {

	public static void main(String[] args) {
		Collection<Integer> numbers = new HashSet<Integer>();
		while (numbers.size() < 7) {
			numbers.add((int)(Math.random() * 49 + 1));
		}
		
		System.out.println(numbers);
	}
}
