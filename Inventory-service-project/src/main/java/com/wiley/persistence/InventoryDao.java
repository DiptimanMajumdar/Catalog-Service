package com.wiley.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wiley.bean.InventoryItem;

@Repository
public interface InventoryDao extends JpaRepository<InventoryItem, Integer>{

	public InventoryItem findByProductCode(String code);
}
