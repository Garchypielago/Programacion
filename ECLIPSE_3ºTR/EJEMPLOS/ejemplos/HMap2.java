<<<<<<< HEAD
package ejemplos;

import java.util.*;
import java.util.Map.Entry;

public class HMap2 {

	public static void main(String args[]) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		// rellenamos
		map.put(1, "hola");
		map.put(2, "adios");
		map.put(3, "que tal");

		System.out.println("Map antes de cambiar: " + map);

		// sustituimos el valor de la clave 3
		String prevvalue = (String) map.put(3, "otro mas");

		// escribimos el antiguo valor
		System.out.println("Devuelto el valor anterior: " + prevvalue);

		System.out.println("Map despues de cambiar: " + map);
		
		// Obtenemos el conjunto de Entries con las parejas clave valor
		Set<Entry<Integer, String>> listaCompleta = map.entrySet();

		System.out.println("Recorremos obteniendo las entradas con entrySet y for each: ");
		for (Entry<Integer, String> entrada : listaCompleta) {
			System.out.println("Clave: " + entrada.getKey() + " -> Valor: " + entrada.getValue());
		}

		System.out.println("Recorremos obteniendo las entradas con entrySet y Iterator: ");
		Entry<Integer, String> dato;
		Iterator<Entry<Integer, String>> itMap = listaCompleta.iterator();
		while (itMap.hasNext()) {
			dato = itMap.next();
			System.out.println("Clave: " + dato.getKey() + " -> Valor: " + dato.getValue());
		}	

	}
=======
package ejemplos;

import java.util.*;
import java.util.Map.Entry;

public class HMap2 {

	public static void main(String args[]) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		// rellenamos
		map.put(1, "hola");
		map.put(2, "adios");
		map.put(3, "que tal");

		System.out.println("Map antes de cambiar: " + map);

		// sustituimos el valor de la clave 3
		String prevvalue = (String) map.put(3, "otro mas");

		// escribimos el antiguo valor
		System.out.println("Devuelto el valor anterior: " + prevvalue);

		System.out.println("Map despues de cambiar: " + map);
		
		// Obtenemos el conjunto de Entries con las parejas clave valor
		Set<Entry<Integer, String>> listaCompleta = map.entrySet();

		System.out.println("Recorremos obteniendo las entradas con entrySet y for each: ");
		for (Entry<Integer, String> entrada : listaCompleta) {
			System.out.println("Clave: " + entrada.getKey() + " -> Valor: " + entrada.getValue());
		}

		System.out.println("Recorremos obteniendo las entradas con entrySet y Iterator: ");
		Entry<Integer, String> dato;
		Iterator<Entry<Integer, String>> itMap = listaCompleta.iterator();
		while (itMap.hasNext()) {
			dato = itMap.next();
			System.out.println("Clave: " + dato.getKey() + " -> Valor: " + dato.getValue());
		}	

	}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
}