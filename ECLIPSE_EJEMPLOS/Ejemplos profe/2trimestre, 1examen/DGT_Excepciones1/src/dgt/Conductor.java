<<<<<<< HEAD
package dgt;

public class Conductor {
	private String nombre, dni;
	int codCond;
	private Muestra arr[];
	private static int numCond = 0;
	private int contMuestras = 0;

	public Conductor() {
		codCond = ++numCond;
	}

	public Conductor(String _nombre, String _dni, int tam) {
		nombre = _nombre;
		dni = _dni;
		arr = new Muestra[tam];
		codCond = ++numCond;
	}

	public void setNombre(String _nombre) {
		nombre = _nombre;
	}

	public void setDni(String _dni) {
		dni = _dni;
	}

	public void setArr(int size) {
		arr = new Muestra[size];
	}

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
	
	public boolean cabenMuestras() {
		if (arr.length > contMuestras) {						
			return true;
		}
		return false;
	}
	
	public void ingresarMuestra(Muestra _muestra) {					
			arr[contMuestras] = _muestra;
			contMuestras++;
	}

	public String escribirArrayMuestras() {
		String muestras = "";

		for (int i = 0; i < contMuestras; i++) {
			muestras += "\n" + arr[i];
		}
		return muestras;
	}

	public String toString() {
		String str;
		if (this.contMuestras == 0 ) str = " no tiene muestras";
		else str = " y las muestras obtenidas son: " + escribirArrayMuestras();
		return "El conductor de codigo " + codCond + " se llama " + nombre + ", con DNI " + dni + str;
	}

}
=======
package dgt;

public class Conductor {
	private String nombre, dni;
	int codCond;
	private Muestra arr[];
	private static int numCond = 0;
	private int contMuestras = 0;

	public Conductor() {
		codCond = ++numCond;
	}

	public Conductor(String _nombre, String _dni, int tam) {
		nombre = _nombre;
		dni = _dni;
		arr = new Muestra[tam];
		codCond = ++numCond;
	}

	public void setNombre(String _nombre) {
		nombre = _nombre;
	}

	public void setDni(String _dni) {
		dni = _dni;
	}

	public void setArr(int size) {
		arr = new Muestra[size];
	}

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
	
	public boolean cabenMuestras() {
		if (arr.length > contMuestras) {						
			return true;
		}
		return false;
	}
	
	public void ingresarMuestra(Muestra _muestra) {					
			arr[contMuestras] = _muestra;
			contMuestras++;
	}

	public String escribirArrayMuestras() {
		String muestras = "";

		for (int i = 0; i < contMuestras; i++) {
			muestras += "\n" + arr[i];
		}
		return muestras;
	}

	public String toString() {
		String str;
		if (this.contMuestras == 0 ) str = " no tiene muestras";
		else str = " y las muestras obtenidas son: " + escribirArrayMuestras();
		return "El conductor de codigo " + codCond + " se llama " + nombre + ", con DNI " + dni + str;
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
