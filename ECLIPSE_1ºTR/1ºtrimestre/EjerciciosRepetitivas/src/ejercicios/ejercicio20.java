<<<<<<< HEAD
package ejercicios;

import java.util.Scanner;

public class ejercicio20 {

	public static void main(String[] args) {
		int num, i1, i2, impresos;
		boolean esprimo;

		Scanner sc = new Scanner(System.in);

		System.out.println("Cuantos numeros primos quieres sacar: ");
		num = Integer.parseInt(sc.nextLine());

		for (i1 = 2, impresos = 0; impresos < num; i1++) {

			for (i2 = 2, esprimo = true; i2 < i1; i2++) {

				if (i1 % i2 == 0) {
					esprimo = false;
				}

			}
			
			if (esprimo) {
				System.out.println(i1);
				impresos++;
			}
			
			esprimo = true;

		}

	}

}
=======
package ejercicios;

import java.util.Scanner;

public class ejercicio20 {

	public static void main(String[] args) {
		int num, i1, i2, impresos;
		boolean esprimo;

		Scanner sc = new Scanner(System.in);

		System.out.println("Cuantos numeros primos quieres sacar: ");
		num = Integer.parseInt(sc.nextLine());

		for (i1 = 2, impresos = 0; impresos < num; i1++) {

			for (i2 = 2, esprimo = true; i2 < i1; i2++) {

				if (i1 % i2 == 0) {
					esprimo = false;
				}

			}
			
			if (esprimo) {
				System.out.println(i1);
				impresos++;
			}
			
			esprimo = true;

		}

	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
