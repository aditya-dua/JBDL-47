import java.util.HashSet;

public class Student {
	
	private String name;
	private HashSet<Integer> marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HashSet<Integer> getMarks() {
		return marks;
	}
	public void setMarks(HashSet<Integer> marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	
	

}
