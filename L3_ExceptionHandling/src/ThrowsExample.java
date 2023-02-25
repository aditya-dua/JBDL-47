import java.io.FileNotFoundException;

public class ThrowsExample {

	public static void main(String[] args) {
		
		
		try {
			throwExample();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		try {
			readFile();
			//int i = 10/0;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public static void readFile() throws FileNotFoundException {
		//throw new Exception("Dummy Exception")
		//FileReader f = new FileReader("test.txt");
		//BufferedReader br = new BufferedReader(f);
	}
	public static void throwExample() throws Exception  {
		throw new Exception("Age should atleast be 18 years to register.");
		
	}
}
