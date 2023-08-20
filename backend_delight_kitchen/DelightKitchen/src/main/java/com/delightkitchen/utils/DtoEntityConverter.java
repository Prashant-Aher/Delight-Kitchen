package com.delightkitchen.utils;

import org.springframework.stereotype.Component;

import com.delightkitchen.dtos.OrderItemDTO;
import com.delightkitchen.dtos.OrdersDTO;
import com.delightkitchen.dtos.ProductDTO;
import com.delightkitchen.dtos.ProductDTOSend;
import com.delightkitchen.dtos.TablesDTO;
import com.delightkitchen.dtos.UserDTO;
import com.delightkitchen.dtos.UserDTOSend;
import com.delightkitchen.entities.OrderItem;
import com.delightkitchen.entities.Orders;
import com.delightkitchen.entities.Product;
import com.delightkitchen.entities.Tables;
import com.delightkitchen.entities.Users;

@Component
public class DtoEntityConverter {

	public Users toUserEntity(UserDTO userDTO) {
		if (userDTO == null)
			return null;
		Users users = new Users();
		users.setUserId(userDTO.getUserId());
		users.setName(userDTO.getName());
		users.setEmail(userDTO.getEmail());
		users.setPhone(userDTO.getPhone());
		users.setPassword(userDTO.getPassword());
		users.setRole(userDTO.getRole());
		users.setCurrentStatus(userDTO.getCurrentStatus());

		return users;

	}

	public UserDTOSend toUserDTO(Users user) {
		if (user == null)
			return null;
		UserDTOSend userDTO = new UserDTOSend();
		userDTO.setUserId(user.getUserId());
		userDTO.setName(user.getName());
		userDTO.setEmail(user.getEmail());
		userDTO.setPhone(user.getPhone());
		userDTO.setRole(user.getRole());
		userDTO.setCurrentStatus(user.getCurrentStatus());
		userDTO.setCreatedDate(user.getDate());

		return userDTO;

	}

	public Product toProductEntity(ProductDTO productDTO) {
		if (productDTO == null)
			return null;
		Product product = new Product();
		product.setProductId(productDTO.getProductId());
		product.setProductName(productDTO.getProductName());
		product.setProductPrice(productDTO.getProductPrice());
		product.setProductStatus(productDTO.getProductStatus());

		return product;
	}

	public ProductDTOSend toProductDTO(Product product) {
		if (product == null)
			return null;
		ProductDTOSend productDTOSend = new ProductDTOSend();
		productDTOSend.setProductId(product.getProductId());
		productDTOSend.setProductName(product.getProductName());
		productDTOSend.setProductPrice(product.getProductPrice());
		productDTOSend.setProductStatus(product.getProductStatus());
		productDTOSend.setProductcategoryId(product.getCategory().getCategoryId());
		productDTOSend.setProductcategoryName(product.getCategory().getCategoryName());
		return productDTOSend;
	}

	public TablesDTO toTablesDTO(Tables tables) {
		if (tables == null)
			return null;
		TablesDTO tablesDTO = new TablesDTO();
		tablesDTO.setTableId(tables.getTableId());
		tablesDTO.setTableName(tables.getTableName());
		tablesDTO.setTableStatus(tables.getTableStatus());
		tablesDTO.setTableCapacity(tables.getTableCapacity());
		if (tables.getWaiter() != null)
			tablesDTO.setWaiterId(tables.getWaiter().getUserId());
		if (tables.getWaiter() != null)
			tablesDTO.setWaiterName(tables.getWaiter().getName());

		return tablesDTO;

	}

	public Tables toTablesEntity(TablesDTO tablesDTO) {
		if (tablesDTO == null)
			return null;
		Tables tables = new Tables();
		tables.setTableId(tablesDTO.getTableId());
		tables.setTableName(tablesDTO.getTableName());
		tables.setTableStatus(tablesDTO.getTableStatus());
		tables.setTableCapacity(tablesDTO.getTableCapacity());
		if (tablesDTO.getWaiterId() != 0)
			tables.setWaiter(new Users(tablesDTO.getWaiterId()));

		return tables;

	}

	public OrdersDTO toOrderDTO(Orders orders) {
		if (orders == null)
			return new OrdersDTO(0);

		OrdersDTO ordersDTO = new OrdersDTO();

		ordersDTO.setOrderId(orders.getOrderId());
		ordersDTO.setOrderStatus(orders.getOrderStatus());
		ordersDTO.setOrderServicePersonId(orders.getOrderServicePerson().getUserId());
		ordersDTO.setOrderTableId(orders.getOrderTable().getTableId());
		ordersDTO.setOrderTableName(orders.getOrderTable().getTableName());
		return ordersDTO;

	}

	public Orders toOrderEntity(OrdersDTO ordersDTO) {
		if (ordersDTO == null)
			return null;

		Orders orders = new Orders();

		orders.setOrderId(ordersDTO.getOrderId());
		orders.setOrderStatus(ordersDTO.getOrderStatus());
		orders.setOrderServicePerson(new Users(ordersDTO.getOrderServicePersonId()));
		orders.setOrderTable(new Tables(ordersDTO.getOrderTableId()));

		return orders;

	}

	public OrderItem toOrderItemEntity(OrderItemDTO orderItemDTO) {
		if (orderItemDTO == null)
			return null;

		OrderItem orderItem = new OrderItem();

		orderItem.setOrderItemQuantity(orderItemDTO.getOrderItemQuantity());
		orderItem.setOrderItemOrder(new Orders(orderItemDTO.getOrderItemOrderId()));
		orderItem.setOrderItemProduct(new Product(orderItemDTO.getOrderItemProductId()));

		return orderItem;

	}

	public OrderItemDTO toOrderItemDTO(OrderItem orderItem) {
		if (orderItem == null)
			return null;

		OrderItemDTO orderItemDTO = new OrderItemDTO();

		orderItemDTO.setOrderItemQuantity(orderItem.getOrderItemQuantity());
		orderItemDTO.setOrderItemId(orderItem.getOrderItemId());
		orderItemDTO.setOrderItemAmount(orderItem.getOrderItemAmount());
		orderItemDTO.setOrderItemOrderId(orderItem.getOrderItemOrder().getOrderId());
		orderItemDTO.setOrderItemProductId(orderItem.getOrderItemProduct().getProductId());
		orderItemDTO.setOrderItemRate(orderItem.getOrderItemProduct().getProductPrice());
		orderItemDTO.setOrderItemName(orderItem.getOrderItemProduct().getProductName());
		return orderItemDTO;

	}

}
