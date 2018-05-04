package com.mtc.app.repository;

import com.mtc.app.vo.Product;

public interface IProductRepository {
	
	Product findById(int id);
	void updateQuantity(int id,int quantity);

}
