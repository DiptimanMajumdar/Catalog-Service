package com.wiley.persistence;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wiley.bean.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer>{

	public Optional<Product> findByCode(String code);
}
