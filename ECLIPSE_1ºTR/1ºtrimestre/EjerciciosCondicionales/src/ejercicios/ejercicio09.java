package ejercicios;

import java.util.Scanner;

public class ejercicio09 {

	public static void main(String[] args) {
		double n1, n2, n3;

		Scanner sc = new Scanner(System.in);
		System.out.println("Primer número");
		n1 = Double.parseDouble(sc.nextLine());

		System.out.println("Segundo número");
		n2 = Double.parseDouble(sc.nextLine());

		System.out.println("Tercer número");
		n3 = Double.parseDouble(sc.nextLine());

//		if ( n1 > n2 && n2 > n3 ) {
//			System.out.println(n1 + ">" + n2 + ">" + n3);
//		}
//		else if ( n1 > n3 && n3 > n2) {
//			System.out.println(n1 + ">" + n3 + ">" + n2);
//		}
//		else if ( n2 > n1 && n1 > n3) {
//			System.out.println(n2 + ">" + n1 + ">" + n3);
//		}
//		else if ( n2 > n3 && n3 > n1) {
//			System.out.println(n2 + ">" + n3 + ">" + n1);
//		}
//		else if ( n3 > n2 && n2 > n1) {
//			System.out.println(n3 + ">" + n2 + ">" + n1);
//		}
//		else if ( n3 > n1 && n1 > n2) {
//			System.out.println(n3 + ">" + n1 + ">" + n2);
//		}
//		else {
//			System.out.println("Algún número es igual a otro");
//		}

		if (n1 > n2 && n1 > n3) {
			if (n2 > n3) {
				System.out.println(n1 + ">" + n2 + ">" + n3);
			} else {
				System.out.println(n1 + ">" + n3 + ">" + n2);
			}
		}

		else if (n2 > n1 && n2 > n3) {
			if (n1 > n3) {
				System.out.println(n2 + ">" + n1 + ">" + n3);
			} else {
				System.out.println(n2 + ">" + n3 + ">" + n1);
			}
		}
		
		else {
			if (n1 > n2) {
				System.out.println(n3 + ">" + n1 + ">" + n2);
			} else {
				System.out.println(n3 + ">" + n2 + ">" + n1);
			}
		}
		
		
		sc.close();

	}

}
