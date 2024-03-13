package utilidades;

import java.util.*;

import alumnos.Alumno;
import asignatura.*;
import excepciones.*;

public class CreacionObjetos {

	public static AsignaturaAcademia asigAcademia(Scanner sc) {
		boolean creado = false;
		String nombre = "";
		double precio = 0;

		while (!creado) {
			try {
				nombre = Lector.leeCadena(sc, "Cual es el nombre de la asignatura:");
				precio = Lector.leeDouble(sc, "Cual es su precio:");
				creado = true;
			} catch (NumberFormatException NFE) {
				System.out.println("Formato incorrecto");
			}
		}
		return new AsignaturaAcademia(nombre, precio);
	}
	
	public static AsignaturaAlumno asigAlumno(Scanner sc, ArrayList<AsignaturaAcademia> opciones) {
		boolean creado = false;
		String nombre = "";

		while (!creado) {
			try {
				nombre = Lector.leeCadena(sc, "Cual es el nombre de la asignatura:");
				for(AsignaturaAcademia as: opciones) {
					if ( as.equals(nombre))
						creado = true;
				}
				if (!creado)
					throw new AsignaturaNoEncontrada("No contamos con esa asignatura");
			} catch (NumberFormatException NFE) {
				System.out.println("Formato incorrecto");
			} catch (AsignaturaNoEncontrada ANE) {
				System.out.println(ANE.getMessage());
			}
		}
		return new AsignaturaAlumno(nombre);
	}
	
	
	public static Alumno alumno(Scanner sc, ArrayList<AsignaturaAcademia> opciones) {
		boolean creado = false;
		String nombre = "", DNI="";
		int curso = 0;
		String grupo = "";
		ArrayList<AsignaturaAlumno> matriculado = new ArrayList<AsignaturaAlumno>();

		while (!creado) {
			try {
				nombre = Lector.leeCadena(sc, "Cual es el nombre del alumno:");
				DNI = Lector.leeCadena(sc, "Cual es su DNI:");
				validaciones.DNIvalido(DNI);
				curso = Lector.leeInt(sc, "En que curso se encuentra:");
				grupo = Lector.leeCadena(sc, "Cual es su grupo:");
				System.out.println("Primera asignatura:");
				matriculado.add(asigAlumno(sc, opciones));
				System.out.println("Segunda asignatura:");
				matriculado.add(asigAlumno(sc, opciones));
				System.out.println("Tercera asignatura:");
				matriculado.add(asigAlumno(sc, opciones));
				creado = true;
			} catch (NumberFormatException NFE) {
				System.out.println("Formato incorrecto");
			} catch (FormatoInvalido FI){
				System.out.println(FI.getMessage());
			}
		}
		return new Alumno(nombre,DNI, curso, grupo, matriculado);
	}

}
