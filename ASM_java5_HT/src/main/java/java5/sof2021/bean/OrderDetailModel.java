package java5.sof2021.bean;

import java5.sof2021.entities.Order;
import java5.sof2021.entities.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailModel {
	private Order order;
	private Product product;
	private double price;
	private Integer quantity;
}
