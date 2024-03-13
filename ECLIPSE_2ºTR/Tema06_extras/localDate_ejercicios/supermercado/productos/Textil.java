package productos;

public class Textil extends Producto {
	protected String color;

	public Textil(double precio, String nombre, String codigo, String color) {
		super(precio, nombre, codigo);
		this.color = color;
	}
	
	

}
