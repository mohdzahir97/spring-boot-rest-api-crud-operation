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
	<form action="add-product-data" method="post">


		<div class="container mt-5">
			<div>
				<h1>Add Product</h1>
			</div>

			<div>
				<div class="mb-3">
					<label for="exampleFormControlInput1" class="form-label"><b>Product
						Name</b></label> <input type="text" class="form-control" name="produjct_name"
						id="produjct_name" placeholder="Enter The Product Naame">
				</div>

				<div class="mb-3">
					<label for="exampleFormControlInput1" class="form-label"><b>Product
						Price</b></label> 
						<input type="number" class="form-control" name="price"
						id="price" placeholder="Enter The Product Price" min="0">
				</div>


				<div class="mb-3">
					<label for="description" class="form-label"><b>Product
						Description</b></label>
					<textarea class="form-control" id="description" name="description"
						rows="3"></textarea>
				</div>

				<div class="mb-3">
					<input type="submit" class="btn btn-success" value="Add Product">
				</div>
			</div>
		</div>
	</form>
</body>
</html>