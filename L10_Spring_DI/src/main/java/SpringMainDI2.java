import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMainDI2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-cons.xml");
		
		Employee emp = (Employee) context.getBean("employee");
		
		System.out.println(emp);
		
		Student stu = (Student) context.getBean("student");
		
		System.out.println(stu);

	}

}
