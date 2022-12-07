package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestMain {
public static void main(String[] args) {
	

	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg2.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session session =sf.openSession();
	Transaction ts=session.beginTransaction();
	         
	
	BikeOne bike=new BikeOne();
	bike.setCompany("Honda");
	
	bike.setPrice(56789);
	
	
	StudentOne student =new StudentOne();                                                                
	student.setName("Shreyas");
	student.setEmail("shreyasdhumal4545@gmail.com");
	student.setBike(bike);
	
	session.save(student);
	session.save(bike);
	               
	ts.commit();
	session.close();
	System.out.println("inserted");
	}
	
}
