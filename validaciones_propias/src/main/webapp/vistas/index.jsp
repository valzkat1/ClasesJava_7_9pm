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
<h3>Usuarios</h3>


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

<div class="input-group">
  <span class="input-group-text">Direccion</span>
  <form:input path="direccion" name="direccion" class="form-control"/>
</div>
<form:errors path="direccion" style="color:red;"/>

<br/>

<div class="input-group">
  <span class="input-group-text">Telefono</span>
  <form:input path="telefono" name="telefono" class="form-control" placeholder="57 - 3XXXXXXXX"/>
</div>
<form:errors path="telefono" style="color:red;"/>

<br/>

<div class="input-group">
  <span class="input-group-text">Fecha Nacimiento</span>
  <form:input type="date" path="fechaN" name="fechaN" class="form-control" />
</div>
<form:errors path="fechaN" style="color:red;"/>

<br/>

<div class="input-group">
  <span class="input-group-text">Email</span>
  <form:input type="text" path="email" name="email" class="form-control" />
</div>
<form:errors path="email" style="color:red;"/>

<br/>


<div class="input-group">
  <span class="input-group-text">Comprobar Email</span>
  <form:input type="text" path="comprobaremail" name="comprobaremail" class="form-control" />
</div>
<form:errors path="comprobaremail" style="color:red;"/>

<br/>


<div class="input-group">
  <span class="input-group-text">Nombre Usuario</span>
  <form:input type="text" path="username" name="username" class="form-control" />
</div>
<form:errors path="username" style="color:red;"/>

<br/>


<div class="input-group">
  <span class="input-group-text">Clave</span>
  <form:input type="text" path="clave" name="clave" class="form-control" />
</div>
<form:errors path="clave" style="color:red;"/>

<br/>



<form:button>Enviar</form:button>


</form:form>


</div>




<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>