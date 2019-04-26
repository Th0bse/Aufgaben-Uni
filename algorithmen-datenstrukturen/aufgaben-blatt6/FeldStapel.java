package Blatt6;

import java.util.ArrayList;

public class FeldStapel<I> {

	private ArrayList<I> array = new ArrayList<>();
	
	public void push(I val) {
		array.add(val);
	}
	
	public I pop() {
		return array.remove(array.size() - 1);
	}
	
	public I peek() {
		return array.get(array.size() - 1);
	}
}
