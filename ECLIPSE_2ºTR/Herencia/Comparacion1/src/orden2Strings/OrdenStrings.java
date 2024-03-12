package orden2Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class OrdenStrings {
	public static void main(String[] args) {

		ArrayList<String> arrayListString = new ArrayList<String>();
		// Guardo datos en el ArrayList
		arrayListString.add("Pepe");
		arrayListString.add("Paco");
		arrayListString.add("Juan");
		arrayListString.add("Susi");
		arrayListString.add("Lola");
		arrayListString.add("Jose");
		arrayListString.add("Dani");
		arrayListString.add("Sara");

		System.out.println("\nOrden ascendente\n");

		// Ordenamos en orden ascendente
		Collections.sort(arrayListString);

		// Imprimir el arrayList
		for (String s : arrayListString)
			System.out.println(s);


		System.out.println("\nOrden descendente\n");

		// Ordenamos en orden descendente
		Collections.sort(arrayListString, Collections.reverseOrder());

		// Imprimir el arrayList
		for (String s : arrayListString)
			System.out.println(s);

		// Otra forma, usando la interfaz Comparator:
		System.out.println();
		
		Comparator<String> comparador = Collections.reverseOrder();
		Collections.sort(arrayListString, comparador);

		System.out.println("\nSin orden con nuevos terminos\n");
		// Si añado posteriormente elementos, estaran descolocados segun el orden
		arrayListString.add("Fernando");
		arrayListString.add("ana");
		
		// Imprimir el arrayList
		for (String s : arrayListString)
			System.out.println(s);
				
		System.out.println("\nOrden ascendente, minus detras\n");

		System.out.println();
		Collections.sort(arrayListString);
		
		for (String s : arrayListString)
			System.out.println(s);
		
		System.out.println();
		
		System.out.println("\nOrden ascendente, minus = mayus\n");
		Collections.sort(arrayListString, String.CASE_INSENSITIVE_ORDER);
		
		System.out.println();
	
		for (String s : arrayListString)
			System.out.println(s);
		
		
		System.out.println();
		
		
		System.out.println("\nUsando el comparator creado antes:\n");

		String[] a = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"}; 
//		Arrays.sort(a, Collections.reverseOrder());	 
//		sorts the array in reverse-lexicographic (alphabetical) order.
//		
// 		Usando el comparator creado antes:
		Arrays.sort(a, comparador);
			
		for(String str : a)
	     	System.out.println(str);

	}
}
