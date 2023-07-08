package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.Libro;
import models.Usuario;
import servicios.LibroServicio;


@WebServlet(name="SvLibro" , urlPatterns = "/SvLibro")
public class SvLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	LibroServicio libroServ;
	
       

    public SvLibro() {
        super();
        libroServ = new LibroServicio();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String action = request.getParameter("action");
		if (action == null) {
			
			List<Libro> listaLibros = libroServ.mostrarLibros();		
			HttpSession miSesion =  request.getSession();
			miSesion.setAttribute("listaLibros", listaLibros);
			response.sendRedirect("mostrarLibros.jsp");
			
		}else if(action.equals("actualizar")) {
			System.out.println("paso actualizar");
			Integer id = Integer.parseInt(request.getParameter("idLibro")) ;
			Libro libro = libroServ.obtenerLibro(id);
			
			System.out.println(libro.toString());


			HttpSession miSesion =  request.getSession();
			miSesion.setAttribute("libro", libro);
			
			response.sendRedirect("editarLibro.jsp");
			
		}else if(action.equals("buscarIsbn")) {
			
			List<Libro> listLibIsbn = libroServ.buscarLibros(Long.parseLong(request.getParameter("bISBN")));
			HttpSession miSesion =  request.getSession();
			miSesion.setAttribute("listLibIsbn", listLibIsbn);			
			response.sendRedirect("buscarLibro.jsp");
			
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String action = request.getParameter("action");
		
		System.out.println(action);
		
		if (action.equals("borrar")) {
			Integer id = Integer.parseInt(request.getParameter("idLibro")) ;
			libroServ.borrarLibro(id);
			
			response.sendRedirect("Index.jsp");
			
		}else if(action.equals("crear")) {
			Libro libro = new Libro();
			

			String  iSBN = request.getParameter("iSBN");
			String  titulo = request.getParameter("titulo");
			String  anio = request.getParameter("anio");
			String  ejemplares = request.getParameter("ejemplares");
			String  alta = request.getParameter("alta");

			
			libroServ.crearLibro(iSBN, titulo, anio, ejemplares, alta);
	
			
			response.sendRedirect("Index.jsp");
			
			
		}else if(action.equals("actulizar")) {
			
			
			System.out.println("llamado actulizar libro");
			Libro libro = (Libro) request.getSession().getAttribute("libro");
			
			libro.setISBN(Long.parseLong(request.getParameter("isbn")));
			libro.setTitulo(request.getParameter("titulo"));
			libro.setAnio(Integer.parseInt(request.getParameter("anio")));
			libro.setEjemplares(Integer.parseInt(request.getParameter("Ejemplares")));
			
			
			System.out.println(request.getParameter("alta"));

			Integer alt = 0;
			if (request.getParameter("alta") != null ) {
				alt = 1;
				System.out.println("alt: " + alt.toString());
			}		
			
			libro.setAlta(alt);
			
			System.out.println("actulizar libro");
			System.out.println(libro.toString());
			
			libroServ.editarLibro(libro);
			
			
			response.sendRedirect("Index.jsp");
			
		}
	}

}
