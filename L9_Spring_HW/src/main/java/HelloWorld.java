
public class HelloWorld {

	private String message;

	public void init() {
		// INIT which we call
		System.out.println("Init called");
		
	}
	
	public void destroy() {
		System.out.println("Destroy Called");
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void print() {
		System.out.println("Message: "+message);
	}
}
