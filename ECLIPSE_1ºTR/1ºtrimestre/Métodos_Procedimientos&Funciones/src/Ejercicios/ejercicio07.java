package Ejercicios;

import java.util.Scanner;

public class ejercicio07 {

	public static void main(String[] args) {
		int n1;

		Scanner sc = new Scanner(System.in);

		System.out.println("Que número quieres convertir:");
		n1 = Integer.parseInt(sc.nextLine());

		binario(n1);

		sc.close();
	}

	public static void binario(int x) {
		int coeficiente, resto;
		String acumulador="";

		coeficiente = x / 2;
		resto = (x % 2);

		while (coeficiente != 0){

			acumulador = String.valueOf(resto) + acumulador ;

			resto = (coeficiente % 2);
			coeficiente = coeficiente / 2;
			
		}
		acumulador = String.valueOf(resto) + acumulador ;
		
		System.out.println(acumulador);
	}

}
