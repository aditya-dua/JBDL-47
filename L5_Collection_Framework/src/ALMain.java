import java.util.ArrayList;
import java.util.Iterator;

public class ALMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<>();
		
		al.add("Aditya");
		al.add("John");
		al.add("Viman");
		al.add("ABhay");
		
		System.out.println(al.size());
		al.add(3,"Aditya");
		
		for (String string : al) {
			System.out.println(string);
		}

		ArrayList<Integer> alint = new ArrayList<>();
		alint.add(1);
		alint.add(2);
		alint.add(3);
		alint.add(4);
		alint.add(5);
		
		for (int i = 0; i < alint.size(); i++) {
			System.out.println(alint.get(i));
		}
				
		alint.remove(1);
		alint.remove((Integer)5);

		for (int i = 0; i < alint.size(); i++) {
			System.out.println(alint.get(i));
		}
		
		
		ArrayList<String> alCopy = new ArrayList<>(al);
		ArrayList<String> alCopy1 = new ArrayList<>(100);
		System.out.println(alCopy1.size());

	}

}
