package l18_hibernate_mapping.one2one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class O2OMappingMainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration c = new Configuration();
		
		SessionFactory factory =c.configure("hbmO2O.cfg.xml").buildSessionFactory();
		
		Address add1 = new Address(1, "Street Number 1", "Delhi", "India");
		
		Employee emp = new Employee(1, "Aditya", "Dua", add1);
		
		Session session = factory.openSession();
		
		Transaction tx;
		
		try {
			tx=session.beginTransaction();
			session.save(add1);
			session.save(emp);
			
			tx.commit();
			session.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
