package principal;

import java.time.LocalDate;
import java.util.Scanner;

import clases.*;
import enumerados.*;
import utilidades.CrearObjetos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SalaProyeccion cinesa = new SalaProyeccion("Cinesa");
		
		cinesa.agregarPelicula(new Largometraje("Madame Webb", "S.J. Clarkson", 116, Genero.THRILLER, LocalDate.of(2024, 12, 03)));
		cinesa.agregarPelicula(new Cortometraje("Bao", "Domee Shi", 7, Genero.DRAMATICO, LocalDate.of(2018, 9, 9)));
		
		//ej01
		cinesa.agregarPelicula(CrearObjetos.crearCortoUsuario(sc));
		cinesa.agregarPelicula(CrearObjetos.crearLargoUsuario(sc));
		//ej02
		cinesa.mostrarPeliculas();
		//ej03
		System.out.println(cinesa.toString());
		
		
		sc.close();
		
	}
}
