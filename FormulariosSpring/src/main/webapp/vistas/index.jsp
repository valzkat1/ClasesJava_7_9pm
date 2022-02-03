<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>

<br/>
<div class="container">
<form action="/procesarEstudiante" method="POST">

<label class="form-label">Nombre</label>
<input type="text" name="nombre" class="form-control"/>

<label class="form-label">Apellidos</label>
<input type="text" name="apellidos" class="form-control"/>


<label class="form-label">Edad</label>
<input type="number" name="edad" class="form-control"/>

<br/>
<button type="submit" class="btn btn-primary">Enviar</button>


</form>

<a href="/home">Ir al Home</a>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>