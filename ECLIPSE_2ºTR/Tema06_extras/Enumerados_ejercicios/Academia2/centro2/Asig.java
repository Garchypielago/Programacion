package centro2;

public enum Asig {

	A1, A2, A3, A4, A5;

	private String nombre;
	private double precio;

	private Asig() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
