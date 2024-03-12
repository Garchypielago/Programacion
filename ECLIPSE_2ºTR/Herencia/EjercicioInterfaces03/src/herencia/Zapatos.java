<<<<<<< HEAD
package herencia;

public class Zapatos extends Item {
	protected int numero;

	public Zapatos(String nombre, int id, int numero) {
		super(nombre, id);
		this.numero = numero;
	}

	public Zapatos(String nombre, int id) {
		super(nombre, id);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return super.toString() + ", numero=" + numero;
	}
	
	

}
=======
package herencia;

public class Zapatos extends Item {
	protected int numero;

	public Zapatos(String nombre, int id, int numero) {
		super(nombre, id);
		this.numero = numero;
	}

	public Zapatos(String nombre, int id) {
		super(nombre, id);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return super.toString() + ", numero=" + numero;
	}
	
	

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
