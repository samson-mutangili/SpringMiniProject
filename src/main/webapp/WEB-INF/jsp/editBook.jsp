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


   

 <form action="/update/book" method="POST">
 <input type="hidden" name="id" id="id" value="${book.id}" />
 	<div class="form-group">
 		<label for="bookName">Book name</label>
 		<input type="text" class="form-control" name="bookName" id="bookName" value="${book.bookName}" />
 	</div>
 	
 	<div class="form-group">
 		<label for="author">Author</label>
 		<input type="text" class="form-control" name="author" id="author"  value="${book.author}"/>
 	</div>
 	
 	<div class="form-group">
 		<label for="purchaseDate">Purchase Date</label> 
 		<input type="Date" class="form-control" name="purchaseDate" id="purchaseDate" value="${book.purchaseDate}" />
 	</div>
 	
 	
 <div class="form-group">
 		<input type="submit" class="btn btn-success" value="Update" />
 	</div>
 </form>
  
</div>

</body>
</html>
