import java.io.File;
import java.io.IOException;

public class FileSample {

	public static void main(String[] args) {
		
		File f = new File("myFirstFile.txt");
		
		if(f.exists()) {
			System.out.println("File Already Exists");
		}else {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("New File is Created.");
			
		}
		
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getName());
		System.out.println(f.length());
		System.out.println(f.isDirectory());
		
		
		
	}
}
