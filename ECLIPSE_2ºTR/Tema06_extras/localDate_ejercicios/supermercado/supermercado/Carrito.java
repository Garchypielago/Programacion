package supermercado;

import java.util.*;
import productos.*;

public class Carrito {
	// array de productos qeu se compran
	ArrayList<Producto> carrito;

	public Carrito() {
		super();
		this.carrito = new ArrayList<Producto>();
	}

	public double calcPrecio() {
		double precios = 0;
		for (Producto p : carrito) {
			precios += p.getPrecio();
		}
		return precios;
	}
	
	public void nuevoCliente() {
		Iterator<Producto> it = carrito.iterator();
		//foreach que borra
	}

}
