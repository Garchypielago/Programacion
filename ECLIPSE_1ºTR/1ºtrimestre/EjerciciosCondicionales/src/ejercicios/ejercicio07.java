<<<<<<< HEAD
package ejercicios;
import java.util.Scanner;
public class ejercicio07 {

	public static void main(String[] args) {
		double base, exp;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime la base: ");
		base = Integer.parseInt(sc.nextLine());
		
		System.out.println("Dime el exponente: ");
		exp = Integer.parseInt(sc.nextLine());

		
		if (exp>=0) {
			System.out.println("El resultado es: " + Math.pow(base, exp));
		}
		else {
			exp = -1 * exp;
			System.out.println("El resultado es: " + 1 / Math.pow(base, exp));
		}

		sc.close();
	}
}
=======
package ejercicios;
import java.util.Scanner;
public class ejercicio07 {

	public static void main(String[] args) {
		double base, exp;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime la base: ");
		base = Integer.parseInt(sc.nextLine());
		
		System.out.println("Dime el exponente: ");
		exp = Integer.parseInt(sc.nextLine());

		
		if (exp>=0) {
			System.out.println("El resultado es: " + Math.pow(base, exp));
		}
		else {
			exp = -1 * exp;
			System.out.println("El resultado es: " + 1 / Math.pow(base, exp));
		}

		sc.close();
	}
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
