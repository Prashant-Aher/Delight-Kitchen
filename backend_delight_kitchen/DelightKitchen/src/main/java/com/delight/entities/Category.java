package com.delight.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
<<<<<<< HEAD
@Table(name = "category")
=======
@Table(name="category")
>>>>>>> 3893c23 (All entities Added)
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD
	private int categoryId;
	private String categoryName;
	private String categoryStatus = "Enabled";
	@OneToMany(mappedBy = "category", cascade = CascadeType.REMOVE)
	private List<Product> productList;

}
=======
	private int  categoryId;
	private String  categoryName;
	private String  categoryStatus="Enabled";
	@OneToMany(mappedBy = "category",cascade = CascadeType.REMOVE)
	private List<Product> productList;
	


	}




	
	
	
	

>>>>>>> 3893c23 (All entities Added)
