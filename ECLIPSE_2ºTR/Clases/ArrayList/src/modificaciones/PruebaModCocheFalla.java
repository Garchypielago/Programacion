package modificaciones;
import java.util.*; 
public class PruebaModCocheFalla { 
	public static void main(String[] args) { 
		
		ArrayList<Coche> coches = new ArrayList<Coche>(); 

		coches.add(new Coche("Seat")); 
		coches.add(new Coche("Nissan"));
		coches.add(new Coche("Mercedes")); 
		
		System.out.println("Ha introducido: " + coches.size() + " numeros:"); 
		System.out.println(coches); //Muestra el arrayList completo 
		
		Iterator <Coche>it = coches.iterator(); 
		
		// Ojo, que no cambiamos nada asi	
		while(it.hasNext()) {
			Coche coche = it.next();
			if (coche.devMarca().equals("Nissan")) {
//				// Esto es lo que pasaba con el caso String y Integer
//				coche = new Coche("NUEVAFALLA");	
				Coche coche2 = new Coche("NUEVAFALLA");	
				// localizo el coche que esta indicando el iterador
				coches.set(coches.indexOf(coche), coche2);
			}
		}
		
		System.out.println();
		
		it = coches.iterator(); 
		while(it.hasNext()) 	
			System.out.println(it.next()); 
		
	} 
}
