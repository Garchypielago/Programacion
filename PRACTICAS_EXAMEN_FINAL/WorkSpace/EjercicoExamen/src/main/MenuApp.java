package main;
import java.util.*;

class MenuApp {

	public static final int MAX_OPC = 6;

	static int menu(int tope_op, Scanner sc) {
		int opcion_menu;

		System.out.println();
		System.out.println("\t1. Introducir vehículo en el fichero");
		System.out.println("\t2. Mostrar vehículos del fichero");
		System.out.println("\t3. Volcar vehículos en la base de datos");
		System.out.println("\t4. Mostrar vehículos de la base de datos");
		System.out.println("\t5. Borrar todos los vehículos");
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

		while (opcion != MAX_OPC) {
			opcion = menu(MAX_OPC, sc);
			switch (opcion) {
			case 1: //usuario -> datos vehiculo. pasa al .dat . No sobreescribir el .dat .
				break;
			case 2: //mostrar los datos del .dat .
				break;
			case 3: //pasar del .dat a la bbdd. se vuelca el fich enteropor lo qeu se repiten datos,
					// no mostar excepcion si no mensaje de y ainsertado
				break;
			case 4: //mostrar bbdd 
				break;
			case 5: // borrar fichero y eliminar datos de la bbdd
				break;
			case 6:
				System.out.println("Fin de programa.");
				break;
			}
		}
		sc.close();
	}

}