<<<<<<< HEAD
package practicaHasSet;

import java.util.*;

public class Ej_02 {

	public static final int MAX_OPC = 7;

	static int menu(int tope_op, Scanner sc) {
		int opcion_menu;

		System.out.println();
		System.out.println("\t1. Introdcir empleado");
		System.out.println("\t2. Listar empleados");
		System.out.println("\t3. Eliminar empleado");
		System.out.println("\t4. Borrar todos");
		System.out.println("\t5. Mostrar numero de empleados");
		System.out.println("\t6. Buscar empleado");
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
		
		Set<Ej_02_Empleado> hset = new HashSet<Ej_02_Empleado>();
		hset.add(new Ej_02_Empleado("Pepe", 2000));
		hset.add(new Ej_02_Empleado("Juan", 4000));

		while (opcion != MAX_OPC) {
			opcion = menu(MAX_OPC, sc);
			switch (opcion) {
			case 1:
				String newnombre;
				System.out.println("Escriba nombre del empleado:");
				newnombre=sc.nextLine();
				if (hset.contains(new Ej_02_Empleado(newnombre, 0))) {
					System.out.println("Ya existe ese empleado");
					break;
				}
				System.out.println("Escriba su sueldo:");
				hset.add(new Ej_02_Empleado(newnombre, Float.parseFloat(sc.nextLine())));
				break;
			case 2:
				System.out.println(hset);
				break;
			case 3:
				System.out.println("Escriba el nombre del empleado:");
				hset.remove(new Ej_02_Empleado(sc.nextLine(), 0));
				break;
			case 4:
				hset.clear();
				break;
			case 5:
				System.out.println("Número de empleados:" + hset.size());
				break;
			case 6:
				System.out.println("Escriba nombre y sueldo del empleado:");
				System.out.println(hset.contains(new Ej_02_Empleado(sc.nextLine(), 0))? "Empleado encontrado" : "No existe"); 
				break;
			case 7:
				System.out.println("Fin de programa");
				break;
			}
		}
		sc.close();
	}

}
=======
package practicaHasSet;

import java.util.*;

public class Ej_02 {

	public static final int MAX_OPC = 7;

	static int menu(int tope_op, Scanner sc) {
		int opcion_menu;

		System.out.println();
		System.out.println("\t1. Introdcir empleado");
		System.out.println("\t2. Listar empleados");
		System.out.println("\t3. Eliminar empleado");
		System.out.println("\t4. Borrar todos");
		System.out.println("\t5. Mostrar numero de empleados");
		System.out.println("\t6. Buscar empleado");
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
		
		Set<Ej_02_Empleado> hset = new HashSet<Ej_02_Empleado>();
		hset.add(new Ej_02_Empleado("Pepe", 2000));
		hset.add(new Ej_02_Empleado("Juan", 4000));

		while (opcion != MAX_OPC) {
			opcion = menu(MAX_OPC, sc);
			switch (opcion) {
			case 1:
				String newnombre;
				System.out.println("Escriba nombre del empleado:");
				newnombre=sc.nextLine();
				if (hset.contains(new Ej_02_Empleado(newnombre, 0))) {
					System.out.println("Ya existe ese empleado");
					break;
				}
				System.out.println("Escriba su sueldo:");
				hset.add(new Ej_02_Empleado(newnombre, Float.parseFloat(sc.nextLine())));
				break;
			case 2:
				System.out.println(hset);
				break;
			case 3:
				System.out.println("Escriba el nombre del empleado:");
				hset.remove(new Ej_02_Empleado(sc.nextLine(), 0));
				break;
			case 4:
				hset.clear();
				break;
			case 5:
				System.out.println("Número de empleados:" + hset.size());
				break;
			case 6:
				System.out.println("Escriba nombre y sueldo del empleado:");
				System.out.println(hset.contains(new Ej_02_Empleado(sc.nextLine(), 0))? "Empleado encontrado" : "No existe"); 
				break;
			case 7:
				System.out.println("Fin de programa");
				break;
			}
		}
		sc.close();
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
