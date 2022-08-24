package java5.sof2021.bean;

public class login {
	private String email;
	private String password;
	
	public login() {
		super();
	}
public login(String email,String password) {
	this.email=email;
	this.password=password;
}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
