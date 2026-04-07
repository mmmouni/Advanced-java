<%@ page language="java" contentType="text/html"%>
    <%@ page import="java.util.List"%>
    <%@ page import="com.sathya.product.ProductDao" %>
    <%@ page import="com.sathya.product.Product" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <title>List of Products</title>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<h1 class="text-center font-italic mb-1">List of Available products</h1>
<a class="btn btn-success mt-5" href="product.html">save product</a>
<table  class="table table-bordered table-striped">
   <thead class="thead-dark">
     <tr>
         <th>proId</th>
          <th>proName</th>
           <th>proprice</th>
            <th>Brand</th>
             <th>MadeIn</th>
              <th>MfgDate</th>
               <th>ExpDate</th>
                <th>Image</th>
                <th>Actions</th>
         </tr>
  </thead>
         <tbody >
      <c:forEach items="<%=new ProductDao().findAll() %>" var="product">
        	<tr>
        	<td>${product.proId}</td>
        	<td>${product.proName}</td>
        	<td>${product.proPrice}</td>
        	<td>${product.proBrand}</td>
        	<td>${product.proMadeIn}</td>
        	<td>${product.proMfgDate}</td>
        	<td>${product.proExpDate}</td>
        	<td >
        	<img src="data:image/jpeg;base64,${product.base64ProductImage}" alt="Product Image" style="max-width: 100px; max-height: 100px;">
				</td>
        	<td>
        	<a class="btn btn-primary" href="./DeleteProductServlet?proId=${product.proId}">Delete</a>
                   <a class="btn btn-primary" href="./EditProductServlet?proId=${product.proId}">Edit</a>
                </td>
            <tr>
         </c:forEach>
         </tbody>
</table>

</body>
</html>