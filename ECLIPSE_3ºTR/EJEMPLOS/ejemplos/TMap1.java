package ejemplos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

// No se admiten claves repetidas en un MAP, se quedaria solo la ultima
public class TMap1 {

	public static void main(String[] args) {

		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(); // Orden natural
		// TreeMap<Integer, String> treeMap = new TreeMap<Integer,
		// String>(Collections.reverseOrder());

		// Clave, valor
		treeMap.put(1, "Casillas");
		treeMap.put(15, "Ramos");
		treeMap.put(5, "Puyol");
		treeMap.put(3, "Pique");
		treeMap.put(11, "Capdevila");
		treeMap.put(14, "Xabi Alonso");
		treeMap.put(16, "Busquets");
		treeMap.put(18, "Pedrito");
		treeMap.put(8, "Xavi Hernandez");
		treeMap.put(7, "Villa");
		treeMap.put(6, "Iniesta");

		// Imprimimos el Map con un Iterador sobre el conjunto de claves, ordena ascendentemente por clave
		Iterator<Integer> itKeySet = treeMap.keySet().iterator();

		while (itKeySet.hasNext()) {
			int key = (int) itKeySet.next();
			System.out.println("Clave: " + key + " -> Valor: " + treeMap.get(key));
		}

		Collection<String> coleccion = treeMap.values();
		System.out.println(coleccion);
		
		// Esto de abajo no se puede hacer:
		// la coleccion que devuelve values no es instancia de List
		
//		Collections.sort((List)coleccion);
//		System.out.println(coleccion);
		
		// List es una interfaz que implementa Collection (subinterfaz)
		// Para mostrar ordenados los valores del mapa:
	
		List<String> lista = new ArrayList<String>(coleccion);
		
		System.out.println(lista);
		
		System.out.println("Mostramos ordenados los valores del mapa");
		Collections.sort(lista);
		System.out.println(lista);
		
		// Set<Map.Entry<Integer, String>> listaCompleta = treeMap.entrySet();
		// Tengo importado la clase Map.Entry
		// El metodo entrySet devuelve todas las parejas del mapa en un conjunto
		Set<Entry<Integer, String>> listaCompleta = treeMap.entrySet();

		System.out.println(listaCompleta);
		
		// Como es un conjunto, podemos iterar y obtenemos cada objeto de tipo Entry:
		// los objetos Entry tienen metodos para recoger clave y valor
		Entry<Integer, String> dato;
		Iterator<Entry<Integer, String>> itMap = listaCompleta.iterator();
		while (itMap.hasNext()) {
			dato = itMap.next();
			System.out.println("Clave: " + dato.getKey() + " -> Valor: " + dato.getValue());
		}	

	}
}
