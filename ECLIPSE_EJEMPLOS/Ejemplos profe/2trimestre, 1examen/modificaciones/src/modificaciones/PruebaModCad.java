package modificaciones;
import java.util.*; 
public class PruebaModCad { 
	public static void main(String[] args) { 
	
		ArrayList<String> nombres = new ArrayList<String>(); 

		nombres.add("uno"); 
		nombres.add("dos");
		nombres.add("tres"); 
		nombres.add("cuatro");
		nombres.add("dos");
		
		System.out.println("Ha introducido: " + nombres.size() + " numeros:"); 
		System.out.println(nombres); //Muestra el arrayList completo 
		
		Iterator <String> it = nombres.iterator(); 		
		
		while(it.hasNext()) {
			String pString = it.next();
			if (pString.equals("dos"))
				nombres.set(nombres.indexOf(pString), "prueba");
		}
		
		// Reiniciamos el iterador
		it = nombres.iterator(); 
		while(it.hasNext()) 			
			System.out.println(it.next()); 	
		
	} 
}
