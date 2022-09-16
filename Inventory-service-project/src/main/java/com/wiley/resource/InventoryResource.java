package com.wiley.resource;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wiley.bean.InventoryItem;
import com.wiley.service.InventoryService;

@RestController
public class InventoryResource {

	@Autowired
	InventoryService inventoryService;
	
	@GetMapping(path = "/code/{productCode}" )
	public InventoryItem getInventoryItemByProductCode (@PathVariable("productCode") String productCode) {
		return inventoryService.getItemByProdCode(productCode);
	}
	
	@PutMapping(path = "/code/{productCode}/{availableQuantity}")
	public Optional<InventoryItem> updateInventoryItemQuantityByProductCode(@PathVariable("productCode") String productCode,
			@PathVariable("availableQuantity") int availableQuantity) {
		return inventoryService.updateQuantityByCode(productCode, availableQuantity);
	}


}
