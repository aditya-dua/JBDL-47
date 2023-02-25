
public class Person {
	
	int id;
	int num;
	
	
	public Person() {
		// TODO Auto-generated constructor stub
		
		/*try {
			num = id/1;
		}finally {
			System.out.println("In finaly");
		}*/
		
	}
	
	public int calculate() {
		// Handle my exception here
		
		int num = 0;
		try {
			System.out.println("In Try before divide by zero");
			
			num = id/0;
			
			System.out.println("In Try after divide by zero");
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.err.println("In Catch");
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			System.out.println("In finally");
		}
		
		
		return num;
	}

}
