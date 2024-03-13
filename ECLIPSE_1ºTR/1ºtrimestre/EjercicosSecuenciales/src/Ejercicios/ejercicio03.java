package Ejercicios;
import java.util.Scanner;
public class ejercicio03 {

	public static void main(String[] args) {
		double c1, c2, h;
				
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Introduce los catetos:");
		c1 = Double.parseDouble(sc.nextLine());
		c2 = Double.parseDouble(sc.nextLine());
				
		h = Math.sqrt((Math.pow(c1, 2) + Math.pow(c2, 2)));
		
		System.out.println("La hipotenusa es " + h);
		

		sc.close();
	}

}
