package EjerciciosClases03;

import javax.swing.*;

import java.util.*;

public class Alumnos_Main {
	
	public static void main(String[] args) {
		
		
		
		
	}
	
	public static Alumnos altaAlumno() {
		String nombre, apellido, input;
		double nota;
		int curso;

		nombre = JOptionPane.showInputDialog("Nombre del alumno");
		apellido = JOptionPane.showInputDialog("Apellido del alumno");
		input = JOptionPane.showInputDialog("Curso en el que se encuentra");
		curso = Integer.parseInt(input);
		input = JOptionPane.showInputDialog("Nota del alumno");
		nota = Double.parseDouble(input);

		Alumnos newAlumno = new Alumnos(nombre, apellido, nota, curso);

		return newAlumno;
	}
	
	public static void aprobados(Alumnos[] arrayalumnos) {
		int contador=0;
		
		for (Alumnos a : arrayalumnos)
			if (a.getNota()>=5) {
				contador++;
				System.out.println(contador + ") " + a);
			}
		System.out.println(contador + "/" + arrayalumnos.length + " alumnos, han aprobado.");
	}
	
	public static void suspensos(Alumnos[] arrayalumnos) {
		int contador=0;
		
		for (Alumnos a : arrayalumnos)
			if (a.getNota()<5) {
				contador++;
				System.out.println(contador + ") " + a);
			}
		System.out.println(contador + "/" + arrayalumnos.length + " alumnos, han suspendido.");
	}
	
	public static void menuAlumnos(Alumnos[] arrayAlumnos) {
		int opcion, contador = 0;
		String input;

		do {
			input = JOptionPane.showInputDialog("Elige la opcion: \n\n1)Nuevo alumno \n2)Alumnos aprobados "
					+ "\n3)Alumnos suspensos \n4)Salir");
			opcion = Integer.parseInt(input);

			switch (opcion) {
			case 1:
				arrayAlumnos[contador] = altaAlumno();
				contador++;
				break;
			case 2:
				aprobados(arrayAlumnos);
				break;
			case 3:
				suspensos(arrayAlumnos);
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Fin del programa");
				break;
			default:
				JOptionPane.showMessageDialog(null, "No es una opcion valida");
				break;
			}
		} while (opcion != 4);
	}
	
	public static void menuAlumnos() {
		int opcion, contador = 0;
		String input;
		
		Alumnos[] arrayAlumnos = new Alumnos[100];

		do {
			input = JOptionPane.showInputDialog("Elige la opcion: \n\n1)Nuevo alumno \n2)Alumnos aprobados "
					+ "\n3)Alumnos suspensos \n4)Salir");
			opcion = Integer.parseInt(input);

			switch (opcion) {
			case 1:
				arrayAlumnos[contador] = altaAlumno();
				contador++;
				break;
			case 2:
				aprobados(arrayAlumnos);
				break;
			case 3:
				suspensos(arrayAlumnos);
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Fin del programa");
				break;
			default:
				JOptionPane.showMessageDialog(null, "No es una opcion valida");
				break;
			}
		} while (opcion != 4);
	}

}
