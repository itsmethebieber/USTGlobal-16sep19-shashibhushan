package com.ustglobal.finalproject.dao;

import java.util.List;

import com.ustglobal.finalproject.dto.Product;

public interface ProductDAO {
	public List<Product> getProductByName(String name);

	public List<Product> getProductByCompany(String company);

	public boolean addProduct(Product product);

	public boolean updateProduct(Product product);

	public List<Product> getProductByCategory(String category);

}
