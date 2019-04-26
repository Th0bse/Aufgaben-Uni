package Blatt6;

public class FCFSListe implements WarteSchlange{
	
	private ZPatient first;
	private ZPatient last;
	
	@Override
	public void anmelden(ZPatient p) {
		if (first == null) {
			first = p;
			last = p;
		} else {
			last.next = p;
			last = p;
		}
		
	}

	@Override
	public ZPatient derNaechsteBitte() {
		try {
		ZPatient temp = first;
		first = first.next;
		return temp;
		} catch (NullPointerException ne) {
			return null;
		}
	}

}
