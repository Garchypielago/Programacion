<<<<<<< HEAD
package EjerciciosClases02;

public class Autor {
	private String nombre, apellido1, apellido2;
	private int titulosEditados;
	
	public Autor() {
		super();
	}

	public Autor(String nombre, String apellido1, String apellido2, int titulosEditados) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.titulosEditados = titulosEditados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public int getTitulosEditados() {
		return titulosEditados;
	}

	public void setTitulosEditados(int titulosEditados) {
		this.titulosEditados = titulosEditados;
	}

	@Override
	public String toString() {
		return "Autor [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ ", titulosEditados=" + titulosEditados + "]";
	}
	
	public void añadirtituloEditado() {
		titulosEditados++;
	}
	
}
=======
package EjerciciosClases02;

public class Autor {
	private String nombre, apellido1, apellido2;
	private int titulosEditados;
	
	public Autor() {
		super();
	}

	public Autor(String nombre, String apellido1, String apellido2, int titulosEditados) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.titulosEditados = titulosEditados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public int getTitulosEditados() {
		return titulosEditados;
	}

	public void setTitulosEditados(int titulosEditados) {
		this.titulosEditados = titulosEditados;
	}

	@Override
	public String toString() {
		return "Autor [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ ", titulosEditados=" + titulosEditados + "]";
	}
	
	public void añadirtituloEditado() {
		titulosEditados++;
	}
	
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
