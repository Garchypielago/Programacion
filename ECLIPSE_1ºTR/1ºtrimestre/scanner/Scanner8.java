<<<<<<< HEAD
package scanner;
import java.util.Scanner;

public class Scanner8 {
	public static void main(String[] args) {
        Scanner input = new Scanner("Cascaras de higos, cascaras de nueces");
        System.out.println("Palabras/tokens encontradas en la cadena usada como input:");
 
	    while (input.hasNext()) { //Se repite hasta que hasNext() devuelva FALSE
	        System.out.println(">>> " + input.next()); // recoge trozos de espacio en blanco en espacio en blanco
	    }
 
	    input.close();
	    
	    System.out.println("\n\n\tFIN DE PROGRAMA");
	 }

}
=======
package scanner;
import java.util.Scanner;

public class Scanner8 {
	public static void main(String[] args) {
        Scanner input = new Scanner("Cascaras de higos, cascaras de nueces");
        System.out.println("Palabras/tokens encontradas en la cadena usada como input:");
 
	    while (input.hasNext()) { //Se repite hasta que hasNext() devuelva FALSE
	        System.out.println(">>> " + input.next()); // recoge trozos de espacio en blanco en espacio en blanco
	    }
 
	    input.close();
	    
	    System.out.println("\n\n\tFIN DE PROGRAMA");
	 }

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
