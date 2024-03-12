<<<<<<< HEAD
package ejercicios;
import java.util.Scanner;
public class ejercicio18 {

	public static void main(String[] args) {
		int ndia;
		String sdia=" ";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el numero del dia:");
		ndia = Integer.parseInt(sc.nextLine());
		
		if (ndia<1 || ndia>7) {
			System.out.println("ERROR: número incorrecto.");
		} else {
			switch (ndia) {
			case 1 : sdia = "Lunes";
			break;
			case 2 : sdia = "Martes";
			break;
			case 3 : sdia = "Miércoles";
			break;
			case 4 : sdia = "Jueves";
			break;
			case 5 : sdia = "Viernes";
			break;
			case 6 : sdia = "Sábado";
			break;
			case 7 : sdia = "Domingo";
			break;
			}
			System.out.println( sdia );
		}
		
		sc.close();
	}

}
=======
package ejercicios;
import java.util.Scanner;
public class ejercicio18 {

	public static void main(String[] args) {
		int ndia;
		String sdia=" ";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el numero del dia:");
		ndia = Integer.parseInt(sc.nextLine());
		
		if (ndia<1 || ndia>7) {
			System.out.println("ERROR: número incorrecto.");
		} else {
			switch (ndia) {
			case 1 : sdia = "Lunes";
			break;
			case 2 : sdia = "Martes";
			break;
			case 3 : sdia = "Miércoles";
			break;
			case 4 : sdia = "Jueves";
			break;
			case 5 : sdia = "Viernes";
			break;
			case 6 : sdia = "Sábado";
			break;
			case 7 : sdia = "Domingo";
			break;
			}
			System.out.println( sdia );
		}
		
		sc.close();
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
