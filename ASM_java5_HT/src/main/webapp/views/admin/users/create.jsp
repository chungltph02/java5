<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>chung</title>
<link rel="stylesheet" href="/SOF2021_Java5_1/css/bootstrap.min.css" />
</head>
<body>

	<form:form method="POST" action="/SOF2021_Java5_1/admin/users/store"
		modelAttribute="user">

		<div>
			<label>Hoten</label>
			<form:input path="hoTen" name="hoTen" />
			<form:errors path="hoTen" class="text-danger"
			style="color:red;"></form:errors>
		</div>
		<div>
			<label>Diachi</label>
			<form:input path="diaChi" name="diaChi" />
			<form:errors path="diaChi" class="text-danger" style="color:red;"></form:errors>
		</div>
		<div>
			<label>gioi tinh</label>
			<form:radiobutton path="gioiTinh" name="gioiTinh" value="1" label="Nam" />
			<form:radiobutton path="gioiTinh" name="gioiTinh" value="0" label="Nu" />
		</div>
		<div>
			<label>email</label>
			
			<form:input type="email" path="email" name="email" />
			<form:errors path="email" class="text-danger" style="color:red;"></form:errors>
		</div>
		<div>
			<label>password</label>
			<form:password path="password" name="password" />
			<form:errors path="password" class="text-danger" style="color:red;"></form:errors>
		</div>
		<div>
			<label>sdt</label>
			<form:input path="sdt" name="sdt" />
			<form:errors path="sdt" class="text-danger" style="color:red;"></form:errors>
		</div>
		<div>
			<label>avatar</label>
			<form:input path="avatar" name="avatar" />
			<form:errors path="avatar" class="text-danger" style="color:red;"></form:errors>
		</div>

             <button>Save</button>
	</form:form>
</body>
<script src="/SOF2021_Java5_1/js/jquery.min.js"></script>
	<script src="/SOF2021_Java5_1/js/popper.min.js"></script>
	<script src="/SOF2021_Java5_1/js/bootstrap.min.js"></script>
</html>