<<<<<<< HEAD
package utilidades;
import java.util.*;
public class Lector{
	public static int leeInt(Scanner sc, String mensaje){
		System.out.println(mensaje);
		return Integer.parseInt(sc.nextLine());
	}
		
	public static String leeCadena(Scanner sc, String mensaje){
		System.out.println(mensaje);
		return sc.nextLine();
	}
	
	public static String leeLinea(Scanner sc, String mensaje){
		System.out.println(mensaje);
		return sc.nextLine();
	}
	
	public static Float leeFloat(Scanner sc, String mensaje){
		System.out.println(mensaje);
		return Float.parseFloat(sc.nextLine());
	}
	
	public static Double leeDouble(Scanner sc, String mensaje){
		System.out.println(mensaje);
		return Double.parseDouble(sc.nextLine());
	}
	
	public static char leeChar(Scanner sc, String mensaje){
		System.out.println(mensaje);
		return mensaje.charAt(0);
	}
	
=======
package utilidades;
import java.util.*;
public class Lector{
	public static int leeInt(Scanner sc, String mensaje){
		System.out.println(mensaje);
		return Integer.parseInt(sc.nextLine());
	}
		
	public static String leeCadena(Scanner sc, String mensaje){
		System.out.println(mensaje);
		return sc.nextLine();
	}
	
	public static String leeLinea(Scanner sc, String mensaje){
		System.out.println(mensaje);
		return sc.nextLine();
	}
	
	public static Float leeFloat(Scanner sc, String mensaje){
		System.out.println(mensaje);
		return Float.parseFloat(sc.nextLine());
	}
	
	public static Double leeDouble(Scanner sc, String mensaje){
		System.out.println(mensaje);
		return Double.parseDouble(sc.nextLine());
	}
	
	public static char leeChar(Scanner sc, String mensaje){
		System.out.println(mensaje);
		return mensaje.charAt(0);
	}
	
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
}