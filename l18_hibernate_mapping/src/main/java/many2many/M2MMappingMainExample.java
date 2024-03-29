package many2many;

import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class M2MMappingMainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration c = new Configuration();
		
		SessionFactory factory =c.configure("hbmM2M.cfg.xml").buildSessionFactory();
		
		Item i = new Item(1, 100, "iphone");
		
		Item i1 = new Item(2, 50, "macbook");
		
		
	
		
		HashSet<Item> itemSet = new HashSet<Item>();
		itemSet.add(i1);
		itemSet.add(i);
		
		
//		Cart cart = new Cart();
//		cart.setTotal(150);
//		cart.setItems(itemSet);
//		
//		Session session = factory.openSession();
//		
//		session.save(cart);
//		
//		session.close();
		Cart cart1 = new Cart(1,150,itemSet);
		
		
		Session session = factory.openSession();
		Transaction tx;
		try {
			tx = session.beginTransaction();
			session.save(cart1);


			tx.commit();
			session.close();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
