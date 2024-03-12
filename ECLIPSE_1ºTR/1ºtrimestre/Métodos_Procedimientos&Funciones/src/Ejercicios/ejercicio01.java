<<<<<<< HEAD
package Ejercicios;

import java.util.Scanner;

public class ejercicio01 {

	public static void main(String[] args) {
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantas veces quieres escribirlo:");
		n=Integer.parseInt(sc.nextLine());
		repetir(n);
		
		sc.close();
	}
		
		public static void repetir(int x) {
			
			for (int i=1; i<=x; i++) {
			System.out.println("Módulo ejecutandose");
		}
	}

}
=======
package Ejercicios;

import java.util.Scanner;

public class ejercicio01 {

	public static void main(String[] args) {
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantas veces quieres escribirlo:");
		n=Integer.parseInt(sc.nextLine());
		repetir(n);
		
		sc.close();
	}
		
		public static void repetir(int x) {
			
			for (int i=1; i<=x; i++) {
			System.out.println("Módulo ejecutandose");
		}
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
