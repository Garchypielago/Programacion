package practicaHasSet;

import java.util.Objects;

public class Ej_02_Empleado {
	private String nombre;
	private float sueldo;
	
	public Ej_02_Empleado(String nombre, float sueldo) {
		super();
		this.nombre=nombre;
		this.sueldo=sueldo;
	}

	public String getNombre() {
		return nombre;
	}

	public float getSueldo() {
		return sueldo;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nombre.toLowerCase());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		if (this.nombre.equalsIgnoreCase(((Ej_02_Empleado)obj).nombre))
			return true;
		Ej_02_Empleado other = (Ej_02_Empleado) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "* " + nombre + ", sueldo=" + sueldo + "€ *";
	}

	

}
