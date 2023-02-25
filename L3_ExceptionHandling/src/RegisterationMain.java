
public class RegisterationMain {

	public static void main(String[] args) {
		
		User u = new User();
		try {
			u.register(1, null, 19);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
