import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHWMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
	
		HelloWorld hw = (HelloWorld)context.getBean("helloWorld");
		hw.setMessage("Test Message");
	
		hw.print();
		
		System.out.println(hw);
		
		HelloWorld hw1 = (HelloWorld)context.getBean("helloWorld");
		System.out.println(hw1);
	}

}
