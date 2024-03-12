package Ejercicios;

import java.util.Scanner;
public class ejercicio01 {

	public static void main(String[] args) {
		
		String nombre;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre:");
		nombre = sc.nextLine();
		System.out.println("Hola " + nombre);

		sc.close();
	}

}
