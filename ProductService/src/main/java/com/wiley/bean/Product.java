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

@Entity(name="Products")
public class Product {

	@Id
    private Long id;
    private String code;
    private String name;
    private String description;
    private double price;
}
