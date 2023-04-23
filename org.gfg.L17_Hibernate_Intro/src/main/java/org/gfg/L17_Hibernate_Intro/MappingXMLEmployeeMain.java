package org.gfg.L17_Hibernate_Intro;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MappingXMLEmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration c = new Configuration();
		
		SessionFactory factory =c.configure("hbm.cfg.xml").buildSessionFactory();
		
		Employee e = new Employee(1, "ABC");
		
		Session s = factory.openSession();
		
		s.save(e);
		s.close();
	}

}
