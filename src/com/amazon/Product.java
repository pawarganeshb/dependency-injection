package com.amazon;

import java.util.Map;
import java.util.Set;

public class Product {

	private int productId;
	String productName;
	double price;
	boolean isExpired;
	Set<String> products;
	Map<Integer, String> productPrices;

	public Product(int productId, String productName, double price, boolean isExpired, Set<String> products,
			Map<Integer, String> productPrices) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.isExpired = isExpired;
		this.products = products;
		this.productPrices = productPrices;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isExpired() {
		return isExpired;
	}

	public void setExpired(boolean isExpired) {
		this.isExpired = isExpired;
	}

	public Set<String> getProducts() {
		return products;
	}

	public void setProducts(Set<String> products) {
		this.products = products;
	}

	public Map<Integer, String> getProductPrices() {
		return productPrices;
	}

	public void setProductPrices(Map<Integer, String> productPrices) {
		this.productPrices = productPrices;
	}

}
