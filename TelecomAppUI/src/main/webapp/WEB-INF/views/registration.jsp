<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">


	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    <title>Registration</title>
  </head>
  <body class="">
<div class="row">
<div class="col-xs-12 col-lg-4 col-md-8 col-sm-12 mx-auto">

<span class="text-danger text-center">
<h5>
<c:if test="${message ne null}">
<c:out value="${message}"></c:out>
</c:if>
</h5>
</span>
<span class="text-center"><h2>Registration</h2></span>
<form:form action="registerUser" modelAttribute="registrationBean" method="post" class="form-control">

<div class="form-group">
<form:errors path="phoneNumber"/>
<form:input path="phoneNumber" placeholder="enter phone number" class="form-control"/><br>
</div>
<div class="form-group">
<form:errors path="username"/>
<form:input path="username" placeholder="enter username" class="form-control"/><br>
</div>
<div class="form-group">
<form:errors path="password"/>
<form:input type="password" path="password" placeholder="enter password" class="form-control"/><br>
</div>
<div class="form-group">
<form:errors path="email"/>
<form:input type="email" path="email" placeholder="enter email" class="form-control"/><br>
</div>
<div class="form-group">
<form:errors path="planId"/>
<form:select path="planId" class="form-control">
<form:option value="">--SELECT--</form:option>
<form:options items="${registrationBean.planList}" itemValue="planId" itemLabel="planId"/>
</form:select>
</div>
<br>
<input type="submit" value="register" class="btn btn-info form-group form-control"><br><br>
<div class="form-group text-center">
<span class="">For Existing User Login Here</span>
<a href="/TelecomApp/Login" class="">Login</a>
</div>

</form:form>



</div>
</div>

  </body>
</html>