package java5.sof2021.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



import lombok.Data;



@Data
@Entity
@Table(name = "orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id; 
	
	@ManyToOne @JoinColumn(name = "user_id",referencedColumnName = "id")
	private Account  account;
	
	@Column(name = "create_date")
	@Temporal(TemporalType.DATE)
	 Date create_date=new Date();
	
	@Column(name = "address")
	private String address;
	
//	@OneToMany(mappedBy = "order")
//	private List<Order_details> Order_details;

	

}
