package com.sira.app.productrating.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientProperties.FeignClientConfiguration;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.sira.app.productrating.domain.Products;

@FeignClient(name = "product-info-catalog", configuration = FeignClientConfiguration.class)
public interface ProductCatalogInfoClient {

	@GetMapping(value = "/api/products", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Products> getProducts();
}
