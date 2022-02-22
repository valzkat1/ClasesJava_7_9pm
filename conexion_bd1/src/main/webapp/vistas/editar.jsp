<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix ="form" uri = "http://www.springframework.org/tags/form"%>     
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Validaciones propias</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
<br/>
<div class="container">
<h3>Editar Usuarios</h3>


<form:form action="/validar" method="POST" modelAttribute="usuario">

<div class="input-group">
  <span class="input-group-text">Nombre</span>
  <form:input path="nombre" name="nombre" class="form-control"/>
</div>
<form:errors path="nombre" style="color:red;"/>

<br/>

<div class="input-group">
  <span class="input-group-text">Apellidos</span>
  <form:input path="apellidos" name="apellidos" class="form-control"/>
</div>
<form:errors path="apellidos" style="color:red;"/>

<br/>

<div class="input-group">
  <span class="input-group-text">Edad</span>
  <form:input path="edad" name="edad" class="form-control"/>
</div>
<form:errors path="edad" style="color:red;"/>


<br/>

  <form:hidden path="cc" name="cc" class="form-control"/>


<br/>



<form:button>Enviar</form:button>


</form:form>


<br/>
<a href="/listar">Lista de Usuarios</a>

</div>




<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>