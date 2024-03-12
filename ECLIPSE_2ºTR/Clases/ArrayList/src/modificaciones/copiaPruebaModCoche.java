package modificaciones;

import java.util.ArrayList;
import java.util.Iterator;

public class copiaPruebaModCoche {
public static void main(String[] args) { 
		Coche coche, cocheBis;
		ArrayList<Coche> coches = new ArrayList<Coche>(); 

		coches.add(new Coche("Seat")); 
		coches.add(new Coche("Nissan"));
		coches.add(new Coche("Mercedes")); 
		
		System.out.println("Ha introducido: " + coches.size() + " numeros:"); 
		System.out.println(coches); //Muestra el arrayList completo 
		
		cocheBis= new Coche("seat");
		
		Iterator <Coche>it = coches.iterator(); 
		while(it.hasNext()) {
			coche = it.next();
			if (coche.equals(cocheBis)) {
				coche.ponMarca("Volvo");				
			}
		}
		
		// Otra forma:
		while(it.hasNext()) {
			coche = it.next();
			if (coche.equals("Nissan")) {
//				// Esto es lo que pasaba con el caso String y Integer
				coche = new Coche("NUEVAFALLA");	
			}
		}
		
		
		
		it = coches.iterator(); 
		while(it.hasNext()) 	
			System.out.println(it.next()); 		
	} 

}
