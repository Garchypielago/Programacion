<<<<<<< HEAD
package listaObjetos;

import java.util.*;

import objetoPadre.Centro;

public class Centros {
	
	static ArrayList<Centro> centros;

	public Centros() {
		super();
		this.centros = new ArrayList<Centro>();
	}
	
	public void agregar(Centro c) {
		centros.add(c);
	}
	
	public static ArrayList<Centro> getLista() {
        return centros;
    }
	
	public void mostrarCentros() {
		for(Centro ce: centros) {
			System.out.println(ce.toString());
		}
	}

}
=======
package listaObjetos;

import java.util.*;

import objetoPadre.Centro;

public class Centros {
	
	static ArrayList<Centro> centros;

	public Centros() {
		super();
		this.centros = new ArrayList<Centro>();
	}
	
	public void agregar(Centro c) {
		centros.add(c);
	}
	
	public static ArrayList<Centro> getLista() {
        return centros;
    }
	
	public void mostrarCentros() {
		for(Centro ce: centros) {
			System.out.println(ce.toString());
		}
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
