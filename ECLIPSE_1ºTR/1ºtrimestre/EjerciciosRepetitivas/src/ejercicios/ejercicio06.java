<<<<<<< HEAD
package ejercicios;

import java.util.Scanner;

public class ejercicio06 {

	public static void main(String[] args) {
		int i1, i2, n, suma = 0, fuera = 0, igual = 0;
		String sigual = null;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Límite inferior");
			i1 = Integer.parseInt(sc.nextLine());

			System.out.println("Límite superior");
			i2 = Integer.parseInt(sc.nextLine());
		} while (i1 > i2);

		/*System.out.println("Introduce el primer número, se pausa con el 0");
		n = Integer.parseInt(sc.nextLine());

		while (n != 0) {

			if (n >= i1 && n <= i2) {
				suma += n;
				if (n == i1 || n == i2) {
					igual++;
				}
			} else {
				fuera++;
			}

			System.out.println("Introduce otro número, se pausa con el 0");
			n = Integer.parseInt(sc.nextLine());
		}
		*/
		
		do {
			System.out.println("Introduce un número, se pausa con el 0");
			n = Integer.parseInt(sc.nextLine());
			
			if (n >= i1 && n <= i2) {
				suma += n;
				if (n == i1 || n == i2) {
					igual++;
				}
			} else {
				fuera++;
			}
		} while (n != 0);

		
		sigual = igual > 0 ? " si ha habido número en intervalo" : " no ha habido números en intervalo";

		System.out.println("La suma de los números es " + suma + ", ha habido " + fuera
				+ " números fuera del intervalo, y" + sigual);
		sc.close();
	}

}
=======
package ejercicios;

import java.util.Scanner;

public class ejercicio06 {

	public static void main(String[] args) {
		int i1, i2, n, suma = 0, fuera = 0, igual = 0;
		String sigual = null;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Límite inferior");
			i1 = Integer.parseInt(sc.nextLine());

			System.out.println("Límite superior");
			i2 = Integer.parseInt(sc.nextLine());
		} while (i1 > i2);

		/*System.out.println("Introduce el primer número, se pausa con el 0");
		n = Integer.parseInt(sc.nextLine());

		while (n != 0) {

			if (n >= i1 && n <= i2) {
				suma += n;
				if (n == i1 || n == i2) {
					igual++;
				}
			} else {
				fuera++;
			}

			System.out.println("Introduce otro número, se pausa con el 0");
			n = Integer.parseInt(sc.nextLine());
		}
		*/
		
		do {
			System.out.println("Introduce un número, se pausa con el 0");
			n = Integer.parseInt(sc.nextLine());
			
			if (n >= i1 && n <= i2) {
				suma += n;
				if (n == i1 || n == i2) {
					igual++;
				}
			} else {
				fuera++;
			}
		} while (n != 0);

		
		sigual = igual > 0 ? " si ha habido número en intervalo" : " no ha habido números en intervalo";

		System.out.println("La suma de los números es " + suma + ", ha habido " + fuera
				+ " números fuera del intervalo, y" + sigual);
		sc.close();
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
