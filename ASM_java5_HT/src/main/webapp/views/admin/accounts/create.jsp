<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Save Account</title>
<link rel="stylesheet" href="/SOF2021_Java5_1/css/bootstrap.min.css" />
</head>
<body>
<form:form
		method="POST"
		action="/SOF2021_Java5_1/admin/accounts/store"
		modelAttribute="accounts">
		<div>
			<label>Họ Tên</label>
			<form:input path="fullname" class="form-control" placeholder="fullname" aria-label="fullname" aria-describedby="addon-wrapping" />
		</div>
		<div>
			<label>Email</label>
			<form:input path="email" type="email" class="form-control" placeholder="email" aria-label="email" aria-describedby="addon-wrapping"/>
		</div>
		<div>
			<label>Tên</label>
			<form:input path="username"  type="text" class="form-control" placeholder="Username" aria-label="Username" aria-describedby="addon-wrapping"/>
			
		</div>
		<div>
			<label>Mật Khẩu</label>
			<form:password path="password" class="form-control" placeholder="password" aria-label="password" aria-describedby="addon-wrapping"/>
		</div>
		<div>
			<label>Ảnh</label>
			<form:input path="photo" class="form-control" placeholder="photo" aria-label="photo" aria-describedby="addon-wrapping"/>
		</div>
		<div>
			<label>Chức vụ</label>
			<form:select path="fullname">
				<form:option value="0">Member</form:option>
				<form:option value="1">Admin</form:option>
			</form:select>
		</div>
		<button>Lưu</button>
	</form:form>

<script src="/SOF2021_Java5_1/js/jquery.min.js"></script>
	<script src="/SOF2021_Java5_1/js/popper.min.js"></script>
	<script src="/SOF2021_Java5_1/js/bootstrap.min.js"></script>
</body>
</html>