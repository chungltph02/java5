package java5.sof2021.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountModel {
	private String username;
	private String password;
	private String fullname;
	private String email;
	private String photo;
	private int admin;
}
