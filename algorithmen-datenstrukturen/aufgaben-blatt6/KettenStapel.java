package Blatt6;

import java.util.LinkedList;

public class KettenStapel<I> {

	LinkedList<I> list = new LinkedList<>();
	
	public void push(I val) {
		list.push(val);
	}
	
	public I peek() {
		return list.peek();
	}
	
	public I pop() {
		return list.pop();
	}
}
