package excepciones;
import java.util.*;

public class Prueba1 {

	public static void main(String[] args) {
		int a = 0, b = 0;

		boolean ex;

		Scanner sc = new Scanner(System.in);
		
//		nextInt, si no puede procesar el token, lanza una excepci�n, pero no pasa al siguiente token.

		do {

		    try {	       
		        System.out.print("Introduce el primer numero a: ");
		        a = sc.nextInt();
		        System.out.print("Introduce el segundo numero b: ");
		        b = sc.nextInt();
		        ex = false;
		    } catch (InputMismatchException exc) {
		        System.out.println("Error, lo introducido no es valido: " + exc.getMessage());
		        ex = true;
		    }
		
		} while(ex);
		sc.close();
		System.out.println("a " + a + " b " + b);
	}

}
