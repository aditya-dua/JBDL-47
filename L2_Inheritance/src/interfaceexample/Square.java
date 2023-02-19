package interfaceexample;

public class Square extends Shape implements Area{
	
	
	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("The area of a square is :"+side*side);
	}

	
}
