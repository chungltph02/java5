package java5.sof2021.bean;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class user {
	@NotBlank(message="ko duoc de trong")
	private String hoTen;
	@NotBlank(message="ko duoc de trong")
	private String diaChi;
	@NotNull//gioi tinh chi duoc 2 gia tri la  1 va 0
	private int gioiTinh;
	@NotBlank(message="ko duoc de trong")
	@Email(message="nhập đúng định dạng email")//email dungs dinh dang
	@Pattern(regexp = "[a-zA-Z][a-zA-Z ]+@fpt.edu.vn", message = "đúng định dạng @fpt.edu.vn ")
	private String email;
	@NotBlank(message="ko duoc de trong")
	@Length(min = 6)
	private String password;
	@NotBlank(message="ko duoc de trong")//sdt diung dinh dang :0[(24)3709]..
	@Size(min=10,max=11,message="số điện thoại có độ dài 10 đến 11 số")
	@Pattern(regexp = "0\\d{2}\\d{2}\\d{5}", message = "SDT không đúng định dạng")
	
	private String sdt;
	@NotBlank(message="ko duoc de trong")
	private String avatar;

}
