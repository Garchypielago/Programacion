package ejercicios;
import java.util.Scanner;
public class ejercicio04 {

	public static void main(String[] args) {
		double dividendo, divisor, resul;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe el dividendo");
		dividendo = Double.parseDouble(sc.nextLine());
		
		System.out.println("Escribe el divisor");
		divisor = Double.parseDouble(sc.nextLine());
		
		resul = dividendo / divisor;
		
		if (divisor == 0) {
			System.out.println("Tu divisor no puede ser 0");
		}
			else {
			System.out.println("El resultado de la división es: " + resul);
			}
		
		sc.close();
		
	}
}
