<<<<<<< HEAD
package asignatura;

public class AsignaturaAlumno extends Asignatura {
	private float nota;

	public AsignaturaAlumno(String nombre) {
		super(nombre);
		nota = -1;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		if (nota == -1)
			return super.toString() + ", nota: no disponible";
		else
			return super.toString() + ", nota:" + nota + ".";
	}

}
=======
package asignatura;

public class AsignaturaAlumno extends Asignatura {
	private float nota;

	public AsignaturaAlumno(String nombre) {
		super(nombre);
		nota = -1;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		if (nota == -1)
			return super.toString() + ", nota: no disponible";
		else
			return super.toString() + ", nota:" + nota + ".";
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
