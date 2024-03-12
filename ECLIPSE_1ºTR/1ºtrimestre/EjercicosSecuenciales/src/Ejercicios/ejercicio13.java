<<<<<<< HEAD
package Ejercicios;
import java.util.Scanner;
public class ejercicio13 {

	public static void main(String[] args) {
		double n, r2, r3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el número: ");
		n = Double.parseDouble(sc.nextLine());
		
		r2 = Math.sqrt(n);
		r3 = Math.pow(n, (1/3.0)); //no se si habra otro metodo
		
		
		System.out.println("La raiz cuadrada es: " + r2 + "\nLa raiz cúbica es:  " + r3);
		
		sc.close();
	}
}	
=======
package Ejercicios;
import java.util.Scanner;
public class ejercicio13 {

	public static void main(String[] args) {
		double n, r2, r3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el número: ");
		n = Double.parseDouble(sc.nextLine());
		
		r2 = Math.sqrt(n);
		r3 = Math.pow(n, (1/3.0)); //no se si habra otro metodo
		
		
		System.out.println("La raiz cuadrada es: " + r2 + "\nLa raiz cúbica es:  " + r3);
		
		sc.close();
	}
}	
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
