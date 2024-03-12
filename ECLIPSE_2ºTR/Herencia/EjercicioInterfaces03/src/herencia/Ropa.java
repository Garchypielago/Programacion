<<<<<<< HEAD
package herencia;

public class Ropa extends Item {
	protected String talla;

	public Ropa(String nombre, int id, String talla) {
		super(nombre, id);
		this.talla = talla;
	}

	public Ropa(String nombre, int id) {
		super(nombre, id);
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	@Override
	public String toString() {
		return super.toString() + ", talla=" + talla;
	}
	
	

}
=======
package herencia;

public class Ropa extends Item {
	protected String talla;

	public Ropa(String nombre, int id, String talla) {
		super(nombre, id);
		this.talla = talla;
	}

	public Ropa(String nombre, int id) {
		super(nombre, id);
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	@Override
	public String toString() {
		return super.toString() + ", talla=" + talla;
	}
	
	

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
