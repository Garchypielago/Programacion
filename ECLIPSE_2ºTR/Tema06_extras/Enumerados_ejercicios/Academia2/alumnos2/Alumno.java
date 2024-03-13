package alumnos2;

import java.util.ArrayList;

public class Alumno {
	private String nombre, DNI;
	private int curso;
	private char grupo;
	private ArrayList<Asignatura> matriculado;
	public Alumno(String nombre, String DNI, int curso, char grupo) {
		super();
		this.nombre = nombre;
		this.DNI = DNI;
		this.curso = curso;
		this.grupo = grupo;
	}
	

}
