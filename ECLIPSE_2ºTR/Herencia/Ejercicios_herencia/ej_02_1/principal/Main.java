package principal;

import objetosLista.Viviendas;
import objetoPadre.Vivienda;
import objetosHijo.*;
import java.util.*;

class Main {

	public static final int MAX_OPC = 8;

	static int menu(int tope_op, Scanner sc) {
		int opcion_menu;

		System.out.println();
		System.out.println("1. Insertar vivienda");
		System.out.println("2. Insertar chalet");
		System.out.println("3. Insertar palacio");
		System.out.println("4. Mostrar viviendas");
		System.out.println("5. Mostrar chalets");
		System.out.println("6. Mostrar palacios");
		System.out.println("7. Borrar vivienda");
		System.out.println("8. Salir.");
		do {
			System.out.print("\nElija opcion:");
			opcion_menu = Integer.parseInt(sc.nextLine());
		} while (opcion_menu < 1 || opcion_menu > tope_op);

		return opcion_menu;
	}

	public static void main(String args[]) {

		int opcion = 0;

		Scanner sc = new Scanner(System.in);
		
		Viviendas vs = new Viviendas();

		while (opcion != MAX_OPC) {
			opcion = menu(MAX_OPC, sc);
			switch (opcion) {
			case 1:
				vs.agregarVivienda(new Vivienda(100.5,"vivienda",1));
				break;
			case 2:
				vs.agregarChalet(new Chalet("chalet",2, true));
				break;
			case 3:
				vs.agregarPalacio(new Palacio(100.5,"palacio",3, 4));
				break;
			case 4:
				vs.mostrarViviendas();
				break;
			case 5:
				vs.mostrarChalet();
				break;
			case 6:
				vs.mostrarPalacios();
				break;
			case 7:
				vs.borrarVivienda("vivienda", 1);
				break;
			case 8:
				System.out.println("\nFin del programa.");
				break;
			}
		}
		sc.close();
	}

}
