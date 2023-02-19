package interfaceexample;

public class InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r = new Rectangle();
		r.length=100;
		r.width=50;
		
		r.calculateArea();
		
		
		Square s=new Square();
		s.side=100;
		s.calculateArea();
	}

}
