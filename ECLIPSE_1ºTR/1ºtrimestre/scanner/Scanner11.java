package scanner;
import java.util.Scanner;
	// Programa Java para leer algunos valores usando la clase Scanner
	// e imprimir su media

public class Scanner11 {
	public static void main(String[] args) {
		// Declarar un objeto e inicializar con
		// el objeto de entrada estandar predefinido
		Scanner sc = new Scanner(System.in);

		// Inicializar la suma y el recuento
		// de los elementos de entrada
		int sum = 0, cuenta = 0;

		// Compruebe si un valor int esta disponible
		while (sc.hasNextInt()) {
			// Lee un valor int
			int num = sc.nextInt();
			sum += num;
			cuenta++;
		} // Acaba con Ctrl+Z
		int media = sum / cuenta;
		System.out.println("La media es: " + media);
		sc.close();
	}

}
