package com.example.hibernate.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.example.hibernate.HibernateUtil;

public class HQLExample {

	public static void main(String[] args) {

		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			Transaction t = session.beginTransaction();
			
			//Example of HQL to get all the records
			Query query=session.createQuery("from Office");
			query.setMaxResults(1);
			query.setFirstResult(3);  
			
			List list=query.list();  
			
			
			
			for(Object o : list) {
				System.out.println(o);
			}
			
			System.out.println("\n\n-------------\n\n");
			
			
			
			t.commit();
			
		}catch (Exception e) {

			e.printStackTrace();

		}
		
		

	}

}
