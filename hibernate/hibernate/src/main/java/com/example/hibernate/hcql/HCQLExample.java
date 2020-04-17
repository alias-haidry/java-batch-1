package com.example.hibernate.hcql;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.example.hibernate.HibernateUtil;
import com.example.hibernate.entity.Office;

public class HCQLExample {

	public static void main(String[] args) {

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			Transaction t = session.beginTransaction();

			Criteria cr = session.createCriteria(Office.class);
			
			cr.add(Restrictions.gt("officeCode", "5"));
			cr.addOrder(Order.desc("officeCode"));
			
			List result = cr.list();

			for(Object o : result) {
				System.out.println(o);
			}
			
			System.out.println("\n\n-------------\n\n");
			
			t.commit();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
