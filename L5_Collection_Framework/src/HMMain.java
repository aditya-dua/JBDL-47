import java.util.HashMap;
import java.util.HashSet;

public class HMMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hashmap = new HashMap<>();
		
		hashmap.put(1, "Aditya");
		
		hashmap.put(2, "John");
		hashmap.put(3, "Viky");
		
		System.out.println(hashmap.size());
		hashmap.put(1, "Vishal");
		
		System.out.println(hashmap.size());
		
		
		System.out.println(hashmap.get(1));
		
		HashMap<Integer, Student> studentHM = new HashMap<>();
		
		int marks[]= {10,20,30};
		
		Student s = new Student(1, "ABC", marks);
		studentHM.put(s.id, s);
		
		Student s1 = new Student(1, "ABC", marks);
		studentHM.put(s.id, s1);
		
		studentHM.get(1);

		HashMap<String, Object> sampleSet = new HashMap<>();
		
		Object o = new Object();
		
		sampleSet.put("Aditya", o);
		sampleSet.put("Vishal", o);
		sampleSet.put("Vikram", o);
		sampleSet.put("Aditya", o);

		System.out.println(sampleSet.size());
		
		HashSet<String> hashSet = new HashSet<>();

		hashSet.add("Aditya");
		hashSet.add("Vishal");
		hashSet.add("Vikram");
		hashSet.add("Aditya");


		
	
	}
	

}
