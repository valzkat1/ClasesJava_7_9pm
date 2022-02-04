<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center>

${dato }
<br/>

<form action="/formulario" method="POST" >
<label>Nombre</label>
<input type="text" name="nombre" placeholder="Nombre"/>
<br/>
<label>Edad</label>
<input type="text" name="edad" placeholder="edad"/>
<br/>
<label>Sexo</label>
<input type="text" name="sexo" placeholder="sexo"/>
<br/>
<label>RUT</label>
<input type="text" name="rut" placeholder="rut"/>
<br/>
<label>Peso</label>
<input type="text" name="peso" placeholder="peso"/>
<br/>
<label>Altura</label>
<input type="text" name="altura" placeholder="altura"/>
<br/>
<label>Fecha 1er Consulta</label>
<input type="date" name="fecha" placeholder="fecha"/>
<br/>

<label>Medico Tratante</label>
<select name="medico">
  <option>Victor</option>
</select>

<br/>

<button type="submit">Enviar</button>
</form>


</center>


</body>
</html>