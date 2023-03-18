import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		File f = new File("myFirstFile.txt");
		System.out.println(f.length()+"  "+f.lastModified());
		try {
			Scanner reader = new Scanner(f);
			
			String data;
			while(reader.hasNextLine()) {
				data = reader.nextLine();
				System.out.println(data);
			}
			
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
