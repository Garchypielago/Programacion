package bolsa;
public class Golosina {

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Golosina(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Golosina [nombre=" + nombre + "]";
	}

}
