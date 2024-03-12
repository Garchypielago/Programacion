<<<<<<< HEAD
package objetosHijo;

import java.util.Scanner;

import objetoPadre.Centro;

public class Publico extends Centro {
	private double asigAnual;

	public Publico(String nombre, String direccion, double asigAnual) {
		super(nombre, direccion);
		this.asigAnual = asigAnual;
	}

	public Publico() {
		super();
	}

	public double getAsigAnual() {
		return asigAnual;
	}

	public void setAsigAnual(double asigAnual) {
		this.asigAnual = asigAnual;
	}

	@Override
	public String toString() {
		return super.toString() + ", Asignacion Anual: " + asigAnual;
	}
	
	@Override
	public void leer(Scanner sc) {
		super.leer(sc);
		System.out.println("Asignacion Anual: ");
		asigAnual=Double.parseDouble(sc.nextLine());
	}
	
	

}
=======
package objetosHijo;

import java.util.Scanner;

import objetoPadre.Centro;

public class Publico extends Centro {
	private double asigAnual;

	public Publico(String nombre, String direccion, double asigAnual) {
		super(nombre, direccion);
		this.asigAnual = asigAnual;
	}

	public Publico() {
		super();
	}

	public double getAsigAnual() {
		return asigAnual;
	}

	public void setAsigAnual(double asigAnual) {
		this.asigAnual = asigAnual;
	}

	@Override
	public String toString() {
		return super.toString() + ", Asignacion Anual: " + asigAnual;
	}
	
	@Override
	public void leer(Scanner sc) {
		super.leer(sc);
		System.out.println("Asignacion Anual: ");
		asigAnual=Double.parseDouble(sc.nextLine());
	}
	
	

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
