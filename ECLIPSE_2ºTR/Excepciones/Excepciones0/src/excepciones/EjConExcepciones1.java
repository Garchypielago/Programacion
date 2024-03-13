package excepciones;

import java.util.*;

public class EjConExcepciones1 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int num=0;

		do {
		try {
			System.out.println("Introduce una posicion");
			num = Integer.parseInt(scanner.nextLine());			
			System.out.println("Despues");
		} catch (ArrayIndexOutOfBoundsException error) {
			System.out.println(" Error " + "Introduzca una posicion dentro del rango del array");
		} catch (InputMismatchException error) {//lo da el nextInt
			System.out.println(" Error " + "Introduzca una posicion en formato numerico");
		} catch (NumberFormatException error) {// lo da el parseInt
			System.out.println(" Error " + "El dato leido no es numerico");
		} catch (Exception error) {
			System.out.println(" Error " + error);// Ejecuta el m�todo toString()
		}

		System.out.println("Fuera");
		scanner.close();

	}while(num!=0);
	}

	public static void mostrarEntero(String args[], int n) {
		System.out.println("Entero " + obtenerEntero(args, n));
	}

	public static int obtenerEntero(String args[], int n) {
		return Integer.parseInt(args[n]);
	}
}
