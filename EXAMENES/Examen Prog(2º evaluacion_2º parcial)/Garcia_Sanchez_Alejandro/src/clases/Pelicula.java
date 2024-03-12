<<<<<<< HEAD
package clases;

import java.time.LocalDate;
import java.util.Comparator;

import enumerados.Genero;
import excepciones.ErrorDuracion;
import interfaces.Visionable;

public abstract class Pelicula implements Visionable, Comparable<Pelicula> {

	private String titulo, director;
	private int duracion; // minutos
	private Genero genero;
	private LocalDate fechaEstreno; // poner que sea yyyy-MM-dd

	public Pelicula(String titulo, String director, int duracion, Genero genero, LocalDate fechaEstreno) {
		super();
		this.titulo = titulo;
		this.director = director;
		this.duracion = duracion;
		this.genero = genero;
		this.fechaEstreno = fechaEstreno;
	}

	// el del mismo dia
	public Pelicula(String titulo, String director, int duracion, Genero genero) {
		super();
		this.titulo = titulo;
		this.director = director;
		this.duracion = duracion;
		this.genero = genero;
		this.fechaEstreno = LocalDate.now();
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) throws ErrorDuracion {
		this.duracion = duracion;
	}
	
	@Override
	public String toString() {
		return "título=" + titulo + "**duración=" + duracion + "**género=" + genero + "**director=" + director
				+ "**fecha de estreno=" + fechaEstreno;
	}
	
		

}
=======
package clases;

import java.time.LocalDate;
import java.util.Comparator;

import enumerados.Genero;
import excepciones.ErrorDuracion;
import interfaces.Visionable;

public abstract class Pelicula implements Visionable, Comparable<Pelicula> {

	private String titulo, director;
	private int duracion; // minutos
	private Genero genero;
	private LocalDate fechaEstreno; // poner que sea yyyy-MM-dd

	public Pelicula(String titulo, String director, int duracion, Genero genero, LocalDate fechaEstreno) {
		super();
		this.titulo = titulo;
		this.director = director;
		this.duracion = duracion;
		this.genero = genero;
		this.fechaEstreno = fechaEstreno;
	}

	// el del mismo dia
	public Pelicula(String titulo, String director, int duracion, Genero genero) {
		super();
		this.titulo = titulo;
		this.director = director;
		this.duracion = duracion;
		this.genero = genero;
		this.fechaEstreno = LocalDate.now();
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) throws ErrorDuracion {
		this.duracion = duracion;
	}
	
	@Override
	public String toString() {
		return "título=" + titulo + "**duración=" + duracion + "**género=" + genero + "**director=" + director
				+ "**fecha de estreno=" + fechaEstreno;
	}
	
		

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
