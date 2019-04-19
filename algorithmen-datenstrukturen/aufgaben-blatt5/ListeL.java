package Sortieralgorithmen;

public class ListeL<I extends Comparable<I>> {

	static class ElementL<K> {
		private K inhalt; // Inhalt des Listenelements
		private ElementL<K> next; // Verweis auf den Nachfolger

		public ElementL(K o) {
			inhalt = o;
			next = null;
		}
	}

	private ElementL<I> head; // Referenz auf den Anfang der Liste

	public ListeL() {
		head = null;
	}

	public ListeL(I o) {
		head = new ElementL<I>(o);
	}

	public ElementL<I> insert(I o) { // am Anfang einfügen
		ElementL<I> newEl = new ElementL<I>(o);
		if (head == null) { // Liste ist noch leer
			head = newEl;
		} else {
			newEl.next = head;
			head = newEl;
		}
		return newEl;
	}

	public ElementL<I> insert(I o, ElementL<I> pred) { // nach pred (Vorgänger) einfügen
		ElementL<I> newEl = new ElementL<I>(o);
		if (pred == null) { // am Anfang einfügen
			newEl.next = head;
			head = newEl;
		} else { // nach pred (Vorgänger) einfügen
			newEl.next = pred.next;
			pred.next = newEl;
		}
		return newEl;
	}

	public void remove(ElementL<I> pred) { // Element nach pred (Vorgänger) löschen
		if (pred == null) // erstes Element löschen
			head = head.next;
		else if (pred.next != null) // Element nach pred (Vorgänger) löschen
			pred.next = pred.next.next;
	}

	public String toString() {
		String s = "(";
		ElementL<I> help = head;
		while (help != null && help.next != null) {
			s = s + help.inhalt + ", ";
			help = help.next;
		}
		if (help != null)
			s = s + help.inhalt;
		return s + ")";
	}

	public int find1(I o) {
		ElementL<I> help = head;
		int pos = 0;
		while (help.inhalt.compareTo(o) != 0 && help != null) {
			pos++;
			help = help.next;
		}

		return pos;
	}

	public void selectionsort() {
		ElementL<I> pos = head;
		ElementL<I> help;
		ElementL<I> min;
		while (pos.next != null) {
			help = pos;
			min = pos;
			// find min
			do {
				if (help.inhalt.compareTo(min.inhalt) < 0) {
					min = help;
				}
				help = help.next;
			} while (help != null);
			// insert min at pos
			I temp = pos.inhalt;
			pos.inhalt = min.inhalt;
			min.inhalt = temp;
			// inc pos
			pos = pos.next;
		}
	}

	public void bubblesort() {
		ElementL<I> help;
		boolean swapped = true;
		while (swapped) {
			swapped = false;
			help = head;
			while (help.next != null) {
				if (help.inhalt.compareTo(help.next.inhalt) > 0) {
					I temp = help.inhalt;
					help.inhalt = help.next.inhalt;
					help.next.inhalt = temp;
					swapped = true;
				}
				help = help.next;
			}
		}
	}

	/*
	* NOT functional. possibly never going to be fixed by me.. Marc? haha
	*/
	public void insertionsort() {
		ElementL<I> toSort;
		ElementL<I> lastSorted = head;
		ElementL<I> help = head;
		boolean insert = false;
		while (lastSorted.next != null) {
			help = head;
			toSort = lastSorted.next;
			insert = false;
			// test if we can just leave toSort where it is
			if (lastSorted.inhalt.compareTo(toSort.inhalt) < 0) {
				insert = true;
			}
			// iterate from head to lastSorted, to find position where to insert toSort
			while (help.next.inhalt.compareTo(toSort.inhalt) < 0 && !insert) {
				if (help.inhalt.compareTo(toSort.inhalt) >= 0) {
					insert = true;
				}
			}
			// insert toSort after help
			ElementL<I> temp = help.next;
			lastSorted.next = toSort.next;
			toSort.next = temp.next;
			temp.next = toSort;
			lastSorted = lastSorted.next;
		}
	}

	public static void main(String[] args) {
		ListeL<Integer> l = new ListeL<Integer>();
		l.insert(0);
		ElementL<Integer> eins = l.insert(Integer.valueOf(1));
		l.insert(3);
		System.out.println(l);
		l.insert(2, eins); // nach eins einfügen
		System.out.println(l);
		l.remove(eins); // Nachfolger von eins löschen
		System.out.println(l);
		System.out.println(l.find1(Integer.valueOf(1)));
		for (int i = 0; i < 50; i++) {
			l.insert(Integer.valueOf((int) (Math.random() * 200)));
		}
		System.out.println(l);
		System.out.println("----------------------------------------");
		l.selectionsort();
		System.out.println("Selectionsort:");
		System.out.println(l);
		System.out.println("----------------------------------------");
		l = new ListeL<Integer>();
		for (int i = 0; i < 50; i++) {
			l.insert(Integer.valueOf((int) (Math.random() * 200)));
		}
		System.out.println("----------------------------------------");
		l.bubblesort();
		System.out.println("Bubblesort:");
		System.out.println("----------------------------------------");
		System.out.println(l);
		l = new ListeL<Integer>();
		for (int i = 0; i < 50; i++) {
			l.insert(Integer.valueOf((int) (Math.random() * 200)));
		}
		System.out.println("----------------------------------------");
		l.insertionsort();
		System.out.println("Insertionsort:");
		System.out.println("----------------------------------------");
		System.out.println(l);
		
	}
}
