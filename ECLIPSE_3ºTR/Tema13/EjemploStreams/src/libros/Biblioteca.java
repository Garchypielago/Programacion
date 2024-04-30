package libros;

import java.util.Arrays;
import java.util.List;

public class Biblioteca {

	private List<Libro> libros;
	
	public Biblioteca() {
		generarDatos();
	}
	
	private void generarDatos() {
		libros = Arrays.asList(
				new Libro("Libro 1", "Autor 1", 10.0),
				new Libro("Libro 2", "Autor 2", 15.0),
				new Libro("Libro 3", "Autor 3", 50.99)
				);
	}
	
	public List<Libro> getLibros(){
		return this.libros;
	}
}
