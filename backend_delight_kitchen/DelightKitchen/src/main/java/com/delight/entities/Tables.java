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
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tables")
public class Tables {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tableId;
	private String tableName;
	private int tableCapacity;
	@ManyToOne
	@JoinColumn(name = "waiterId")
	private Users waiter;
	@OneToMany(mappedBy = "orderTable",cascade = CascadeType.REMOVE)
	List<Orders> ordersList;
	private String tableStatus;
	
	
}
