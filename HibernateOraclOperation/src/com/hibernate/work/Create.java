package com.hibernate.work;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.hibernate.work.dto.Employee;
import com.hibernate.work.utility.HibernateUtil;

public class Create {
	public static void main(String[] args) {
		Employee e = new Employee();
        e.setEmpname("Lilly");
        e.setAge(18);
        e.setEmail("@lily223"); 	 	
        e.setMobile(87578);
        e.setSalary(45000);
        e.setState("Karnataka");
        SessionFactory sf = HibernateUtil.Connection();
        Session ses = sf.openSession();
        ses.beginTransaction();
        ses.save(e);
        ses.getTransaction().commit();
        System.out.println("Table insert success");
        ses.close();
        sf.close(); 
	}
}
