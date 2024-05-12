package ej_01;

import java.io.*;

public class Asignatura implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private double nota;
	
	public Asignatura(String nombre, double nota) {
		super();
		this.nombre = nombre;
		this.nota = nota;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getNombre() {
		return nombre;
	}

	public double getNota() {
		return nota;
	}

	@Override
	public String toString() {
		return String.format("%-8s %5s", nombre, nota);
	}
	
	

}
