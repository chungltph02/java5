package java5.sof2021.bean;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

@AllArgsConstructor
@NoArgsConstructor
public class studen {
	
	String name;
	String email;
	double marks;
	boolean gender;
	String faculty;
	
	List<String>hobbies;

	
}
