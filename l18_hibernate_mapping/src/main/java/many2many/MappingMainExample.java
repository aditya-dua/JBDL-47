package many2many;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingMainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration c = new Configuration();
		
		SessionFactory factory = c.configure("hbmM2M.cfg.xml").buildSessionFactory();
		
		Item item = new Item(1, 200,"ABC");
		Item item2 = new Item(2, 100,"DEF");
		
		Set<Item> itemSet = new HashSet<Item>();
		itemSet.add(item2);
		itemSet.add(item);

		
		Cart cart1 = new Cart();
		cart1.setTotal(100);
		cart1.setItems(itemSet);
		
		Cart cart = new Cart(2,200,itemSet);
		Session session = factory.openSession();
		
		Transaction tx;
		try {
			tx = session.beginTransaction();
			session.save(item);
			session.save(item2);
			session.save(cart);
			session.save(cart1);
//			session.save(item);
//			session.save(item2);
			

			tx.commit();
			session.close();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}

}