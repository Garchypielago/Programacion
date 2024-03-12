<<<<<<< HEAD
package ejercicios;
import java.util.Scanner;
public class ejercicio14 {

	public static void main(String[] args) {
		double precio, kilo, A1, B1, A2, B2;
		String tipo;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Escibe el precio por kilo inicial de la uva");
		precio = Double.parseDouble(sc.nextLine());
		
		System.out.println("Escibe los kilos de uva");
		kilo = Double.parseDouble(sc.nextLine());
		
		System.out.println("Escibe el tipo y tamaño de la uva (A1, A2, B1, B2");
		tipo = sc.nextLine().toUpperCase();
		
		if ( tipo.equals("A1") ) {
			A1 = (precio + 0.2) * kilo;
			System.out.println("Tu ganacia seria de " + A1 + "€");
		} else if ( tipo.equals("A2") ) {
			A2 = (precio + 0.3) * kilo;
			System.out.println("Tu ganacia seria de " + A2 + "€");
		} else if ( tipo.equals("B1") ) {
			B1 = (precio - 0.3) * kilo;
			System.out.println("Tu ganacia seria de " + B1 + "€");
		}else if ( tipo.equals("B2") ) {
			B2 = (precio - 0.5) * kilo;
			System.out.println("Tu ganacia seria de " + B2 + "€");
		} else {
			System.out.println("No valido, escibe el tipo y tamaño de la uva (A1, A2, B1, B2");
			tipo = sc.nextLine().toUpperCase();
		}
		
		sc.close();
	}

}
=======
package ejercicios;
import java.util.Scanner;
public class ejercicio14 {

	public static void main(String[] args) {
		double precio, kilo, A1, B1, A2, B2;
		String tipo;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Escibe el precio por kilo inicial de la uva");
		precio = Double.parseDouble(sc.nextLine());
		
		System.out.println("Escibe los kilos de uva");
		kilo = Double.parseDouble(sc.nextLine());
		
		System.out.println("Escibe el tipo y tamaño de la uva (A1, A2, B1, B2");
		tipo = sc.nextLine().toUpperCase();
		
		if ( tipo.equals("A1") ) {
			A1 = (precio + 0.2) * kilo;
			System.out.println("Tu ganacia seria de " + A1 + "€");
		} else if ( tipo.equals("A2") ) {
			A2 = (precio + 0.3) * kilo;
			System.out.println("Tu ganacia seria de " + A2 + "€");
		} else if ( tipo.equals("B1") ) {
			B1 = (precio - 0.3) * kilo;
			System.out.println("Tu ganacia seria de " + B1 + "€");
		}else if ( tipo.equals("B2") ) {
			B2 = (precio - 0.5) * kilo;
			System.out.println("Tu ganacia seria de " + B2 + "€");
		} else {
			System.out.println("No valido, escibe el tipo y tamaño de la uva (A1, A2, B1, B2");
			tipo = sc.nextLine().toUpperCase();
		}
		
		sc.close();
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
