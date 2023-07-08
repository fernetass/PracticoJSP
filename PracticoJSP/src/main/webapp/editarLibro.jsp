<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" import="models.Libro"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar Libro</title>
</head>
<body>
	<h1>modificar Libro</h1>
	<%
	Libro lib = (Libro) request.getSession().getAttribute("libro");
	%>

	<form action="SvLibro" method="POST">

		<input type=hidden name="action" value="actulizar"> <input
			type=hidden name="idLibro" value=<%=lib.getId()%>> <label>
			Isbn: <input type="number" name="isbn" value=<%=lib.getISBN()%>>
		</label> <label> Titulo: <input type="text" name="titulo"
			value=<%=lib.getTitulo()%>>
		</label> <label> anio: <input type="number" name="anio"
			value=<%=lib.getAnio()%>>
		</label> <label> Ejemplares: <input type="number" name="Ejemplares"
			value=<%=lib.getEjemplares()%>>
		</label>

		<%
		if (lib.getAlta() == 1) {
		%>
		<label> alta: <input type="checkbox" name="alta"
			value=<%=lib.getAlta()%> checked>
		</label>
		<%
		} else {
		%>
		<label> alta: <input type="checkbox" name="alta"
			value=<%=lib.getAlta()%>>
		</label>
		<%
		}
		%>

		<button type="submit">Actualizar</button>
	</form>

</body>
</html>