package ejemplosLinkedlist;
import java.util.*;

public class ListasEnlazadas1 {

	public static void main(String args[]) {

		LinkedList<String> list = new LinkedList<String>();

		// Agregamos elemento a la LinkedList:
		list.add("Luisa");
		list.add("Guillermo");
		list.add("Pedro");

		// Agregamos un elemento en la primera posición
		list.addFirst("Patricia");

		// Agregamos un elemento en la última posición
		list.addLast("Marcos");

		// Agregamos un elemento en la tercera posición
		list.add(2, "Antonio");

		// Iteramos la LinkedList para obtener sus elementos:
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
