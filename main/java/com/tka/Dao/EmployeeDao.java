package com.tka.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entities.Employee19;



@Repository
public class EmployeeDao {
	@Autowired
	SessionFactory factory;
	
	public String insertData(Employee19 e) {
		Session session = factory.openSession();
		Transaction tr=session.beginTransaction();
		session.persist(e);
		tr.commit();
		session.close();
		return "Data is inserted";
	}
	
	public String deleteData(int emp_Id) {
		
		Session session =factory.openSession();
		Transaction tr=session.beginTransaction();
		Employee19 e=session.get(Employee19.class, emp_Id);
		session.remove(e);
		tr.commit();
		session.close();
		return "Data is deleted.....";
	}
	
	public String updateData(Employee19 e, int emp_Id) {
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();

		Employee19 emp = session.get(Employee19.class, emp_Id);
		emp.setName(e.getName());
		emp.setCity(e.getCity());
		emp.setEmp_Id(e.getEmp_Id());
		emp.setSalary(e.getSalary());
		session.merge(emp);
		
		tr.commit();
		session.close();
		
		return "Data is Updated....";
	}
	
	public List<Employee19> getAllData(){
		Session session=factory.openSession();
		Transaction tr=session.beginTransaction();
		
		String hqlQuery="from Employee19";
		Query<Employee19> query=session.createQuery(hqlQuery);
		List<Employee19> list=query.getResultList();
		tr.commit();
		session.close();
		return list;
	}
}
