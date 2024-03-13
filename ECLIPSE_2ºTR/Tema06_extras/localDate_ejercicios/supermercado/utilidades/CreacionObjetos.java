package utilidades;

import productos.*;
import supermercado.Supermercado;

import java.time.LocalDate;
import java.util.*;
import excepciones.*;
import utilidades.*;

public class CreacionObjetos {

	private static Scanner sc = new Scanner(System.in);

	public static Alimento crearAlimento(Supermercado sp) {
		double precio = 0;
		String nombre = "", codigo = "";
		LocalDate caducidad = null;
		boolean crea = false;

		while (!crea) {
			try {
				nombre = Lector.leeCadena(sc, "Cual es el nombre de tu producto:");
				precio = Lector.leeFloat(sc, "Cual es su precio");
				codigo = Lector.leeCadena(sc, "Cual es codigo:");
				sp.codigoDuplicado(codigo);
				Validaciones.codigoFormato(codigo);
				System.out.println("Ahora escribe la caducidad");
				caducidad = LocalDate.of(Lector.leeInt(sc, "Año de caducidad"), Lector.leeInt(sc, "Mes de caducidad"),
						Lector.leeInt(sc, "Dia de caducidad"));
				Validaciones.fechaValida(caducidad);
				crea = true;
			} catch (CodigoIncorrectoException CIE) {
				System.out.println(CIE.getMessage());
			} catch (FechaNoValidaException FNVE) {
				System.out.println(FNVE.getMessage());
			}
		}

		return new Alimento(precio, nombre, codigo, caducidad);
	}
	
	public static Alimento crearTextil(Supermercado sp) {
		double precio = 0;
		String nombre = "", codigo = "", color="";
		boolean crea = false;

		while (!crea) {
			try {
				nombre = Lector.leeCadena(sc, "Cual es el nombre de tu producto:");
				precio = Lector.leeFloat(sc, "Cual es su precio:");
				codigo = Lector.leeCadena(sc, "Cual es codigo:");
				sp.codigoDuplicado(codigo);
				Validaciones.codigoFormato(codigo);
				color=Lector.leeCadena(sc, "Cual es el color de tu producto:");
				crea = true;
			} catch (CodigoIncorrectoException CIE) {
				System.out.println(CIE.getMessage());
			}
		}

		return new Alimento(precio, nombre, codigo, color);
	}
	
	public static Alimento crearDrogue(Supermercado sp) {
		double precio = 0;
		String nombre = "", codigo = "", marca="";
		boolean crea = false;

		while (!crea) {
			try {
				nombre = Lector.leeCadena(sc, "Cual es el nombre de tu producto:");
				precio = Lector.leeFloat(sc, "Cual es su precio:");
				codigo = Lector.leeCadena(sc, "Cual es codigo:");
				sp.codigoDuplicado(codigo);
				Validaciones.codigoFormato(codigo);
				marca=Lector.leeCadena(sc, "Cual es la marca de tu producto:");
				crea = true;
			} catch (CodigoIncorrectoException CIE) {
				System.out.println(CIE.getMessage());
			}
		}

		return new Alimento(precio, nombre, codigo, marca);
	}

}
