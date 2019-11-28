package com.ustglobal.jpawithhibernateapp.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestOnetoone {
	public static void main(String[] args) {
		Voterid vc = new Voterid();
		vc.setVid(101);
		vc.setVname("leeeee");
		Person p = new Person();
		p.setId(11);
		p.setName("shashiii");
		p.setVoterid(vc);
		
		
		EntityManager  entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("TestPersistence");
			 entityManager = entityManagerFactory.createEntityManager();
			 entityTransaction = entityManager.getTransaction();
			 entityTransaction.begin();
			 Voterid vCard =entityManager.find(Voterid.class, 101);
			 System.out.println(vCard.getPerson().getId());
			 
			// entityManager.persist(p);
			 System.out.println("saved");
				entityTransaction.commit();
				
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}

}
