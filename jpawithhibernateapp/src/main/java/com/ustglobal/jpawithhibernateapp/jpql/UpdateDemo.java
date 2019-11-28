package com.ustglobal.jpawithhibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateDemo {
	public static void main(String[] args) {

		EntityTransaction transaction = null;
		EntityManager entityManager  = null;
		try {
			EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("TestPersistence");
			 entityManager = entityManagerFactory.createEntityManager();
			 transaction = entityManager.getTransaction();
			
			transaction.begin();
			String jpql = "update Product set pname = 'barryallen' where pid  = 101";
			Query query = entityManager.createQuery(jpql);
			int count = query.executeUpdate();
			System.out.println(count);
			transaction.commit();
		
		}catch(Exception e){
			e.printStackTrace();
			transaction.rollback();
		}

		entityManager.close();
		}
		
	

	}


