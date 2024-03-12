package ejemplosfor;

import java.util.Scanner;

public class AcumuladorPara {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int a, acum, i, n;
		// Acumulador del bucle Para
		acum = 0;
		// Contador del bucle
		i = 0;

		System.out.println("¿Cuantos numeros?");
		n = Integer.parseInt(sc.nextLine());
		
		for (i = 1; i <= n; i++) {
			System.out.println("Introduce número");
			a = Integer.parseInt(sc.nextLine());
			acum = acum + a;
		}

		System.out.println("la suma es " + acum);
		
		sc.close();
	}

}
