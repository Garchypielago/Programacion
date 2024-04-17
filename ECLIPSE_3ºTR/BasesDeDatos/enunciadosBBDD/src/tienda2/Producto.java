package tienda2;

import java.io.Serializable;

public class Producto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int codigo, precio, cantidad;
	private String nombre;

	public Producto(int codigo, String nombre, int precio, int cantidad) {
		super();
		this.codigo = codigo;
		this.precio = precio;
		this.cantidad = cantidad;
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void vender(int vendido) throws Excepciones {
		if (cantidad - vendido < 0)
			throw new Excepciones("No hay suficiente producto, quedan: " + cantidad);

		setCantidad(cantidad - vendido);
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", precio=" + precio + ", cantidad=" + cantidad + ", nombre=" + nombre
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (codigo == ((Producto) obj).codigo)
			return true;
		
		return false;
	}
	
	public boolean comprobar(Producto pr) {
		if(codigo==pr.codigo && nombre.equals(pr.nombre)&& precio==pr.precio && cantidad==pr.cantidad)
			return true;
		
		return false;
	}

}
