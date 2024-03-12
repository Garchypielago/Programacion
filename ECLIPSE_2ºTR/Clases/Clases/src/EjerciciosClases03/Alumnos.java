<<<<<<< HEAD
package EjerciciosClases03;

public class Alumnos {
	private String nombre, apellido;
	private int  curso;
	private double nota;
	static int num_alumnos=0;
	
	public Alumnos() {
		super();
		num_alumnos++;
	}

	public Alumnos(String nombre, String apellido, double nota, int curso) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nota = nota;
		this.curso = curso;
		num_alumnos++;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}
	
	public static int getNum_Alumnos() {
		return num_alumnos;
	}

	public static void bajaAlumno() {
		num_alumnos--;
	}
}
=======
package EjerciciosClases03;

public class Alumnos {
	private String nombre, apellido;
	private int  curso;
	private double nota;
	static int num_alumnos=0;
	
	public Alumnos() {
		super();
		num_alumnos++;
	}

	public Alumnos(String nombre, String apellido, double nota, int curso) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nota = nota;
		this.curso = curso;
		num_alumnos++;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}
	
	public static int getNum_Alumnos() {
		return num_alumnos;
	}

	public static void bajaAlumno() {
		num_alumnos--;
	}
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
