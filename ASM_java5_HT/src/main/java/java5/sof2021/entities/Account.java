package java5.sof2021.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.Data;



@Data
@Entity
@Table(name="accounts")
@NamedQueries(@NamedQuery(name="Account.findByEmail",query = "SELECT acc FROM Account acc WHERE acc.email LIKE :email"))
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@Column(name="username")
	private String username;

	@Column(name="password")
	private String password;

	@Column(name="fullname")
	private String fullname;

	@Column(name="email")
	private String email;

	@Column(name="photo")
	private String photo;

	@Column(name="activated")
	private int activated;

	@Column(name="admin")
	private int admin;
	
	@OneToMany(mappedBy = "account")
	private List<Order>orders;

	

}
