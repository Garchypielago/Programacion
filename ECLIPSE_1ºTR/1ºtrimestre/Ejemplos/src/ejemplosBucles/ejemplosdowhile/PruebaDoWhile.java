<<<<<<< HEAD
package ejemplosdowhile;
import java.util.Scanner;

public class PruebaDoWhile {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i; 
		
		do { 
			System.out.println ("Introducir un numero distinto de 0"); 
			i = teclado.nextInt(); 
		} while(i == 0);
		
		System.out.println ("Ha salido del do-while"); 
		
		teclado.close();
	}

}
=======
package ejemplosdowhile;
import java.util.Scanner;

public class PruebaDoWhile {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i; 
		
		do { 
			System.out.println ("Introducir un numero distinto de 0"); 
			i = teclado.nextInt(); 
		} while(i == 0);
		
		System.out.println ("Ha salido del do-while"); 
		
		teclado.close();
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
