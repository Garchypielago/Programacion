package i_o;
import java.util.*;

public class Lector{
	public static int leeInt(Scanner sc, String mensaje){
		int valorLeido = -1;		
		boolean correcto = false;
		
		while (!correcto) {
			System.out.println(mensaje);
			try {
				valorLeido= Integer.parseInt(sc.nextLine());
				correcto = true;		
			}
			catch (NumberFormatException e) {
				System.out.println("Debe introducir un numero entero");
			}
		}
			
		return valorLeido;		
	}
		
	public static String leeCadena(Scanner sc, String mensaje){
		System.out.println(mensaje);
		return sc.nextLine();
	}
	
	public static Float leeFloat(Scanner sc, String mensaje){
		float valorLeido = -1;		
		boolean correcto = false;
		
		while (!correcto) {
			System.out.println(mensaje);
			try {
				valorLeido= Float.parseFloat(sc.nextLine());
				correcto = true;		
			}
			catch (NumberFormatException e) {
				System.out.println("Debe introducir un numero decimal");
			}
		}
			
		return valorLeido;
	}
	
	public static Double leeDouble(Scanner sc, String mensaje){
		double valorLeido = -1;		
		boolean correcto = false;
		
		while (!correcto) {
			System.out.println(mensaje);
			try {
				valorLeido= Double.parseDouble(sc.nextLine());
				correcto = true;		
			}
			catch (NumberFormatException e) {
				System.out.println("Debe introducir un numero decimal");
			}
		}
			
		return valorLeido;		
	}
}