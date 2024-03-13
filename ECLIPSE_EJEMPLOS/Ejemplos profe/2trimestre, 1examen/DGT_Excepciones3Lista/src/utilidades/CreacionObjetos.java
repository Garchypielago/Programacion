package utilidades;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
import dgt.Conductor;
import dgt.Muestra;
import excepciones.CodigoIncorrectoException;
import excepciones.PorcentajeIncorrectoException;
import lector.Lector;

public class CreacionObjetos {
	public static Conductor crearConductor(Scanner sc) {

		String name = Lector.leeCadena(sc, "Introduce el nombre del conductor");
		String dni = Lector.leeCadena(sc, "Introduce el dni:");
		
		return new Conductor(name, dni);
	}
	
	/**********************************************************************************************************/
	/* Usando este metodo, pedimos al usuario solo el dato que ha introducido mal, no todos los de la muestra */
	/**********************************************************************************************************/
	public static Muestra crearMuestra(Scanner sc) {
		Muestra muestra = new Muestra();
		boolean repetir = true;
		
		// En esta versión creamos una muestra por defecto para ir añadiendo los diferentes valores
		// a los atributos
		System.out.println("Introduce los datos de la muestra");
		
		muestra.setFecha(LocalDate.now());
		muestra.setHora(LocalTime.now());
		while (repetir) {
			try {
				muestra.setCodigo(Lector.leeCadena(sc, "Codigo del puesto de control preventivo (2 letras mayúsculas seguidas de 2 digitos):"));
				repetir = false;
			}
			catch (CodigoIncorrectoException e) {
				System.out.println(e.getMessage());
			}
		};

		System.out.print("Matricula del vehiculo:");
		muestra.setMatricula(sc.nextLine());	
		
		repetir = true;
		while (repetir) {
			try {
				muestra.setPorcentaje(Lector.leeFloat(sc, "Porcentaje de alcohol en sangre:"));
				repetir = false;
			}
			catch (PorcentajeIncorrectoException e) {
				System.out.println(e.getMessage());
			}
		};

		return muestra;
	}
}
