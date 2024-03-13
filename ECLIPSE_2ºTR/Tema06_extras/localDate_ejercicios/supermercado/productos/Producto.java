package productos;

public abstract class Producto {
	private double precio;
	private String nombre, codigo;
	
	public Producto(double precio, String nombre, String codigo) {
		super();
		this.precio = precio;
		this.nombre = nombre;
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	
	
}
