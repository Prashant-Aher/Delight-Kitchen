package com.delight.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

<<<<<<< HEAD
=======

>>>>>>> 3893c23 (All entities Added)
@Setter
@Getter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "orders")
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	private String orderStatus;
	@ManyToOne
	@JoinColumn(name = "orderServicePersonId")
	private Users orderServicePerson;
	@ManyToOne
	@JoinColumn(name = "orderTableId")
	private Tables orderTable;
<<<<<<< HEAD

	@OneToMany(mappedBy = "orderItemOrder", cascade = CascadeType.REMOVE)
	private List<OrderItem> ordersItemList;

	@OneToOne(mappedBy = "billOrder", cascade = CascadeType.REMOVE)
=======
	
	@OneToMany(mappedBy = "orderItemOrder",cascade = CascadeType.REMOVE)
	private List<OrderItem> ordersItemList;
	
	@OneToOne(mappedBy = "billOrder",cascade = CascadeType.REMOVE)
>>>>>>> 3893c23 (All entities Added)
	private Bill OrderBill;
}