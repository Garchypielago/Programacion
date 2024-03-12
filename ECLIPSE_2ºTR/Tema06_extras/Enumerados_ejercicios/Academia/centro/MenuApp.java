package centro;

import java.util.*;

import excepciones.AsignaturasIniciadasException;

class MenuApp {

	public static final int MAX_OPC = 6;

	static int menu(int tope_op, Scanner sc) {
		int opcion_menu;

		System.out.println("Academia Milagos");
		System.out.println("\t1. Introducir Asignaturas");
		System.out.println("\t2. Matricular Alumno");
		System.out.println("\t3. Calificar Alumno");
		System.out.println("\t4. Mostrar Asignaturas");
		System.out.println("\t5. Mostrar Alumnos");
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

		Academia academia = new Academia();

		while (opcion != MAX_OPC) {
			opcion = menu(MAX_OPC, sc);
			switch (opcion) {
			case 1:
				try {
					academia.introducirAsignaturas(sc);
				} catch (AsignaturasIniciadasException AIE) {
					System.out.println(AIE.getMessage());
				}
				break;
			case 2:
				try {
					if(!academia.isAsig())
						throw new AsignaturasIniciadasException();
					academia.matricularAlumno(sc);
				} catch (AsignaturasIniciadasException AIE) {
					System.out.println("No puedes matricular alumnos sin asignaturas establecidas");
				}
				break;
			case 3:
				try {
					if(!academia.isAsig())
						throw new AsignaturasIniciadasException();
					academia.calificarAlumno(sc);
				} catch (AsignaturasIniciadasException AIE) {
					System.out.println("No puedes calificar alumnos sin asignaturas establecidas");
				}
				break;
			case 4:
				try {
					if(!academia.isAsig())
						throw new AsignaturasIniciadasException();
					academia.mostrarAsig();
				} catch (AsignaturasIniciadasException AIE) {
					System.out.println("No puedes mostrar las asignaturas sin establecerlas primero");
				}
				break;
			case 5:
				try {
					if(!academia.isAsig())
						throw new AsignaturasIniciadasException();
					academia.mostrarAlumnos();
				} catch (AsignaturasIniciadasException AIE) {
					System.out.println("No puedes mostrar los alumnos sin establecer las asignaturas primero");
				}
				break;
			case 6:
				System.out.println("Programa finalizado");
				break;
			}
		}
		sc.close();
	}

}
