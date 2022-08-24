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
	<form:form method="POST" modelAttribute="orderDetail"
		action="/SOF2021_Java5_1/admin/orderDetail/update/${ order.id }">

		<div class="row col-5 offset-4">
			<div class="form-group mt-3">
				<label>order_id</label>
				<form:select path="order_id" >
					<c:forEach items="${ dsOrder }" var="order">
						<option value="${ order.id }">${ order.id}</option>
					</c:forEach>
				</form:select>

			</div>

			<div class="form-group mt-3">
				<label>Product_id</label>
				<form:select name="product" path="product">
					<c:forEach items="${ dsPro }" var="product">
						<option value="${ product.id }">${ product.name }</option>
					</c:forEach>
				</form:select>
			</div>
			<div>

				<label>Gia</label>
				<form:input path="price" />
			</div>
			<div>

				<label>so luong</label>
				<form:input path="quantity" />
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