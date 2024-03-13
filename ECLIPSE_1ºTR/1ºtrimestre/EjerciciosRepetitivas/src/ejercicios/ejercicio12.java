package ejercicios;

import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
		double i=0, dinero, ahorrado=0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("¿Cuanto has ahorrado este mes?");
			dinero = Double.parseDouble(sc.nextLine());
			ahorrado+=dinero;
			System.out.println("Llevas ahorrado: " + ahorrado + "€");
			i++;
		}while(i!=12);
		
		System.out.println("Has ahorrado en un año: " + ahorrado + "€");
		sc.close();
	}

}
