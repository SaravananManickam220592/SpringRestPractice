package com.example.SpringRestExample.dao;

import java.util.List;

import com.example.SpringRestExample.model.Product;

public interface ProductDao {
	
	public void addProduct(Product product);

	public List<Product> getProducts();
	
	public void updateProduct(Product product,int id);
	
	public void deleteProduct(int id);
	
}
