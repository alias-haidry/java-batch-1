package com.example.hibernate.crud.office;

import org.hibernate.Session;

import com.example.hibernate.HibernateUtil;
import com.example.hibernate.entity.Office;

public class OfficeRead {

	public static void main(String[] args) {
		
		Session session = null;
		
		try {
		
			session = HibernateUtil.getSessionFactory().openSession();
			
			Office office = session.find(Office.class, "8");
			
	        System.out.println(office);
			
		
		} catch(Exception e) {
			
			e.printStackTrace();
	
		} finally {
			
			if(session != null) {
				session.close();
			}
			
		}
		
		
	}
	
}
