package repositorios;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import connections.Conexion;
import models.Libro;

public class LibroDAO {
	EntityManager entity ;
	
	public LibroDAO() {
		super();
	}

	public void guardarLibro(Libro libro) {

		entity = Conexion.getEntityManager();
		System.out.println("guardar Libro");	
		try {
			entity.getTransaction().begin();
			entity.persist(libro);
			entity.getTransaction().commit();
		} finally {
			if (entity != null) {
				entity.close();
			}
		}
		entity.close();

	}

	
	public void borrarLibro(Integer id) {

		Libro libro = buscarPorId(id);
		
		System.out.println("borrar Libro");
		try {
			entity.getTransaction().begin();
			entity.remove(libro);
			entity.getTransaction().commit();
		} finally {
			if (entity != null) {
				entity.close();
			}
		}
		entity.close();

	}
	
	
	
	public void actualizarLibro(Libro libro) 
	{
		entity = Conexion.getEntityManager();	
		System.out.println("Actulizar Libro");
		
		try {
			entity.getTransaction().begin();
			entity.merge(libro);
			entity.getTransaction().commit();
		} finally {
			if (entity != null) {
				entity.close();
			}
		}
		entity.close();

	}
	
	
	public Libro buscarPorId(Integer id) {
		entity = Conexion.getEntityManager();
		Libro libro = new Libro();
		libro = entity.find(Libro.class, id);
		return libro;
	}

	public List<Libro> obtenerLibros() {
		EntityManager entity = Conexion.getEntityManager();

		try {
			List<Libro> listaLibros = new ArrayList<>();
			Query sql = entity.createQuery("SELECT a FROM Libro a");
			return listaLibros = sql.getResultList();
		} finally {
			if (entity != null) {
				entity.close();
			}
		}

	}

	
	public List<Libro> buscarLibros(Long isbn) {
		EntityManager entity = Conexion.getEntityManager();

		try {
			List<Libro> listaLibros = new ArrayList<>();
			Query sql = entity.createQuery("SELECT a FROM Libro a where a.ISBN ="+ isbn);
			return listaLibros = sql.getResultList();
		} finally {
			if (entity != null) {
				entity.close();
			}
		}

	}
	
	
	public void cerrarConexion() {
		Conexion.CloseEntityManagerFactory();
	}

}
