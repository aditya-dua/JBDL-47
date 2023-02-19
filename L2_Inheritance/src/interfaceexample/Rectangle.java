package interfaceexample;

public class Rectangle implements Area{

	int length,width;
	
	
	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("The area of a rectangle is :"+length*width);
	}

	
}
