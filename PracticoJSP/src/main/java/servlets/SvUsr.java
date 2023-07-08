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

import models.Usuario;

@WebServlet(name="SvUsr",urlPatterns="/SvUsrss")
public class SvUsr extends HttpServlet {
	//private static final long serialVersionUID = 1L;
       
 
    public SvUsr() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Usuario> listaUsuario = new ArrayList<>();
		listaUsuario.add(new Usuario(31475436, "Kary", "aranada"));
		listaUsuario.add(new Usuario(32035394, "Fer", "Tassil"));
		listaUsuario.add(new Usuario(31475436, "Steven", "ArTass"));
		
		HttpSession miSesion =  request.getSession();
		miSesion.setAttribute("ListaUsuarios", listaUsuario);
		
		response.sendRedirect("mostrarUsuarios.jsp");

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String dni = request.getParameter("dni");
		String nombre = request.getParameter("Nombre");
		String apellido = request.getParameter("Apellido");
		
		System.out.println("dni: "+ dni);
		System.out.println("nombre: "+ nombre);
		System.out.println("apellido: "+ apellido);
		
		response.sendRedirect("Index.jsp");
	
	}

}
