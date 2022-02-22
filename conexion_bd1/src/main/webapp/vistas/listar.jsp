<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix ="form" uri = "http://www.springframework.org/tags/form"%>     
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
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
<h3>Lista de Usuarios</h3>


<table class="table">
<thead>
<th>Cc</th>
<th>Nombre</th>
<th>Apellidos</th>
<th>Edad</th>
<th>Editar</th>
<th>Borrar</th>
</thead>
<tbody>
<c:forEach items="${listaUser}" var="u">
<tr>
<td>${u.getCc()}</td>
<td>${u.getNombre()}</td>
<td>${u.getApellidos()}</td>
<td>${u.getEdad()}</td>
<td><a href="/editar?id=${u.getCc()}">Modificar</a></td>
<td><a href="/eliminar?id=${u.getCc()}" onclick="return confirmar()">Borrar</a></td>
</tr>


</c:forEach>


</tbody>


</table>



</div>




<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<script>

function confirmar(){
	return window.confirm("Esta seguro de querer eliminar el registro?");
	
}

</script>

</body>
</html>