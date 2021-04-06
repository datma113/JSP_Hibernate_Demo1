package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entity.Person;

public class PersonDao {
	private SessionFactory factory;

	public PersonDao() {
		factory = MySessionFactory.getInstance().getFactory();
	}
	
	public boolean addPerson(Person p) {
		Session s = factory.openSession();
		Transaction tr = s.getTransaction();
		
		try {
			tr.begin();
			s.save(p);
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
			return false;
		} finally {
			s.close();
		}			
		return true;
	}
	
}
