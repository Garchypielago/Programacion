package Ejercicios;
import java.util.Scanner;
public class ejercicio06 {

	public static void main(String[] args) {
		double n1, n2, n3, m;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer número:");
		n1 = Double.parseDouble(sc.nextLine());
		
		System.out.println("Introduce el segundo número:");
		n2 = Double.parseDouble(sc.nextLine());
		
		System.out.println("Introduce el tercer número:");
		n3 = Double.parseDouble(sc.nextLine());
		
		
		m = (n1+n2+n3)/3;
		
		System.out.println("La media es de " + m);

		sc.close();
	}

}
