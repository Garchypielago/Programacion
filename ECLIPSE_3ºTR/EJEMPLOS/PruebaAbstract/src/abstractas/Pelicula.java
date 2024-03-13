package abstractas;

public class Pelicula extends Item {
    
	public Pelicula(String titulo, float precio) {
		super(titulo, precio);
	}

	public boolean esAlquilable() {
        return true;
    }
}