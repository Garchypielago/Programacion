<<<<<<< HEAD
package objetosHijo;

import java.util.Scanner;

import objetoPadre.Centro;

public class Concertado extends Centro {
	private double asigMensual, cuotaMensual;

	public Concertado(String nombre, String direccion, double asigMensual, double cuotaMensual) {
		super(nombre, direccion);
		this.asigMensual = asigMensual;
		this.cuotaMensual = cuotaMensual;
	}

	public Concertado() {
		super();
	}

	public double getAsigMensual() {
		return asigMensual;
	}

	public void setAsigMensual(double asigMensual) {
		this.asigMensual = asigMensual;
	}

	public double getCuotaMensual() {
		return cuotaMensual;
	}

	public void setCuotaMensual(double cuotaMensual) {
		this.cuotaMensual = cuotaMensual;
	}

	@Override
	public String toString() {
		return super.toString() +", Asigancion Mensual:" + asigMensual + ", Cuota Mensual:" + cuotaMensual;
	}
	
	@Override
	public void leer(Scanner sc) {
		super.leer(sc);
		System.out.println("Asignacion Mensual: ");
		asigMensual=Double.parseDouble(sc.nextLine());
		System.out.println("Cuota Mensual: ");
		cuotaMensual=Double.parseDouble(sc.nextLine());
	}
	
	
}
=======
package objetosHijo;

import java.util.Scanner;

import objetoPadre.Centro;

public class Concertado extends Centro {
	private double asigMensual, cuotaMensual;

	public Concertado(String nombre, String direccion, double asigMensual, double cuotaMensual) {
		super(nombre, direccion);
		this.asigMensual = asigMensual;
		this.cuotaMensual = cuotaMensual;
	}

	public Concertado() {
		super();
	}

	public double getAsigMensual() {
		return asigMensual;
	}

	public void setAsigMensual(double asigMensual) {
		this.asigMensual = asigMensual;
	}

	public double getCuotaMensual() {
		return cuotaMensual;
	}

	public void setCuotaMensual(double cuotaMensual) {
		this.cuotaMensual = cuotaMensual;
	}

	@Override
	public String toString() {
		return super.toString() +", Asigancion Mensual:" + asigMensual + ", Cuota Mensual:" + cuotaMensual;
	}
	
	@Override
	public void leer(Scanner sc) {
		super.leer(sc);
		System.out.println("Asignacion Mensual: ");
		asigMensual=Double.parseDouble(sc.nextLine());
		System.out.println("Cuota Mensual: ");
		cuotaMensual=Double.parseDouble(sc.nextLine());
	}
	
	
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
