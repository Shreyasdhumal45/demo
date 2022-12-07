package com.map;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CustomerTest {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg3.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction ts = session.beginTransaction();


		Customer cust = new Customer();
	

		Policy p1 = new Policy("Accident", "Active", "5677", cust);
		Policy p2 = new Policy("Health", "Active", "7555", cust);
		Policy p3 = new Policy("Bike", "Active", "6799", cust);

		Set<Policy> set = new HashSet();
		set.add(p1);
		set.add(p2);
		set.add(p3);

		cust.setCustomer_name("Shreyas");
		cust.setCustomer_city("Pune");
		cust.setCustomer_number("456789");
		cust.setPolicy(set);

		session.save(cust);
		session.save(p1);
		session.save(p2);
		session.save(p3);
		ts.commit();
		session.close();
		System.out.println("inserted");
	}

}
