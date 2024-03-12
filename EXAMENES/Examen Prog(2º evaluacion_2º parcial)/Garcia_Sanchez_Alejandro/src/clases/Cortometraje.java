package clases;

import java.time.LocalDate;

import enumerados.Genero;
import excepciones.ErrorDuracion;

public class Cortometraje extends Pelicula {

	public Cortometraje(String titulo, String director, int duracion, Genero genero, LocalDate fechaEstreno) {
		super(titulo, director, duracion, genero, fechaEstreno);
		try {
			setDuracion(duracion);
		} catch (ErrorDuracion e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		// TODO Auto-generated constructor stub
	}

	public Cortometraje(String titulo, String director, int duracion, Genero genero) {
		super(titulo, director, duracion, genero);
		// TODO Auto-generated constructor stub
		try {
			super.setDuracion(duracion);
		} catch (ErrorDuracion e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	public void setDuracion(int duracion) throws ErrorDuracion {

		if (duracion < 10 || duracion > 29) {
			super.setDuracion(10);
			throw new ErrorDuracion("**Duración incorrecta, se asigna el valor de 10***");
		} else {
			super.setDuracion(duracion);
		}
	}

	@Override
	public String toString() {
		return "Cortometraje " + super.toString();
	}

	@Override
	public String Visionar() {
		// TODO Auto-generated method stub
		return "Visionado de cortometraje " + super.getDuracion() + "minutos";
	}

}
