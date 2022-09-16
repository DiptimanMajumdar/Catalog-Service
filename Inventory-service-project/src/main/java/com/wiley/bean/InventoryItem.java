package com.wiley.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity(name="Inventory")
public class InventoryItem {

	@Id
    private Long id;
    private String productCode;
    private Integer availableQuantity ;

}
