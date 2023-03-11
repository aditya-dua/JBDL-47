import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> al= new ArrayList<>();
		
		int marks[]= {10,20,30};
		Student s = new Student(1, "ABC", marks);
		
		al.add(s);
		
		for (Student student : al) {
			System.out.println(student);
		}

	}

}
