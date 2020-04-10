package com.example.hibernate.crud.office;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.hibernate.HibernateUtil;
import com.example.hibernate.entity.Office;

public class OfficeDelete {

	public static void main(String[] args) {
		
		Session session = null;
		
		try {
		
			session = HibernateUtil.getSessionFactory().openSession();
			
		    Transaction t = session.beginTransaction();   
		    
		    Office office = session.find(Office.class, "8");
		    
		    session.delete(office);
		    
	        t.commit();  
	        
	        System.out.println("successfully removed");
			
		
		} catch(Exception e) {
			
			e.printStackTrace();
	
		} finally {
			
			if(session != null) {
				session.close();
			}
			
		}
		
		
	}
	
}
