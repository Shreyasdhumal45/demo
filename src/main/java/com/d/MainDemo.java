package com.d;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainDemo {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg5.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		
		User us1=new User();
		us1.setName("Sai");                        
		us1.setCity("pune");
		
        User us2=new User();
		us2.setName("Shreyas");
		us2.setCity("pune");
		
		User us3=new User();        
		us3.setName("Gaurav");
		us3.setCity("Delhi");
		
		Policy pol1=new Policy();
		pol1.setPolicyName("Health");
		pol1.setPolicyStatus("Active");
		
		Policy pol2=new Policy();
		pol2.setPolicyName("Health");
		pol2.setPolicyStatus("Active");
		
		Policy pol3=new Policy();
		pol3.setPolicyName("Health");
		pol3.setPolicyStatus("Active");
		
		List<User> policylist=new ArrayList();
		policylist.add(us1);
		policylist.add(us2);
		policylist.add(us3);
		
		List<Policy>userlist=new ArrayList<Policy>();
		userlist.add(pol1);
		userlist.add(pol2);
		userlist.add(pol3);
		
		us1.setPolicylist(userlist);
		us2.setPolicylist(userlist);
		us3.setPolicylist(userlist);
		
		pol1.setUserlist(policylist);
		pol2.setUserlist(policylist);
		pol3.setUserlist(policylist);
		
		session.persist(us1);
        session.persist(us2);       
        session.persist(us3);
        
        tr.commit();
        session.close();
	}
}
