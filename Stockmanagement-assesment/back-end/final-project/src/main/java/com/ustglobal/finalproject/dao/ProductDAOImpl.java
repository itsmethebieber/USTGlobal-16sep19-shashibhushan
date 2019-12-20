package com.ustglobal.finalproject.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.finalproject.dto.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean addProduct(Product product) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(product);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean updateProduct(Product product) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Product p = manager.find(Product.class, product.getId());
			p.setCategory(product.getCategory());
			p.setName(product.getName());
			p.setQuantity(product.getQuantity());
			p.setPrice(product.getPrice());
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public List<Product> getProductByName(String name) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Product where name=:name";
		TypedQuery<Product> typedQuery = manager.createQuery(jpql, Product.class);
		typedQuery.setParameter("name", name);
		return typedQuery.getResultList();
	}

	@Override
	public List<Product> getProductByCompany(String company) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Product where company=:company";
		TypedQuery<Product> typedQuery = manager.createQuery(jpql, Product.class);
		typedQuery.setParameter("company", company);
		return typedQuery.getResultList();
	}

	@Override
	public List<Product> getProductByCategory(String category) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Product where catogory=:catogory";
		TypedQuery<Product> typedQuery = manager.createQuery(jpql, Product.class);
		typedQuery.setParameter("category", category);
		return typedQuery.getResultList();
	}
}
