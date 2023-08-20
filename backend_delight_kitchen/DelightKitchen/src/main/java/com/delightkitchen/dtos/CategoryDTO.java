package com.delightkitchen.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data // @NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString
public class CategoryDTO {
	private int categoryId;
	private String categoryName;
	private String categoryStatus = "Enabled";

}
