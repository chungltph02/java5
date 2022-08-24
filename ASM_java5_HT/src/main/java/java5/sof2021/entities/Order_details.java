package java5.sof2021.entities;

import javax.persistence.Column;
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
@Table(name="order_details")
public class Order_details {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@ManyToOne
	@JoinColumn(name="order_id" ,referencedColumnName = "id")
	private Order order;
	@ManyToOne
	@JoinColumn(name="product_id" ,referencedColumnName = "id")
	private Product product;
	@Column(name="price")
	private double price;
	@Column(name="quantity")
	private int quantity;
	

}
