package java5.sof2021.bean;

import java.util.Date;

import java5.sof2021.entities.Account;
import java5.sof2021.entities.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderModel {
private Account account;
private Date create_date;
private String address;

}
