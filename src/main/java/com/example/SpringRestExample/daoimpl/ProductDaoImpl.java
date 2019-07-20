package com.example.SpringRestExample.daoimpl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.SpringRestExample.dao.ProductDao;
import com.example.SpringRestExample.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

//	@Autowired
//	private JdbcTemplate jdbcTemplate;
//
//	@Override
//	public int addProduct(Product product) {
//		int result = jdbcTemplate.update(" INSERT INTO PRODUCTS VALUES(?,?,?)",
//				new Object[] { product.getProductId(), product.getProductName(), product.getProductCategory() });
//
//		return result;
//	}
//
//	@Override
//	public List<Product> getProducts(String productName) {
//		
//		String query = "SELECT  * FROM PRODUCTS ";
//		
//		if(productName !=null){
//			query += " where NAME LIKE '%"+productName+"%'";
//		}
//
//		List<Map<String, Object>> produtsData = jdbcTemplate.queryForList(query);
//
//		List<Product> productsList = new ArrayList<Product>();
//		for (Map<String, Object> data : produtsData) {
//			Product prod = new Product(((BigDecimal) data.get("ID")).intValue(), data.get("NAME").toString(),
//					data.get("CATEGORY").toString());
//			productsList.add(prod);
//		}
//		return productsList;
//	}
//
//	@Override
//	public void updateProduct(Product product, int id) {
//
//		jdbcTemplate.execute(" UPDATE PRODUCTS SET NAME='" + product.getProductName() + "' , CATEGORY='"
//				+ product.getProductCategory() + "' where ID=" + id + "");
//
//	}
//
//	@Override
//	public void deleteProduct(int id) {
//		jdbcTemplate.execute("DELETE FROM PRODUCTS WHERE ID=" + id + "");
//	}

}
