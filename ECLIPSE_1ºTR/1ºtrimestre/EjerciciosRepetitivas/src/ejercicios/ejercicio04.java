<<<<<<< HEAD
package ejercicios;

import java.util.Scanner;

public class ejercicio04 {

	public static void main(String[] args) {
		Integer n1, n2, n3, n4;

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe el primer número");
		n1 = Integer.parseInt(sc.nextLine());
		System.out.println("Escribe el segundo número");
		n2 = Integer.parseInt(sc.nextLine());

		n3 = Integer.min(n1, n2);
		n4 = Integer.max(n1, n2);

		/*while (n3 != n4) {

			if (n3 % 2 == 0) {
				System.out.println(n3);
			}
			n3++;
		}

		if (n4 % 2 == 0) {
			System.out.println(n4);
		}
		*/
		
		for ( ; n3!=n4; n3++ ) {
			if (n3 % 2 == 0) {
				System.out.println(n3);
			}
		}
		
		if (n4 % 2 == 0) {
			System.out.println(n4);
		}
		
		System.out.println("Esos son lo números pares.");

		sc.close();

	}

}
=======
package ejercicios;

import java.util.Scanner;

public class ejercicio04 {

	public static void main(String[] args) {
		Integer n1, n2, n3, n4;

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe el primer número");
		n1 = Integer.parseInt(sc.nextLine());
		System.out.println("Escribe el segundo número");
		n2 = Integer.parseInt(sc.nextLine());

		n3 = Integer.min(n1, n2);
		n4 = Integer.max(n1, n2);

		/*while (n3 != n4) {

			if (n3 % 2 == 0) {
				System.out.println(n3);
			}
			n3++;
		}

		if (n4 % 2 == 0) {
			System.out.println(n4);
		}
		*/
		
		for ( ; n3!=n4; n3++ ) {
			if (n3 % 2 == 0) {
				System.out.println(n3);
			}
		}
		
		if (n4 % 2 == 0) {
			System.out.println(n4);
		}
		
		System.out.println("Esos son lo números pares.");

		sc.close();

	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
