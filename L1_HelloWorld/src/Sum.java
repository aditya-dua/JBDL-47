
public class Sum {
	
	int a;
	int b;
	int sum;
	
	public Sum(int a, int b) {
		// TODO Auto-generated constructor stub
		this.a=a;
		this.b=b;
		sum();
	}
	
	public Sum(int a) {
		
	}
	
	public Sum() {
		
	}
	
	public Sum(String a) {
		
	}
	
	
	public void sum() {
		sum = a+b;
	}
	
	public void print() {
		sum();
		System.out.println("The sum of a and b is :"+sum);
	}

}
