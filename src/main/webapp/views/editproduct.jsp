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


	<form action="${pageContext.request.contextPath}/edit-product-data"
		method="post">


		<div class="container mt-5">
			<div>
				<h1>Update Product Details</h1>
			</div>


			<div>

				<div class="mb-3">
					<label for="exampleFormControlInput1" class="form-label"><b>Product
							Name</b></label> <input type="text" class="form-control" name="id" id="id"
						value="${product.id}">
				</div>

				<div class="mb-3">
					<label for="exampleFormControlInput1" class="form-label"><b>Product
							Name</b></label> <input type="text" class="form-control" name="produjct_name"
						id="produjct_name" placeholder="Enter The Product Naame"
						value="${product.produjct_name}">
				</div>

				<div class="mb-3">
					<label for="exampleFormControlInput1" class="form-label"><b>Product
							Price</b></label> <input type="number" class="form-control" name="price"
						id="price" placeholder="Enter The Product Price" min="0"
						value="${product.price}">
				</div>


				<div class="mb-3">
					<label for="description" class="form-label"><b>Product
							Description</b></label>
					<textarea class="form-control" id="description" name="description"
						rows="3">${product.description}</textarea>

				</div>

				<div class="mb-3">



					<a href="${pageContext.request.contextPath}/"
						class="btn btn-outline-danger">Back</a> <input type="submit"
						class="btn btn-success" value="Update Product">
				</div>
			</div>
		</div>
	</form>
</body>
</html>