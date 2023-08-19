package com.delight.entities;

<<<<<<< HEAD
=======


>>>>>>> 3893c23 (All entities Added)
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String name;
	private String email;
	private String phone;
	private String password;
<<<<<<< HEAD
	// private String profileImage;
	private String role;
	private Date createdDate;
	private String currentStatus;
	@OneToMany(mappedBy = "waiter", cascade = CascadeType.REMOVE)
	private List<Tables> tableList;
	@OneToMany(mappedBy = "orderServicePerson", cascade = CascadeType.REMOVE)
	private List<Orders> ordersList;
	@OneToMany(mappedBy = "billCashier", cascade = CascadeType.REMOVE)
	private List<Bill> BillList;

	public Users() {
		// TODO Auto-generated constructor stub
	}

	public Users(int userId) {
		super();
		this.userId = userId;
	}

	public Users(int userId, String name, String email, String phone, String password, String role, Date date,
			String currentStatus, List<Tables> tableList) {
=======
	//private String profileImage;
	private String role;
	private Date createdDate;
	private String currentStatus;
	@OneToMany(mappedBy = "waiter",cascade = CascadeType.REMOVE)
	private List<Tables> tableList;
	@OneToMany(mappedBy = "orderServicePerson",cascade = CascadeType.REMOVE)
	private List<Orders> ordersList;
	@OneToMany(mappedBy = "billCashier",cascade = CascadeType.REMOVE)
	private List<Bill> BillList;
	public Users() {
		// TODO Auto-generated constructor stub
	}
	public Users(int userId)
	{
		super();
		this.userId = userId;	
	}

	public Users(int userId, String name, String email, String phone, String password, String role,
			Date date, String currentStatus, List<Tables> tableList) {
>>>>>>> 3893c23 (All entities Added)
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
<<<<<<< HEAD
		// this.profileImage = profileImage;
=======
	//	this.profileImage = profileImage;
>>>>>>> 3893c23 (All entities Added)
		this.role = role;
		this.createdDate = date;
		this.currentStatus = currentStatus;
		this.tableList = tableList;
	}

<<<<<<< HEAD
	public Users(int userId, String name, String email, String phone, String password, String role, Date date,
			String currentStatus) {
=======

	public Users(int userId, String name, String email, String phone, String password,  String role,
			Date date, String currentStatus) {
>>>>>>> 3893c23 (All entities Added)
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
<<<<<<< HEAD
		// this.profileImage = profileImage;
=======
		//this.profileImage = profileImage;
>>>>>>> 3893c23 (All entities Added)
		this.role = role;
		this.createdDate = date;
		this.currentStatus = currentStatus;
	}

<<<<<<< HEAD
=======

>>>>>>> 3893c23 (All entities Added)
	public int getUserId() {
		return userId;
	}

<<<<<<< HEAD
=======

>>>>>>> 3893c23 (All entities Added)
	public void setUserId(int userId) {
		this.userId = userId;
	}

<<<<<<< HEAD
=======

>>>>>>> 3893c23 (All entities Added)
	public String getName() {
		return name;
	}

<<<<<<< HEAD
=======

>>>>>>> 3893c23 (All entities Added)
	public void setName(String name) {
		this.name = name;
	}

<<<<<<< HEAD
=======

>>>>>>> 3893c23 (All entities Added)
	public String getEmail() {
		return email;
	}

<<<<<<< HEAD
=======

>>>>>>> 3893c23 (All entities Added)
	public void setEmail(String email) {
		this.email = email;
	}

<<<<<<< HEAD
=======

>>>>>>> 3893c23 (All entities Added)
	public String getPhone() {
		return phone;
	}

<<<<<<< HEAD
=======

>>>>>>> 3893c23 (All entities Added)
	public void setPhone(String phone) {
		this.phone = phone;
	}

<<<<<<< HEAD
=======

>>>>>>> 3893c23 (All entities Added)
	public String getPassword() {
		return password;
	}

<<<<<<< HEAD
=======

>>>>>>> 3893c23 (All entities Added)
	public void setPassword(String password) {
		this.password = password;
	}

<<<<<<< HEAD
=======

>>>>>>> 3893c23 (All entities Added)
//	public String getProfileImage() {
//		return profileImage;
//	}
//
//
//	public void setProfileImage(String profileImage) {
//		this.profileImage = profileImage;
//	}

<<<<<<< HEAD
=======

>>>>>>> 3893c23 (All entities Added)
	public String getRole() {
		return role;
	}

<<<<<<< HEAD
=======

>>>>>>> 3893c23 (All entities Added)
	public void setRole(String role) {
		this.role = role;
	}

<<<<<<< HEAD
=======

>>>>>>> 3893c23 (All entities Added)
	public Date getDate() {
		return createdDate;
	}

<<<<<<< HEAD
=======

>>>>>>> 3893c23 (All entities Added)
	public void setDate(Date date) {
		this.createdDate = date;
	}

<<<<<<< HEAD
=======

>>>>>>> 3893c23 (All entities Added)
	public String getCurrentStatus() {
		return currentStatus;
	}

<<<<<<< HEAD
=======

>>>>>>> 3893c23 (All entities Added)
	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}

<<<<<<< HEAD
=======

>>>>>>> 3893c23 (All entities Added)
	public List<Tables> getTableList() {
		return tableList;
	}

<<<<<<< HEAD
=======

>>>>>>> 3893c23 (All entities Added)
	public void setTableList(List<Tables> tableList) {
		this.tableList = tableList;
	}

<<<<<<< HEAD
=======

>>>>>>> 3893c23 (All entities Added)
	@Override
	public String toString() {
		return String.format(
				"Users [userId=%s, name=%s, email=%s, phone=%s, password=%s, role=%s, date=%s, currentStatus=%s]",
				userId, name, email, phone, password, role, createdDate, currentStatus);
	}
<<<<<<< HEAD

=======
	
	
	
>>>>>>> 3893c23 (All entities Added)
}
