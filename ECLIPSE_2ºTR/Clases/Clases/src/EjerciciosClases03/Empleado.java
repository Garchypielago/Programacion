<<<<<<< HEAD
package EjerciciosClases03;

import javax.swing.*;

public class Empleado {
	private String nombre, apellido;
	private double salario;
	private int edad;
	private boolean plus;

	public Empleado() {
		super();
		plus = false;
	}

	public Empleado(String nombre, String apellido, int edad, double salario) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = salario;
		plus = false;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario + ", edad=" + edad
				+ "]";
	}

	public boolean subirSalario(double aumento) {
		if (edad > 40 && !plus) {
			salario = salario + aumento;
			plus = true;
		}
		return plus;
	}

}
=======
package EjerciciosClases03;

import javax.swing.*;

public class Empleado {
	private String nombre, apellido;
	private double salario;
	private int edad;
	private boolean plus;

	public Empleado() {
		super();
		plus = false;
	}

	public Empleado(String nombre, String apellido, int edad, double salario) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = salario;
		plus = false;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario + ", edad=" + edad
				+ "]";
	}

	public boolean subirSalario(double aumento) {
		if (edad > 40 && !plus) {
			salario = salario + aumento;
			plus = true;
		}
		return plus;
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
