package ejercicios;

import java.util.Scanner;

public class ejercicio03 {

	public static void main(String[] args) {
		char c1;

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe el caracter, si hay mas de uno solo se evaluara el primero, usa el espacio para parar");
		c1 = sc.nextLine().toLowerCase().charAt(0);

		/*while (c1 != ' ') {
			if (c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u') {
				System.out.println("VOCAL");
			} else {
				System.out.println("CONSONANTE");
			}
			System.out.println("Escribe otro caracter, si hay mas de uno solo se evaluara el primero");
			c1 = sc.nextLine().toLowerCase().charAt(0);
		}
		*/
		
		for ( ; c1 !=' '; ) {
			if (c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u') {
				System.out.println("VOCAL");
			} else {
				System.out.println("CONSONANTE");
			}
			System.out.println("Escribe otro caracter, si hay mas de uno solo se evaluara el primero, usa el espacio para parar");
			c1 = sc.nextLine().toLowerCase().charAt(0);
			
		}
		
		
		System.out.println("Fin de programa");
		sc.close();

	}

}