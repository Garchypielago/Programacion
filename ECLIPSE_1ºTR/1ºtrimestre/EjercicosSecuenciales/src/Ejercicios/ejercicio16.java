package Ejercicios;
import java.util.Scanner;
public class ejercicio16 {

	public static void main(String[] args) {
		double v1, v2, d, t;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la velocidad del primer coche en Km/h: ");
		v1 = Double.parseDouble(sc.nextLine());
		
		System.out.println("Introduce la velocidad del segundo coche en Km/h: ");
		v2 = Double.parseDouble(sc.nextLine());
		
		System.out.println("Introduce la distancia en Km: ");
		d = Double.parseDouble(sc.nextLine());
		
		
		t = d / (v2 - v1);
		
		System.out.println("Tarda " + (t * 60 ) + "minutos en alcanzarlo.");
		
		sc.close();
		
	}
	
}
