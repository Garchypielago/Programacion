<<<<<<< HEAD
package orden1Integer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class OrdenInteger {
	public static void main(String[] args) {

		ArrayList<Integer> arrayListInt = new ArrayList<Integer>();
		// Guardo datos en el ArrayList
		arrayListInt.add(3); 	arrayListInt.add(4);
		arrayListInt.add(2);	arrayListInt.add(6);
		arrayListInt.add(5);	arrayListInt.add(1);
		arrayListInt.add(7);
		
		System.out.println("\nSin orden\n");
		// Imprimir el arrayList
				for(Integer i : arrayListInt)
					System.out.println(i);
				
		System.out.println("\nOrden ascendente\n");
		
		// Ordenamos en orden ascendente
		Collections.sort(arrayListInt);
		
		// Imprimir el arrayList
		for(Integer i : arrayListInt)
			System.out.println(i);
		
		System.out.println("\nOrden descendente\n");
		
		// Ordenamos en orden descendente
		Collections.sort(arrayListInt, Collections.reverseOrder());
		
		// Imprimir el arrayList
		for(Integer i : arrayListInt)
	     	System.out.println(i);
		
		// Explicacion usando la interfaz Comparator:
		
		// public static <T> Comparator<T> reverseOrder()
		
//		Returns a comparator that imposes the reverse of the natural ordering 
//		on a collection of objects that implement the Comparable interface. 
//		(The natural ordering is the ordering imposed by the objects' own compareTo method.)
//		This enables a simple idiom for sorting (or maintaining) collections
//		(or arrays) of objects that implement the Comparable interface
//		in reverse-natural-order.
//
		
	}	
}
=======
package orden1Integer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class OrdenInteger {
	public static void main(String[] args) {

		ArrayList<Integer> arrayListInt = new ArrayList<Integer>();
		// Guardo datos en el ArrayList
		arrayListInt.add(3); 	arrayListInt.add(4);
		arrayListInt.add(2);	arrayListInt.add(6);
		arrayListInt.add(5);	arrayListInt.add(1);
		arrayListInt.add(7);
		
		System.out.println("\nSin orden\n");
		// Imprimir el arrayList
				for(Integer i : arrayListInt)
					System.out.println(i);
				
		System.out.println("\nOrden ascendente\n");
		
		// Ordenamos en orden ascendente
		Collections.sort(arrayListInt);
		
		// Imprimir el arrayList
		for(Integer i : arrayListInt)
			System.out.println(i);
		
		System.out.println("\nOrden descendente\n");
		
		// Ordenamos en orden descendente
		Collections.sort(arrayListInt, Collections.reverseOrder());
		
		// Imprimir el arrayList
		for(Integer i : arrayListInt)
	     	System.out.println(i);
		
		// Explicacion usando la interfaz Comparator:
		
		// public static <T> Comparator<T> reverseOrder()
		
//		Returns a comparator that imposes the reverse of the natural ordering 
//		on a collection of objects that implement the Comparable interface. 
//		(The natural ordering is the ordering imposed by the objects' own compareTo method.)
//		This enables a simple idiom for sorting (or maintaining) collections
//		(or arrays) of objects that implement the Comparable interface
//		in reverse-natural-order.
//
		
	}	
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
