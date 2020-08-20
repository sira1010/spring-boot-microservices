package com.sira.app.productcataloginfo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sira.app.productcataloginfo.domain.Product;
import com.sira.app.productcataloginfo.domain.Products;

@Service
public class ProductcataloginfoService {

	public ResponseEntity<Products> getProducts() {
		Products products = new Products();
		List<Product> productList = new ArrayList<>();
		Product product1 = new Product();
		product1.setId("1");
		product1.setName("Phone");
		product1.setPrice("500");
		product1.setCountry("USA");
		Product product2 = new Product();
		product2.setId("2");
		product2.setName("Laptop");
		product2.setPrice("300");
		product2.setCountry("USA");
		productList.add(product1);
		productList.add(product2);
		products.setProductList(productList);
		return new ResponseEntity<>(products, HttpStatus.OK);
	}
}
