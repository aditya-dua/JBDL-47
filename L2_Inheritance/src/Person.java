
public class Person {

	private int id;
	private String name;
	private String phone;
	private String address;
	final int age=0;
	
	
	public Person() {
		// TODO Auto-generated constructor stub
		//this.age=100;
	}
	
	
	// Getter and Setter
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
