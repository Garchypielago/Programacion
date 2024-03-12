<<<<<<< HEAD
package Ejercicios;

import java.util.Scanner;

public class ejercicio05 {

	public static void main(String[] args) {
		float n1, n2;
		String entrada;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("--------------------------------------------\n"
					+ "Escribe que operación quieres realizar:\n" + "Suma\nResta\nMultiplicación\nDivisión\n"
					+ "--------------------------------------------");
			entrada = sc.nextLine().toLowerCase();
		} while (!entrada.equalsIgnoreCase("suma") && !entrada.equalsIgnoreCase("resta")
				&& !entrada.equalsIgnoreCase("multiplicación") && !entrada.equalsIgnoreCase("división"));

		System.out.println("Cual es el primer numero");
		n1 = Integer.parseInt(sc.nextLine());
		System.out.println("Cual es el segundo numero");
		n2 = Integer.parseInt(sc.nextLine());

		switch (entrada) {
		case "suma":
			System.out.println("La suma es: " + suma(n1, n2));
			break;
		case "resta":
			System.out.println("La resta es: " + resta(n1, n2));
			break;
		case "multiplicación":
			System.out.println("La multiplicación es: " + multi(n1, n2));
			break;
		case "división":
			System.out.println("La división es: " + divi(n1, n2));
			break;
		}
		sc.close();
	}

	public static float suma(float a, float b) {
		return a + b;
	}

	public static float resta(float a, float b) {
		return a - b;
	}

	public static float multi(float a, float b) {
		return a * b;
	}

	public static float divi(float a, float b) {
		return a / b;
	}

}
=======
package Ejercicios;

import java.util.Scanner;

public class ejercicio05 {

	public static void main(String[] args) {
		float n1, n2;
		String entrada;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("--------------------------------------------\n"
					+ "Escribe que operación quieres realizar:\n" + "Suma\nResta\nMultiplicación\nDivisión\n"
					+ "--------------------------------------------");
			entrada = sc.nextLine().toLowerCase();
		} while (!entrada.equalsIgnoreCase("suma") && !entrada.equalsIgnoreCase("resta")
				&& !entrada.equalsIgnoreCase("multiplicación") && !entrada.equalsIgnoreCase("división"));

		System.out.println("Cual es el primer numero");
		n1 = Integer.parseInt(sc.nextLine());
		System.out.println("Cual es el segundo numero");
		n2 = Integer.parseInt(sc.nextLine());

		switch (entrada) {
		case "suma":
			System.out.println("La suma es: " + suma(n1, n2));
			break;
		case "resta":
			System.out.println("La resta es: " + resta(n1, n2));
			break;
		case "multiplicación":
			System.out.println("La multiplicación es: " + multi(n1, n2));
			break;
		case "división":
			System.out.println("La división es: " + divi(n1, n2));
			break;
		}
		sc.close();
	}

	public static float suma(float a, float b) {
		return a + b;
	}

	public static float resta(float a, float b) {
		return a - b;
	}

	public static float multi(float a, float b) {
		return a * b;
	}

	public static float divi(float a, float b) {
		return a / b;
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
