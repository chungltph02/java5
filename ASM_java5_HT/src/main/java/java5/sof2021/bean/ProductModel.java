package java5.sof2021.bean;

import java.util.Date;

import java5.sof2021.entities.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductModel {
	private String name;
	private String image;
	private double price;
	 private Date create_date;
	 private int available;
	 private Category category;

}
