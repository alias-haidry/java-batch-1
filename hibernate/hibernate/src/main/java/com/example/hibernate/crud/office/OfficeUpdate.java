package com.example.hibernate.crud.office;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.hibernate.HibernateUtil;
import com.example.hibernate.entity.Office;

public class OfficeUpdate {

	public static void main(String[] args) {
		
		Session session = null;
		
		try {
		
			session = HibernateUtil.getSessionFactory().openSession();
			
		    Transaction t = session.beginTransaction();   

		    Office office = session.find(Office.class, "8");

	        office.setAddressLine1("New Address line 1 .......");
	        office.setAddressLine2("New Address line 2 .......");
	        	            
	        session.save(office);  
	        
	        t.commit();  
	        
	        System.out.println("successfully updated");
			
		
		} catch(Exception e) {
			
			e.printStackTrace();
	
		} finally {
			
			if(session != null) {
				session.close();
			}
			
		}
		
		
	}
	
}
