  
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib  prefix="fmt"  uri = "http://java.sun.com/jsp/jstl/fmt"%>
<%@ page import = "br.com.rd.rdevs.moduloweb.model.Modulo" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
<title>Listar Módulos</title>
</head>
<body>
	<h1 class="display-4 text-center">Módulo</h1>
	<table class="table">
		<tr>
			<th scope="col">CURSO</th>
			<th scope="col">INSTRUTOR</th>
			<th scope="col">INSTRUTOR AUXILIAR</th>
			<th scope="col">DATA INÍCIO</th>
		</tr>
		<c:forEach var="modulo" items="${modulos}"> 
		<tr>
			<td><c:out value="${modulo.getDsNome()}"></c:out>  </td>
			<td><c:out value="${modulo.getDsInstrutorTitular()}"></c:out>  </td>
			<td><c:out value="${modulo.getDsInstrutorAuxiliar()}"></c:out>  </td>
			<td><fmt:formatDate value="${modulo.getDtInicio()}" pattern="dd/MM/yyyy"/></td>
		</tr>
		</c:forEach>
	</table>
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
</body>
</html>