package com.ustglobal.finalproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.finalproject.dao.ProductDAO;
import com.ustglobal.finalproject.dto.Product;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDAO dao;

	@Override
	public boolean addProduct(Product product) {

		return dao.addProduct(product);
	}

	@Override
	public boolean updateProduct(Product product) {

		return dao.updateProduct(product);
	}

	@Override
	public List<Product> getProductByName(String name) {
		// TODO Auto-generated method stub
		return dao.getProductByName(name);
	}

	@Override
	public List<Product> getProductByCompany(String company) {
		// TODO Auto-generated method stub
		return dao.getProductByCompany(company);
	}

	@Override
	public List<Product> getProductByCategory(String category) {
		// TODO Auto-generated method stub
		return dao.getProductByCategory(category);
	}

}
