package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session session =sf.openSession();
	Transaction tr=session.beginTransaction();
	
	Info info=new Info();
	info.setEmail("abc45@gmail.com");
	info.setNumber("12345");
	
	session.save(info);
	
	
	
	
	
	
	tr.commit();
	session.close();
	
	
	
	
	
	
}
}
