<<<<<<< HEAD
package productos;

import java.time.*;

public class Alimento extends Producto {
	protected LocalDate caducidad;
	
	public Alimento(double precio, String nombre, String codigo, String caducidad) {
		super(precio, nombre, codigo);
		this.caducidad = LocalDate.parse(caducidad);
	}
	
	public Alimento(double precio, String nombre, String codigo, LocalDate caducidad) {
		super(precio, nombre, codigo);
		this.caducidad = caducidad;
	}

	public LocalDate getCaducidad() {
		return caducidad;
	}

	public void setCaducidad(LocalDate caducidad) {
		this.caducidad = caducidad;
	}

	@Override
	public String toString() {
		return "Alimento [caducidad=" + caducidad + "]";
	}
	
	


}
=======
package productos;

import java.time.*;

public class Alimento extends Producto {
	protected LocalDate caducidad;
	
	public Alimento(double precio, String nombre, String codigo, String caducidad) {
		super(precio, nombre, codigo);
		this.caducidad = LocalDate.parse(caducidad);
	}
	
	public Alimento(double precio, String nombre, String codigo, LocalDate caducidad) {
		super(precio, nombre, codigo);
		this.caducidad = caducidad;
	}

	public LocalDate getCaducidad() {
		return caducidad;
	}

	public void setCaducidad(LocalDate caducidad) {
		this.caducidad = caducidad;
	}

	@Override
	public String toString() {
		return "Alimento [caducidad=" + caducidad + "]";
	}
	
	


}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
