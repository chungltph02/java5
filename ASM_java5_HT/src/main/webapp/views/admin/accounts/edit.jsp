<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Account</title>
<link rel="stylesheet" href="/SOF2021_Java5_1/css/bootstrap.min.css" />
</head>
<body>
<form:form method="POST"
		modelAttribute="acc" action="/SOF2021_Java5_1/admin/accounts/update/${ acc.id }">
		<h3 class="text-center mt-3">Sửa tài khoản</h3>
	<div class="row col-5 offset-4">
			<div class="form-group mt-3">
				<label>Fullname</label>
				<form:input path="fullname" class="form-control" value="${acc.fullname }" name="fullname"/>
			</div>
			<div class="form-group mt-3">
				<label>Email</label>
				<form:input path="email" type="email" value="${acc.email }" class="form-control" name="email" />
			</div>
			<div class="form-group mt-3">
				<label>Username</label>
				<form:input path="username" value="${acc.username }" class="form-control" name = "username"/>
			</div>
			<div class="form-group mt-3">
				<label>password</label>
				<form:input path="password"  class="form-control" name = "username"/>
			</div>
			
			
			<div class="form-group mt-3">
				<label for="photo">Photo</label>
			    <input type="file" value="${acc.photo }" class="form-control" id="photo" name="photo">
			</div>
			<div class="form-group mt-3">
				<label>Admin</label>
				<form:select path="fullname" value="${acc.admin }" class="form-control">
					<form:option value="0">Member</form:option>
					<form:option value="1">Admin</form:option>
				</form:select>
			</div>
			<div class="mt-3">
				<button class="btn btn-success">Sửa</button>
			</div>
		</div>
	</form:form>
	<script src="/SOF2021_Java5_1/js/jquery.min.js"></script>
	<script src="/SOF2021_Java5_1/js/popper.min.js"></script>
	<script src="/SOF2021_Java5_1/js/bootstrap.min.js"></script>
</body>
</html>