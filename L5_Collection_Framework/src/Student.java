import java.util.Arrays;

public class Student {

	int id;
	String name;
	int [] marks;
	
	
	public Student(int id, String name, int[] marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + Arrays.toString(marks) + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Student s=(Student) obj;
		if(this.id==s.id) {return true;}
		else {return false;}
		
	}
	
	
}
