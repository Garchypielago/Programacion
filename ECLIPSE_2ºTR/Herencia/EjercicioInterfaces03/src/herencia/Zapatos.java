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
