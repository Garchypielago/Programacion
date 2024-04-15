package tienda2;

import java.util.*;

public class Tienda {

	ArrayList<Producto> tienda;

	public Tienda() {
		super();
		tienda = new ArrayList<Producto>();
	}
	
	public void addTienda(Producto pr) {
		tienda.add(pr);
	}
	
	public void leer() {
		for (int i=0;i<=tienda.size();i++) {
			System.out.println( tienda.get(i));
		}
	}
	
	
}
