package dgt;

import java.util.Scanner;

import lector.Lector;
import utilidades.*;

public class Principal_dgt {

	public static final int MAX_OP = 6;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menuOp;

		Conductores listaConductores = new Conductores();

		do {
			menuOp = menu(sc);

			switch (menuOp) {
			case 1:
				conductorNuevo(listaConductores, sc);
				break;
			case 2:
				muestraNueva(listaConductores, sc);
				break;
			case 3:
				mostrarDatosConductor(listaConductores, sc);
				break;
			case 4:
				mostrarMuestrasConductor(listaConductores, sc);
				break;
			case 5:
				mostrarConductores(listaConductores);
				break;
			default:
				System.out.println("Fin del programa.");
				break;
			}

		} while (menuOp != MAX_OP);

		sc.close();

	}

	private static int menu(Scanner sc) {
		int menuOp;

		System.out.println("1. Introducir un nuevo conductor.");
		System.out.println("2. Introducir una muestra.");
		System.out.println("3. Mostrar los datos de un conductor.");
		System.out.println("4. Mostrar las muestras de un conductor.");
		System.out.println("5. Mostrar los datos de todos los conductores.");
		System.out.println("6. Salir.");

		do {
			menuOp = Lector.leeInt(sc, "Elige una opcion:");
			System.out.println();
		} while (menuOp < 1 || menuOp > MAX_OP);

		return menuOp;
	}

	/**************************************************************************/
	/* conductorNuevo */
	/* Pide los datos para crear un conductor nuevo en la lista */
	/**************************************************************************/
	public static void conductorNuevo(Conductores lista, Scanner sc) {

		Conductor unConductor = CreacionObjetos.crearConductor(sc);
		if (unConductor != null) {
			lista.aniadirConductor(unConductor);
			System.out.println("Se ha añadido conductor.\n");
		} else
			System.out.println("No se ha podido crear conductor.\n");

	}

	/**************************************************************************/
	/* muestraNueva */
	/* Pide los datos para crear una muestra nueva y asignarla a un conductor */
	/**************************************************************************/
	public static void muestraNueva(Conductores lista, Scanner sc) {
		int posicion;
		if (Conductor.getNumCond() > 0) {
			lista.mostrarConductores();

			posicion = Lector.leeInt(sc, "¿A qué conductor pertenece la muestra (numero)?");

			if (lista.aniadirMuestra(posicion, sc))
				System.out.println("Se ha añadido muestra\n");
			else
				System.out.println("No se ha podido añadir la muestra\n");

		} else
			System.out.println("No hay conductores dados de alta.\n");
	}

	/**************************************************************************/
	/* mostrarDatosConductor */
	/* Muestra los datos de un conductor concreto */
	/**************************************************************************/
	public static void mostrarDatosConductor(Conductores lista, Scanner sc) {
		int posicion;
		if (Conductor.getNumCond() > 0) {
			//lista.mostrarConductores();
			System.out.println();
			posicion = Lector.leeInt(sc, "Indica de qué conductor quieres mostrar los datos (1.." + lista.numConductores()+")");		
			lista.mostrarConductor(posicion);
				
		} else
			System.out.println("No hay conductores dados de alta.\n");
	}

	/**************************************************************************/
	/* mostrarMuestrasConductor */
	/* Muestra los datos de un conductor con sus muestras */
	/**************************************************************************/
	public static void mostrarMuestrasConductor(Conductores lista, Scanner sc) {
		int posicion;
		if (Conductor.getNumCond() > 0) {
			lista.mostrarConductores();
			posicion = Lector.leeInt(sc, "Indica el codigo del conductor del que quieres mostrar las muestras:");
			lista.mostrarMuestras(posicion);
		} else
			System.out.println("No hay conductores dados de alta.\n");
	}

	/**************************************************************************/
	/* mostrarConductores */
	/* Muestra los datos de todos los conductores */
	/**************************************************************************/

	public static void mostrarConductores(Conductores lista) {
		if (Conductor.getNumCond() > 0)
			lista.mostrarConductoresMuestras();
		else
			System.out.println("No hay conductores dados de alta.\n");
	}
}
