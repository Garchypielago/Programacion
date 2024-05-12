package practicaMap;

import java.util.*;
import java.util.Map.Entry;

import Utilidades.*;

public class Treemap {

	public static final int MAX_OPC = 6;

	static int menu(int tope_op, Scanner sc) {
		int opcion_menu;

		System.out.println("\n\tOpciones:");
		System.out.println("\t--------------------");
		System.out.println("\t1. Listar alumnos");
		System.out.println("\t2. Matricular alumnos");
		System.out.println("\t3. Calificar alumno");
		System.out.println("\t4. Eliminar alumno");
		System.out.println("\t5. Eliminar alumnos");
		System.out.println("\t6. Salir.");
		do {
			System.out.print("\t--------------------\n\tElija opcion:");
			opcion_menu = Integer.parseInt(sc.nextLine());
		} while (opcion_menu < 1 || opcion_menu > tope_op);

		return opcion_menu;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer, Alumno> tm = new TreeMap<Integer, Alumno>();
		Scanner sc = new Scanner(System.in);

		tm.put(1, new Alumno("Alex", -1, 2, 10));
		tm.put(2, new Alumno("Diana", 1, 10, 10));
		tm.put(34, new Alumno("Renata", 10, 2, 10));
		tm.put(189, new Alumno("Alfredo", -1, -1, 8));

		int opcion = 0;

		while (opcion != MAX_OPC) {
			opcion = menu(MAX_OPC, sc);
			switch (opcion) {
			case 1:
				listarAlumnos(tm);
				break;
			case 2:
				matricularAlumno(sc, tm);
				break;
			case 3:
				calificarAlumno(sc, tm);
				break;
			case 4:
				eliminarAlumno(sc, tm);
				break;
			case 5:
				tm.clear();
				break;
			case 6:
				System.out.println("Fin de programa.");
				break;
			}
		}
		sc.close();
	}

	public static void listarAlumnos(TreeMap<Integer, Alumno> tmap) {

		String pevs, sevs, tevs;

		Iterator<Integer> it = tmap.keySet().iterator();

		System.out.println();
//		System.out.println("\tnº Exp." + "\t\tNombre" + "\t\t1ºEva." + "\t\t2ºEva." + "\t\t3ºEva.");
		System.out.printf("%s\t %s\t %20s %14s %14s \n", "nºExp.", "Nombre", "1ºEva.", "2ºEva.", "3ºEva." );
		System.out.println("--------------------------------------------------------------------------");
		
		while (it.hasNext()) {
			int key = (int) it.next();
			System.out.printf("%s\t %s\t \n" , key,tmap.get(key).toString());
			
		}
		System.out.println();

	}

	public static void matricularAlumno(Scanner sc, TreeMap<Integer, Alumno> tm) {
		int ex = 0;
		String nom = null;
		boolean hecho = false;
		while (!hecho) {
			try {
				ex = Lector.leeInt(sc, "Numero de expediente correspondiente: ");
				if (tm.containsKey(ex))
					throw new ErrorAlumno("Numero de expediente ya usado, introduzca otro");
				nom = Lector.leeCadena(sc, "Nombre del nuevo alumno: ");

				tm.put(ex, new Alumno(nom));
				hecho = true;
			} catch (ErrorAlumno e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Alumno " + nom + " de nº expediente " + ex + " agregado al sistema");
	}

	public static void calificarAlumno(Scanner sc, TreeMap<Integer, Alumno> tm) {
		int exp = 0, ev = 0, nota = 0;
		boolean hecho = false;

		while (!hecho) {
			try {
				exp = buscarAlumno("Numero de expedinete del alumno a calificar", tm, sc);

				ev = Lector.leeInt(sc, "Numero de la evaluacion a calificar (1,2,3): ");
				if (ev != 1 && ev != 2 && ev != 3)
					throw new ErrorAlumno("Numero de expediente no encontrado");

				nota = Lector.leeInt(sc, "Calificacion: ");
				if (ev != 0 && ev != 1 && ev != 2 && ev != 3 && ev != 4 && ev != 5 && ev != 6 && ev != 7 && ev != 8
						&& ev != 9 && ev != 10)
					throw new ErrorAlumno("Nota fuera de limites");
				hecho = true;
			} catch (ErrorAlumno e) {
				System.out.println(e.getMessage());
			}
		}

		switch (ev) {
		case 1:
			System.out.println("Nota previa de la primera evaluacion: " + tm.get(exp).getPev());
			tm.get(exp).setPev(nota);
			System.out.println("Nota tras el cambio de la primera evaluacion: " + tm.get(exp).getPev());
			break;
		case 2:
			System.out.println("Nota previa de la segunda evaluacion: " + tm.get(exp).getSev());
			tm.get(exp).setSev(nota);
			System.out.println("Nota tras el cambio de la segunda evaluacion: " + tm.get(exp).getSev());
			break;
		case 3:
			System.out.println("Nota previa de la tercera evaluacion: " + tm.get(exp).getTev());
			tm.get(exp).setTev(nota);
			System.out.println("Nota tras el cambio de la tercera evaluacion: " + tm.get(exp).getTev());
			break;
		}

	}

	public static int buscarAlumno(String msg, TreeMap<Integer, Alumno> tm, Scanner sc) throws ErrorAlumno {
		int exp = Lector.leeInt(sc, msg);
		if (tm.containsKey(exp))
			throw new ErrorAlumno("Numero de expediente no encontrado");

		return exp;
	}

	public static void eliminarAlumno(Scanner sc, TreeMap<Integer, Alumno> tm) {
		int exp = 0;
		boolean hecho = false;

		while (!hecho) {
			try {
				exp = buscarAlumno("Numero de expedinete del alumno a eliminar", tm, sc);

				tm.remove(exp);
				hecho = true;

			} catch (ErrorAlumno e) {
				System.out.println(e.getMessage());
			}
		}

		System.out.println("Alumno eliminado.");
	}

}
