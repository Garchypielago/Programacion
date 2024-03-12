<<<<<<< HEAD
package objetosHijo;

import java.util.Scanner;

import objetoPadre.Centro;

public class Privado extends Centro{
	private double cuotaMensual;

	public Privado(String nombre, String direccion, double cuotaMensual) {
		super(nombre, direccion);
		this.cuotaMensual = cuotaMensual;
	}

	public Privado() {
		super();
	}

	public double getCuotaMensual() {
		return cuotaMensual;
	}

	public void setCuotaMensual(double cuotaMensual) {
		this.cuotaMensual = cuotaMensual;
	}

	@Override
	public String toString() {
		return super.toString() +", Cuota Mensual:" + cuotaMensual;
	}
	
	@Override
	public void leer(Scanner sc) {
		super.leer(sc);
		System.out.println("Cuota Mensual: ");
		cuotaMensual=Double.parseDouble(sc.nextLine());
	}
}
=======
package objetosHijo;

import java.util.Scanner;

import objetoPadre.Centro;

public class Privado extends Centro{
	private double cuotaMensual;

	public Privado(String nombre, String direccion, double cuotaMensual) {
		super(nombre, direccion);
		this.cuotaMensual = cuotaMensual;
	}

	public Privado() {
		super();
	}

	public double getCuotaMensual() {
		return cuotaMensual;
	}

	public void setCuotaMensual(double cuotaMensual) {
		this.cuotaMensual = cuotaMensual;
	}

	@Override
	public String toString() {
		return super.toString() +", Cuota Mensual:" + cuotaMensual;
	}
	
	@Override
	public void leer(Scanner sc) {
		super.leer(sc);
		System.out.println("Cuota Mensual: ");
		cuotaMensual=Double.parseDouble(sc.nextLine());
	}
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
