<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>

	<div class="container mt-5">

		<div class="col-md-12">

			<h1 class="text-center">All Product Details</h1>
			<table class="table">
				<thead>
					<tr>
						<th scope="col">ID</th>
						<th scope="col">Product Name</th>
						<th scope="col">Product Price</th>
						<th scope="col">Action</th>
					</tr>
				</thead>

				<tbody>

					<c:forEach var="p" items="${products}">

						<tr>
							<th scope="col">${p.id}</th>
							<td scope="col">${p.produjct_name}</td>
							<td scope="col">&#8377; ${p.price}</td>
							<td scope="col"><a href="delete/${p.id}"><i
									class="fas fa-trash text-danger"></i></a> <a href="edit/${p.id}"
								class="ml-2"><i class="fas fa-edit text-outline-success"></i></a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>

			<div class="container">
				<div class="text-center">
					<a href="addproduct" class="btn btn-outline-success ml-10">Add
						Product </a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>