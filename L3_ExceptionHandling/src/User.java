
public class User {
	int id;
	String name;
	int age;
	
	
	public void register(int id, String name, int age) throws InvalidAgeException {
		if(age>18) this.age = age;
		else throw new InvalidAgeException("Minimum age to register is 18.");
		
		this.id=id;
		
		if(name!=null) this.name=name;
		else throw new NullPointerException("Name cannot be Null!");
		
	}

}
