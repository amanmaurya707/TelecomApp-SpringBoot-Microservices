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
/* footer */working fine
/* { */
   
/*     padding-bottom: 0px; */
/*     position:relative; */
/*     bottom:0; */
/*     width:100%; */
/* } */
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
    <script type="text/javascript">
        window.history.forward();
        function noBack() {
            window.history.forward();
        }
    </script>
    
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
  	<li class="active" aria-current="page">Profile||</li>
    <li class=""><a href="User" style="text-decoration: none;">Home&nbsp;&nbsp;</a></li>
    <li class=""><a href="LogOut" style="text-decoration: none;">Logout</a></li>
    </ol>
	</div>
           
              </div>
            </div>
          </nav>

    </header>
<div class="profile container">

<div class="row">
    <div class="col-12 container">
         <div class="profile_image">
            <img src="images/profile_image.jpg" alt="not found" width="200px" height="200px">

         </div>
         <div class="personal_details">
             <h2 style="color:#ABB2B9;">Customer Details</h2><hr>
                <div class="row" style="font-size:18px;font-family: 'Jost', sans-serif;">
                    <div class="col-12">
                           <font style="color: #808B96;">phone number:</font>
                           <span><c:out value="${customerData.phoneNumber}" /> </span> 

                    </div>
                    <div class="col-12">
                          <font style="color:#808B96;">username:</font>
                          <span><c:out value="${customerData.username}" /> </span>

                    </div>
                    <div class="col-12">
                        <font style="color: #808B96;">email:</font>
                        <span><c:out value="${customerData.email}" /></span>
                    </div>
                </div>

         </div>
         <div class="current_plan mt-5">
            <h2 style="color:#ABB2B9;">Current Plan Details</h2><hr>
                <div class="row" style="font-size:18px;font-family: 'Jost', sans-serif;">
                    <div class="col-12">
                        <font style="color: #808B96;">plan id:</font>
                        <span><c:out value="${customerData.currentPlan.planId}" /></span>

                    </div>
                    <div class="col-12">
                        <font style="color: #808B96;">plan name:</font>
                        <span><c:out value="${customerData.currentPlan.planName}" /></span>

                    </div>
                    <div class="col-12">
                        <font style="color: #808B96;">validity:</font>
                        <span><c:out value="${customerData.currentPlan.validity}" /></span>

                    </div>
                    <div class="col-12">
                        <font style="color: #808B96;">description:</font>
                        <span><c:out value="${customerData.currentPlan.description}" /></span>
                    </div>
                </div>

         </div>
         <div class="friends_contact mt-5">
             <h2 style="color:#ABB2B9;">Friends Contact Numbers</h2><hr>
                <div class="row" style="font-size:18px;font-family: 'Jost', sans-serif;">
                    <div class="col-12">
                        <c:forEach items="${customerData.friendsContactNumbers}" var="friendNo">
                          <font><c:out value="${friendNo}"/></font><br>
                        </c:forEach>
                      
                    </div>

                </div>

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