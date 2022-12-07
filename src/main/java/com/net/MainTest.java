package com.net;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainTest {

	public  void demo(String name,String mail) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg4.xml");
	SessionFactory sf=	cfg.buildSessionFactory();
	Session session=sf.openSession();
	Transaction tr=session.beginTransaction();
	
	
	Employee emp=new Employee();
	emp.setEmpName(name);
	emp.setEmpmail(mail);
	
	/*Employee emp1=new Employee();
	emp1.setEmpName(name);
	emp1.setEmpmail(mail);*/
	
	Accounts acc=new Accounts("Saving","Active",emp);

	
	emp.setAc(acc);
	//emp1.setAc(acc);
	
	
	
	
	session.save(emp);
	//session.save(emp1);
	session.save(acc);
	
	tr.commit();
	session.close();
	
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		for(int i=1;i<=3;i++) {
		System.out.println("Enter the name");
		String name=scan.next();
		System.out.println("Enter mail");
		String mail=scan.next();
		
		MainTest mn=new MainTest();
		mn.demo(name, mail);
		
	}}
	
	
}
