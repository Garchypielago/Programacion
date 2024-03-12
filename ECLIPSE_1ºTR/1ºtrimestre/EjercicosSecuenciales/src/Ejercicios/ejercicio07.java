<<<<<<< HEAD
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
=======
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
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
