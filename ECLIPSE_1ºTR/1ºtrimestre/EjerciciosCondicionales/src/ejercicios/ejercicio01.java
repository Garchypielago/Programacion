package ejercicios;
import java.util.Scanner;
public class ejercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n1, n2;
		System.out.println("Escribe un número");
		n1 = Double.parseDouble(sc.nextLine());
		System.out.println("Escribe otr número");
		n2 = Double.parseDouble(sc.nextLine());
		
		if (n1>n2) {
			System.out.println(n1 + " es mayor que " + n2);
		}
			else if (n1<n2)	{
				System.out.println(n1 + " es menor que " + n2);
			}
			else {
				System.out.println(n1 + " es igual a " + n2);
			}

		sc.close();
	}

}
