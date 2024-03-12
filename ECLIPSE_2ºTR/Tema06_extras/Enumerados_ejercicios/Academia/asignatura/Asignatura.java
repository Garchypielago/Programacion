package asignatura;

public abstract class Asignatura {
	private String nombre;

	public Asignatura(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Asignatura: " + nombre;
	}
	
	public boolean equals(String nom) {
		if (this.nombre.equalsIgnoreCase(nom)) {
			return true;
		}
		return false;
	}
	
	

}
