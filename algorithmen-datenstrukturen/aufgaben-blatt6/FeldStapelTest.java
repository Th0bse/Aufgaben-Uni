package Blatt6;

public class FeldStapelTest {

	public static void main(String[] args) {
		FeldStapel<Integer> f = new FeldStapel<>();
		f.push(1);
		f.push(2);
		f.push(3);
		
		System.out.println(f.pop());
		System.out.println(f.pop());
		System.out.println(f.pop());
	}
}
