package excepciones;
import java.util.*;

public class Prueba2 {

	public static void main(String[] args) {
		int a = 0, b = 0;

		boolean ex;

		Scanner sc = new Scanner(System.in);

		do {

		    try {
		       
		        System.out.print("Introduce el primer numero a: ");
		        a = sc.nextInt();
		        System.out.print("Introduce el segundo numero b: ");
		        b = sc.nextInt();
		        ex = false;

		    } catch (InputMismatchException exc) {
		    	sc.next();// Para limpiar el buffer después de leer el numero
		    	System.out.println("Error, lo introducido no es valido: " + exc.getStackTrace());
		        ex = true;
		    }
		
		} while(ex);
		sc.close();
		System.out.println("a " + a + " b " + b);
		
	}

}
