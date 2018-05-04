package com.mtc.app.vo;

public class Order {
	
	private int orderId;
	private int productId;
	private int orderedQuantity;
	private String comments;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(int orderId, int productId, int orderedQuantity, String comments) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.orderedQuantity = orderedQuantity;
		this.comments = comments;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getOrderedQuantity() {
		return orderedQuantity;
	}

	public void setOrderedQuantity(int orderedQuantity) {
		this.orderedQuantity = orderedQuantity;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	
	

}
