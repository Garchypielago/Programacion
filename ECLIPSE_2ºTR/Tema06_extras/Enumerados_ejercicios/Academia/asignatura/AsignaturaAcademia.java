package asignatura;

public class AsignaturaAcademia extends Asignatura {
	private double precio;

	public AsignaturaAcademia(String nombre, double precio) {
		super(nombre);
		this.precio = precio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return super.toString() + ", precio: " + precio + "€";
	}
	
	

}
