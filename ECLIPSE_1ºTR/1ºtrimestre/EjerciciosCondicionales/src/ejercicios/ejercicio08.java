<<<<<<< HEAD
package ejercicios;
import java.util.Scanner;
public class ejercicio08 {

	public static void main(String[] args) {
		int edad, nota;
		Character empadronado;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime tu edad");
		edad = Integer.parseInt(sc.nextLine());
		
		System.out.println("Dime tu nota");
		nota = Integer.parseInt(sc.nextLine());
		
		System.out.println("¿Estas aqui empadronado? (si:S, no:N)");
		empadronado = sc.nextLine().toUpperCase().charAt(0);
		
		

		//if (edad>=18 && nota>=5 && empadronado.equals('S')) {
		if (edad>=18 && nota>=5 && empadronado=='S') {
			System.out.println("ACEPTA@");
		}
		else if (edad>=18 && nota>=5 && empadronado.equals('N')) {
			System.out.println("POSIBLE");
		}
		else {
			System.out.println("NO ACEPTAD@");
		}
		
		sc.close();
		
	}

}
=======
package ejercicios;
import java.util.Scanner;
public class ejercicio08 {

	public static void main(String[] args) {
		int edad, nota;
		Character empadronado;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime tu edad");
		edad = Integer.parseInt(sc.nextLine());
		
		System.out.println("Dime tu nota");
		nota = Integer.parseInt(sc.nextLine());
		
		System.out.println("¿Estas aqui empadronado? (si:S, no:N)");
		empadronado = sc.nextLine().toUpperCase().charAt(0);
		
		

		//if (edad>=18 && nota>=5 && empadronado.equals('S')) {
		if (edad>=18 && nota>=5 && empadronado=='S') {
			System.out.println("ACEPTA@");
		}
		else if (edad>=18 && nota>=5 && empadronado.equals('N')) {
			System.out.println("POSIBLE");
		}
		else {
			System.out.println("NO ACEPTAD@");
		}
		
		sc.close();
		
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
