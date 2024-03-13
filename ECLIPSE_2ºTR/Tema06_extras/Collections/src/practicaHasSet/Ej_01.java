package practicaHasSet;

import java.util.*;

public class Ej_01 {

	public static final int MAX_OPC = 7;

	static int menu(int tope_op, Scanner sc) {
		int opcion_menu;

		System.out.println();
		System.out.println("\t1. Introdcir palabra");
		System.out.println("\t2. Listar palabras");
		System.out.println("\t3. Eliminar palabra");
		System.out.println("\t4. Borrar todas");
		System.out.println("\t5. Mostrar tamaño");
		System.out.println("\t6. Buscar palabra");
		System.out.println("\t7. Salir.");
		do {
			System.out.print("\n\n\tElija opcion:");
			opcion_menu = Integer.parseInt(sc.nextLine());
		} while (opcion_menu < 1 || opcion_menu > tope_op);

		return opcion_menu;
	}

	public static void main(String args[]) {

		int opcion = 0;

		Scanner sc = new Scanner(System.in);
		
		Set<String> hset = new HashSet<String>();

		while (opcion != MAX_OPC) {
			opcion = menu(MAX_OPC, sc);
			switch (opcion) {
			case 1:
				hset.add(sc.nextLine());
				break;
			case 2:
				System.out.println(hset);
				break;
			case 3:
				hset.remove(sc.nextLine());
				break;
			case 4:
				hset.clear();
				break;
			case 5:
				System.out.println(hset.size());
				break;
			case 6:
				System.out.println(hset.contains(sc.nextLine())); 
				break;
			case 7:
				System.out.println("Fin de programa");
				break;
			}
		}
		sc.close();
	}

}
