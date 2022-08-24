<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>chung</title>
</head>
<body>
	<form:form method="POST" action="/SOF2021_Java5_1/studen/form"
		modelAttribute="studen">
		<div>
			<label>Hoten</label>
			<form:input path="name" name="name" />

		</div>
		<div>
			<label>email</label>
			<form:input path="email" name="email" type="email" />

		</div>
		<div>
			<label>diem</label>
			<form:input path="marks" name="marks"  />

		</div>
		<label>khoa</label>
		<form:select path="faculty" name="faculty">
		<form:option value="1">CNTT</form:option>
		<form:option value="2">TKDH</form:option>
		<form:option value="3">TKW</form:option>
		</form:select>
		
		<div>
			<label>gioi tinh</label>
			<form:radiobutton path="gender" name="gender" value="1" label="Nam" />
			<form:radiobutton path="gender" name="gender" value="0" label="Nu" />
		</div>
		

	</form:form>

</body>
</html>