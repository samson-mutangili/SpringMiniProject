<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
    
    
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Spring boot mini project</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <!-- Brand/logo -->
  <a class="navbar-brand" href="#">SpringBoot</a>
  
  <!-- Links -->
  <ul class="navbar-nav">
    <li class="nav-item">
      <a class="nav-link" href="/">All books</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="/addBook">Add new</a>
    </li>
    
  </ul>
</nav>

<div class="container">
<c:if test="${added_book == 'You have successfully added a new book'}">
	<div class="alert alert-danger">
		<strong>Success </strong>:${added_book}
	</div>
</c:if>
 <table class="table table-stripped table-hover">
    <thead>
      <tr>
        <th>id</th>
        <th>Book name</th>
        <th>Author</th>
        <th>Purchase date</th>
        <th>Action</th>
      </tr>
    </thead>
    <tbody>
    
    <c:forEach var="book" items="${books}">
     <tr>
        <td>${book.id}</td>
        <td>${book.bookName}</td>
        <td>${book.author}</td>
        <td>${book.purchaseDate}</td>
        <td>
        	<a href="/books/edit/?bookId=${book.id}"> <button class="btn btn-outline-primary">Edit </button></a>
        	<a href="/books/delete/${book.id}"> <button class="btn btn-outline-danger">Delete </button></a>
        	
        </td>
        
      </tr>
    </c:forEach>
     
     
    </tbody>
  </table>

</div>

</body>
</html>
