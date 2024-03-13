package Ejercicios;
import java.util.Scanner;
public class ejercicio18 {

	public static void main(String[] args) {
		String nombre, ape1, ape2;
		Character n1, a1, a2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		nombre = sc.nextLine();
		System.out.println("Introduce tu primer apellido");
		ape1 = sc.nextLine();
		System.out.println("Introduce tu segundo apellido");
		ape2 = sc.nextLine();
		
		nombre = nombre.toUpperCase();	
		ape1 = ape1.toUpperCase();
		ape2 = ape2.toUpperCase();
		
		n1 = nombre.charAt(0);
		a1 = ape1.charAt(0);
		a2 = ape2.charAt(0);
		
		System.out.println("Tus iniciales son: " + n1.toString() + a1.toString() + a2.toString() );
		sc.close();

	}

}
