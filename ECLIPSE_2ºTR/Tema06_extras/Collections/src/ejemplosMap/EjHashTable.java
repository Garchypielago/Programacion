package ejemplosMap;
import java.util.Enumeration;
import java.util.Hashtable;

// Una Hashtable Java es una estructura de datos que utiliza una función hash para identificar datos
// mediante una llave o clave (ej. Nombre de una persona). La función hash transforma una llave a un 
// valor índice de un array de elementos. En este caso a una índice de nuestra Hashtable Java.

public class EjHashTable {

	public static void main(String[] args) {
		Hashtable<String, String> contenedor = new Hashtable<String, String>();

		contenedor.put("101", "Harry");
		contenedor.put("102", "Potter");
		contenedor.put("103", "IRONMAN");
		contenedor.put("104", "IRONMAN");
		contenedor.put("105", "HALLO");
		
		// El primer elemento será la clave y el segundo será el valor a almacenar.
		System.out.println(contenedor.get("105"));
		System.out.println(contenedor.get("101"));

		// Mediante un Enumeration vamos a recorrer el contenido de nuestra Hashtable
		// Java:

		Enumeration<String> enumeration = contenedor.elements();
		while (enumeration.hasMoreElements()) {
			System.out.println("" + "hashtable valores: " + enumeration.nextElement());
		}

		// Si queremos saber cuales son las claves de la Hashtable Java usamos el método
		// .keys().

		Enumeration<String> llaves = contenedor.keys();
		while (llaves.hasMoreElements()) {
			System.out.println("" + "hashtable llaves: " + llaves.nextElement());
		}
	}

}
