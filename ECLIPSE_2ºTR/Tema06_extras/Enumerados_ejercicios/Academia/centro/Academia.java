package centro;

import java.util.*;
import alumnos.Alumno;
import asignatura.*;
import excepciones.*;
import utilidades.*;

public class Academia {

	private ArrayList<AsignaturaAcademia> opciones;
	private ArrayList<Alumno> estudiantes;
	private boolean asig;
	private static int nalum, nasig;

	public Academia() {
		super();
		opciones = new ArrayList<AsignaturaAcademia>();
		estudiantes = new ArrayList<Alumno>();
		asig = false;
		nalum = 0;
		nasig = 0;
	}

	public boolean isAsig() {
		return asig;
	}

	public static int getNalum() {
		return nalum;
	}

	public static int getNasig() {
		return nasig;
	}

	public void introducirAsignaturas(Scanner sc) throws AsignaturasIniciadasException {
		if (!asig) {
			while (nasig < 5) {
				opciones.add(CreacionObjetos.asigAcademia(sc));
				nasig++;
			}
			asig = true;
		} else {
			throw new AsignaturasIniciadasException("Las asignaturas ya han sido establecidas");
		}
	}

	public void matricularAlumno(Scanner sc) {
		estudiantes.add(CreacionObjetos.alumno(sc, opciones));
	}

	public void calificarAlumno(Scanner sc) {
		boolean matriculado = false, asigencontrada = false;
		String alumno = null;

		while (!matriculado) {
			try {
				alumno = Lector.leeCadena(sc, "Cual es su DNI");
				for (Alumno a : estudiantes)
					if (a.equals(alumno))
						matriculado = true;
				if (!matriculado)
					throw new AlumnoNoMatriculado("No esta matriculado");
			} catch (AlumnoNoMatriculado ANM) {
				System.out.println(ANM.getMessage());
			}
		}

		for (Alumno a : estudiantes) {
			if (a.equals(alumno)) {
				try {
					String asig = Lector.leeCadena(sc, "En que asignatura:");
					for (AsignaturaAcademia as : opciones)
						if (as.equals(asig))
							asigencontrada = true;
					if (!asigencontrada)
						throw new AsignaturaNoEncontrada("No tenemos esa asignatura");
					a.notaAsig(asig);
				} catch (AsignaturaNoEncontrada ANE) {
					System.out.println(ANE.getMessage());
				}
			}
		}
	}

	public void mostrarAsig() {
		int contador = 1;
		for (AsignaturaAcademia a : opciones) {
			System.out.println(contador + ") " + a.toString());
		}
	}

	public void mostrarAlumnos() {
		int contador = 1;
		for (Alumno a : estudiantes) {
			System.out.println(contador + ") " + a.toString());
		}
	}

}
