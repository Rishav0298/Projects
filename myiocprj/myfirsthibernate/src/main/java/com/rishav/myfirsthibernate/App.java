package com.rishav.myfirsthibernate;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		System.out.println("Hello everyone!");
		
				
		Configuration con = new Configuration()
				.configure().addAnnotatedClass(Employee.class)
				.addAnnotatedClass(Laptop.class)
				.addAnnotatedClass(Skill.class);
		
		
		ServiceRegistry reg = new ServiceRegistryBuilder()
							.applySettings(con.getProperties())
							.buildServiceRegistry();
		
		
		SessionFactory sf = con.buildSessionFactory(reg);
		
		Session session = sf.openSession();
				
        session.beginTransaction();
        
        
//        Query q = session.createQuery("from Employee");   
//        
//        List<Employee> employees  = (List<Employee>) q.list();
//        
//        for(Employee e : employees) {
//        	System.out.println(e);
//        }
        Query q = session.createQuery("select id, ename, deptt from Employee where id = 101");   
        
        Object[] employee_obj =  (Object[]) q.uniqueResult();
        
        for(Object o : employee_obj)
        	System.out.println(o);
        	
        System.out.println("Alternatively :  ");
        System.out.println(employee_obj[0] + " " +employee_obj[1] + " " +employee_obj[2]);

    		
		
	    session.getTransaction().commit();
	
	      
	    session.close();
	    
	}

}

