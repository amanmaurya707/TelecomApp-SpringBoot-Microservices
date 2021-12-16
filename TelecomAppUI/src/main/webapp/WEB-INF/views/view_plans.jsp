<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"   prefix="c"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Jost&display=swap" rel="stylesheet">
<style>
body
{
height: 100vh;
display: flex;
flex-direction: column;
}

footer
{
 margin-top: auto;
  
} 
</style>
    
  </head>
  <body>
    <header>

        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container-fluid">
              <span class="navbar-brand fst-italic">Telecom  Application<img src="images/24hrs services.jpg" alt="not found" height="80px" width="80px"></span>
              <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
              </button>
                  <div class="collapse navbar-collapse" id="navbarSupportedContent">
               
               <div class="mx-auto" style="font-size:18px;font-family: 'Jost', sans-serif;">
	<ol class="navbar-nav mx-auto mb-2 mb-lg-0 mr-4 py-4 text-center breadcrumb ml-4">
  	<li class="active" aria-current="page">View Plans||</li>
    <li class=""><a href="User" style="text-decoration: none;">Home&nbsp;&nbsp;</a></li>
    <li class=""><a href="LogOut" style="text-decoration: none;">Logout</a></li>
    </ol>
	</div>
           
              </div>
            </div>
          </nav>

    </header>
<div class="container">

<div class="row">
    <div class="col-12 container">
             <div class="col-12 mx-auto text-center pt-4" style="background-color:#F2F4F4 ;">
                <h2 style="color:#ABB2B9;">All Plans Listed Here</h2><hr>
             
            </div>
            <div class="col-12 mt-5 pt-5">
                <table class="table table-bordered tbl" id="mydata">
                    <thead>
                      <tr>
                        <th scope="col">Plan Id</th>
                        <th scope="col">Plan Name</th>
                        <th scope="col">Validity</th>
                        <th scope="col">Description</th>
                       
                      </tr>
                    </thead>
                    <tbody id="result">
                    
                     <c:forEach items="${plansData}" var="plan">
                     <tr>
                      <td><c:out value="${plan.planId}"/></td>
                      <td><c:out value="${plan.planName}"/></td>
                      <td><c:out value="${plan.validity}"/></td>
                      <td><c:out value="${plan.description}"/></td>
                      </tr>
                      </c:forEach>  
                        
                    </tbody>
                  </table>
            </div>
            
    </div>
</div>

</div>


<footer style="width:100%;height:100px;color:white;" class="bg-dark text-center">
    <div style="padding-top:50px;font-size:16px;">
    <span>Design And Develope By AMANKUMAR MAURYA ||&copy; 2021 All Right Reserved.</span>
    </div>
</footer>
  </body>
</html>