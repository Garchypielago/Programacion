<<<<<<< HEAD
package dgt;

import java.util.Scanner;

import utilidades.*;

public class Principal_dgt {

	public static final int MAX_OP = 6;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menuOp;
		System.out.println("Introduce la cantidad de conductores:");
		int cantidadConductores = Integer.parseInt(sc.nextLine());

		Conductores listaConductores = new Conductores(cantidadConductores);

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
			System.out.println("Elige una opcion:");
			menuOp = Integer.parseInt(sc.nextLine());
			System.out.println();
		} while (menuOp < 1 || menuOp > MAX_OP);

		return menuOp;
	}

	public static void conductorNuevo(Conductores lista, Scanner sc) {
		if (Conductor.getNumCond() < lista.maxConductores) {
			Conductor unConductor = CreacionObjetos.crearConductor(sc);
			if (unConductor != null) {
				lista.aniadirConductor(unConductor);
				System.out.println("Se ha añadido conductor.\n");
			} else
				System.out.println("No se ha podido crear conductor.\n");
		} else
			System.out.println("No hay espacio para crear más conductores.\n");
	}

	public static void muestraNueva(Conductores lista, Scanner sc) {
		int posicion;
		if (Conductor.getNumCond() > 0) {
			lista.mostrarConductores();
			System.out.println("¿A qué conductor pertenece la muestra (código)?");

			posicion = Integer.parseInt(sc.nextLine());
			if (posicion >= 1 && posicion <= Conductor.getNumCond()) {

				if (lista.aniadirMuestra(posicion, sc))
					System.out.println("Se ha añadido muestra");

			} else
				System.out.println("El conductor no existe.\n");
		} else
			System.out.println("No hay conductores dados de alta.");
	}

	public static void mostrarDatosConductor(Conductores lista, Scanner sc) {
		int posicion;
		if (Conductor.getNumCond() > 0) {
			System.out.println("Indica de qué conductor quieres mostrar los datos:");
			posicion = Integer.parseInt(sc.nextLine());
			if (!lista.mostrarConductor(posicion))
				System.out.println("El conductor no existe.\n");
		} else
			System.out.println("No hay conductores dados de alta.");
	}

	public static void mostrarMuestrasConductor(Conductores lista, Scanner sc) {
		int posicion;
		if (Conductor.getNumCond() > 0) {
			lista.mostrarConductores();
			System.out.println("Indica el codigo del conductor del que quieres mostrar las muestras:");

			posicion = Integer.parseInt(sc.nextLine());
			if (!lista.mostrarMuestras(posicion))
				System.out.println("El conductor no existe.\n");
		} else
			System.out.println("No hay conductores dados de alta.");
	}

	public static void mostrarConductores(Conductores lista) {
		if (Conductor.getNumCond() > 0)
			lista.mostrarConductores();
		else
			System.out.println("No hay conductores dados de alta.");
	}
}
=======
package dgt;

import java.util.Scanner;

import utilidades.*;

public class Principal_dgt {

	public static final int MAX_OP = 6;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menuOp;
		System.out.println("Introduce la cantidad de conductores:");
		int cantidadConductores = Integer.parseInt(sc.nextLine());

		Conductores listaConductores = new Conductores(cantidadConductores);

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
			System.out.println("Elige una opcion:");
			menuOp = Integer.parseInt(sc.nextLine());
			System.out.println();
		} while (menuOp < 1 || menuOp > MAX_OP);

		return menuOp;
	}

	public static void conductorNuevo(Conductores lista, Scanner sc) {
		if (Conductor.getNumCond() < lista.maxConductores) {
			Conductor unConductor = CreacionObjetos.crearConductor(sc);
			if (unConductor != null) {
				lista.aniadirConductor(unConductor);
				System.out.println("Se ha añadido conductor.\n");
			} else
				System.out.println("No se ha podido crear conductor.\n");
		} else
			System.out.println("No hay espacio para crear más conductores.\n");
	}

	public static void muestraNueva(Conductores lista, Scanner sc) {
		int posicion;
		if (Conductor.getNumCond() > 0) {
			lista.mostrarConductores();
			System.out.println("¿A qué conductor pertenece la muestra (código)?");

			posicion = Integer.parseInt(sc.nextLine());
			if (posicion >= 1 && posicion <= Conductor.getNumCond()) {

				if (lista.aniadirMuestra(posicion, sc))
					System.out.println("Se ha añadido muestra");

			} else
				System.out.println("El conductor no existe.\n");
		} else
			System.out.println("No hay conductores dados de alta.");
	}

	public static void mostrarDatosConductor(Conductores lista, Scanner sc) {
		int posicion;
		if (Conductor.getNumCond() > 0) {
			System.out.println("Indica de qué conductor quieres mostrar los datos:");
			posicion = Integer.parseInt(sc.nextLine());
			if (!lista.mostrarConductor(posicion))
				System.out.println("El conductor no existe.\n");
		} else
			System.out.println("No hay conductores dados de alta.");
	}

	public static void mostrarMuestrasConductor(Conductores lista, Scanner sc) {
		int posicion;
		if (Conductor.getNumCond() > 0) {
			lista.mostrarConductores();
			System.out.println("Indica el codigo del conductor del que quieres mostrar las muestras:");

			posicion = Integer.parseInt(sc.nextLine());
			if (!lista.mostrarMuestras(posicion))
				System.out.println("El conductor no existe.\n");
		} else
			System.out.println("No hay conductores dados de alta.");
	}

	public static void mostrarConductores(Conductores lista) {
		if (Conductor.getNumCond() > 0)
			lista.mostrarConductores();
		else
			System.out.println("No hay conductores dados de alta.");
	}
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
