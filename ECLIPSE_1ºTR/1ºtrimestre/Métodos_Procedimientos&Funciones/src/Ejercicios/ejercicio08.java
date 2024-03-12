<<<<<<< HEAD

package Ejercicios;

import java.util.Scanner;

public class ejercicio08 {

	public static void main(String[] args) {
		int n1;

		Scanner sc = new Scanner(System.in);

		System.out.println("De que numero quieres saber las cifras");
		n1 = sc.nextInt();
		
		System.out.println("Tu número tiene " + cifras(n1) + " cifras.");

		sc.close();
		
	}

	public static int cifras(int x) {
		int cifras=0;
		
		if (x==0) {
			cifras = 1;
		}
		for (int i = 0; i < x; x = x / 10, cifras++) {
		}

		return cifras;
	}
}
=======

package Ejercicios;

import java.util.Scanner;

public class ejercicio08 {

	public static void main(String[] args) {
		int n1;

		Scanner sc = new Scanner(System.in);

		System.out.println("De que numero quieres saber las cifras");
		n1 = sc.nextInt();
		
		System.out.println("Tu número tiene " + cifras(n1) + " cifras.");

		sc.close();
		
	}

	public static int cifras(int x) {
		int cifras=0;
		
		if (x==0) {
			cifras = 1;
		}
		for (int i = 0; i < x; x = x / 10, cifras++) {
		}

		return cifras;
	}
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
