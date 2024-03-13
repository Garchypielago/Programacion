package ejemplos;
import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;


public class TSortedMap {
	public static void main(String[] args) {
	
	// Si quiero realizar una ordenaciondescendente:
	//SortedMap<Integer, String> map = new TreeMap<Integer, String>(java.util.Collections.reverseOrder());
	TreeMap<Integer, String> map = new TreeMap<Integer, String>(java.util.Collections.reverseOrder());
	
	// SortedMap es una interfaz que ordena ascendentemente por defecto, TreeMap implementa esa interfaz
	map.put(1,  "Casillas");	
	map.put(15, "Ramos");
	map.put(5,  "Puyol");
	map.put(3,  "Pique");		
	map.put(11, "Capdevila");
	map.put(14, "Xabi Alonso");
	map.put(16, "Busquets");	
	map.put(18, "Pedrito");
	map.put(8,  "Xavi Hernandez");
	map.put(7,  "Villa");
	map.put(6,  "Iniesta");

	// Imprimimos el Map con un Iterador sobre el conjunto de las claves
	Iterator<Integer> it = map.keySet().iterator();
	
	while(it.hasNext()){
	  int key = (int) it.next();
	  System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
	}
}
}
