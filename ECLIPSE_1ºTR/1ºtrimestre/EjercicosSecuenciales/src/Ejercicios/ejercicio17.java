package Ejercicios;
import java.util.Scanner;
public class ejercicio17 {

	public static void main(String[] args) {
		int h1, m1, s1, t, h2, m2, s2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la H, los M y los S de partida de la ciudad A, primero la H: ");
		h1 = Integer.parseInt(sc.nextLine());
		System.out.println("Ahora los M: ");
		m1 = Integer.parseInt(sc.nextLine());
		System.out.println("Y por ultimo los S: ");
		s1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("Introduce el tiempo en segundos que tarda en llegar: ");
		t = Integer.parseInt(sc.nextLine());
		
		
		h2 = h1 + t / 3600;
		m2 = m1 + ( t % 3600 ) / 60;
		s2 = s1 + (( t % 360 ) % 60) / 60;
		
		System.out.println("El tiempo de llegada es a las " + h2 + "h " + m2 + "m y " + s2 + "s.");
		
		sc.close();

	}

}
