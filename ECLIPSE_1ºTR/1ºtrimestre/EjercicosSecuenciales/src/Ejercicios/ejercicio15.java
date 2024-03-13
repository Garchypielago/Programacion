package Ejercicios;
import java.util.Scanner;
public class ejercicio15 {

	public static void main(String[] args) {
		double a1, a2, b1, b2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el valor de A: ");
		a1 = Double.parseDouble(sc.nextLine());
		
		System.out.println("Escribe el valor de B: ");
		b1 = Double.parseDouble(sc.nextLine());
		
		a2 = b1;
		b2 = a1;
		
		System.out.println("El valor de A es: " + a2 + "\nEl valor de B es: " + b2);
		
		sc.close();
		

	}

}
