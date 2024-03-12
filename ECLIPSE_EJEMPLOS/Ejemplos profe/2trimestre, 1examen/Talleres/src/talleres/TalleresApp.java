package talleres;

import java.util.*;

public class TalleresApp {

	public static final int MAX_OPC = 5;

	// MENU
	static int menu(int tope_op, Scanner sc) {
		int opcion_menu;

		System.out.println();
		System.out.println("\t1. Crear elemento talleres (hueco para 2 talleres).");
		System.out.println("\t2. Introducir un taller.");
		System.out.println("\t3. Dar de alta coche.");
		System.out.println("\t4. Imprimir los talleres y sus coches.");
		System.out.println("\t5. Salir.");
		do {
			System.out.print("\n\n\tElija opcion:");
			opcion_menu = Integer.parseInt(sc.nextLine());
		} while (opcion_menu < 1 || opcion_menu > tope_op);

		return opcion_menu;
	}

	// PROGRAMA PRINCIPAL
	public static void main(String args[]) {
		int opcion = 0;
		Scanner sc = new Scanner(System.in);
		Talleres gTalleres = null;

		while (opcion != MAX_OPC) {
			opcion = menu(MAX_OPC, sc);
			switch (opcion) {
			case 1:
				// Crear array con dos talleres
				gTalleres = crearArrayTalleres(gTalleres);

				break;
			case 2:
				// Introducir un taller
				introducirTaller(gTalleres, sc);

				break;
			case 3:
				// Dar de alta coche
				darAltaCoche(gTalleres, sc);

				break;
			case 4:
				// Imprimir los talleres
				imprimirTalleres(gTalleres);
				break;
			}
		}

		sc.close();
	}

	private static Talleres crearArrayTalleres(Talleres talleres) {

		if (talleres != null)
			System.out.println("\nYa existe el elemento talleres.");
		else {
			talleres = new Talleres();
			System.out.println("\nElemento talleres creado correctamente.");
		}
		return talleres;
	}

	private static void introducirTaller(Talleres talleres, Scanner sc) {
		Taller unTaller;
		if (talleres != null) {
			if (talleres.devNumTalleres() < Talleres.NTALLERES) {
				unTaller = CreacionObjetos.rellenarTaller(sc);
				if (unTaller != null)
					talleres.introducirTaller(unTaller);
				else
					System.out.print("No se ha podido crear el taller.\n");
			} else
				System.out.print("No se pueden introducir mas talleres.\n");
		} else
			System.out.print("Tiene que crear primero un elemento para guardar los talleres (OPCION 1).\n");
	}

	private static void darAltaCoche(Talleres talleres, Scanner sc) {
		Coche unCoche;
		if (talleres != null && talleres.devNumTalleres() == Talleres.NTALLERES) {
			System.out.print("En qué taller quiere dar de alta el coche (1 o 2): ");
			int idTaller = Integer.parseInt(sc.nextLine());
			if (idTaller == 1 || idTaller == 2) {
				unCoche = CreacionObjetos.rellenarCoche(sc);
				//
				talleres.introducirCoche(idTaller, unCoche);
			} else
				System.out.println("no es un taller válido");
		} else
			System.out.println(
					"Tiene que rellenar los " + Talleres.NTALLERES + " talleres para poder introducir coches.");
	}

	private static void imprimirTalleres(Talleres talleres) {
		if (talleres != null && talleres.devNumTalleres() == Talleres.NTALLERES)
			System.out.println(talleres);
		else
			System.out.println("Tiene que introducir todos los datos para que sea posible la impresion.");
	}
}
