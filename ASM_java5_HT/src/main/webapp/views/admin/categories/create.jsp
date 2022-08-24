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
		action="/SOF2021_Java5_1/admin/categories/store"
		modelAttribute="categories">
		
		<h2>Edit Danh Mục</h2>
		<div>
			<label>Tên</label>
			<form:input path="name"/>
			
		</div>
		
		<button>Lưu</button>
	</form:form>

<script src="/SOF2021_Java5_1/js/jquery.min.js"></script>
	<script src="/SOF2021_Java5_1/js/popper.min.js"></script>
	<script src="/SOF2021_Java5_1/js/bootstrap.min.js"></script>
</body>
</html>