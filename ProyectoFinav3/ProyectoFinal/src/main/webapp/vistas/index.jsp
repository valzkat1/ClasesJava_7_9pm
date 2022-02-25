<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix ="form" uri = "http://www.springframework.org/tags/form"%>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Proyecto final</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<style type="text/css">

.divider:after,
.divider:before {
  content: "";
  flex: 1;
  height: 1px;
  background: #eee;
}
.h-custom {
  height: calc(100% - 73px);
}
@media (max-width: 450px) {
  .h-custom {
    height: 100%;
  }
}
</style>
</head>
<body>

<section class="vh-100">
  <div class="container-fluid h-custom">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-md-9 col-lg-6 col-xl-5">
        <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.webp" class="img-fluid"
          alt="Sample image">
      </div>
      <div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1">
        
        
        <form:form modelAttribute="usuario" action="/login" method="POST">       

  

          <!-- Email input -->
          <div class="form-outline mb-4">
            <form:input type="text"  name="username" path="username" id="form3Example3" class="form-control form-control-lg"
              placeholder="Enter a valid email address" />
            <label class="form-label" for="form3Example3">${txtUsuario}</label>
            <br/>
            <form:errors path="username"/>
          </div>

          <!-- Password input -->
          <div class="form-outline mb-3">
            <form:input type="password"  name="clave" path="clave" id="form3Example4" class="form-control form-control-lg"
              placeholder="Enter password" />
            <label class="form-label" for="form3Example4">${txtClave}</label>
            <br/>
            <form:errors path="clave"/>
          </div>

       

          <div class="text-center text-lg-start mt-4 pt-2">
            <form:button type="submit" class="btn btn-primary btn-lg"
              style="padding-left: 2.5rem; padding-right: 2.5rem;">${txtEnviar}</form:button>
         
          </div>

        </form:form>
      </div>
    </div>
  </div>
  <div class="d-flex flex-column flex-md-row text-center text-md-start justify-content-between py-4 px-4 px-xl-5 bg-primary">
    <!-- Copyright -->
    <div class="text-white mb-3 mb-md-0">
      Copyright © 2022. All rights reserved.
    </div>
 
  </div>
</section>



<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>