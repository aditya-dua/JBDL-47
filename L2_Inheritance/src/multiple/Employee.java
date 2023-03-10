package multiple;

public class Employee {

	int id;
	String name;
	
	public void display() {
		display(1);
		System.out.println("Display");
	}
	
	public void display(int num) {
		this.display();
		System.out.println("Display");
	}
}
