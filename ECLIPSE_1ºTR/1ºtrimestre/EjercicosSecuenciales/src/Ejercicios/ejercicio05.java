package Ejercicios;
import java.util.Scanner;
public class ejercicio05 {

	public static void main(String[] args) {
		double grados;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los grados:");
		grados = Double.parseDouble(sc.nextLine());
		
		System.out.println("La temperatura es de " + ((grados - 32) * 5 / 9));
	
		sc.close();
	}

}
