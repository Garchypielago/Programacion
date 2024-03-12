package Basicos01;

import java.util.Scanner;

public class ejercicio08 {

	public static void main(String[] args) {
		int n;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Escribe tu numero (debe ser mayor a 2):");
			n = Integer.parseInt(sc.nextLine());

			
		} while (n <= 2);
		
		Fibonacci(n);
		sc.close();
	}

	public static void Fibonacci(int x) {
		int y=1, z=0;
		
		System.out.println("La sucesión de Fobinacci de " + x + " números son:");
		
		for (int i= 1;i<=x; i++) {
			y=z+y;
			
			z=y-z;
			
			if(i<x) {
			System.out.print(z + ", ");
			}else {
				System.out.print(z + ".");
			}
		}
		
	}

}
