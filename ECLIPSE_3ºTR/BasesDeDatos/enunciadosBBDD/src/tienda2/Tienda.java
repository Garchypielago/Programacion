package tienda2;

import java.util.*;

public class Tienda {

	ArrayList<Producto> tienda;

	public Tienda() {
		super();
		tienda = new ArrayList<Producto>();
	}

	public void add(Producto pr) {
		tienda.add(pr);
	}

	public void leer() {
		for (int i = 0; i < tienda.size(); i++) {
			if (tienda.get(i).getCantidad() > 0)
				System.out.println(tienda.get(i));
		}
	}

	public int tam() {
		return tienda.size();
	}

	public Producto getProducto(int i) {
		return tienda.get(i);
	}

}
