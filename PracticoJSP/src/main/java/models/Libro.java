package models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;



@Entity
public class Libro {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;	
	@Column(unique=true,nullable = false)	
    private Long ISBN;
	@Column(nullable = false)	
    private String titulo;
   // @Temporal(value = TemporalType.DATE)
	
    private Integer anio;
	
    private Integer ejemplares;
    
    private Integer alta;
    
    
	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Libro(Long iSBN, String titulo, Integer anio, Integer ejemplares, Integer alta) {
		ISBN = iSBN;
		this.titulo = titulo;
		this.anio = anio;
		this.ejemplares = ejemplares;
		this.alta = alta;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Long getISBN() {
		return ISBN;
	}


	public void setISBN(Long iSBN) {
		ISBN = iSBN;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public Integer getAnio() {
		return anio;
	}


	public void setAnio(Integer anio) {
		this.anio = anio;
	}


	public Integer getEjemplares() {
		return ejemplares;
	}


	public void setEjemplares(Integer ejemplares) {
		this.ejemplares = ejemplares;
	}


	public Integer getAlta() {
		return alta;
	}


	public void setAlta(Integer alta) {
		this.alta = alta;
	}


	@Override
	public String toString() {
		return "Libro [id=" + id + ", ISBN=" + ISBN + ", titulo=" + titulo + ", anio=" + anio + ", ejemplares="
				+ ejemplares + ", alta=" + alta + "]";
	}


	
	
	


}
