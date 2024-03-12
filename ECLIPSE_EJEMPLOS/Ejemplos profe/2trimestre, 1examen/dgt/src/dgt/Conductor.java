<<<<<<< HEAD
package dgt;

public class Conductor {
	private String nombre, dni;
	private Muestra arr[];
	private static int numCond = 0;
	private int contMuestras = 0;

	public Conductor() {
		numCond++;
	}

	public Conductor(String _nombre, String _dni, int tam) {
		nombre = _nombre;
		dni = _dni;
		arr = new Muestra[tam];
		numCond++;
	}

	public void setNombre(String _nombre) {
		nombre = _nombre;
	}

	public void setDni(String _dni) {
		dni = _dni;
	}

	public void setArr(int size) {// Por si utilizo el constructor por defecto
		arr = new Muestra[size];
	}

	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

//	public Muestra[] getArrayMuestras() {
//		return arr;
//	}

	public static int getNumCond() {
		return numCond;
	}

	public int ingresarMuestra(Muestra _muestra) {
		if (arr.length > contMuestras) {
			arr[contMuestras] = _muestra;
			contMuestras++;

			return 1;
		}

		return -1;
	}

	public String escribirArrayMuestras() {
		String muestras = "";

		for (int i = 0; i < contMuestras; i++) {
			muestras += "\n" + arr[i];
		}
		return muestras;
	}

	public String toString() {
		// Aquí podríamos hacer un mensaje distinto si no hubiera muestras.
		return "El conductor se llama " + nombre + ", con DNI " + dni + " y las muestras obtenidas son:"
				+ escribirArrayMuestras();
	}

}
=======
package dgt;

public class Conductor {
	private String nombre, dni;
	private Muestra arr[];
	private static int numCond = 0;
	private int contMuestras = 0;

	public Conductor() {
		numCond++;
	}

	public Conductor(String _nombre, String _dni, int tam) {
		nombre = _nombre;
		dni = _dni;
		arr = new Muestra[tam];
		numCond++;
	}

	public void setNombre(String _nombre) {
		nombre = _nombre;
	}

	public void setDni(String _dni) {
		dni = _dni;
	}

	public void setArr(int size) {// Por si utilizo el constructor por defecto
		arr = new Muestra[size];
	}

	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

//	public Muestra[] getArrayMuestras() {
//		return arr;
//	}

	public static int getNumCond() {
		return numCond;
	}

	public int ingresarMuestra(Muestra _muestra) {
		if (arr.length > contMuestras) {
			arr[contMuestras] = _muestra;
			contMuestras++;

			return 1;
		}

		return -1;
	}

	public String escribirArrayMuestras() {
		String muestras = "";

		for (int i = 0; i < contMuestras; i++) {
			muestras += "\n" + arr[i];
		}
		return muestras;
	}

	public String toString() {
		// Aquí podríamos hacer un mensaje distinto si no hubiera muestras.
		return "El conductor se llama " + nombre + ", con DNI " + dni + " y las muestras obtenidas son:"
				+ escribirArrayMuestras();
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
