package com.ustglobal.jpawithhibernateapp.jpql;

import java.util.List;
import java.util.ListIterator;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class ReadDemo {
	public static void main(String[] args) {


		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("TestPersistence");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    String jpql = " select pname from Product";
	    Query query = entityManager.createQuery(jpql);
	  List<String> p = query.getResultList();
	  for (String product : p) {
		 // System.out.println(product.getPid());
		  System.out.println(product);
		//  System.out.println(product.getQuantity());
	  }
	    
		

	}

}
