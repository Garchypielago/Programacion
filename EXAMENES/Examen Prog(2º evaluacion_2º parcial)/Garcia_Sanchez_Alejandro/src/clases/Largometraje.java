package clases;

import java.time.LocalDate;

import enumerados.Genero;
import excepciones.ErrorDuracion;

public class Largometraje extends Pelicula {

	public Largometraje(String titulo, String director, int duracion, Genero genero, LocalDate fechaEstreno) {
		super(titulo, director, duracion, genero, fechaEstreno);
		// TODO Auto-generated constructor stub
		try {
			super.setDuracion(duracion);
		} catch (ErrorDuracion e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	public Largometraje(String titulo, String director, int duracion, Genero genero) {
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

		if (duracion < 30 || duracion > 300) {
			super.setDuracion(30);
			throw new ErrorDuracion("**Duración incorrecta, se asigna el valor de 3s0***");
		} else {
			super.setDuracion(duracion);
		}
	}

	public int getTiempoDescanso() {
		return super.getDuracion() / 10;
	}

	@Override
	public String toString() {
		return "Largometraje " + super.toString();
	}

	@Override
	public String Visionar() {
		// TODO Auto-generated method stub
		return "Visionado de largometraje " + super.getDuracion() + "minutos";
	}

}
