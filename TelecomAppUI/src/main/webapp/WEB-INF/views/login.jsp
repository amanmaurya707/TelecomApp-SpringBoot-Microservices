 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>      
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

	
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    <title>Login</title>
    <!--  disable back button after log out -->
       <script type="text/javascript">
        function preventBack() { window.history.forward(); }
        setTimeout("preventBack()", 0);
        window.onunload = function () { null };
    </script>
  </head>
  <body>
<div class="row">

<div class="col-lg-4 col-md-8 col-sm-12 mx-auto">
<span class="text-danger text-center">
<h5>
<c:if test="${message ne null}">
<c:out value="${message}"></c:out>
</c:if>
</h5>

</span>
<span class="text-center"><h2>Login</h2></span>
<form action="/TelecomApp/loginCheck" method="post" class="form-control">
<input type="text" name="phoneNumber" placeholder="enter phone number" class="form-control form-group"><br>
<input type="password" name="password" placeholder="enter password" class="form-control form-group"><br>
<input type="submit" value="submit" class="btn btn-info form-control form-group"><br><br>
<span class="text-center">For New User Sign Up Here<a href="SignUp">Sign Up</a></span>
</form>

</div>


</div>


  </body>
</html>