package com.sira.app.productrating.domain;

import java.util.List;

public class Products {
	
	private List<Product> productList;

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}
