package com.cloudai.employeeinfo.repository;


import java.util.List;

import javax.sql.DataSource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cloudai.employeeinfo.model.Employee;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
	
  
	@Autowired
	 private   SessionFactory sessionFactory;
	
	@Override
	public void saveEmployeeInfo(Employee employee) {
		Session session=getSession();
	   session.save(employee);
		session.flush();
		
	}
	
	@Override
	public void updateEmployeeInfo(Employee employee) {
		Session session=getSession();
		   session.update(employee);
			session.flush();
	}
	@Override
	public void deleteEmployeeInfo(int id) {
		Employee employee=getEmployeeById(id);
		if(employee!=null) {
			Session session=getSession();
			   session.delete(employee);
				session.flush();
	  }
	}
	@Override
	public List<Employee> getAllEmployee() {
		Criteria criteria=getSession().createCriteria(Employee.class);
		return criteria.list();
	}
	
	@Override
	public Employee getEmployeeById(int id) {
		return (Employee) getSession().get(Employee.class, id);
	}
	
	public Session getSession() {
		Session session= sessionFactory.openSession();
		if(session==null) {
			session=sessionFactory.getCurrentSession();
		}
		
		return session;
	}
}
