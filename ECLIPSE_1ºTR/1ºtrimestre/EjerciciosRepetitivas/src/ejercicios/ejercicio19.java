package ejercicios;

import java.util.Scanner;

public class ejercicio19 {

	public static void main(String[] args) {
		String entrada;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("-----------¿Que quiere hacer?-----------\n");
			System.out.println("-Saludar->   Que el programa salude.");
			System.out.println("-Despedir->  Que el programa se despida.");
			System.out.println("-Salir->     Que el programa finalice.");
			System.out.println("----------------------------------------");
			
			entrada = sc.nextLine();
			
			if(entrada.equalsIgnoreCase("saludar")) {
				System.out.println("\nBuenos dias!!\n");
			} else if (entrada.equalsIgnoreCase("despedir")) {
				System.out.println("\nHasta ahora!!\n");
			}
				
		} while (!entrada.equalsIgnoreCase("salir"));
		
		System.out.println("\nAhora si que si, hasta pronto!!");
		
		sc.close();

	}

}
