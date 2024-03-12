<<<<<<< HEAD
package modificaciones;
import java.util.*; 
public class PruebaModNumFalla { 
	public static void main(String[] args) { 
		
		ArrayList<Integer> numeros = new ArrayList<Integer>(); 

		numeros.add(1); 
		numeros.add(2);
		numeros.add(3); 
		numeros.add(4);
//		numeros.add(new Integer(1)); 
//		numeros.add(new Integer(2));
//		numeros.add(new Integer(3)); 
//		numeros.add(new Integer(4));
		
		System.out.println("Ha introducido: " + numeros.size() + " numeros:"); 
		System.out.println(numeros); //Muestra el arrayList completo 
		
		Iterator <Integer>it = numeros.iterator(); 
		
		// Ojo, que no cambiamos nada asi
		while(it.hasNext()) {
			Integer pInteger = it.next(); 
			if (pInteger == 2) {
				pInteger = 100; // Esto hace new Integer(100)
				System.out.println(pInteger);
			}
		}
		
		System.out.println();
		
		it = numeros.iterator(); 
		while(it.hasNext())			
			System.out.println(it.next()); 		

		System.out.println();
		
		for (int i=0; i < numeros.size(); i++) {
			int num = numeros.get(i); // devuelve el elemento y lo copia en num, que es otra variable
			if (num == 1) num = 4; // Esto tampoco cambia el array
			System.out.println(num);				
		}
		
		System.out.println();
		
		it = numeros.iterator(); // Para volver al principio 
		while(it.hasNext())			
			System.out.println(it.next()); 
	} 
}
=======
package modificaciones;
import java.util.*; 
public class PruebaModNumFalla { 
	public static void main(String[] args) { 
		
		ArrayList<Integer> numeros = new ArrayList<Integer>(); 

		numeros.add(1); 
		numeros.add(2);
		numeros.add(3); 
		numeros.add(4);
//		numeros.add(new Integer(1)); 
//		numeros.add(new Integer(2));
//		numeros.add(new Integer(3)); 
//		numeros.add(new Integer(4));
		
		System.out.println("Ha introducido: " + numeros.size() + " numeros:"); 
		System.out.println(numeros); //Muestra el arrayList completo 
		
		Iterator <Integer>it = numeros.iterator(); 
		
		// Ojo, que no cambiamos nada asi
		while(it.hasNext()) {
			Integer pInteger = it.next(); 
			if (pInteger == 2) {
				pInteger = 100; // Esto hace new Integer(100)
				System.out.println(pInteger);
			}
		}
		
		System.out.println();
		
		it = numeros.iterator(); 
		while(it.hasNext())			
			System.out.println(it.next()); 		

		System.out.println();
		
		for (int i=0; i < numeros.size(); i++) {
			int num = numeros.get(i); // devuelve el elemento y lo copia en num, que es otra variable
			if (num == 1) num = 4; // Esto tampoco cambia el array
			System.out.println(num);				
		}
		
		System.out.println();
		
		it = numeros.iterator(); // Para volver al principio 
		while(it.hasNext())			
			System.out.println(it.next()); 
	} 
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
