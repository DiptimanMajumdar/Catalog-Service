package com.wiley.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiley.bean.InventoryItem;
import com.wiley.persistence.InventoryDao;

@Service
public class InventoryServiceImpl implements InventoryService{
	
	@Autowired
	InventoryDao inventoryDao;

	@Override
	public InventoryItem getItemByProdCode(String code) {
		return inventoryDao.findByProductCode(code); 
	}
	
	@Override
	public Optional<InventoryItem> updateQuantityByCode(String code, int qty) {
		InventoryItem item=inventoryDao.findByProductCode(code);
		item.setAvailableQuantity(item.getAvailableQuantity()+qty);
		InventoryItem item1=inventoryDao.save(item);
		if(item1!=null)
			return Optional.of(item1);
		else 
			return null;
	}
}
