<<<<<<< HEAD
package excepciones;

import java.util.*;

public class Prueba3 {

	public static void main(String[] args) {
		int a = 0, b = 0;

		boolean ex;

		Scanner sc = new Scanner(System.in);

		// Esta es la forma correcta
		do {

			try {
				
				System.out.print("Introduce el primer numero a: ");
				a = Integer.parseInt(sc.nextLine());
				System.out.print("Introduce el segundo numero b: ");
				b = Integer.parseInt(sc.nextLine());
				ex = false;
				/*
				 * } catch (InputMismatchException | NumberFormatException exc) {// A partir de
				 * la v. 8 se puede hacer así
				 * System.out.println("Error, lo introducido no es valido: " +
				 * exc.getMessage()); ex = true;
				 */
			} catch (InputMismatchException exc) { // saldria si se hiciera nextInt, ahora ya no saldra
				System.out.println("Error, lo introducido no es valido: " + exc.toString());
				ex = true;
			} catch (NumberFormatException exc) {// Siempre va a salir por aqui, por la lectura de escaner con nextLine
				System.out.println("Error, lo introducido no es un numero: " + exc.toString());
				ex = true;
			}

		} while (ex);
		sc.close();
		System.out.println("a " + a + " b " + b);
	}

}
=======
package excepciones;

import java.util.*;

public class Prueba3 {

	public static void main(String[] args) {
		int a = 0, b = 0;

		boolean ex;

		Scanner sc = new Scanner(System.in);

		// Esta es la forma correcta
		do {

			try {
				
				System.out.print("Introduce el primer numero a: ");
				a = Integer.parseInt(sc.nextLine());
				System.out.print("Introduce el segundo numero b: ");
				b = Integer.parseInt(sc.nextLine());
				ex = false;
				/*
				 * } catch (InputMismatchException | NumberFormatException exc) {// A partir de
				 * la v. 8 se puede hacer así
				 * System.out.println("Error, lo introducido no es valido: " +
				 * exc.getMessage()); ex = true;
				 */
			} catch (InputMismatchException exc) { // saldria si se hiciera nextInt, ahora ya no saldra
				System.out.println("Error, lo introducido no es valido: " + exc.toString());
				ex = true;
			} catch (NumberFormatException exc) {// Siempre va a salir por aqui, por la lectura de escaner con nextLine
				System.out.println("Error, lo introducido no es un numero: " + exc.toString());
				ex = true;
			}

		} while (ex);
		sc.close();
		System.out.println("a " + a + " b " + b);
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
