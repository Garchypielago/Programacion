package ej_01;

import java.util.*;

import javax.swing.JOptionPane;

public class Asignaturas {
	
	public ArrayList<Asignatura> arr;

	public Asignaturas() {
		super();
		arr = new ArrayList<Asignatura>();
	}
	
	public void addAsig(Asignatura asig) {
		arr.add(asig);
	}
	
	public void rellenar() {
		boolean seguir=true;
		String nombre;
		double nota;
		
		while(seguir) {
		nombre = JOptionPane.showInputDialog("Nombre de la asignatura");
		nota = Double.parseDouble(JOptionPane.showInputDialog("Nota de la asignatura"));
		
		addAsig(new Asignatura(nombre,nota));
		
		seguir = (JOptionPane.showConfirmDialog(
	            null, 
	            "¿Quieres introducir otra asignatura?", 
	            null, 
	            JOptionPane.YES_NO_OPTION)	==0);
		
		}
		System.out.println("***** Las notas se han almacenado en la lista *****");
	}
	
	public void leer() {
		for (int i=0;i<=arr.size();i++) {
			System.out.println( arr.get(i));
		}
	}
	
	
}
