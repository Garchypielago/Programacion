package productos;

public class Drogueria extends Producto {
	protected String marca;

	public Drogueria(double precio, String nombre, String codigo, String marca) {
		super(precio, nombre, codigo);
		this.marca = marca;
	}
	
}
