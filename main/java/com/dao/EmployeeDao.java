package com.dao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.Entity.Employeed3;

public class EmployeeDao {
	public void  insert() {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employeed3.class);
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		Employeed3 e=new Employeed3();
		e.setName("Sahil");
		e.setCity("Pune");
		e.setSalary(96000);
		
		ss.persist(e);
		tr.commit();
		ss.close();
	}
	
	public void fetch() {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employeed3.class);
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		String hqlQuery="from Employeed3";
		Query<Employeed3> query=ss.createQuery(hqlQuery,Employeed3.class);
		List<Employeed3> List=query.getResultList();
		for(Employeed3 e : List) {
			System.out.println(e);
		}
		
		tr.commit();
		ss.close();
	}
	
	public void updaterecord() {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employeed3.class);
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		String hql = "update Employeed3 set city = :city where empId = :id";

		MutationQuery q = ss.createMutationQuery(hql);

		q.setParameter("city", "Delhi");
		q.setParameter("id", 1);

		int rows = q.executeUpdate();
		if(rows > 0) {
		    System.out.println("Record Updated Successfully");
		}
		else {
		    System.out.println("Record Not Found");
		}

		tr.commit();
		ss.close();
	}
	
	public void deletedao() {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employeed3.class);
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		String hqlQuery="delete from Employeed3 where id=: id";
		MutationQuery query = ss.createMutationQuery(hqlQuery);
		query.setParameter("id", 3);
		query.executeUpdate();

		System.out.println("Data is deleted...!");

		tr.commit();
		ss.close();
	}
	
}
