package com.example.SpringRestExample.daoimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.example.SpringRestExample.dao.ProductDao;
import com.example.SpringRestExample.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	private static Map<Integer, Product> productsRepo = new HashMap<Integer, Product>();

	@Override
	public void addProduct(Product product) {
		productsRepo.put(product.getProductId(), product);
	}
	
	@Override
	public List<Product> getProducts(){
		
		Set<Integer> keys= productsRepo.keySet();
		List<Product> productList= new ArrayList<Product>();
		for(Integer key:keys){
			productList.add(productsRepo.get(key));
		}
		
		return productList;
		
	}
	
	@Override
	public void updateProduct(Product product,int id) {
		productsRepo.put(id, product);
	}
	
	@Override
	public void deleteProduct(int id) {
		productsRepo.remove(id);
	}


}
