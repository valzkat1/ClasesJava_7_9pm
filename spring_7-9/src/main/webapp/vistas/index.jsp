<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pagina inicial</title>
</head>
<body>
<center>
${admin.getNombre()}
<br/>
<a href="/apis/home">Ir al home</a>

<br/>
<a href="/operario">Operarios</a>

<br/>
<a href="/datos?tipo=admin">Datos admin</a>


<br/>
<a href="/datos?tipo=operario">Datos operario</a>
</center>
</body>
</html>