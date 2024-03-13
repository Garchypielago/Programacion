package ejemplos4;

public class Conversiones1 { 
public static void main (String [] args) { 
		System.out.println("*** Ejemplos de conversiones implícitas ***");

		// Declaraciones. 
		int k = 5, p; 
		short s = 10; 
		char c = 'ñ'; 
		float h; 
		byte b;
		
		p = c; // Conversión implícita de char a int. 
		h = k; // Conversión implícita de int a float. 
		k = s; // Conversión implícita de short a int.
		
		System.out.println("p " + p + " h " + h + " k " + k);

		// Los siguientes ejemplos de conversión implícita provocarían un error.
		// System.out.println("*** Ejemplos de conversiones implícitas erroneas ***");

		// Declaraciones.

		
		long l = 20;
		float ft = 2.4f;
		char car;
		b = 4;

		int n = l; // Error, el tipo destino es menor al tipo origen.
		car = b; // Cuando la variable destino es "char" y el origen es numérico;
				// independientemente del tipo específico, la conversión no podrá ser
				// automática.
		n = ft; // Cuando la variable destino es entera y el origen es decimal (float o double),
				// la conversión no podrá ser automática.

		

	}
} 
