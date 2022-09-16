package com.wiley.service;

import java.util.Optional;

import com.wiley.bean.InventoryItem;

public interface InventoryService {

	InventoryItem getItemByProdCode(String code);

	Optional<InventoryItem> updateQuantityByCode(String code, int qty);

}
