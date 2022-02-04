<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Datos</title>
</head>
<body>
<center>
<strong>Tipo: </strong> ${user.getTipo()} <br/>
<strong>Nombre: </strong> ${user.getNombre()}  <br/>
<strong>Horario: </strong>  ${user.getHorario()}  <br/>
<strong>Tareas: </strong> ${user.Tareas()} 

</center>
</body>
</html>