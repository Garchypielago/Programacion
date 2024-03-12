<<<<<<< HEAD
package ejercicios;

import java.util.Scanner;

public class ejercicio05 {

	public static void main(String[] args) {
		int i, n;

		Scanner sc = new Scanner(System.in);

		System.out.println("De que número quieres la tabla");
		n = Integer.parseInt(sc.nextLine());

		for (i = 0; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + (n * i));
		}
		
		sc.close();
	}

}
=======
package ejercicios;

import java.util.Scanner;

public class ejercicio05 {

	public static void main(String[] args) {
		int i, n;

		Scanner sc = new Scanner(System.in);

		System.out.println("De que número quieres la tabla");
		n = Integer.parseInt(sc.nextLine());

		for (i = 0; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + (n * i));
		}
		
		sc.close();
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
