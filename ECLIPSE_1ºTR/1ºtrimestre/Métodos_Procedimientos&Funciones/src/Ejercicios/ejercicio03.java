<<<<<<< HEAD
package Ejercicios;

import java.util.Scanner;

public class ejercicio03 {

	public static void main(String[] args) {
		int n1, n2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Tu primer numero");
		n1 = Integer.parseInt(sc.nextLine());
		System.out.println("Tu segundo numero");
		n2 = Integer.parseInt(sc.nextLine());
		
		System.out.println("Suma: " + suma(n1,n2));
		sc.close();
	}
	
	public static int suma(int a, int b) {
		return a + b;
	}
}
=======
package Ejercicios;

import java.util.Scanner;

public class ejercicio03 {

	public static void main(String[] args) {
		int n1, n2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Tu primer numero");
		n1 = Integer.parseInt(sc.nextLine());
		System.out.println("Tu segundo numero");
		n2 = Integer.parseInt(sc.nextLine());
		
		System.out.println("Suma: " + suma(n1,n2));
		sc.close();
	}
	
	public static int suma(int a, int b) {
		return a + b;
	}
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
