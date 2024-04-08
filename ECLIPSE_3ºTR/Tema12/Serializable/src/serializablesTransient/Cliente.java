package serializablesTransient;

import java.io.*;

public class Cliente implements Serializable {
	
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	String nombre;
	private transient String cuenta;

	Cliente(String n, String c) {
		nombre = n;
		cuenta = c;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public void Escribir() {
		System.out.println("Nombre: " + nombre);
		System.out.print("Cuenta: ");
		if (cuenta == null)
			System.out.println("No disponible");
		else
			System.out.println(cuenta);
	}
	
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + " cuenta=" + cuenta+ "]";
	}

}
