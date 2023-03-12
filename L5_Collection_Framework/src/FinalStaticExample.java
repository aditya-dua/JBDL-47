
public class FinalStaticExample {
	
	private int id;
	protected int name;
	final int pie=3;
	static int counter = 0;
	
	static void display() {
		System.out.println("In Final Static Example Display.");
	}

	static void display(int i) {
		System.out.println("In Final Static Example Display.");
	}

	final void testFunction() {
		System.out.println("In Final Static Example testFunction.");
	}
}
