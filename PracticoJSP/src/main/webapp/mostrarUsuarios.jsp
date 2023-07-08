<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" import="models.Usuario"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Lista de usuarios</h1>
	<%
	List<Usuario> listaUsuarios = (List) request.getSession().getAttribute("ListaUsuarios");

	for (Usuario usu : listaUsuarios) {
	%>
	<h3>
		dni:
		<%=usu.getDni()%></h3>
	<h3>
		Nombre:
		<%=usu.getNombre()%></h3>
	<h3>
		Apellido:
		<%=usu.getApellido()%></h3>
	<br>

	<%
	}
	%>

</body>
</html>