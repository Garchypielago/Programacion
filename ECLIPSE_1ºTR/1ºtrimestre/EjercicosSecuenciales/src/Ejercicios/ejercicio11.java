<<<<<<< HEAD
package Ejercicios;
import java.util.Scanner;
public class ejercicio11 {

	public static void main(String[] args) {
		double n1, n2, d;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el primer número: ");
		n1= Double.parseDouble(sc.nextLine());
		
		System.out.println("Escribe el segundo número: ");
		n2= Double.parseDouble(sc.nextLine());
		
		d = Math.abs(n1-n2);
		
		System.out.println("La distancia entre tus números es de: " + d );
		
		sc.close();

	}

}
=======
package Ejercicios;
import java.util.Scanner;
public class ejercicio11 {

	public static void main(String[] args) {
		double n1, n2, d;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el primer número: ");
		n1= Double.parseDouble(sc.nextLine());
		
		System.out.println("Escribe el segundo número: ");
		n2= Double.parseDouble(sc.nextLine());
		
		d = Math.abs(n1-n2);
		
		System.out.println("La distancia entre tus números es de: " + d );
		
		sc.close();

	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
