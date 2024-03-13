package Ejercicios;
import java.util.Scanner;
public class ejercicio20 {

	public static void main(String[] args) {
		int eur2, eur1, cent50, cent20, cent10, centimos;
		float euros;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantas monedas de 2€ tienes:");
		eur2 = Integer.parseInt(sc.nextLine());
		System.out.println("Cuantas monedas de 1€ tienes:");
		eur1 = Integer.parseInt(sc.nextLine());
		System.out.println("Cuantas monedas de 50cent tienes:");
		cent50 = Integer.parseInt(sc.nextLine());
		System.out.println("Cuantas monedas de 20cent tienes:");
		cent20 = Integer.parseInt(sc.nextLine());
		System.out.println("Cuantas monedas de 10cent tienes:");
		cent10 = Integer.parseInt(sc.nextLine());
		
		
		euros = eur2 * 2 + eur1 + (float)(cent50 * 50 + cent20 * 20 + cent10 * 10) / 100;
		centimos = (eur2 * 2 + eur1) * 100 + cent50 * 50 + cent20 * 20 + cent10 * 10;
		
		System.out.println("Tienes " + euros + "€ o, lo que es lo mismo, " + centimos + "cents.");
		
		sc.close();

	}

}
