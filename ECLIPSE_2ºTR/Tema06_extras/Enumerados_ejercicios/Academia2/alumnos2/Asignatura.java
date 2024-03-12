<<<<<<< HEAD
package alumnos2;

public class Asignatura {
	private String nombre;
	private float nota;
	
	public Asignatura(String nombre, float nota) {
		super();
		this.nombre = nombre;
		this.nota = nota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Asignatura [nombre=" + nombre + ", nota=" + nota + "]";
	}
	
	public boolean equals(String nom) {
		if (this.nombre.equalsIgnoreCase(nom)) {
			return true;
		}
		return false;
	}
	
	

}
=======
package alumnos2;

public class Asignatura {
	private String nombre;
	private float nota;
	
	public Asignatura(String nombre, float nota) {
		super();
		this.nombre = nombre;
		this.nota = nota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Asignatura [nombre=" + nombre + ", nota=" + nota + "]";
	}
	
	public boolean equals(String nom) {
		if (this.nombre.equalsIgnoreCase(nom)) {
			return true;
		}
		return false;
	}
	
	

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
