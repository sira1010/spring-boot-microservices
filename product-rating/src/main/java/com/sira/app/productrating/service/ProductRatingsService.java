package com.sira.app.productrating.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sira.app.productrating.client.ProductCatalogInfoClient;
import com.sira.app.productrating.domain.ProductRating;
import com.sira.app.productrating.domain.ProductRatings;
import com.sira.app.productrating.domain.Products;

@Service
public class ProductRatingsService {

	@Autowired
	private ProductCatalogInfoClient productCatalogInfoClient;

	public ResponseEntity<ProductRatings> getProductRatings() {
		ProductRatings productRatings = new ProductRatings();
		List<ProductRating> productRatingsList = new ArrayList<>();
		ResponseEntity<Products> products = productCatalogInfoClient.getProducts();
		if (products != null && products.getStatusCodeValue() == 200) {
			Products productsResponse = products.getBody();
			productsResponse.getProductList().forEach(product -> {
				ProductRating productRating = new ProductRating();
				productRating.setRating(getRating(product.getPrice()));
				productRating.setId(product.getId());
				productRating.setName(product.getName());
				productRatingsList.add(productRating);
			});
			productRatings.setProductRatingList(productRatingsList);
		}
		return new ResponseEntity<>(productRatings, HttpStatus.OK);
	}

	private String getRating(String price) {
		switch (price) {
		case "100":
			return "A";
		case "200":
			return "B";
		case "300":
			return "C";
		case "400":
			return "D";
		case "500":
			return "E";
		case "600":
			return "F";
		default:
			break;
		}
		return price;
	}
}
