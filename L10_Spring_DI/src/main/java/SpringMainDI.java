import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMainDI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		Address add = (Address) context.getBean("address");
		Employee emp = (Employee) context.getBean("employee");
		
		System.out.println(emp);
	}

}
