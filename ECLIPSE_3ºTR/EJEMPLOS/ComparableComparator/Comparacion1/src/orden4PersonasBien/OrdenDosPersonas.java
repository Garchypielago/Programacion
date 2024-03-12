package orden4PersonasBien;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenDosPersonas {
	public static void main(String[] args) {	
		 Persona p1 = new Persona("Pepe", 28);
		 Persona p2 = new Persona("Juan", 32);
		 Persona p3 = new Persona("Juan", 32);
		 
		 System.out.println(p1.compareTo(p2));
		 System.out.println(p2.compareTo(p1));
		 System.out.println(p2.compareTo(p3));		
	}	
}
