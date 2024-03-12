<<<<<<< HEAD
package ejemplos4;

public class Conversiones2 { 
public static void main (String [] args) { 
	int a = 2, p, n; 
	double b = 3.0; 
	byte k; 
	double d; 

	System.out.println("*** Ejemplos de conversiones explícitas ***");

	// Declaraciones. 
 
	p = 400;
	d = 34.6; 
		
	// Conversiones explícitas. 
	n = (int)d; // Se elimina la parte decimal (trunca), no se redondea.
	System.out.println("Valor de n " + n);
	
	k = (byte)p; // Se provoca una pérdida de datos, pero la conversión es posible. 
	System.out.println("Valor de k " + k);
	System.out.println("Formato byte " + (byte)p);
	System.out.println("Formato short " + (short)p);

	float c = (float) (20000*a/b + 5); //13.338,333333333333333333333333333
	System.out.println("Resultado: " + (20000*a/b + 5)); 
	// 11010000011010 es 13338
	System.out.println("Valor en formato float: " + c); 
	System.out.println("Valor en formato double: " + (double) c); 
	//Nos quedamos con los 8 primeros bits por la derecha -> 11010 -> 26
	System.out.println("Valor en formato byte: " + (byte) c); 
	System.out.println("Valor en formato short: " + (short) c); 
	System.out.println("Valor en formato int: " + (int) c); 
	System.out.println("Valor en formato long: " + (long) c); 
	
	c = 13339; //11010000011011
	System.out.println("\n\nValor en formato float: " + c); 
	System.out.println("Valor en formato double: " + (double) c); 
	//Nos quedamos con los 8 primeros bits - 11011
	System.out.println("Valor en formato byte: " + (byte) c); 
	System.out.println("Valor en formato short: " + (short) c); 
	System.out.println("Valor en formato int: " + (int) c); 
	System.out.println("Valor en formato long: " + (long) c); 
} 
} 
=======
package ejemplos4;

public class Conversiones2 { 
public static void main (String [] args) { 
	int a = 2, p, n; 
	double b = 3.0; 
	byte k; 
	double d; 

	System.out.println("*** Ejemplos de conversiones explícitas ***");

	// Declaraciones. 
 
	p = 400;
	d = 34.6; 
		
	// Conversiones explícitas. 
	n = (int)d; // Se elimina la parte decimal (trunca), no se redondea.
	System.out.println("Valor de n " + n);
	
	k = (byte)p; // Se provoca una pérdida de datos, pero la conversión es posible. 
	System.out.println("Valor de k " + k);
	System.out.println("Formato byte " + (byte)p);
	System.out.println("Formato short " + (short)p);

	float c = (float) (20000*a/b + 5); //13.338,333333333333333333333333333
	System.out.println("Resultado: " + (20000*a/b + 5)); 
	// 11010000011010 es 13338
	System.out.println("Valor en formato float: " + c); 
	System.out.println("Valor en formato double: " + (double) c); 
	//Nos quedamos con los 8 primeros bits por la derecha -> 11010 -> 26
	System.out.println("Valor en formato byte: " + (byte) c); 
	System.out.println("Valor en formato short: " + (short) c); 
	System.out.println("Valor en formato int: " + (int) c); 
	System.out.println("Valor en formato long: " + (long) c); 
	
	c = 13339; //11010000011011
	System.out.println("\n\nValor en formato float: " + c); 
	System.out.println("Valor en formato double: " + (double) c); 
	//Nos quedamos con los 8 primeros bits - 11011
	System.out.println("Valor en formato byte: " + (byte) c); 
	System.out.println("Valor en formato short: " + (short) c); 
	System.out.println("Valor en formato int: " + (int) c); 
	System.out.println("Valor en formato long: " + (long) c); 
} 
} 
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
