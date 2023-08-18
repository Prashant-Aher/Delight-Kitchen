package com.delight.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "orderitem")
public class OrderItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderItemId;
	private int orderItemQuantity;
	private float orderItemAmount;
	@ManyToOne
	@JoinColumn(name = "orderItemOrderId")
	private Orders orderItemOrder;
	@ManyToOne
	@JoinColumn(name = "orderItemProductId")
	private Product orderItemProduct;
	
	
	
	
}
