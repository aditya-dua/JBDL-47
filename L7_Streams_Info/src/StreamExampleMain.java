import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> number = Arrays.asList(3,2,1);
		
		List<Integer> square = number.stream()
				.map(x-> x*x)
				.sorted()
				.collect(Collectors.toList());
		
		for (Iterator iterator = square.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
			
		}
		
		int sum = number.stream()
				.map(x-> x*x)
				.reduce(0,(i,tot)-> tot+i);
		
		// i tot
		// 1 0 ..1
		// 4 1 .. 5
		// 9 5 .. 14
		System.out.println(sum);
		
		List<String> name = Arrays.asList("Aditya","ROhan","Roshan","Rakesh","John");
		
		name.stream().filter(s->s.startsWith("R")).skip(1).forEach(x-> System.out.println(x));
		
		
	
	}
	

}
