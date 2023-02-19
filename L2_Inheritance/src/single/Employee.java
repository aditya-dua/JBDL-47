package single;

public class Employee {
	
	String name;
	int id;
	String email;
	
	
	
	public Employee() {
		System.out.println("Employee Default Constructor");
		// TODO Auto-generated constructor stub
	}

	public void display() {
		System.out.println("Display from Employee");
		System.out.println("Name: "+name+" id:"+id+" email:"+email);
	}


	public Employee(String name, int id, String email) {
		super();
		this.name = name;
		this.id = id;
		this.email = email;
	}
	




	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", email=" + email + "]";
	}
	
	

}
