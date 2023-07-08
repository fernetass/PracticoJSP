package root;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.persistence.EntityManager;

import connections.Conexion;
import models.Libro;
import repositorios.LibroRepositorio;
import repositorios.LibroDAO;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		 * System.out.println("entro"); // 1- definir la url de conexion final String
		 * DB_URL = "jdbc:sqlite:mi_base.db";
		 * 
		 * // 2- cargar driver try { Class.forName("org.sqlite.JDBC"); // 3.establecer
		 * la conexion Connection conect = DriverManager.getConnection(DB_URL); //4-
		 * crear objeto statement Statement stm = conect.createStatement();
		 * 
		 * 
		 * 
		 * stm.
		 * executeUpdate("INSERT INTO LIBRO (ISBN, TITULO,ANIO,EJEMPLARES,ALTA) VALUES(12321,'KARY',2020,3,1)"
		 * ); System.out.println("ok insert"); // READ
		 * 
		 * ResultSet result =
		 * stm.executeQuery("SELECT * FROM LIBRO ORDER BY TITULO ASC");
		 * 
		 * System.out.println(result.next()); while(result.next()) {
		 * System.out.println(result.getString("titulo"));
		 * 
		 * 
		 * }
		 * 
		 * 
		 * } catch (ClassNotFoundException e) {
		 * System.out.println("clase no encontrada"); e.printStackTrace(); } catch
		 * (SQLException e) { System.out.println("no conecta "); e.printStackTrace(); }
		 */
		
		

		/*
		 * LibroRepositorio librorepo = new LibroRepositorio();
		 * 
		 * try { librorepo.traerLibrosporisbn(7013); } catch (ClassNotFoundException e)
		 * { // TODO Auto-generated catch block e.printStackTrace(); } catch
		 * (SQLException e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 */
	
//		EntityManager em;
//		try {
//			em = Conexion.getEntityManager();
//			System.out.println("Conexion Exitosa");
//		} catch (Exception e) {
//			System.out.println("ALgo salio mal");
//		} finally {
//
//			Conexion.CloseEntityManager();
//		}
		
		
//		LibroDAO libroDAO = new LibroDAO();
//	
//		Libro libro = new Libro(111L,"Sapo PEPE1", 1981,6,0);
//		
//		libroDAO.guardar(libro);
//		
//		Libro nuevoLibro = libroDAO.buscarPorId(1);
//		
//		System.out.println(nuevoLibro.toString());
		
		
		LibroDAO libroDAO = new LibroDAO();
		List<Libro> listaDb = libroDAO.obtenerLibros();
		
		for (Libro lib: listaDb) {
			System.out.println(lib.toString());
		}
		
		 

	}



}
