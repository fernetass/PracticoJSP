package repositorios;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import models.Libro;


public class LibroRepositorio {
//	final String DB_URL = "jdbc:sqlite:mi_base.db";
//	private Connection conect;
//	private Statement stm;
//	private PreparedStatement sql;
//	
//	
//	
//	public LibroRepositorio() {
//
//	}
//
//	private void conectar() throws SQLException , ClassNotFoundException{
//		Class.forName("org.sqlite.JDBC");
//		this.conect = DriverManager.getConnection(DB_URL);
//
//	}
//	
//	public void traerLibrosporisbn(int isbn) throws SQLException , ClassNotFoundException {
//		conectar();
//		Libro libro = new Libro();
//		this.sql = this.conect.prepareStatement("SELECT * FROM LIBRO WHERE ISBN=?");
//		sql.setInt(1, isbn);
//		ResultSet result = sql.executeQuery();
//		
//
//		libro.setISBN(result.getLong("ISBN"));
//		libro.setTitulo(result.getString("titulo"));
//		libro.setAnio(result.getInt("anio"));
//		libro.setEjemplares(result.getInt("ejemplares"));
//		libro.setAlta(result.getInt("alta"));
//
//		System.out.println(libro.toString());
//		
//		this.conect.close();
//		result.close();
//
//		//return libro;	
//	}
//	
//	public void borrarLibro() throws ClassNotFoundException, SQLException {
//		conectar();
//	}
//	
	

	

}