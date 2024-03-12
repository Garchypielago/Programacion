<<<<<<< HEAD
package modificaciones;
import java.util.*; 
public class PruebaModCoche { 
	public static void main(String[] args) { 
		
		ArrayList<Coche> coches = new ArrayList<Coche>(); 

		coches.add(new Coche("Seat")); 
		coches.add(new Coche("Nissan"));
		coches.add(new Coche("Mercedes")); 
		
		System.out.println("Ha introducido: " + coches.size() + " numeros:"); 
		System.out.println(coches); //Muestra el arrayList completo 
		
		Iterator <Coche>it = coches.iterator(); 
		
		while(it.hasNext()) {
			Coche coche = it.next();
			if (coche.devMarca().equals("Nissan")) {
				coche.ponMarca("Volvo");				
			}
		}
		
		// Otra forma:
		while(it.hasNext()) {
			Coche coche = it.next();
			if (coche.devMarca().equals("Nissan")) {
//				// Esto es lo que pasaba con el caso String y Integer
				coche = new Coche("NUEVAFALLA");	
			}
		}
		
		System.out.println();
		
		it = coches.iterator(); 
		while(it.hasNext()) 	
			System.out.println(it.next()); 		
	} 
}
=======
package modificaciones;
import java.util.*; 
public class PruebaModCoche { 
	public static void main(String[] args) { 
		
		ArrayList<Coche> coches = new ArrayList<Coche>(); 

		coches.add(new Coche("Seat")); 
		coches.add(new Coche("Nissan"));
		coches.add(new Coche("Mercedes")); 
		
		System.out.println("Ha introducido: " + coches.size() + " numeros:"); 
		System.out.println(coches); //Muestra el arrayList completo 
		
		Iterator <Coche>it = coches.iterator(); 
		
		while(it.hasNext()) {
			Coche coche = it.next();
			if (coche.devMarca().equals("Nissan")) {
				coche.ponMarca("Volvo");				
			}
		}
		
		// Otra forma:
		while(it.hasNext()) {
			Coche coche = it.next();
			if (coche.devMarca().equals("Nissan")) {
//				// Esto es lo que pasaba con el caso String y Integer
				coche = new Coche("NUEVAFALLA");	
			}
		}
		
		System.out.println();
		
		it = coches.iterator(); 
		while(it.hasNext()) 	
			System.out.println(it.next()); 		
	} 
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
