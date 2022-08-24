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
	<form:form method="POST" modelAttribute="pro"
		action="/SOF2021_Java5_1/admin/products/update/${ pro.id }">

		<div class="row col-5 offset-4">
			<div class="form-group mt-3">
				<label>tên sản phẩm</label>
				<form:input path="name" class="form-control" value="${pro.name }"
					name="fullname" />
			</div>
			<div class="form-group mt-3">
				<label>Ảnh</label>
				<form:input path="image" type="text" value="${pro.image }"
					class="form-control" name="image" />
			</div>
			<div class="form-group mt-3">
				<label>Giá</label>
				<form:input path="price" value="${pro.price }" class="form-control"
					name="price" />
			</div>

			<div class="form-group mt-3">
				<label>Ngày</label>
				<form:input path="created_date" value="${pro.created_date }"/>
			</div>
			<div>

				<label>Available</label>
				<form:input path="available" />
			</div>
			<div class="form-group mt-3">
				<label>tên danh mục</label>
			
				<form:input path="category.id"  />
					

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