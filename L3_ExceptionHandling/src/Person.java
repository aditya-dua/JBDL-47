
public class Person {
	
	int id;
	
	public int calculate() {
		// Handle my exception here
		
		int num = 0;
		try {
			num = id/0;
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return num;
	}

}
