package com.example.hibernate.crud.office;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.hibernate.HibernateUtil;
import com.example.hibernate.entity.Office;

public class OfficeCreate {

	public static void main(String[] args) {
		
		Session session = null;
		
		try {
		
			session = HibernateUtil.getSessionFactory().openSession();
			
		    Transaction t = session.beginTransaction();   

	        Office office = new Office();    
	        office.setOfficeCode("8");
	        office.setCity("kolkata");
	        office.setPhone("1234");
	        office.setAddressLine1("Address line 1 .......");
	        office.setAddressLine2("Address line 2 .......");
	        office.setState("West Bengal");
	        office.setCountry("India");
	        office.setPostalCode("700000");
	        office.setTerritory("ASIA");
	        	            
	        session.save(office);  
	        
	        t.commit();  
	        
	        System.out.println("successfully created");
			
		
		} catch(Exception e) {
			
			e.printStackTrace();
	
		} finally {
			
			if(session != null) {
				session.close();
			}
			
		}
		
		
	}
	
}
