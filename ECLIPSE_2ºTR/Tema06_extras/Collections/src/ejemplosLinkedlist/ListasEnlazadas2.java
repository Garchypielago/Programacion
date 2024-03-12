<<<<<<< HEAD
package ejemplosLinkedlist;

import java.util.*;

// Eliminar elementos
public class ListasEnlazadas2 {

	public static void main(String args[]) {

		LinkedList<String> lista = new LinkedList<String>();

		// Agregamos elementos a la Linked list
		lista.add("Luisa");
		lista.add("Guillermo");
		lista.add("Pedro");
		lista.add("Patricia");
		lista.add("Marcos");
		lista.add("Antonio");

		// Borramos el primer elemento
		// Same as list.remove(0);
		lista.removeFirst();

		// Borramos el último elemento
		lista.removeLast();

		// Iterating LinkedList
		Iterator<String> iterator = lista.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}

		// Borramos el segundo elemento
		lista.remove(1);

		System.out.println("\nDespues de borrar el segundo elemento: ");
		// Recorremos iterando
		iterator = lista.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}

		System.out.println("\nLista desde el final:");
		ListIterator<String> li = lista.listIterator(lista.size());
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}

	}

}
=======
package ejemplosLinkedlist;

import java.util.*;

// Eliminar elementos
public class ListasEnlazadas2 {

	public static void main(String args[]) {

		LinkedList<String> lista = new LinkedList<String>();

		// Agregamos elementos a la Linked list
		lista.add("Luisa");
		lista.add("Guillermo");
		lista.add("Pedro");
		lista.add("Patricia");
		lista.add("Marcos");
		lista.add("Antonio");

		// Borramos el primer elemento
		// Same as list.remove(0);
		lista.removeFirst();

		// Borramos el último elemento
		lista.removeLast();

		// Iterating LinkedList
		Iterator<String> iterator = lista.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}

		// Borramos el segundo elemento
		lista.remove(1);

		System.out.println("\nDespues de borrar el segundo elemento: ");
		// Recorremos iterando
		iterator = lista.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}

		System.out.println("\nLista desde el final:");
		ListIterator<String> li = lista.listIterator(lista.size());
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}

	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
