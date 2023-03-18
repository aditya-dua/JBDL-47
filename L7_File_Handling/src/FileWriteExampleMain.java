import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f = new File("myFirstFile.txt");
			FileWriter fileWriter;
			
			// You have to create the file over here
			fileWriter = new FileWriter(f);
			fileWriter.write("Its my First Text File");
			
			fileWriter.flush();
			fileWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
