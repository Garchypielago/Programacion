package practicaTreeset;

import java.util.*;

public class Ej_02 {

	public static final int MAX_OPC = 6;

	static int menu(int tope_op, Scanner sc) {
		int opcion_menu;

		System.out.println();
		System.out.println("\t1. Introdcir jugador");
		System.out.println("\t2. Listar empleados");
		System.out.println("\t3. Eliminar jugador");
		System.out.println("\t4. Mostrar todos los jugadores con nombre posterior al de un jugador dado");
		System.out.println("\t5. Borrar todos");
		System.out.println("\t6. Salir.");
		do {
			System.out.print("\n\n\tElija opcion:");
			opcion_menu = Integer.parseInt(sc.nextLine());
		} while (opcion_menu < 1 || opcion_menu > tope_op);

		return opcion_menu;
	}

	public static void main(String args[]) {

		int opcion = 0;

		Scanner sc = new Scanner(System.in);
		
		TreeSet<Ej_02_Jugador> tset = new TreeSet<Ej_02_Jugador>();
		tset.add(new Ej_02_Jugador("Pepe", 170));
		tset.add(new Ej_02_Jugador("Juan", 180));
		tset.add(new Ej_02_Jugador("Alex", 170));
		tset.add(new Ej_02_Jugador("Zaira", 180));

		while (opcion != MAX_OPC) {
			opcion = menu(MAX_OPC, sc);
			switch (opcion) {
			case 1:
				String newnombre;
				System.out.println("Escriba nombre del jugador:");
				newnombre=sc.nextLine();
				if (tset.contains(new Ej_02_Jugador(newnombre, 0))) {
					System.out.println("Ya existe ese jugador");
					break;
				}
				System.out.println("Escriba su estatura:");
				tset.add(new Ej_02_Jugador(newnombre, Integer.parseInt(sc.nextLine())));
				break;
			case 2:
				System.out.println(tset);
				break;
			case 3:
				System.out.println("Escriba el nombre del jugador:");
				tset.remove(new Ej_02_Jugador(sc.nextLine(), 0));
				break;
			case 4:
				System.out.println("Escriba nombre del jugador:");
				SortedSet<Ej_02_Jugador> tsetpeq = tset.tailSet(new Ej_02_Jugador(sc.nextLine(), 0), false); //si pones flase no parece el mismo
				System.out.println(tsetpeq);
				break;
			case 5:
				tset.clear();
				break;
			case 6:
				System.out.println("Fin de programa");
				break;
			}
		}
		sc.close();
	}

}
