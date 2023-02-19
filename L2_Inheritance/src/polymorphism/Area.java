package polymorphism;

public class Area {
	
	
	public int calculateArea(int breadth, int length) {
		return breadth*length;
	}
	
	public int calculateArea(int side) {
		return side*side;
	}
	
	public double calculateArea(double radius) {
		return 3.14*radius;
	}
}
