<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" import="models.Libro"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Lista de Libros</h1>
	<%
	List<Libro> listaLibros = (List) request.getSession().getAttribute("listLibIsbn");

	for (Libro lib : listaLibros) {
	%>
	<h3>
		titulo:
		<%=lib.getTitulo()%></h3>
	<h3>
		iSBN:
		<%=lib.getISBN()%></h3>
	<h3>
		Alta:
		<%=lib.getAlta()%></h3>
	<h3>
		Ejemplares:
		<%=lib.getEjemplares()%></h3>

	<h3>
		anio:
		<%=lib.getAnio()%></h3>
	<br>

	
	<%
	}
	%>

</body>
</html>