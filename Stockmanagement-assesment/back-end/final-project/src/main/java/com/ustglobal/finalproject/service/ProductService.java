package com.ustglobal.finalproject.service;

import java.util.List;

import com.ustglobal.finalproject.dto.Product;

public interface ProductService {
	public List<Product> getProductByName(String name);

	public List<Product> getProductByCompany(String company);

	public boolean addProduct(Product product);

	public boolean updateProduct(Product product);

	public List<Product> getProductByCategory(String category);

}
