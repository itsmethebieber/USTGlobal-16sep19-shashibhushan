package com.ust.hwithjpa.manytoone;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestManys {
	public static void main(String[] args) {
		
		
		Course c = new Course();
		c.setId(100);
		c.setName("java");
		
		Course c1 = new Course();
		c1.setId(200);
		c1.setName("sql");
		
		ArrayList<Course> al = new ArrayList<Course>();
		al.add(c);
		al.add(c1);
		
		
		Student s = new Student();
		s.setSid(93);
		s.setSname("lee");
		s.setCourse(al);
		
		EntityManager  entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("TestPersistence");
			 entityManager = entityManagerFactory.createEntityManager();
			 entityTransaction = entityManager.getTransaction();
			 entityTransaction.begin();
			
			 entityManager.persist(s);
			 
			 System.out.println("saved");
				entityTransaction.commit();
				
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}

}
