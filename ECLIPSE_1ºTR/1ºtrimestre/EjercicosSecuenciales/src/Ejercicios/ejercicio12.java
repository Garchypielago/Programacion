<<<<<<< HEAD
package Ejercicios;
import java.util.Scanner;
public class ejercicio12 {

	public static void main(String[] args) {
		double x1, x2, y1, y2, d;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe la cardinalidad horizontal de la primera coordenada y despues la vertical");
		x1 = Double.parseDouble(sc.nextLine());
		y1 = Double.parseDouble(sc.nextLine());
		
		System.out.println("Escribe la cardinalidad horizontal de la segunda coordenada y despues la vertical");
		x2 = Double.parseDouble(sc.nextLine());
		y2 = Double.parseDouble(sc.nextLine());

		d = Math.sqrt( Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)  );
		
		System.out.println("La dsitancia entre las coordenadas es de: " + d );
		
		sc.close();
		
	}

}
=======
package Ejercicios;
import java.util.Scanner;
public class ejercicio12 {

	public static void main(String[] args) {
		double x1, x2, y1, y2, d;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe la cardinalidad horizontal de la primera coordenada y despues la vertical");
		x1 = Double.parseDouble(sc.nextLine());
		y1 = Double.parseDouble(sc.nextLine());
		
		System.out.println("Escribe la cardinalidad horizontal de la segunda coordenada y despues la vertical");
		x2 = Double.parseDouble(sc.nextLine());
		y2 = Double.parseDouble(sc.nextLine());

		d = Math.sqrt( Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)  );
		
		System.out.println("La dsitancia entre las coordenadas es de: " + d );
		
		sc.close();
		
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
