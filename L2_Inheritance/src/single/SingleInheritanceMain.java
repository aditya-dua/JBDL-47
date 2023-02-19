package single;

public class SingleInheritanceMain {
	
	public static void main(String[] args) {
		
		FullTimeEmployee fte = new FullTimeEmployee(100, "ABC Bank");
		
		FullTimeEmployee fte1 = new FullTimeEmployee("ABC", 1, "abc@abc.com");

		FullTimeEmployee fte3 = new FullTimeEmployee("ABC1", 2, "abc2@abc.com",100,"DEF Bank");

		fte.display();
		fte1.display();
		fte3.display();
		
		System.out.println(fte);
		System.out.println(fte1);
		System.out.println(fte3);
		
		Employee emp = new Employee();
		Employee emp1= new Employee("EMployee", 3, "e@abc.com");
		
		System.out.println(emp);
		System.out.println(emp1);
		
		Employee e1 = new FullTimeEmployee();
		Employee e2 = new Employee();
		FullTimeEmployee e3 = new FullTimeEmployee();
		
		e1.updateSalary();
		
		e1.display();
		e2.display();
		//e1.super.display();
		
		//FullTimeEmployee e4 = new Employee();


	}

}
