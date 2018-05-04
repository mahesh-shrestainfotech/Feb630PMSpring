package com.mtc.app.repository;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mtc.app.db.ProductDBStore;
import com.mtc.app.vo.Product;

@Repository
public class ProductRepository implements IProductRepository{
	
	@Autowired
	private ProductDBStore productDBStore;
	
	public Product findById(int id) {
		
		Product product = get(id);
		
		return product;
	}
	
	@Override
	public void updateQuantity(int id,int quantity) {
		
		Product product = get(id);
		
		product.setQuantity(quantity);
		
	}

	private Product get(int id) {
		Product product = productDBStore.getProductsList().stream().filter(p -> p.getId() == id).collect(Collectors.toList()).get(0);
		return product;
	}
	
}
