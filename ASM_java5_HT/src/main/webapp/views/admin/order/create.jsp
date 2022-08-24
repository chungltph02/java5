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
	<form:form method="POST" action="/SOF2021_Java5_1/admin/order/store"
		modelAttribute="order">
		<div>
			<label>Tên sản phẩm</label>
			
				<form:select path="account" name="account" class="form-select"
				aria-label="Default select example">
					<c:forEach items="${ account }" var="account">
					<option value="${ account.id }">${ account.username }</option>
				</c:forEach></form:select>
		</div>
		
		<div>
			<label>Ngày</label>
			<form:input path="create_date" class="form-control"
				placeholder="password" aria-label="Ngày bán"
				aria-describedby="addon-wrapping" />
		</div>
		<div>
			<label>Dia chi</label>
			<form:input path="address" class="form-control"
				placeholder="address" aria-label="address"
				aria-describedby="addon-wrapping" />
		</div>
		<div>
			

		</div>


		<button>Lưu</button>
	</form:form>

	<script src="/SOF2021_Java5_1/js/jquery.min.js"></script>
	<script src="/SOF2021_Java5_1/js/popper.min.js"></script>
	<script src="/SOF2021_Java5_1/js/bootstrap.min.js"></script>
</body>
</html>