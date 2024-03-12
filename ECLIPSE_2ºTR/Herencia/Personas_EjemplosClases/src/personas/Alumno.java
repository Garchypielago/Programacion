<<<<<<< HEAD
package personas;

import java.util.Scanner;

public class Alumno extends Persona {
	private String curso;

	public Alumno() {
		System.out.println("Ejecutando el constructor por defeto de Alumno");
	}

	public Alumno(String nif, String nombre, String curso) {
		super(nif, nombre);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	@Override
	public void leer(Scanner sc) {
		super.leer(sc);//llamo al metodo de persona para leer nif y nombre
		System.out.println("Curso: ");
		curso=sc.nextLine();
	}

	@Override
	public String toString() {
		return super.toString() + "\nCurso: " + curso;
	}

}
=======
package personas;

import java.util.Scanner;

public class Alumno extends Persona {
	private String curso;

	public Alumno() {
		System.out.println("Ejecutando el constructor por defeto de Alumno");
	}

	public Alumno(String nif, String nombre, String curso) {
		super(nif, nombre);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	@Override
	public void leer(Scanner sc) {
		super.leer(sc);//llamo al metodo de persona para leer nif y nombre
		System.out.println("Curso: ");
		curso=sc.nextLine();
	}

	@Override
	public String toString() {
		return super.toString() + "\nCurso: " + curso;
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
