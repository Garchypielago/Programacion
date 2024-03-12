package personas;

import java.util.Scanner;

public class Persona {
	private String nif, nombre;

	public Persona() {
		super();
	}

	public Persona(String nif, String nombre) {
		super();
		this.nif = nif;
		this.nombre = nombre;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void leer(Scanner sc) {
		System.out.println("Nif: ");
		nif=sc.nextLine();
		System.out.println("Nombre: ");
		nombre=sc.nextLine();
	}

	@Override
	public String toString() {
		return "Nif=" + nif + "\nNombre=" + nombre;
	}
	
	

}
