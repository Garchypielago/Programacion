<<<<<<< HEAD
package dgt;

import java.util.ArrayList;
import java.util.Scanner;

import utilidades.CreacionObjetos;

public class Conductores {
	private ArrayList<Conductor> listaConductores;

	public Conductores() {
		listaConductores = new ArrayList<Conductor>();
	}

	public void aniadirConductor(Conductor unConductor) {
		listaConductores.add(unConductor);
	}
	
	public int numConductores() {
		return listaConductores.size();
	}

	public boolean aniadirMuestra(int pos, Scanner sc) {
		if (pos >= 1 && pos <= listaConductores.size()) {
			Muestra m = CreacionObjetos.crearMuestra(sc);
			// Termina aqui si se ha producido excepcion por no cumplirse las condiciones
			if (m != null) {
				listaConductores.get(pos-1).ingresarMuestra(m);
				return true;
			} else
				return false;
		} else {
			System.out.println("No hay conductor en esa posicion\n");
			return false;
		}

	}

	public void mostrarConductoresMuestras() {
		for (Conductor c : listaConductores)
			System.out.println(c);
	}

	public void mostrarConductores() {
		System.out.println("Numero  dni");
		System.out.println("------  ---");
		for (Conductor c : listaConductores)
			System.out.println(c.codCond + "\t " + c.getDni());
	}

	public boolean mostrarConductor(int pos) {
		if (pos >= 1 && pos <= listaConductores.size()) {
			System.out.println("Numero dni");
			System.out.println("------ ---");
			System.out.println(listaConductores.get(pos-1));
			System.out.println();
			return true;
		} else {
			System.out.println("El conductor no existe.\n");
			return false;
		}
	}

	public boolean mostrarMuestras(int pos) {
		if (pos >= 1 && pos <= listaConductores.size()) {
			System.out.println(listaConductores.get(pos-1));
			System.out.println();
			return true;
		} else {
			System.out.println("El conductor no existe.\n");
			return false;
		}
	}

}
=======
package dgt;

import java.util.ArrayList;
import java.util.Scanner;

import utilidades.CreacionObjetos;

public class Conductores {
	private ArrayList<Conductor> listaConductores;

	public Conductores() {
		listaConductores = new ArrayList<Conductor>();
	}

	public void aniadirConductor(Conductor unConductor) {
		listaConductores.add(unConductor);
	}
	
	public int numConductores() {
		return listaConductores.size();
	}

	public boolean aniadirMuestra(int pos, Scanner sc) {
		if (pos >= 1 && pos <= listaConductores.size()) {
			Muestra m = CreacionObjetos.crearMuestra(sc);
			// Termina aqui si se ha producido excepcion por no cumplirse las condiciones
			if (m != null) {
				listaConductores.get(pos-1).ingresarMuestra(m);
				return true;
			} else
				return false;
		} else {
			System.out.println("No hay conductor en esa posicion\n");
			return false;
		}

	}

	public void mostrarConductoresMuestras() {
		for (Conductor c : listaConductores)
			System.out.println(c);
	}

	public void mostrarConductores() {
		System.out.println("Numero  dni");
		System.out.println("------  ---");
		for (Conductor c : listaConductores)
			System.out.println(c.codCond + "\t " + c.getDni());
	}

	public boolean mostrarConductor(int pos) {
		if (pos >= 1 && pos <= listaConductores.size()) {
			System.out.println("Numero dni");
			System.out.println("------ ---");
			System.out.println(listaConductores.get(pos-1));
			System.out.println();
			return true;
		} else {
			System.out.println("El conductor no existe.\n");
			return false;
		}
	}

	public boolean mostrarMuestras(int pos) {
		if (pos >= 1 && pos <= listaConductores.size()) {
			System.out.println(listaConductores.get(pos-1));
			System.out.println();
			return true;
		} else {
			System.out.println("El conductor no existe.\n");
			return false;
		}
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
