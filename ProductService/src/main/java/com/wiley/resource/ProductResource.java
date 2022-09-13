package com.wiley.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.wiley.bean.Product;
import com.wiley.service.ProductService;

@RestController
public class ProductResource {

	@Autowired
	ProductService productService;
	
	@GetMapping(path = "/products")
	public List<Product> listAllProducts(){
		return productService.getAllProducts();
	}
	
	@GetMapping(path = "/products/code/{productCode}")
	public Optional<Product> getProductByCode(@PathVariable("productCode") String productCode){
		return productService.getProdByCode(productCode);
	}


}
