<<<<<<< HEAD
package Ejercicios;
import java.util.Scanner;
public class ejercicio14 {

	public static void main(String[] args) {
		/*int n1, n2, n3, n4;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número: ");
		n1 = Integer.parseInt(sc.nextLine());
		
		n2 = n1 / 10;
		
		n3 = n1 % 10;
		
		System.out.println("Dado la vuelta: " + n3 + n2);
		*/
		
		String n;
		Character c1, c2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero de dos cifras:");
		n = sc.nextLine();
		
		c1 = n.charAt(0);
		c2 = n.charAt(1);
		
		System.out.println("Dado la vuelta: " + c2.toString() + c1.toString() );
		
		sc.close();
		

	}

}
=======
package Ejercicios;
import java.util.Scanner;
public class ejercicio14 {

	public static void main(String[] args) {
		/*int n1, n2, n3, n4;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número: ");
		n1 = Integer.parseInt(sc.nextLine());
		
		n2 = n1 / 10;
		
		n3 = n1 % 10;
		
		System.out.println("Dado la vuelta: " + n3 + n2);
		*/
		
		String n;
		Character c1, c2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero de dos cifras:");
		n = sc.nextLine();
		
		c1 = n.charAt(0);
		c2 = n.charAt(1);
		
		System.out.println("Dado la vuelta: " + c2.toString() + c1.toString() );
		
		sc.close();
		

	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
