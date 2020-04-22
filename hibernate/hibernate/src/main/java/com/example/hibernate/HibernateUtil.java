package com.example.hibernate;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

	private static SessionFactory sessionFactory;

	private HibernateUtil() {
	}

	static {
		Logger x = Logger.getLogger("org.hibernate");
		x.setLevel(Level.SEVERE);
	}

	public static synchronized SessionFactory getSessionFactory() {

		if (sessionFactory == null) {

			StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
			Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
			sessionFactory = meta.getSessionFactoryBuilder().build();

		}
		return sessionFactory;
	}

}
