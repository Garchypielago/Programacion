<<<<<<< HEAD
package Ej_02;

import java.util.*;

import practicaMap.Alumno;

public class ManuApp {

	public static final int MAX_OPC = 9;

	static int menu(int tope_op, Scanner sc) {
		int opcion_menu;

		System.out.println("\n\tOpciones:");
		System.out.println("\t--------------------");
		System.out.println("\t1. Listar alumnos");
		System.out.println("\t2. Matricular alumno Ciclos");
		System.out.println("\t3. Matricular alumno Bachillerato");
		System.out.println("\t4. Calificar alumno");
		System.out.println("\t5. Listar alumnos de Ciclos aprobados");
		System.out.println("\t6. Listar alumnos de Bachillerato de ciencias");
		System.out.println("\t7. Eliminar alumno");
		System.out.println("\t8. Eliminar todos");
		System.out.println("\t9. Salir.");
		do {
			System.out.print("\n\n\tElija opcion:");
			opcion_menu = Integer.parseInt(sc.nextLine());
		} while (opcion_menu < 1 || opcion_menu > tope_op);

		return opcion_menu;
	}

	public static void main(String args[]) {

		int opcion = 0;

		Escuela DonPelayo = new Escuela();
		DonPelayo.script();
		
		Scanner sc = new Scanner(System.in);

		// Ciclo(String nombre, String apellidos, String familiaCiclo, String ciclo, int
		// pev, int sev, int tev)
		// Bachillerato(String nombre, String apellidos, Bachiller bach, int pev, int
		// sev, int tev)

		while (opcion != MAX_OPC) {
			opcion = menu(MAX_OPC, sc);
			switch (opcion) {
			case 1:
				DonPelayo.listar(sc);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				DonPelayo.alumnosCiclosAprobados();
				break;
			case 6:
				DonPelayo.alumnosBachilleratoCiencias();
				break;
			case 7:
				break;
			case 8:
				DonPelayo.eliminarTodos();
				break;
			case 9:
				System.out.println("Fin de programa.");
				break;
			}
		}
		sc.close();
	}

	

}
=======
package Ej_02;

import java.util.*;

import practicaMap.Alumno;

public class ManuApp {

	public static final int MAX_OPC = 9;

	static int menu(int tope_op, Scanner sc) {
		int opcion_menu;

		System.out.println("\n\tOpciones:");
		System.out.println("\t--------------------");
		System.out.println("\t1. Listar alumnos");
		System.out.println("\t2. Matricular alumno Ciclos");
		System.out.println("\t3. Matricular alumno Bachillerato");
		System.out.println("\t4. Calificar alumno");
		System.out.println("\t5. Listar alumnos de Ciclos aprobados");
		System.out.println("\t6. Listar alumnos de Bachillerato de ciencias");
		System.out.println("\t7. Eliminar alumno");
		System.out.println("\t8. Eliminar todos");
		System.out.println("\t9. Salir.");
		do {
			System.out.print("\n\n\tElija opcion:");
			opcion_menu = Integer.parseInt(sc.nextLine());
		} while (opcion_menu < 1 || opcion_menu > tope_op);

		return opcion_menu;
	}

	public static void main(String args[]) {

		int opcion = 0;

		Escuela DonPelayo = new Escuela();
		DonPelayo.script();
		
		Scanner sc = new Scanner(System.in);

		// Ciclo(String nombre, String apellidos, String familiaCiclo, String ciclo, int
		// pev, int sev, int tev)
		// Bachillerato(String nombre, String apellidos, Bachiller bach, int pev, int
		// sev, int tev)

		while (opcion != MAX_OPC) {
			opcion = menu(MAX_OPC, sc);
			switch (opcion) {
			case 1:
				DonPelayo.listar(sc);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				DonPelayo.alumnosCiclosAprobados();
				break;
			case 6:
				DonPelayo.alumnosBachilleratoCiencias();
				break;
			case 7:
				break;
			case 8:
				DonPelayo.eliminarTodos();
				break;
			case 9:
				System.out.println("Fin de programa.");
				break;
			}
		}
		sc.close();
	}

	

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
