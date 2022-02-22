<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista usuarios</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>

<div class="container">

<h3>Lista de suarios</h3>

<table class="table">
<thead>

<th>Nombre</th>
<th>Apellidos</th>
<th>Edad</th>
<th>Direccion</th>
<th>Telefono</th>
<th>Editar</th>
</thead>

<tbody>
<core:forEach items="${lista}" var="user">

<tr>
<td>${user.getNombre()}</td>
<td>${user.getApellidos()}</td>
<td>${user.getEdad()}</td>
<td>${user.getDireccion()}</td>
<td>${user.getTelefono()}</td>
<td><a href="/editar?nomb=${user.getNombre()}&apellido=${user.getApellidos()}&edad=${user.getEdad()}&telefono=${user.getTelefono()}&direccion=${user.getDireccion()}">Editar</a></td>
</tr>
</core:forEach>


</tbody>

</table>


</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>