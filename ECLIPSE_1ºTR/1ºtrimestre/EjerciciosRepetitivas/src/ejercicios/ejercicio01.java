<<<<<<< HEAD
package ejercicios;

import java.util.Scanner;

public class ejercicio01 {

	public static void main(String[] args) {
		int i, n, suma;
		double media;

		Scanner sc = new Scanner(System.in);

		i = 0;
		suma = 0;

		System.out.println("Escribe un numero, se pausa con un 0");
		n = Integer.parseInt(sc.nextLine());

		while (n != 0) {
			suma += n;
			i++;

			System.out.println("Escribe un numero, se pausa con un 0");
			n = Integer.parseInt(sc.nextLine());
		}
		
		if (i>0) {
		media = suma / (double) i;
		} else {
			media = 0;
		}

		System.out.println("La suma es " + suma + ". Y la media es " + media + ".");
		sc.close();

	}

}
=======
package ejercicios;

import java.util.Scanner;

public class ejercicio01 {

	public static void main(String[] args) {
		int i, n, suma;
		double media;

		Scanner sc = new Scanner(System.in);

		i = 0;
		suma = 0;

		System.out.println("Escribe un numero, se pausa con un 0");
		n = Integer.parseInt(sc.nextLine());

		while (n != 0) {
			suma += n;
			i++;

			System.out.println("Escribe un numero, se pausa con un 0");
			n = Integer.parseInt(sc.nextLine());
		}
		
		if (i>0) {
		media = suma / (double) i;
		} else {
			media = 0;
		}

		System.out.println("La suma es " + suma + ". Y la media es " + media + ".");
		sc.close();

	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
