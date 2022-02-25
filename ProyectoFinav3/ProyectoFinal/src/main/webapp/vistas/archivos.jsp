<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix ="form" uri = "http://www.springframework.org/tags/form"%> 
      
<jsp:include page="navbar.jsp"></jsp:include>

  <h3>Crear Archivo</h3>  
 <form:form action="/guardarArchivo" method="POST" modelAttribute="archivo" enctype="multipart/form-data">

<div class="input-group">
  <span class="input-group-text">Id</span>
  <form:input type="number" path="id" name="id" class="form-control"/>
</div>
<form:errors path="id" style="color:red;"/>

<div class="input-group">
  <span class="input-group-text">Nombre</span>
  <form:input path="nombre" name="nombre" class="form-control"/>
</div>
<form:errors path="nombre" style="color:red;"/>


<div class="input-group">
  <span class="input-group-text">Archivo</span>
  <input type="file"  name="path" class="form-control"/>
</div>


<form:button type="submit">Enviar</form:button>


</form:form>

<jsp:include page="footer.jsp"></jsp:include>