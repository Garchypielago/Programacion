package scanner;
import java.util.Scanner;
public class Scanner1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double radio;
		int n;

		System.out.print("Introduzca el radio de la circunferencia: ");
		radio = sc.nextDouble();		
		System.out.println("Longitud de la circunferencia: " + 2*Math.PI*radio);
		
		System.out.print("Introduzca un numero entero: ");
		n = sc.nextInt();
		System.out.println("El cuadrado es: " + Math.pow(n,2));
		
		sc.close();
	}
}
