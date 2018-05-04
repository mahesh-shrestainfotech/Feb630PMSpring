package com.mtc.app.db;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.mtc.app.vo.Product;

@Component("productDBStore")
public class ProductDBStore {
	
	private List<Product> productsList;
	
	public ProductDBStore() {
		productsList = new ArrayList<Product>();
		
		productsList.add(new Product(101,"iPhone",140,200));
		productsList.add(new Product(102,"BlackBerry",50,240));
		productsList.add(new Product(103,"Vivo",100,150));
		productsList.add(new Product(104,"Nokia",160,160));
		productsList.add(new Product(105,"Samsung",170,180));
	}
	
	public List<Product> getProductsList() {
		return productsList;
	}

}
