package Ej_02;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

import Utilidades.Lector;
import practicaMap.Alumno;
import practicaMap.ErrorAlumno;

public class Escuela {

	TreeMap<Integer, Alumnos> tm;

	public Escuela() {
		super();
		this.tm = new TreeMap<Integer, Alumnos>();
	}

	public void script() {
		tm.put(1, new Ciclo("Alejandro", "Garcia Sanchez", "Informatica", "DAM/DAW", 7, 8, 7));
		tm.put(3, new Bachillerato("Aitana", "Garcia Sanchez", Bachiller.CIENCIAS, 7, 8, 7));
		tm.put(4, new Ciclo("Jorge", "Jimenez Sanz", "Informatica", "DAM", -1, 5, 6));
		tm.put(15, new Bachillerato("Jimena", "Sanz Sanchez", Bachiller.ARTES, 4, 5, 9));
		tm.put(13, new Ciclo("Antonio", "Alvarez Sol", "Informatica", "DAW", 5, 3, 3));
		tm.put(19, new Bachillerato("Lorena", "Martin Ayuso", Bachiller.CIENCIAS, -1, 8, 6));
		tm.put(17, new Ciclo("Pablo", "Jimenez Gimenez", "Marketing", "Mark", 7, 8, 6));
		tm.put(8, new Bachillerato("Teresa", "Garcia Alvarez", Bachiller.HUMANIDADES_y_CIENCIAS_SOCIALES, 8, 7, 9));
	}

	public void listar(Scanner sc) {
		Iterator<Integer> it = tm.keySet().iterator();

		System.out.println();
		System.out.printf("%-8s%-15s%-20s%-33s%s%14s%14s\n", "nºExp.", "Nombre", "Apellidos", "Estudios", "1ºEva.",
				"2ºEva.", "3ºEva.");
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------");

		while (it.hasNext()) {
			int key = (int) it.next();

			if (tm.get(key) instanceof Ciclo) {
				System.out.printf("%4s    %s \n", key, ((Ciclo) tm.get(key)).toString());
			}
			if (tm.get(key) instanceof Bachillerato) {
				System.out.printf("%4s    %s \n", key, ((Bachillerato) tm.get(key)).toString());
			}
		}
		System.out.println();
	}

	public void alumnosCiclosAprobados() {
		Iterator<Integer> it = tm.keySet().iterator();

		System.out.printf("%-8s%-15s%-20s%-33s%s%14s%14s\n", "nºExp.", "Nombre", "Apellidos", "Estudios", "1ºEva.",
				"2ºEva.", "3ºEva.");
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------");

		while (it.hasNext()) {
			int key = (int) it.next();

			if (tm.get(key) instanceof Ciclo && ((Ciclo) tm.get(key)).aprobado()) {
				System.out.printf("%4s    %s \n", key, ((Ciclo) tm.get(key)).toString());
			}
		}
		System.out.println();

	}
	
	public void alumnosBachilleratoCiencias() {
		Iterator<Integer> it = tm.keySet().iterator();

		System.out.printf("%-8s%-15s%-20s%-33s%s%14s%14s\n", "nºExp.", "Nombre", "Apellidos", "Estudios", "1ºEva.",
				"2ºEva.", "3ºEva.");
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------");

		while (it.hasNext()) {
			int key = (int) it.next();

			if (tm.get(key) instanceof Bachillerato && ((Bachillerato) tm.get(key)).ciencias()) {
				System.out.printf("%4s    %s \n", key, ((Bachillerato) tm.get(key)).toString());
			}
		}
		System.out.println();

	}
	
	public void eliminarTodos() {
		tm.clear();
	}

	public void matricularAlumnoCiclo(Scanner sc) {
		int ex = 0;
		String nom = null, ape=null, famc=null, c=null;
		boolean hecho = false;
		while (!hecho) {
			try {
				ex = Lector.leeInt(sc, "Numero de expediente correspondiente: ");
				if (tm.containsKey(ex))
					throw new ErrorAlumno("Numero de expediente ya usado, introduzca otro");
				
				//usar clase crearobjetos
				nom = Lector.leeCadena(sc, "Nombre del nuevo alumno: ");
				ape =  Lector.leeCadena(sc, "Apellidos del nuevo alumno: ");
				famc=  Lector.leeCadena(sc, "Familia del ciclo del nuevo alumno: ");
				c =  Lector.leeCadena(sc, "Nombre del ciclo del nuevo alumno: ");

				tm.put(ex, new Ciclo(nom, ape, famc, c));
				hecho = true;
			} catch (ErrorAlumno e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.printf("%4s    %s \n", ex, ((Ciclo) tm.get(ex)).toString());
	}
	
	public void matricularAlumnoBachillerato(Scanner sc) {
		int ex = 0;
		String nom = null, ape=null;
		boolean hecho = false;
		while (!hecho) {
			try {
				ex = Lector.leeInt(sc, "Numero de expediente correspondiente: ");
				if (tm.containsKey(ex))
					throw new ErrorAlumno("Numero de expediente ya usado, introduzca otro");
				
				//usar clase crearobjetos
				nom = Lector.leeCadena(sc, "Nombre del nuevo alumno: ");
				ape =  Lector.leeCadena(sc, "Apellidos del nuevo alumno: ");
				
				//menu enumerados ren una clase del paquete de utilidades
				

				tm.put(ex, new Bachillerato(nom, ape, famc, c));
				hecho = true;
			} catch (ErrorAlumno e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.printf("%4s    %s \n", ex, ((Ciclo) tm.get(ex)).toString());
	}
}
