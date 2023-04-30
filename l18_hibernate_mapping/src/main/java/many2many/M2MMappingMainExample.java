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
		
		
		Cart cart = new Cart();
		cart.setTotal(150);
		
		HashSet<Item> itemSet = new HashSet<Item>();
		itemSet.add(i1);
		itemSet.add(i);
		
		cart.setItems(itemSet);
		
		try{
			
			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();
			session.save(cart);
			System.out.println("Before committing transaction");
			tx.commit();
			factory.close();
		
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
