<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix ="form" uri = "http://www.springframework.org/tags/form"%> 
    
    
   <jsp:include page="navbar.jsp"></jsp:include> 
    
  <h3>Crear Usuario</h3>  
 <form:form action="/crearUser" method="POST" modelAttribute="usuario">

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
  <span class="input-group-text">Cc</span>
  <form:input path="cc" name="cc" class="form-control"/>
</div>
<form:errors path="cc" style="color:red;"/>

<br/>

<div class="input-group">
  <span class="input-group-text">Nombre Usuario</span>
  <form:input path="username" name="username" class="form-control"/>
</div>
<form:errors path="username" style="color:red;"/>

<br/>

<div class="input-group">
  <span class="input-group-text">Clave</span>
  <form:input path="clave" name="clave" class="form-control"/>
</div>
<form:errors path="clave" style="color:red;"/>

<br/>




<form:button type="submit">Enviar</form:button>


</form:form>   



 <jsp:include page="footer.jsp"></jsp:include> 
