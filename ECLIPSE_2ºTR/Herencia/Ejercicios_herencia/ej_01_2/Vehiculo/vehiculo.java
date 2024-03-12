<<<<<<< HEAD
package Vehiculo;

import excepciones_ej01_2.DemasiadoRapidoExcepcion;

public class Vehiculo {
	private String matricula;
	private int velocidad;
	
	public Vehiculo(String matricula) {
		super();
		this.matricula = matricula;
		this.velocidad = 0;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public String toString() {
		return "Matricula: " + matricula + ", velocidad: " + velocidad;
	}
	
	public void acelerar(int ac) throws DemasiadoRapidoExcepcion {
		velocidad+=ac;
	}

}
=======
package Vehiculo;

import excepciones_ej01_2.DemasiadoRapidoExcepcion;

public class Vehiculo {
	private String matricula;
	private int velocidad;
	
	public Vehiculo(String matricula) {
		super();
		this.matricula = matricula;
		this.velocidad = 0;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public String toString() {
		return "Matricula: " + matricula + ", velocidad: " + velocidad;
	}
	
	public void acelerar(int ac) throws DemasiadoRapidoExcepcion {
		velocidad+=ac;
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
