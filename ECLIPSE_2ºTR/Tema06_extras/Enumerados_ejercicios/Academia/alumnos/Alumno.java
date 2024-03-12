package alumnos;

import java.util.ArrayList;
import java.math.*;
import asignatura.AsignaturaAlumno;
import excepciones.AsignaturaNoEncontrada;

public class Alumno {
	private String nombre, DNI, grupo;
	private int curso;
	private ArrayList<AsignaturaAlumno> matriculado;
	
	public Alumno(String nombre, String dNI, int curso, String grupo, ArrayList<AsignaturaAlumno> matriculado) {
		super();
		this.nombre = nombre;
		DNI = dNI;
		this.curso = curso;
		this.grupo = grupo;
		this.matriculado = matriculado;
	}
	
	public boolean equals(String DNI) {
		if (this.DNI.equalsIgnoreCase(DNI)) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Nombre=" + nombre + ", DNI=" + DNI + ", curso=" + curso + ", grupo=" + grupo + 
				"\n\t matricula 1: " +matriculado.get(0).toString() +
				"\n\t matricula 2: " +matriculado.get(1).toString() +
				"\n\t matricula 3: " +matriculado.get(2).toString();
	}
	
	public void notaAsig(String asig) throws AsignaturaNoEncontrada{
		boolean hecho=false;
		for(AsignaturaAlumno a:matriculado) {
			if(a.equals(asig)) {
				a.setNota((float)(Math.random()*10+1));
				hecho=true;
				System.out.println("El alumno " + nombre + " DNI: " + DNI + "tiene en " + a.getNombre() + " un " + a.getNota() );
			}
		}
		if(!hecho) {
			throw new AsignaturaNoEncontrada("No esta matriculado en esa asignatura");
		}
	}
	

}
