package practicaMap;

import java.util.*;
import java.util.Map.Entry;

import Utilidades.*;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		Scanner sc = new Scanner(System.in);

		Boolean hecho = false;
		int codigo;
		String desc, act;

		while (!hecho) {
				codigo = Lector.leeInt(sc, "Código (-1 para terminar): ");
				if (codigo != -1) {

				desc = Lector.leeCadena(sc, "Descripción: ");

				act = hmap.put(codigo, desc);
				if (act != null)
					System.out.println("Descripcion actualizada");
				else
					System.out.println("Nuevo producto añadido");
				} else {
					hecho=true;
				}
		}

		System.out.println("Total de articulos insertados: " + hmap.size());

		System.out.println("Lista de articulos: ");
		hmap.forEach((c, d) -> System.out.println("Codigo: " + c + ", Descripcion: " + d));

		System.out.println("Borrado de articulos: ");
		Iterator<Entry<Integer, String>> itMap = hmap.entrySet().iterator();
		Entry<Integer, String> dato;
		String borrar = "";
		while (itMap.hasNext()) {
			dato = itMap.next();
			System.out.println("Codigo: " + dato.getKey() + ", Descripcion: " + dato.getValue());
			while (!borrar.equalsIgnoreCase("s") && !borrar.equalsIgnoreCase("n")) {
				borrar = Lector.leeCadena(sc, "Borrar? (s/n): ");
				if (borrar.equalsIgnoreCase("s")) {
					itMap.remove();
				}
			}
			borrar="";
		}

		System.out.println("Articulos restantes (" + hmap.size() + "):");
		hmap.forEach((c, d) -> System.out.println("Codigo: " + c + ", Descripcion: " + d));

	}

}

/*
234
Magdalena
67
Bizcocho
85
Galleta
67
Chocolate
-1
n
s
n
 
 */
