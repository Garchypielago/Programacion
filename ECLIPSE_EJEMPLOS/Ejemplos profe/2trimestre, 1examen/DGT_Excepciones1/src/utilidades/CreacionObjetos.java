package utilidades;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
import dgt.Conductor;
import dgt.Muestra;
import excepciones.CodigoIncorrectoException;
import excepciones.PorcentajeIncorrectoException;

public class CreacionObjetos {
	public static Conductor crearConductor(Scanner sc) {

		System.out.print("Introduce el nombre del conductor: ");
		String name = sc.nextLine();
		System.out.print("Introduce el dni: ");
		String dni = sc.nextLine();
		System.out.print("Indica el numero de muestras que se van a guardar para este conductor: ");
		int numMuestras = Integer.parseInt(sc.nextLine());

		return new Conductor(name, dni, numMuestras);
	}
	
	/**********************************************************************************************************/
	/* Usando este metodo, pedimos al usuario todos los datos de la muestra de nuevo, no solo el erroneo      */
	/**********************************************************************************************************/
	public static Muestra crearMuestra(Scanner sc) throws CodigoIncorrectoException, PorcentajeIncorrectoException {
		Muestra muestra = null;
		String codigo = null, matricula;
		float porcentaje = (float) 0.0;

		System.out.println("Introduce los datos de la muestra");

		System.out.println("Codigo del puesto de control preventivo (2 letras mayúsculas seguidas de 2 digitos):");
		codigo = sc.nextLine();
		Muestra.validaCodigo(codigo);//No se ha creado la muestra, es un metodo estatico

		System.out.print("Matricula del vehiculo:");
		matricula = sc.nextLine();
		//
		System.out.println("Porcentaje de alcohol en sangre:");
		porcentaje = Float.parseFloat(sc.nextLine());
		Muestra.validaPorcentaje(porcentaje);

		// Si pasamos al constructor los datos que pueden producir excepciones, se le pedirán al usuario
		// de nuevo
		muestra = new Muestra(LocalDate.now(), LocalTime.now(), codigo, matricula, porcentaje);
		
		return muestra;
	}
}
