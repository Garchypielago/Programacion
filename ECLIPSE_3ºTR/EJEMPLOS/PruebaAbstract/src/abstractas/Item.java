package abstractas;

public abstract class Item {
	private String titulo;
	private float precio = 5.0f;

	public Item(String titulo, float precio) {
		this.titulo = titulo;
		this.precio = precio;
	}

	public abstract boolean esAlquilable(); // Es una clase abstracta porque tiene un método abstracto

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float pr) {
		precio = pr;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String tit) {
		titulo = tit;
	}

	@Override
	public String toString() {
		return "Item [titulo=" + titulo + ", precio=" + precio + "]";
	}

}
