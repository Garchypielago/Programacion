package practicaLinkedlist;

import java.util.*;

class MenuApp2 {

	public static final int MAX_OPC = 6;

	static int menu(int tope_op, Scanner sc) {
		int opcion_menu;

		System.out.println();
		System.out.println("\t1. Listar personas");
		System.out.println("\t2. Encolar personas");
		System.out.println("\t3. Desencolar personas");
		System.out.println("\t4. Elimina persona determinada");
		System.out.println("\t5. Eliminar todos");
		System.out.println("\t6. Listar personas alfabéticamente");
		System.out.println("\t7. Salir");
		do {
			System.out.print("\n\n\tElija opcion:");
			opcion_menu = Integer.parseInt(sc.nextLine());
		} while (opcion_menu < 1 || opcion_menu > tope_op);

		return opcion_menu;
	}

	public static void main(String args[]) {

		int opcion = 0;

		Scanner sc = new Scanner(System.in);

		LinkedList<Persona> lista = new LinkedList<Persona>();

		while (opcion != MAX_OPC) {
			opcion = menu(MAX_OPC, sc);
			switch (opcion) {
			case 1:
				listar(lista);
				break;
			case 2:
				encolar(sc, lista);
				break;
			case 3:
				desencolar(lista);
				break;
			case 4:
				eliminar(sc, lista);
				break;
			case 5:
				eliminarTodos(lista);
				break;
			case 6:
				;
				break;
			case 7:
				System.out.println("\nPrograma finalizado.");
				;
				break;
			}
		}
		sc.close();
	}

	public static void listar(LinkedList<Persona> lista) {
		System.out.println("Lista de personas:");
		for (Persona p : lista) {
			System.out.println(p.toString());
		}
	}

	public static void encolar(Scanner sc, LinkedList<Persona> lista) {
		String nombre;
		int edad;

		System.out.println("Escribe su nombre");
		nombre = sc.nextLine();
		System.out.println("Escribe su edad");
		edad = Integer.parseInt(sc.nextLine());

		lista.add(new Persona(nombre, edad));
	}

	public static void desencolar(LinkedList<Persona> lista) {
		lista.pop();
	}

	public static void eliminar(Scanner sc, LinkedList<Persona> lista) {
		String nombre;
		int edad, index;
		Persona persona;
		System.out.println("Escribe su nombre");
		nombre = sc.nextLine();
		System.out.println("Escribe su edad");
		edad = Integer.parseInt(sc.nextLine());
		persona = new Persona(nombre, edad);
		if (lista.contains(persona)) {
			lista.remove(persona);
			System.out.println("La persona de nombre " + nombre + ",y edad " + edad + ", se ha eliminado.");
		} else {
			System.out.println("No existe esa persona");
		}
	}

	public static void eliminarTodos(LinkedList<Persona> lista) {
		ListIterator<Persona> lit = lista.listIterator();

		while (lit.hasNext()) {
			lit.next();
			lit.remove();
		}

		System.out.println("Lista borrada");
	}
	
	public static void alfabeticamente(LinkedList<Persona> lista) {
		System.out.println("Lista de personas alfabeticamente:");
		LinkedList<Persona> a = (LinkedList<Persona>) lista.clone();
		Collections.sort(a);
		for (Persona p : a) {
			System.out.println(p.toString());
		}
		
	}

}
