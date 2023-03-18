import java.io.File;
import java.io.IOException;

public class FileSample {

	public static void main(String[] args) throws IOException {
		
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
		
		
		File file = new File("folder1/folder2/folder3");
		
		// Log file
		// File f = new file("03-2022/18")
	
		if(file.mkdirs()) {
			System.out.println("Folder creation is success");
		}else {
			System.out.println("Folder already exists");
		}
		
		File fileNew = new File(file.getAbsolutePath()+"/myNewFile.txt");
		
		
		System.out.println(fileNew.createNewFile());
		System.out.println(fileNew.getAbsolutePath());
		
		
		File home = new File("/");
		
		String[] fileList = home.list();
		for (String string : fileList) {
			
			System.out.println("File: "+string);
		}
		

	}
}
