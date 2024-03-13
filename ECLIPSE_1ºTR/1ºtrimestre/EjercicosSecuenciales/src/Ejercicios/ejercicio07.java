package Ejercicios;
import java.util.Scanner;
public class ejercicio07 {

	public static void main(String[] args) {
		int H, m, M;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe los minutos ");
		m = Integer.parseInt(sc.nextLine());
	
		H = (m/60);
		
		M= (m%60);
		
		System.out.println(m + " son " + H + " horas y " + M +" minutos.");
	
		sc.close();
	}
}
