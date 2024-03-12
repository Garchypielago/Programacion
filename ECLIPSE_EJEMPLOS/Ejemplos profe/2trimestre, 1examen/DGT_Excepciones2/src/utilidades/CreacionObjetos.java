<<<<<<< HEAD
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
			System.out.println("Codigo del puesto de control preventivo (2 letras mayúsculas seguidas de 2 digitos):");
			try {
				muestra.setCodigo(sc.nextLine());
				repetir = false;
			}
			catch (CodigoIncorrectoException e){
				System.out.println(e.getMessage());
			}
		};

		System.out.print("Matricula del vehiculo:");
		muestra.setMatricula(sc.nextLine());	
		
		repetir = true;
		while (repetir) {
			System.out.println("Porcentaje de alcohol en sangre:");
			try {
				muestra.setPorcentaje(Float.parseFloat(sc.nextLine()));
				repetir = false;
			}
			catch (PorcentajeIncorrectoException e){
				System.out.println(e.getMessage());
			}
		};

		return muestra;
	}

}
=======
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
			System.out.println("Codigo del puesto de control preventivo (2 letras mayúsculas seguidas de 2 digitos):");
			try {
				muestra.setCodigo(sc.nextLine());
				repetir = false;
			}
			catch (CodigoIncorrectoException e){
				System.out.println(e.getMessage());
			}
		};

		System.out.print("Matricula del vehiculo:");
		muestra.setMatricula(sc.nextLine());	
		
		repetir = true;
		while (repetir) {
			System.out.println("Porcentaje de alcohol en sangre:");
			try {
				muestra.setPorcentaje(Float.parseFloat(sc.nextLine()));
				repetir = false;
			}
			catch (PorcentajeIncorrectoException e){
				System.out.println(e.getMessage());
			}
		};

		return muestra;
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
