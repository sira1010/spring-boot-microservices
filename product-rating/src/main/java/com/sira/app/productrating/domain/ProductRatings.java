package com.sira.app.productrating.domain;

import java.util.List;

public class ProductRatings {

	private List<ProductRating> productRatingList;

	public List<ProductRating> getProductRatingList() {
		return productRatingList;
	}

	public void setProductRatingList(List<ProductRating> productRatingList) {
		this.productRatingList = productRatingList;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}
