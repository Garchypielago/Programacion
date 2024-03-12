<<<<<<< HEAD
package dgt;

import java.util.ArrayList;

public class Conductor {
	private String nombre, dni;
	int codCond;
	private ArrayList<Muestra> listaMuestras;
	private static int numCond = 0;

	public Conductor() {
		codCond = ++numCond;
	}

	public Conductor(String _nombre, String _dni) {
		nombre = _nombre;
		dni = _dni;
		listaMuestras =new ArrayList<Muestra>();
		codCond = ++numCond;
	}

	public void setNombre(String _nombre) {
		nombre = _nombre;
	}

	public void setDni(String _dni) {
		dni = _dni;
	}

//	public void setArr(int size) {
//		arr = new Muestra[size];
//	}

	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	// Mejor no damos acceso directo al array
//	public Muestra[] getArrayMuestras() {
//		return arr;
//	}

	public static int getNumCond() {
		return numCond;
	}	
	
	public void ingresarMuestra(Muestra _muestra) {					
		listaMuestras.add(_muestra);
	}

	public String mostrarMuestras() {
		String muestras = "";

		for (int i = 0; i < listaMuestras.size(); i++) {
			muestras += "\n" + listaMuestras.get(i);
		}
		return muestras;
	}

	public String toString() {
		String str;
		if (this.listaMuestras.size() == 0 ) str = " y no tiene muestras\n";
		else str = " y las muestras obtenidas son: \n" + mostrarMuestras();
		return "El conductor de codigo " + codCond + " se llama " + nombre + ", con DNI " + dni + str;
	}

}
=======
package dgt;

import java.util.ArrayList;

public class Conductor {
	private String nombre, dni;
	int codCond;
	private ArrayList<Muestra> listaMuestras;
	private static int numCond = 0;

	public Conductor() {
		codCond = ++numCond;
	}

	public Conductor(String _nombre, String _dni) {
		nombre = _nombre;
		dni = _dni;
		listaMuestras =new ArrayList<Muestra>();
		codCond = ++numCond;
	}

	public void setNombre(String _nombre) {
		nombre = _nombre;
	}

	public void setDni(String _dni) {
		dni = _dni;
	}

//	public void setArr(int size) {
//		arr = new Muestra[size];
//	}

	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	// Mejor no damos acceso directo al array
//	public Muestra[] getArrayMuestras() {
//		return arr;
//	}

	public static int getNumCond() {
		return numCond;
	}	
	
	public void ingresarMuestra(Muestra _muestra) {					
		listaMuestras.add(_muestra);
	}

	public String mostrarMuestras() {
		String muestras = "";

		for (int i = 0; i < listaMuestras.size(); i++) {
			muestras += "\n" + listaMuestras.get(i);
		}
		return muestras;
	}

	public String toString() {
		String str;
		if (this.listaMuestras.size() == 0 ) str = " y no tiene muestras\n";
		else str = " y las muestras obtenidas son: \n" + mostrarMuestras();
		return "El conductor de codigo " + codCond + " se llama " + nombre + ", con DNI " + dni + str;
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
