package com.ustglobal.jpawithhibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DymanicDelete {
	public static void main(String[] args) {

		EntityTransaction transaction = null;
		EntityManager entityManager  = null;
		try {
			EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("TestPersistence");
			 entityManager = entityManagerFactory.createEntityManager();
			 transaction = entityManager.getTransaction();
			
			transaction.begin();
			String jpql = "delete from Product where pid =: id ";
			Query query = entityManager.createQuery(jpql);
			query.setParameter("id", 101);
	
			int result = query.executeUpdate();
			System.out.println(result);
			transaction.commit();
		
		}catch(Exception e){
			e.printStackTrace();
			transaction.rollback();
		}

		entityManager.close();
		}


}
