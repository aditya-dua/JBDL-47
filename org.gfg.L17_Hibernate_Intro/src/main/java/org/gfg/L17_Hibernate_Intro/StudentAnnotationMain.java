package org.gfg.L17_Hibernate_Intro;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentAnnotationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration c = new Configuration();
		
		SessionFactory factory =c.configure("hbm-student-annotation.cfg.xml").buildSessionFactory();
		
		Student student = new Student(100, "ADITYA");
		
		Session s = factory.openSession();
		
		s.save(student);
		s.close();
		//hbm-student-annotation.cfg.xml
	}

}
