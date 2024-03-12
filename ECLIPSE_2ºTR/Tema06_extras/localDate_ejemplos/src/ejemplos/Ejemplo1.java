<<<<<<< HEAD
package ejemplos;

import java.time.LocalDate;

public class Ejemplo1 {
	public static void main(String[] args) {
		/*
		 * Usamos el metodo now() de la clase LocalDate para obtener la fecha actual
		 */

		LocalDate currentDate = LocalDate.now();
		System.out.println("Hoy es: " + currentDate);
		/*
		 * Convertimos una fecha en formato LocalDate con el metodo of() de la clase
		 * LocalDate
		 */
		LocalDate unaFecha = LocalDate.of(2024, 01, 23);
		System.out.println("La fecha dada es: " + unaFecha);
	}
}
=======
package ejemplos;

import java.time.LocalDate;

public class Ejemplo1 {
	public static void main(String[] args) {
		/*
		 * Usamos el metodo now() de la clase LocalDate para obtener la fecha actual
		 */

		LocalDate currentDate = LocalDate.now();
		System.out.println("Hoy es: " + currentDate);
		/*
		 * Convertimos una fecha en formato LocalDate con el metodo of() de la clase
		 * LocalDate
		 */
		LocalDate unaFecha = LocalDate.of(2024, 01, 23);
		System.out.println("La fecha dada es: " + unaFecha);
	}
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
