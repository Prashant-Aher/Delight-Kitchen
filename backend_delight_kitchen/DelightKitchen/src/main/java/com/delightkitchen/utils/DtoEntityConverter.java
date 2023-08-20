package com.delightkitchen.utils;

import org.springframework.stereotype.Component;

import com.delightkitchen.dtos.ProductDTO;
import com.delightkitchen.dtos.ProductDTOSend;
import com.delightkitchen.dtos.UserDTO;
import com.delightkitchen.dtos.UserDTOSend;
import com.delightkitchen.entities.Category;
import com.delightkitchen.entities.Product;
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

//		if(userDTO.getProfileImage()!=null)
//		{
//			
//			users.setProfileImage(userDTO.getProfileImage().getOriginalFilename());
//		
//		}

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
//		userDTO.setProfileImage(user.getProfileImage());
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
		product.setCategory(new Category(productDTO.getProductcategoryId()));

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

}
