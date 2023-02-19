package multilevel;

public class Person {
	
	String name;
	
	
	public Person() {
		System.out.println("Person Default Constructor");
		// TODO Auto-generated constructor stub
	}
	
	

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Display of Person");
	}



	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}



	public Person(String name) {
		this();
		this.name = name;
	}
	
	

}
