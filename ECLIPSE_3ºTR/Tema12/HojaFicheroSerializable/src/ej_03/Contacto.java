package ej_03;

import java.io.Serializable;
import java.util.Comparator;

public class Contacto implements Serializable, Comparator<Contacto> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String nombre, apellidos, email;
	private int numero;

	public Contacto(String nombre, String apellidos, String email, int numero) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.numero = numero;
	}

	public Contacto(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + ", numero=" + numero
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (nombre.equalsIgnoreCase(((Contacto) obj).nombre) && apellidos.equalsIgnoreCase(((Contacto) obj).apellidos))
			return true;
		
		return false;
	}

	@Override
	public int compare(Contacto o1, Contacto o2) {
		// TODO Auto-generated method stub
		return ((Contacto)o1).nombre.compareToIgnoreCase(((Contacto)o2).nombre);
	}

}
