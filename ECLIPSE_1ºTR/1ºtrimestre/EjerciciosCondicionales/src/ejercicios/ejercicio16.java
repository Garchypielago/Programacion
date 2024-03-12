<<<<<<< HEAD
package ejercicios;
import java.util.Scanner;
public class ejercicio16 {

	public static void main(String[] args) {
		double minutos, min5, min8, min10, mins, porcentaje, precio;
		String domingo, DoV;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantos minutos ha estado en llamada (minuto empezado cuenta):");
		minutos = Double.parseDouble(sc.nextLine());
		
		System.out.println("Era domingo (SI o NO):");
		domingo = sc.nextLine();
		
		if (domingo.equalsIgnoreCase("SI")) { 
			porcentaje = 0.03;
		} else {
			System.out.println("Era diurna o vespertina:");
			DoV = sc.nextLine();
			if (DoV.equalsIgnoreCase("diurna")){
				porcentaje = 0.15;
			} else {
				porcentaje = 0.10;
			}
		}
		
		
		if (minutos <= 5 && minutos > 0 ) {
			min5 = minutos * 1;
			precio = min5 + min5 * porcentaje;
		} else if ( minutos > 0 && minutos <= 8 ) {
			min5 = 5;
			min8 = (minutos - 5) * 0.8;
			precio = (min5 + min8) + (min5 + min8) * porcentaje;
		} else if ( minutos > 0 && minutos <= 10) {
			min5 = 5;
			min8 = 3 * 0.8;
			min10 = (minutos - 8) * 0.7;
			precio = (min5 + min8 + min10) + (min5 + min8 + min10) * porcentaje;
		} else {
			min5 = 5;
			min8 = 3 * 0.8;
			min10 = 2 * 0.7;
			mins = (minutos - 10) * 0.5;
			precio = (min5 + min8 + min10 + mins) + (min5 + min8 + min10 + mins) * porcentaje;
		} 
		
		System.out.println("Debe pagar " + precio + "€.");
		
		sc.close();
	}

}
=======
package ejercicios;
import java.util.Scanner;
public class ejercicio16 {

	public static void main(String[] args) {
		double minutos, min5, min8, min10, mins, porcentaje, precio;
		String domingo, DoV;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantos minutos ha estado en llamada (minuto empezado cuenta):");
		minutos = Double.parseDouble(sc.nextLine());
		
		System.out.println("Era domingo (SI o NO):");
		domingo = sc.nextLine();
		
		if (domingo.equalsIgnoreCase("SI")) { 
			porcentaje = 0.03;
		} else {
			System.out.println("Era diurna o vespertina:");
			DoV = sc.nextLine();
			if (DoV.equalsIgnoreCase("diurna")){
				porcentaje = 0.15;
			} else {
				porcentaje = 0.10;
			}
		}
		
		
		if (minutos <= 5 && minutos > 0 ) {
			min5 = minutos * 1;
			precio = min5 + min5 * porcentaje;
		} else if ( minutos > 0 && minutos <= 8 ) {
			min5 = 5;
			min8 = (minutos - 5) * 0.8;
			precio = (min5 + min8) + (min5 + min8) * porcentaje;
		} else if ( minutos > 0 && minutos <= 10) {
			min5 = 5;
			min8 = 3 * 0.8;
			min10 = (minutos - 8) * 0.7;
			precio = (min5 + min8 + min10) + (min5 + min8 + min10) * porcentaje;
		} else {
			min5 = 5;
			min8 = 3 * 0.8;
			min10 = 2 * 0.7;
			mins = (minutos - 10) * 0.5;
			precio = (min5 + min8 + min10 + mins) + (min5 + min8 + min10 + mins) * porcentaje;
		} 
		
		System.out.println("Debe pagar " + precio + "€.");
		
		sc.close();
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
