<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Hola JSP</h2>

	<%
	String nombre = "Kary";
	%>

	<h1>
		<%=nombre%></h1>
	<form action="SvUsr" method="POST">
		<label>Dni <input type="text" name="dni"></label> <label>Nombre</label>
		<input type="text" name="Nombre"></label> <label>Apellido</label><input
			type="text" name="Apellido"></label>
		<button type="submit">Enviar</button>
	</form>

	<br>
	<br>
	<br>
	
	<form action="SvUsr" method="GET">
	<h1>Hacer click para ver los usuarios</h1>
	<button type="submit"> Mostrar Usuarios</button>
	</form>


</body>
</html>