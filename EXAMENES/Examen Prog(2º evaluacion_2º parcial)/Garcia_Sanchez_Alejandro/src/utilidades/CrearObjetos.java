<<<<<<< HEAD
package utilidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import clases.*;
import enumerados.Genero;

public class CrearObjetos {

	// String titulo, String director, int duracion, Genero genero, LocalDate
	// fechaEstreno

	public static Cortometraje crearCortoUsuario(Scanner sc) {
		String titulo = "", director = "", fecha;
		int duracion = 0;
		Genero genero = null;
		LocalDate fechaEstreno = null;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		titulo = Lector.leeCadena(sc, "Introduzca titulo del cortometraje:");
		director = Lector.leeCadena(sc, "Introduzca director del cortometraje:");
		duracion = Lector.leeInt(sc, "Introduzca duracion del cortometraje:");
		genero = menuGenero(sc);
		fecha = Lector.leeCadena(sc, "Introduzca fecha de estreno del cortometraje (formato: " + "2012-12-12"
				+ " o intro para fecha de hoy):");
		if (fecha.equalsIgnoreCase(""))
			fechaEstreno = LocalDate.now();
		else
			fechaEstreno = LocalDate.parse(fecha, formatter);

		return new Cortometraje(titulo, director, duracion, genero, fechaEstreno);
	}

	public static Largometraje crearLargoUsuario(Scanner sc) {
		String titulo = "", director = "", fecha;
		int duracion = 0;
		Genero genero = null;
		LocalDate fechaEstreno = null;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		titulo = Lector.leeCadena(sc, "Introduzca titulo del largometraje:");
		director = Lector.leeCadena(sc, "Introduzca director del largometraje:");
		duracion = Lector.leeInt(sc, "Introduzca duracion del largometraje:");
		genero = menuGenero(sc);
		fecha = Lector.leeCadena(sc, "Introduzca fecha de estreno del largometraje (formato: " + "2012-12-12"
				+ " o intro para fecha de hoy):");
		if (fecha.equalsIgnoreCase(""))
			fechaEstreno = LocalDate.now();
		else
			fechaEstreno = LocalDate.parse(fecha, formatter);

		return new Largometraje(titulo, director, duracion, genero, fechaEstreno);
	}

	public static Genero menuGenero(Scanner sc) {
		boolean hecho = false;
		int eleccion;
		String nombre = "";

		while (!hecho) {
			for (Genero g : Genero.values()) {
				System.out.println(g.ordinal() + 1 + " " + g.name());
			}
			eleccion = Lector.leeInt(sc, "Introduzca duracion del cortometraje:");

			switch (eleccion) {
			case 1:
				nombre = Genero.DRAMATICO.name();
				hecho = true;
				break;
			case 2:
				nombre = Genero.COMEDIA.name();
				hecho = true;
				break;
			case 3:
				nombre = Genero.ROMANTICO.name();
				hecho = true;
				break;
			case 4:
				nombre = Genero.THRILLER.name();
				hecho = true;
				break;
			}
		}
		return Genero.valueOf(nombre);

	}

}
=======
package utilidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import clases.*;
import enumerados.Genero;

public class CrearObjetos {

	// String titulo, String director, int duracion, Genero genero, LocalDate
	// fechaEstreno

	public static Cortometraje crearCortoUsuario(Scanner sc) {
		String titulo = "", director = "", fecha;
		int duracion = 0;
		Genero genero = null;
		LocalDate fechaEstreno = null;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		titulo = Lector.leeCadena(sc, "Introduzca titulo del cortometraje:");
		director = Lector.leeCadena(sc, "Introduzca director del cortometraje:");
		duracion = Lector.leeInt(sc, "Introduzca duracion del cortometraje:");
		genero = menuGenero(sc);
		fecha = Lector.leeCadena(sc, "Introduzca fecha de estreno del cortometraje (formato: " + "2012-12-12"
				+ " o intro para fecha de hoy):");
		if (fecha.equalsIgnoreCase(""))
			fechaEstreno = LocalDate.now();
		else
			fechaEstreno = LocalDate.parse(fecha, formatter);

		return new Cortometraje(titulo, director, duracion, genero, fechaEstreno);
	}

	public static Largometraje crearLargoUsuario(Scanner sc) {
		String titulo = "", director = "", fecha;
		int duracion = 0;
		Genero genero = null;
		LocalDate fechaEstreno = null;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		titulo = Lector.leeCadena(sc, "Introduzca titulo del largometraje:");
		director = Lector.leeCadena(sc, "Introduzca director del largometraje:");
		duracion = Lector.leeInt(sc, "Introduzca duracion del largometraje:");
		genero = menuGenero(sc);
		fecha = Lector.leeCadena(sc, "Introduzca fecha de estreno del largometraje (formato: " + "2012-12-12"
				+ " o intro para fecha de hoy):");
		if (fecha.equalsIgnoreCase(""))
			fechaEstreno = LocalDate.now();
		else
			fechaEstreno = LocalDate.parse(fecha, formatter);

		return new Largometraje(titulo, director, duracion, genero, fechaEstreno);
	}

	public static Genero menuGenero(Scanner sc) {
		boolean hecho = false;
		int eleccion;
		String nombre = "";

		while (!hecho) {
			for (Genero g : Genero.values()) {
				System.out.println(g.ordinal() + 1 + " " + g.name());
			}
			eleccion = Lector.leeInt(sc, "Introduzca duracion del cortometraje:");

			switch (eleccion) {
			case 1:
				nombre = Genero.DRAMATICO.name();
				hecho = true;
				break;
			case 2:
				nombre = Genero.COMEDIA.name();
				hecho = true;
				break;
			case 3:
				nombre = Genero.ROMANTICO.name();
				hecho = true;
				break;
			case 4:
				nombre = Genero.THRILLER.name();
				hecho = true;
				break;
			}
		}
		return Genero.valueOf(nombre);

	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
