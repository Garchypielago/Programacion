<<<<<<< HEAD
package excepciones;
import java.util.*;

public class EjSinControlDeErrores {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    
	    System.out.println("Introduce una posicion");   	
	    mostrarEntero (args, scanner.nextInt());
	    // Distinguimos entre el error al introducir un no numerico como posicion
	    // y que en los argumentos no hayamos colocado enteros (falla Integer.parseInt)
	    scanner.close();
	}
	
	public static void mostrarEntero (String args[], int n)
	{
	   System.out.println( "Entero: "+ obtenerEntero(args,n) );
	}
	
	public static int obtenerEntero (String args[], int n)
	{
	   return Integer.parseInt(args[n]);
	}
=======
package excepciones;
import java.util.*;

public class EjSinControlDeErrores {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    
	    System.out.println("Introduce una posicion");   	
	    mostrarEntero (args, scanner.nextInt());
	    // Distinguimos entre el error al introducir un no numerico como posicion
	    // y que en los argumentos no hayamos colocado enteros (falla Integer.parseInt)
	    scanner.close();
	}
	
	public static void mostrarEntero (String args[], int n)
	{
	   System.out.println( "Entero: "+ obtenerEntero(args,n) );
	}
	
	public static int obtenerEntero (String args[], int n)
	{
	   return Integer.parseInt(args[n]);
	}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
}