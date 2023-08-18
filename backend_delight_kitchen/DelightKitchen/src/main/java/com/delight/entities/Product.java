package com.delight.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	private String productName;
	private float productPrice;
	

	@ManyToOne
	@JoinColumn(name = "productcategoryId")
	private Category category;
	private String productStatus="Enabled";
	@OneToMany(mappedBy = "orderItemProduct",cascade = CascadeType.REMOVE)
	List<OrderItem> ordersItemList;

	
}
