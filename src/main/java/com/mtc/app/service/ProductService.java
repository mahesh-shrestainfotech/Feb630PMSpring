package com.mtc.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtc.app.repository.IProductRepository;
import com.mtc.app.vo.Order;
import com.mtc.app.vo.Product;

@Service
public class ProductService implements IProductService{
	
	@Autowired
	private IProductRepository productRespository;
	
	@Override
	public boolean processOrder(Order order) {
		
		Product product = productRespository.findById(order.getProductId());
		
		if(order.getOrderedQuantity() <= product.getQuantity()) {
			
			int quantity = product.getQuantity()-order.getOrderedQuantity();
			
			productRespository.updateQuantity(product.getId(),quantity);
			
			return true;
		}
		
		return false;
	}

}
