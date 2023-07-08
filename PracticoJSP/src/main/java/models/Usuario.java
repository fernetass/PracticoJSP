package models;

public class Usuario {
	private int dni;
	private String Nombre;
	private String Apellido;
	
	public Usuario() {

	}

	public Usuario(int dni, String nombre, String apellido) {
		super();
		this.dni = dni;
		Nombre = nombre;
		Apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	@Override
	public String toString() {
		return "Usuario [dni=" + dni + ", Nombre=" + Nombre + ", Apellido=" + Apellido + "]";
	}
	
	

}
