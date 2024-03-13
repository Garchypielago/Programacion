package scanner;

import java.util.Scanner;

public class Scanner10 {
	public static void main(String[] args) {
        //Scanner input = new Scanner("Cascaras de higos, cascaras de nueces");
        Scanner input = new Scanner("3\n Cascaras de higos, cascaras de nueces\n Ahora comienzo una nueva linea");
        System.out.println("Palabras/tokens encontradas en la cadena usada como input:");
 
	    if (input.hasNext()) { //Se repite hasta que hasNext() devuelva FALSE
	        System.out.println(">>> " + input.nextInt());
	        System.out.println(">>> " + input.nextLine());
	        System.out.println(">>> " + input.nextLine());
	    }
 
	    System.out.println("\n\n\tFIN DE PROGRAMA");
	    
	    input.close();
	 }

}
