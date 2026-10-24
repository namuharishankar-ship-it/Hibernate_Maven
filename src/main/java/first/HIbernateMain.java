package first;

import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import java.util.*;
public class HIbernateMain {

	public static void main(String[] args) {
		try (
		Scanner s = new Scanner(System.in)) {
//			String bankname = s.next();
//			int accountnumber = s.nextInt();
//			String accountname = s.next();
			
			Configuration cfg = new Configuration().configure("hibernate-cfg.xml");
			SessionFactory factory = cfg.buildSessionFactory();//session creation
			Session session = factory.openSession();//session  
			
			//create, read, update, delete
			Transaction tx = session.beginTransaction();
			
//			session.createNativeQuery("insert into bank values(:no,:name,:bankname)")
//			.setParameter("no",45647).setParameter("name", "jai").setParameter("bankname", "SBI")
//			.executeUpdate();
			
			session.createQuery("insert into Bank(bankname,accountnumber,accountname) values(:bankname,:no,:name)")
			.setParameter("bankname", "Axis").setParameter("no",76739904).setParameter("name", "babu2")
			.executeUpdate();
			
//			Bank b = new Bank(bankname,accountnumber,accountname);
//			session.persist(b);
			List<Bank> list = session.createQuery("From Bank",Bank.class).getResultList();
			for(Bank i: list) {
				System.out.println(i.getBankname());
				System.out.println(i.getAccountno());
				System.out.println(i.getAccountname());
			}
			tx.commit();
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Values are inserted");
	}
//
}
