package com.sira.app.productrating.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sira.app.productrating.domain.ProductRatings;
import com.sira.app.productrating.service.ProductRatingsService;

@RestController
@RequestMapping("/api")
public class ProductRatingController {

	@Autowired
	private ProductRatingsService productRatingsService;

	@GetMapping(path = "/product-ratings", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ProductRatings> getProductRatings() {
		return productRatingsService.getProductRatings();
	}
}
