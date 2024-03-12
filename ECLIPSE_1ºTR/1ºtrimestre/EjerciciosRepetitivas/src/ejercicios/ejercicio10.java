<<<<<<< HEAD
package ejercicios;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		double n, i = 2, primo, condicion = 0;
		String scondicion;

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Escribe tu numero:");
			n = Integer.parseInt(sc.nextLine());
		} while (n < 0);
		
		sc.close();
		/*while (i < n) {
			primo = n % i;
			if (primo == 0) {
				condicion++;
			}
			i++;
		}
		scondicion = (condicion > 0) ? "No es primo" : "Si es primo";
		*/
		
		if (n == 1) {
			condicion++;
		}
		
		for (i = 2; i < n ; i++) {
			primo = n % i;
			if (primo == 0) {
				condicion++;
			}
		}
		scondicion = (condicion > 0) ? "No es primo" : "Si es primo";
		
		System.out.println(scondicion);

	}

}
=======
package ejercicios;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		double n, i = 2, primo, condicion = 0;
		String scondicion;

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Escribe tu numero:");
			n = Integer.parseInt(sc.nextLine());
		} while (n < 0);
		
		sc.close();
		/*while (i < n) {
			primo = n % i;
			if (primo == 0) {
				condicion++;
			}
			i++;
		}
		scondicion = (condicion > 0) ? "No es primo" : "Si es primo";
		*/
		
		if (n == 1) {
			condicion++;
		}
		
		for (i = 2; i < n ; i++) {
			primo = n % i;
			if (primo == 0) {
				condicion++;
			}
		}
		scondicion = (condicion > 0) ? "No es primo" : "Si es primo";
		
		System.out.println(scondicion);

	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
