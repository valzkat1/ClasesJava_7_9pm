<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix ="form" uri = "http://www.springframework.org/tags/form"%>     
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<jsp:include page="navbar.jsp"></jsp:include>

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


<jsp:include page="footer.jsp"></jsp:include>
