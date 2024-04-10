package ej_02;

import java.io.Serializable;

public class Cliente implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String NIF, nombre, direccion;
	private int telefono;
	private double deuda;
	
	public Cliente(String nIF, String nombre, String direccion, int telefono, double deuda) {
		super();
		NIF = nIF;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.deuda = deuda;
	}

	public Cliente(String nIF) {
		super();
		NIF = nIF;
	}

	public String getNIF() {
		return NIF;
	}

	public void setNIF(String nIF) {
		NIF = nIF;
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

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public double getDeuda() {
		return deuda;
	}

	public void setDeuda(double deuda) {
		this.deuda = deuda;
	}

	@Override
	public String toString() {
		return String.format("%-12s %-25s %-30s %-12s %-10s" , NIF, nombre, direccion,telefono,deuda);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(NIF.equalsIgnoreCase(((Cliente)obj).NIF))
			return true;
		
		return false;
	}
	
	
	

}
