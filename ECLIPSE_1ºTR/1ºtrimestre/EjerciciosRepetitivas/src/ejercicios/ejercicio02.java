<<<<<<< HEAD
package ejercicios;

import java.util.Scanner;

public class ejercicio02 {

	public static void main(String[] args) {
		int i = 0, c, n, mayor = 0, menor = 0, igual = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe la cantidad de números");
		c = Integer.parseInt(sc.nextLine());

		while (i != c) {

			i++;

			System.out.println("Escribe un numero");
			n = Integer.parseInt(sc.nextLine());

			if (n > 0) {
				mayor++;
			} else if (n < 0) {
				menor++;
			} else {
				igual++;
			}

		}

		System.out.println("Has escrito " + igual + " iguales a 0, " + mayor + " positivos, y " + menor + " negativos.");
		sc.close();

	}

}
=======
package ejercicios;

import java.util.Scanner;

public class ejercicio02 {

	public static void main(String[] args) {
		int i = 0, c, n, mayor = 0, menor = 0, igual = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe la cantidad de números");
		c = Integer.parseInt(sc.nextLine());

		while (i != c) {

			i++;

			System.out.println("Escribe un numero");
			n = Integer.parseInt(sc.nextLine());

			if (n > 0) {
				mayor++;
			} else if (n < 0) {
				menor++;
			} else {
				igual++;
			}

		}

		System.out.println("Has escrito " + igual + " iguales a 0, " + mayor + " positivos, y " + menor + " negativos.");
		sc.close();

	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
