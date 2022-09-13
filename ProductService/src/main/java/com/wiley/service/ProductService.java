package com.wiley.service;

import java.util.List;
import java.util.Optional;

import com.wiley.bean.Product;

public interface ProductService {

	List<Product> getAllProducts();

	Optional<Product> getProdByCode(String code);

}
