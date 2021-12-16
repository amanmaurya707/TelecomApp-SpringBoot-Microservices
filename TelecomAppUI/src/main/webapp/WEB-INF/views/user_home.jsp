<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

<style>

.body{
    background-image: url('banner_img.jpg');
    background-repeat: no-repeat;
    background-size:100% 100% cover;
  
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
                <ul class="navbar-nav mx-auto mb-2 mb-lg-0 mr-4 py-4 text-center" style="font-family: 'Open Sans', sans-serif;font-size:18px;">
                  <li class="nav-item">
                  <a class="nav-link active ps-lg-5" aria-current="page" href="User">Customer Home</a>
                  </li>
                 
                 
                  <li class="nav-item ps-lg-5">
                    <a class="nav-link" href="LogOut">Logout</a>
                  </li>
                </ul>
               
              </div>
            </div>
          </nav>

    </header>
<div class="user_home" style="height:600px;">

<div class="row container mx-auto">
    
        <div class="col-sm-12 col-md-3 col-lg-3">
           <a href="Profile"><img src="images/view_profile_icon.png" alt="not found" height="100px" width="100px"></a><br>
            <span>View Profile</span>

        </div>
        <div class="col-sm-12 col-md-3 col-lg-3">
           <a href="Plans"><img src="images/search_plan_icon.png" alt="not found" height="100px" width="100px"></a><br>
            <span>View Plans</span>

        </div>
        <div class="col-sm-12 col-md-3 col-lg-3">
           <a href="CallDetails"><img src="images/call_details_icon.png" alt="not found" height="100px" width="100px"></a><br>
            <span>View Call Details</span>

        </div>
        <div class="col-sm-12 col-md-3 col-lg-3">
            <a href="AddFriendContact"><img src="images/add_friend_icon.png" alt="not found" height="100px" width="100px"></a><br>
            <span>Add Friend</span>

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