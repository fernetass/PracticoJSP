package servicios;

import java.util.List;

import javax.persistence.Basic;

import models.Libro;
import repositorios.LibroDAO;

public class LibroServicio {
	
	LibroDAO libroDAO;

	public LibroServicio() {
		super();
		libroDAO = new LibroDAO();
		
	}

	
	
	public void crearLibro(String iSBN,String titulo,String anio,String ejemplares,String alta) {
		
		Libro libro = new Libro();
		System.out.println("crearLibro");
		libro.setISBN(Long.parseLong(iSBN) );
		libro.setTitulo(titulo);
		libro.setAnio(Integer.parseInt(anio));
		libro.setEjemplares(Integer.parseInt(ejemplares));
		
		System.out.println(alta);
		
		Integer alt = 0;
		if (alta != null ) {
			alt = 1;
		}
		libro.setAlta(alt);
		libroDAO.guardarLibro(libro);
			
	}
	
	public List<Libro> mostrarLibros() {
		System.out.println("llamo mostrarlibros");	
		List<Libro> listaLibros = libroDAO.obtenerLibros();
		System.out.println(listaLibros.size());
		return listaLibros;		
	}

	
	public List<Libro> buscarLibros(Long isbn) {
		System.out.println("llamo buscarLibros");	
		List<Libro> listaLibros = libroDAO.buscarLibros(isbn);
		return listaLibros;		
	}
	
	
	public void borrarLibro(Integer Id) {
		System.out.println("llamo borrar libro");
		libroDAO.borrarLibro(Id);
		
	}
	
	public void editarLibro(Libro libro) {
		System.out.println("llamo editar libro");
		libroDAO.actualizarLibro(libro);
		
	}
	
	public Libro obtenerLibro(Integer id) {
		System.out.println("llamo obtener libro");
		Libro libro =libroDAO.buscarPorId(id);
		return libro; 
		
	}
	
}
