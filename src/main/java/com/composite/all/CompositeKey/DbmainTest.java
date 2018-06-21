package com.composite.all.CompositeKey;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.composite.all.CompositeKeyBean.CustomerBean;

public class DbmainTest {

	public static Session s1;

	public static SessionFactory getsession() {

		Configuration con = new Configuration().configure();
		SessionFactory sf = con.buildSessionFactory();
		return sf;
	}

	public static void setcus() {
		s1 = getsession().openSession();

		CustomerBean cb = new CustomerBean();
		cb.setPid(1);
		cb.setPname("vinay");
		cb.setPrice(100);

		s1.save(cb);

		Transaction t = s1.beginTransaction();

		t.commit();

	}

	public static void main(String[] args) {

		setcus();
		System.out.println("Started");

	}

}
