<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix ="form" uri = "http://www.springframework.org/tags/form"%>     
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<jsp:include page="navbar.jsp"></jsp:include>

<h3>Lista de Archivos</h3>


<table class="table">
<thead>

<th>Nombre</th>
<th>Apellidos</th>

<th>Editar</th>

</thead>
<tbody>
<c:forEach items="${listaArchivos}" var="u">
<tr>

<td>${u.getNombre()}</td>
<td>${u.getPath()}</td>

<td><a href="/editarA?id=${u.getId()}">Modificar</a></td>

</tr>


</c:forEach>


</tbody>


</table>



</div>


<jsp:include page="footer.jsp"></jsp:include>
