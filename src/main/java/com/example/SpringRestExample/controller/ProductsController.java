package com.example.SpringRestExample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringRestExample.dao.ProductDao;
import com.example.SpringRestExample.model.Product;

@RestController
@RequestMapping("/products")
public class ProductsController {
	
	@Autowired
	private ProductDao productDao;
	
	
	@PostMapping
	public ResponseEntity<String> addProduct(@RequestBody Product product){
		productDao.addProduct(product);
		return new ResponseEntity<String>("Product Added successfully",HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Product>> getProducts(){
		List<Product> productList = productDao.getProducts();
		return new ResponseEntity<List<Product>>(productList,HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<String> updateProduct(@RequestBody Product product,@PathVariable("id") int id){
		productDao.updateProduct(product,id);
		return new ResponseEntity<String>("Product Updated successfully",HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<String> deleteProduct(@RequestParam("id") int id){
		productDao.deleteProduct(id);
		return new ResponseEntity<String>("Product Deleted successfully",HttpStatus.OK);
	}
	
	

}
