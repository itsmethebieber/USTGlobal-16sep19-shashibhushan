package com.ust.hwithjpa.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestManyToOne {
	public static void main(String[] args) {
		PencilBox pb = new PencilBox();
		pb.setBid(1);
		pb.setBname("Apsara");
		Pencil p = new Pencil();
		p.setId(10);
		p.setColor("black");
		p.setPencilbox(pb);
		
		Pencil p1 = new Pencil();
		p1.setId(20);
		p1.setColor("red");
		p1.setPencilbox(pb);
		
		
		EntityManager  entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("TestPersistence");
			 entityManager = entityManagerFactory.createEntityManager();
			 entityTransaction = entityManager.getTransaction();
			 entityTransaction.begin();
			
			 entityManager.persist(p);
			 entityManager.persist(p1);
			 System.out.println("saved");
				entityTransaction.commit();
				
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}

}
