package abstractas;

public class Libro extends Item {

	public Libro(String titulo, float precio) {
		super(titulo, precio);
	}

	public boolean esAlquilable() {
		return false;
	}
}

