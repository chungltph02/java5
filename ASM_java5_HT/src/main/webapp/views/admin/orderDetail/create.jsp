<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Save OrderDetail</title>
<link rel="stylesheet" href="/SOF2021_Java5_1/css/bootstrap.min.css" />
</head>
<body>
	<form:form
     method="POST"
     action="/SOF2021_Java5_1/admin/orderDetail/store"
     modelAttribute="orderDetail">
     <div class="row col-5 offset-4">
      <div class="form-group mt-3">
       <label class="form-label ">Order_ID</label> 
       <form:select
        name="order"  path="order">
        <c:forEach items="${ dsOrder }" var="order">
         <option value="${ order.id }">${ order.id}</option>
        </c:forEach>
       </form:select>
      </div>
      <div class="form-group mt-3">
       <label class="form-label ">Product_ID</label> 
       <form:select
        name="product"  path="product">
        <c:forEach items="${ dsPro }" var="product">
         <option value="${ product.id }">${ product.name }</option>
        </c:forEach>
       </form:select>
      </div>
      <div class="form-group mt-3">
       <label>Price</label>
       <form:input path="price" class="form-control" />
      </div>
      
      <div class="form-group mt-3">
       <label>Quantity</label>
       <form:input path="quantity" class="form-control" />
      </div>
         
      <div class="mt-3">
       <button class="btn btn-success">Thêm</button>
       <a class="btn btn-danger">Hủy</a>
      </div>
     </div>
    </form:form>

	<script src="/SOF2021_Java5_1/js/jquery.min.js"></script>
	<script src="/SOF2021_Java5_1/js/popper.min.js"></script>
	<script src="/SOF2021_Java5_1/js/bootstrap.min.js"></script>
</body>
</html>