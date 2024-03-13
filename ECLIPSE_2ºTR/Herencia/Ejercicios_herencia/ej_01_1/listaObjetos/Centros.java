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
