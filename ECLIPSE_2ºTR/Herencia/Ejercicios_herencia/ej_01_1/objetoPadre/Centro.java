package objetoPadre;

import java.util.*;

public class Centro {
	private String nombre, direccion;

	public Centro(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public Centro() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Nombre:" + nombre + ", Direccion:" + direccion;
	}
	
	public void leer(Scanner sc) {
		System.out.println("Nombre: ");
		nombre=sc.nextLine();
		System.out.println("Direccion: ");
		direccion=sc.nextLine();
	}
	

}
