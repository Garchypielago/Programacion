package Ejercicios;
import java.util.Scanner;
public class ejercicio04 {

	public static void main(String[] args) {
		double n1, n2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los numeros:");
		n1 = Double.parseDouble(sc.nextLine());
		n2 = Double.parseDouble(sc.nextLine());
		
		System.out.println("La suma es " + (n1+n2));
		System.out.println("La resta es " + (n1-n2));
		System.out.println("La divisón es " + (n1/n2));
		System.out.println("La multiplicación es " + (n1*n2));
		
		sc.close();

	}

}
