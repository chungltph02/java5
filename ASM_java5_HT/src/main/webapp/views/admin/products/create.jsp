<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Save Product</title>
<link rel="stylesheet" href="/SOF2021_Java5_1/css/bootstrap.min.css" />
</head>
<body>
	<form:form method="POST" action="/SOF2021_Java5_1/admin/products/store"
		modelAttribute="products">
		<div>
			<label>Tên sản phẩm</label>
			<form:input path="name" class="form-control" placeholder="name"
				aria-label="name" aria-describedby="addon-wrapping" />
		</div>
		<div>
			<label>Ảnh</label>
			<form:input path="image" type="text" class="form-control"
				placeholder="ảnh" aria-label="ảnh" aria-describedby="addon-wrapping" />
		</div>
		<div>
			<label>Giá</label>
			<form:input path="price" type="text" class="form-control"
				placeholder="Giá" aria-label="Giá" aria-describedby="addon-wrapping" />

		</div>
		<div>
			<label>Ngày</label>
			<form:input path="create_date" class="form-control"
				placeholder="password" aria-label="Ngày bán"
				aria-describedby="addon-wrapping" />
		</div>
		<div>
			<label>available</label>
			<form:input path="available" class="form-control"
				placeholder="available" aria-label="available"
				aria-describedby="addon-wrapping" />
		</div>
		<div>
			<label>Tên danh mục</label> 
				<form:select path="category" name="category" class="form-select"
				aria-label="Default select example">
					<c:forEach items="${ category }" var="category">
					<option value="${ category.id }">${ category.name }</option>
				</c:forEach></form:select>

		</div>


		<button>Lưu</button>
	</form:form>

	<script src="/SOF2021_Java5_1/js/jquery.min.js"></script>
	<script src="/SOF2021_Java5_1/js/popper.min.js"></script>
	<script src="/SOF2021_Java5_1/js/bootstrap.min.js"></script>
</body>
</html>