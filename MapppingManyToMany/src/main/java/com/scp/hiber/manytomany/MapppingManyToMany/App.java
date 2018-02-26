package com.scp.hiber.manytomany.MapppingManyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        	Student student=new Student(1, "A");
        	Student student1=new Student(2, "B");
        	Student student2=new Student(3, "C");
        	
        	Course course=new Course(1, "cs");
        	Course course1=new Course(2, "cs1");
        	Course course2=new Course(3, "cs2");
        	Configuration configuration=new Configuration();
        	configuration.configure();
        	SessionFactory sessionFactory=configuration.buildSessionFactory();
        	Session session=sessionFactory.openSession();
        	Transaction transaction=session.beginTransaction();
        	session.save(student);
        	session.save(student1);
        	session.save(student2);
        	
        	session.save(course);
        	session.save(course1);
        	session.save(course2);
        	
        	session.getTransaction().commit();
        	
    }
}
