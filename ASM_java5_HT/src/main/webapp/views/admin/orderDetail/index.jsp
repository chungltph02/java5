<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>order index</title>
<link rel="stylesheet" href="/SOF2021_Java5_1/css/bootstrap.min.css" />
</head>
<body>
	<table class="table table-bordered"">
		<thead>
			<tr>
				<th>ID</th>
				<th>order</th>
				<th>product</th>
				<th>Giá</th>
				<th>Số Lượng</th>
				<th>Role</th>
				<th colspan="2">Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${ data.content }" var="orderdetail">
				<tr>
					<td>${ orderdetail.id }</td>
					<td>${ orderdetail.order.id }</td>
					<td>${ orderdetail.product.name }</td>
					<td>${ orderdetail.price }</td>
					<td>${ orderdetail.quantity }</td>

					<td><a href="/SOF2021_Java5_1/admin/orderDetail/edit/${ orderdetail.id }"
						class="btn btn-info">Edit</a></td>


					<td>

						<button type="button" class="btn btn-primary"
							data-bs-toggle="modal" data-bs-target="#exampleModal">
							Delete</button> <!-- Modal -->
						<div class="modal fade" id="exampleModal" tabindex="-1"
							aria-labelledby="exampleModalLabel" aria-hidden="true">
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-header">
										<h5 class="modal-title" id="exampleModalLabel">Delete</h5>
										<button type="button" class="btn-close"
											data-bs-dismiss="modal" aria-label="Close"></button>
									</div>
									<div class="modal-body">Ban muon xoa chu</div>
									<div class="modal-footer">
										<button type="button" class="btn btn-secondary"
											data-bs-dismiss="modal">Close</button>
										<a href="/SOF2021_Java5_1/admin/orderDetail/delete/${ orderdetail.id }"
											class="btn btn-danger">Delete</a>
									</div>
								</div>
							</div>
						</div>
					</td>


				</tr>
			</c:forEach>
		</tbody>
	</table>

	<div class="row">
		<ul class="pagination">
			<c:forEach var="i" begin="0" end="${ data.totalPages - 1 }">
				<li class="page-item">
				<a class="page-link" href="/SOF2021_Java5_1/admin/orderDetail/index?page=${ i }"> ${ i + 1 }
				</a></li>
			</c:forEach>
		</ul>
	</div>
	<div>
		<a class="btn btn-success"
			href="/SOF2021_Java5_1/admin/orderDetail/create">Them moi </a>
	</div>


	<script src="/SOF2021_Java5_1/js/jquery.min.js"></script>
	<script src="/SOF2021_Java5_1/js/popper.min.js"></script>
	<script src="/SOF2021_Java5_1/js/bootstrap.min.js"></script>
</body>
</html>