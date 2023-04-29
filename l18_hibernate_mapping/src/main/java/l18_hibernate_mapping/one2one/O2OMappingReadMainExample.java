package l18_hibernate_mapping.one2one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class O2OMappingReadMainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration c = new Configuration();
		
		SessionFactory factory =c.configure("hbmO2O.cfg.xml").buildSessionFactory();
		
		Session session = factory.openSession();
		
		Address add = session.get(Address.class, 1);
		
		System.out.println(add);

		
	}

}
