package l18_hibernate_mapping.one2many;

import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class O2MMappingMainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration c = new Configuration();
		
		SessionFactory factory =c.configure("hbmO2M.cfg.xml").buildSessionFactory();
		
		Address add1 = new Address(1, "Street Number 1", "Delhi", "India");
		Address add2 = new Address(2, "Street Number 1", "Delhi", "India");

		
		HashSet<Address> addSet = new HashSet<Address>();
		
		addSet.add(add1);
		addSet.add(add2);
		
		
		Employee emp = new Employee(1, "Aditya", "Dua", addSet);
		
		Session session = factory.openSession();
		
		Transaction tx;
		
		try {
			tx=session.beginTransaction();
			
			session.save(add1);
			session.save(add2);
			session.save(emp);
			
			tx.commit();
			session.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
