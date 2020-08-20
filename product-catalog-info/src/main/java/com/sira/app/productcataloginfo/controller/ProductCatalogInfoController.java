package com.sira.app.productcataloginfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sira.app.productcataloginfo.domain.Products;
import com.sira.app.productcataloginfo.service.ProductcataloginfoService;

@RestController
@RequestMapping("/api")
public class ProductCatalogInfoController {

	@Autowired
	private ProductcataloginfoService productcataloginfoService;

	@GetMapping(path = "/products",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Products> getProducts() {
		return productcataloginfoService.getProducts();
	}
}
