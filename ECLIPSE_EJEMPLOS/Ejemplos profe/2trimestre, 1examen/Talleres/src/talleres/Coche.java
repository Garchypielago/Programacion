<<<<<<< HEAD
package talleres;
public class Coche {
	private String matricula;
	private String tarea;
	private String dni;

	public Coche() {
		
	}

	public Coche(String _matricula, String _tarea, String _dni) {
		matricula = _matricula;
		tarea = _tarea;
		dni = _dni;
	}

	public void setMatricula(String _matricula) {
		matricula = _matricula;
	}

	public void setTarea(String _tarea) {
		tarea = _tarea;
	}

	public void setDni(String _dni) {
		dni = _dni;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getTarea() {
		return tarea;
	}

	public String getDni() {
		return dni;
	}

	public String toString() {
		return ("\n----------------------" + "\nMatricula: " + matricula + "\nTarea a realizar: " + tarea
				+ "\nDNI del dueño: " + dni + "\n----------------------");
	}
=======
package talleres;
public class Coche {
	private String matricula;
	private String tarea;
	private String dni;

	public Coche() {
		
	}

	public Coche(String _matricula, String _tarea, String _dni) {
		matricula = _matricula;
		tarea = _tarea;
		dni = _dni;
	}

	public void setMatricula(String _matricula) {
		matricula = _matricula;
	}

	public void setTarea(String _tarea) {
		tarea = _tarea;
	}

	public void setDni(String _dni) {
		dni = _dni;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getTarea() {
		return tarea;
	}

	public String getDni() {
		return dni;
	}

	public String toString() {
		return ("\n----------------------" + "\nMatricula: " + matricula + "\nTarea a realizar: " + tarea
				+ "\nDNI del dueño: " + dni + "\n----------------------");
	}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
}