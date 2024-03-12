<<<<<<< HEAD
package clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SalaProyeccion {
	
	private String nombre;
	private ArrayList<Pelicula> cartelera;
	
	public SalaProyeccion(String nombre) {
		super();
		this.nombre = nombre;
		cartelera= new ArrayList<Pelicula>();
	}
	
	public void agregarPelicula(Pelicula p) {
		cartelera.add(p);
	}
	
	public String toString() {
		String Cartelera="\nCartelera de cines cinesa:";
		for(Pelicula p : cartelera) {
			Cartelera += ("\n" + p.toString());
		}
		return Cartelera;
	}
	
	public void mostrarPeliculas() {
		
		for(Pelicula p : cartelera) {
			System.out.println(p.Visionar());
		}
		
	}

	
	
}
=======
package clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SalaProyeccion {
	
	private String nombre;
	private ArrayList<Pelicula> cartelera;
	
	public SalaProyeccion(String nombre) {
		super();
		this.nombre = nombre;
		cartelera= new ArrayList<Pelicula>();
	}
	
	public void agregarPelicula(Pelicula p) {
		cartelera.add(p);
	}
	
	public String toString() {
		String Cartelera="\nCartelera de cines cinesa:";
		for(Pelicula p : cartelera) {
			Cartelera += ("\n" + p.toString());
		}
		return Cartelera;
	}
	
	public void mostrarPeliculas() {
		
		for(Pelicula p : cartelera) {
			System.out.println(p.Visionar());
		}
		
	}

	
	
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
