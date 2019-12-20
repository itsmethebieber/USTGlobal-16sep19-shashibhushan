package com.ustglobal.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.finalproject.dto.Product;
import com.ustglobal.finalproject.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;

	@PostMapping(path = "/addproduct", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean addProduct(@RequestBody Product product) {

		if (service.addProduct(product)) {
			return true;
		} else {
			return false;
		}
	}// end of addProduct

	@GetMapping(path = "/getcategory", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getProductByCategory(@RequestParam("category") String category) {
		return service.getProductByCategory(category);

	}// end of getProduct by category

	@GetMapping(path = "/getname", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getProductByName(@RequestParam("name") String name) {
		return service.getProductByName(name);

	}// end of getProduct by name

	@GetMapping(path = "/getcompany", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getProductByCompany(@RequestParam("company") String company) {
		return service.getProductByCompany(company);

	}

}
