<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Administrador Libros</title>
</head>
<body>
	<h2>Agregar Libro</h2>

	<form action="SvLibro" method="POST">
	    <input type=hidden name="action" value="crear">
		<label>iSBN: <input type="number" name="iSBN"></label>
		<label>titulo: <input type="text" name="titulo"></label>
		<label>anio: <input type="number" name="anio"></label>
		<label>Ejemplares: <input type="number" name="ejemplares"></label>
		<label>alta: <input type="checkbox" name="alta"></label>
		<button type="submit">Enviar</button>
	</form>

	<br>
	<br>
	<br>
	
	<form action="SvLibro" method="GET">
	<h1>Hacer click para ver los libros</h1>
	<button type="submit"> Mostrar Libros</button>
	</form>

	<br>
	<br>
	<br>

	<h1>Buscar Libro por ISBN </h1>
	<form action="SvLibro" method="GET">
	<input type=hidden name="action" value="buscarIsbn">
	<label>iSBN: <input type="number" name="bISBN"></label>
	
	<button type="submit"> Buscar Libro</button>
	</form>	
	


</body>
</html>