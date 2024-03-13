package scanner;
import java.util.Scanner;
public class Scanner4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre, radioS, nS;
		double radio;
		int n;

		System.out.print("Introduzca el radio de la circunferencia: ");
		
		radioS = sc.nextLine();
		radio = Double.parseDouble(radioS);
		
		System.out.println("Longitud de la circunferencia: " + 2*Math.PI*radio);
		System.out.print("Introduzca un numero entero: ");
		
		nS = sc.nextLine();
		n = Integer.parseInt(nS);
		
		System.out.println("El cuadrado es: " + Math.pow(n,2));

		System.out.print("Introduzca su nombre: ");
		nombre = sc.nextLine(); //leemos el String despues del double
		System.out.println("Hola " + nombre + "!!!");
		
		sc.close();
	}
}
