<<<<<<< HEAD
package Ejercicios;
import java.util.Scanner;
public class ejercicio09 {

	public static void main(String[] args) {
		double compra, descuento, total;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el importe de la compra para aplicra el 15% de descuneto:");
		compra = Double.parseDouble(sc.nextLine());
		
		descuento = compra * 0.15;
		total = compra - descuento;
		
		System.out.println("Su sompra ha sido de " + compra + "€ con un descuento de " + descuento + "€, por lo que el total es de " + total + "€"); 
		
		sc.close();
		

	}

}
=======
package Ejercicios;
import java.util.Scanner;
public class ejercicio09 {

	public static void main(String[] args) {
		double compra, descuento, total;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el importe de la compra para aplicra el 15% de descuneto:");
		compra = Double.parseDouble(sc.nextLine());
		
		descuento = compra * 0.15;
		total = compra - descuento;
		
		System.out.println("Su sompra ha sido de " + compra + "€ con un descuento de " + descuento + "€, por lo que el total es de " + total + "€"); 
		
		sc.close();
		

	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
