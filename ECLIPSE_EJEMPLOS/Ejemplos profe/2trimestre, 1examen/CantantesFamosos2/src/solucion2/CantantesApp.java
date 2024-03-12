<<<<<<< HEAD
package solucion2;

import java.util.Scanner;

public class CantantesApp {
	public static final int MAX_OPC = 5;

	static int menu(int tope_op, Scanner sc) {
		int opcion_menu;

		System.out.println();
		System.out.println("\t1. Introducir nuevo Cantante.");
		System.out.println("\t2. Borrar Cantante.");
		System.out.println("\t3. Mostrar disco mas vendido de cada cantante.");
		System.out.println("\t4. Mostrar los cantantes y sus discos.");
		System.out.println("\t5. Salir.");
		do {
			System.out.print("\n\n\tElija opcion:");
			opcion_menu = Integer.parseInt(sc.nextLine());
		} while (opcion_menu < 1 || opcion_menu > tope_op);

		return opcion_menu;
	}

	public static void main(String[] args) {
		int opcion = 0;
		CantanteFamoso unCantante;
		ListaCantantes listaCantantes = new ListaCantantes();
		Scanner sc = new Scanner(System.in);

		while (opcion != MAX_OPC) {
			opcion = menu(MAX_OPC, sc);
			switch (opcion) {
			case 1:
				unCantante = Lector.rellenarCantante(sc);
				listaCantantes.guardarCantante(unCantante);
				break;
			case 2:
				if (listaCantantes.devTamLista() == 0) {
					System.out.println("No hay cantantes en la lista.");
				} else {
					System.out.println("Introduce nombre del cantante a borrar.");
					listaCantantes.eliminarCantante(sc.nextLine());
				}

				break;
			case 3:
				if (listaCantantes.devTamLista() == 0) {
					System.out.println("No hay cantantes en la lista.");
				} else
					listaCantantes.listarDiscoMasVendido();

				break;
			case 4:
				if (listaCantantes.devTamLista() == 0) {
					System.out.println("No hay cantantes en la lista.");
				} else
					listaCantantes.listarCantantesDiscos();

				break;
			}
		}
		sc.close();
	}

=======
package solucion2;

import java.util.Scanner;

public class CantantesApp {
	public static final int MAX_OPC = 5;

	static int menu(int tope_op, Scanner sc) {
		int opcion_menu;

		System.out.println();
		System.out.println("\t1. Introducir nuevo Cantante.");
		System.out.println("\t2. Borrar Cantante.");
		System.out.println("\t3. Mostrar disco mas vendido de cada cantante.");
		System.out.println("\t4. Mostrar los cantantes y sus discos.");
		System.out.println("\t5. Salir.");
		do {
			System.out.print("\n\n\tElija opcion:");
			opcion_menu = Integer.parseInt(sc.nextLine());
		} while (opcion_menu < 1 || opcion_menu > tope_op);

		return opcion_menu;
	}

	public static void main(String[] args) {
		int opcion = 0;
		CantanteFamoso unCantante;
		ListaCantantes listaCantantes = new ListaCantantes();
		Scanner sc = new Scanner(System.in);

		while (opcion != MAX_OPC) {
			opcion = menu(MAX_OPC, sc);
			switch (opcion) {
			case 1:
				unCantante = Lector.rellenarCantante(sc);
				listaCantantes.guardarCantante(unCantante);
				break;
			case 2:
				if (listaCantantes.devTamLista() == 0) {
					System.out.println("No hay cantantes en la lista.");
				} else {
					System.out.println("Introduce nombre del cantante a borrar.");
					listaCantantes.eliminarCantante(sc.nextLine());
				}

				break;
			case 3:
				if (listaCantantes.devTamLista() == 0) {
					System.out.println("No hay cantantes en la lista.");
				} else
					listaCantantes.listarDiscoMasVendido();

				break;
			case 4:
				if (listaCantantes.devTamLista() == 0) {
					System.out.println("No hay cantantes en la lista.");
				} else
					listaCantantes.listarCantantesDiscos();

				break;
			}
		}
		sc.close();
	}

>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
}