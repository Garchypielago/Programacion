package ejercicios;
import java.util.Scanner;
public class ejercicio06 {

	public static void main(String[] args) {
		String cadena;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe la cadena: ");
		cadena = sc.nextLine();
		
		if (cadena.equals(cadena.toUpperCase())) {
			System.out.println("La cadena esta en MAYUSCULAS");
		}
		else {
			System.out.println("La cadena esta en minusculas");
		}
		
		sc.close();
	}

}
