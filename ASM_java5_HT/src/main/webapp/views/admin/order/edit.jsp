<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Account</title>
<link rel="stylesheet" href="/SOF2021_Java5_1/css/bootstrap.min.css" />
</head>
<body>
	<form:form method="POST" modelAttribute="ord"
		action="/SOF2021_Java5_1/admin/order/update/${ ord.id }">

		<div class="row col-5 offset-4">
			<div class="form-group mt-3">
				<form:select path="account" >
				<form:options items="${account }" itemLabel="username" itemValue="id"/>
					
				</form:select>
			</div>


			<div class="form-group mt-3">
				<label>Ngày</label>
				<form:input path="created_date" value="${ord.created_date }" />
			</div>
			<div>

				<label>Địa Chỉ</label>
				<form:input path="address" />
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