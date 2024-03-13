package Ejercicios;
import java.util.Scanner;
public class ejercicio10 {

	public static void main(String[] args) {
		float p1, p2, p3, examenF, trabajoF, calificaciónF;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la nota del primer parcial:");
		p1 = Float.parseFloat(sc.nextLine());
		
		System.out.println("Introduce la nota del segundo parcial:");
		p2 = Float.parseFloat(sc.nextLine());
		
		System.out.println("Introduce la nota del tercer parcial:");
		p3 = Float.parseFloat(sc.nextLine());
		
		System.out.println("Introduce la nota del examen final:");
		examenF = Float.parseFloat(sc.nextLine());
		
		System.out.println("Introduce la nota del trabajo final:");
		trabajoF = Float.parseFloat(sc.nextLine());
		
		
		calificaciónF = (float) (0.15 * trabajoF + 0.3 * examenF + 0.55 * (p1+p2+p3) / 3 ) ;
		
		System.out.println("Tu calificación final es de " + calificaciónF);
		
		sc.close();
	}

}
