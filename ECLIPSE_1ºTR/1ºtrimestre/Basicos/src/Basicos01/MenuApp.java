<<<<<<< HEAD
package Basicos01;

import java.util.*;

public class MenuApp {

	public static void main(String args[]) {
		int opcion = 0;

		Scanner sc = new Scanner(System.in);

		while (opcion != MAX_OPC) {
			opcion = menu(MAX_OPC, sc);
//		while (opcion != 3) {
//			opcion = menu(3, sc);
			switch (opcion) {
			case 1:
				System.out.println("Primera opcion");
				break;
			case 2:
				System.out.println("Segunda opcion");
				break;
			}
		}
		sc.close();
	}

	public static final int MAX_OPC = 3;

	static int menu(int tope_op, Scanner sc) {
		int opcion_menu;

		System.out.println();
		System.out.println("\t1. Primera opcion");
		System.out.println("\t2. Segunda opcion");
		System.out.println("\t3. Salir.");
		do {
			System.out.print("\n\n\tElija opcion:");
			opcion_menu = Integer.parseInt(sc.nextLine());
		} while (opcion_menu < 1 || opcion_menu > tope_op);

		return opcion_menu;
	}

}
=======
package Basicos01;

import java.util.*;

public class MenuApp {

	public static void main(String args[]) {
		int opcion = 0;

		Scanner sc = new Scanner(System.in);

		while (opcion != MAX_OPC) {
			opcion = menu(MAX_OPC, sc);
//		while (opcion != 3) {
//			opcion = menu(3, sc);
			switch (opcion) {
			case 1:
				System.out.println("Primera opcion");
				break;
			case 2:
				System.out.println("Segunda opcion");
				break;
			}
		}
		sc.close();
	}

	public static final int MAX_OPC = 3;

	static int menu(int tope_op, Scanner sc) {
		int opcion_menu;

		System.out.println();
		System.out.println("\t1. Primera opcion");
		System.out.println("\t2. Segunda opcion");
		System.out.println("\t3. Salir.");
		do {
			System.out.print("\n\n\tElija opcion:");
			opcion_menu = Integer.parseInt(sc.nextLine());
		} while (opcion_menu < 1 || opcion_menu > tope_op);

		return opcion_menu;
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
