<<<<<<< HEAD
package Ejercicios;
import java.util.Scanner;
public class ejercicio02 {

	public static void main(String[] args) {
		double b, h;
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la base y la altura:");
		b = Double.parseDouble(sc.nextLine());
		h = Double.parseDouble(sc.nextLine());
		
		System.out.println("El perímetro es " + (2*b+2*h));
		System.out.println("El área es " + (b*h));
		
		sc.close();
	}

}
=======
package Ejercicios;
import java.util.Scanner;
public class ejercicio02 {

	public static void main(String[] args) {
		double b, h;
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la base y la altura:");
		b = Double.parseDouble(sc.nextLine());
		h = Double.parseDouble(sc.nextLine());
		
		System.out.println("El perímetro es " + (2*b+2*h));
		System.out.println("El área es " + (b*h));
		
		sc.close();
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
