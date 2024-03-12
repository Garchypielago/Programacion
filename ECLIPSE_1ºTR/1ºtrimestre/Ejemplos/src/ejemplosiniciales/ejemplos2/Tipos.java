<<<<<<< HEAD
package ejemplos2;

import java.text.DecimalFormat;

public class Tipos {
	
	public static void main(String args[]) { 
		
		// En java un numero entero, por defecto es int
		System.out.println("1.- Es un literal int " + 2147483647 * 2 ); 
		System.out.println("2.- Es un literal long " + 2147483647L * 2 );
		
		// 2147483647 es el valor mas grande que se puede almacenar en una variable de tipo int, 4 bytes
		// es representacion con signo. En el primer caso se desborda.
		int x = 2147483647;
		
		System.out.println("1.- x " + x ); 
		
		System.out.println("2.- x * 2 " + x * 2 ); 
		
		x = x * 2;
		
		System.out.println("3.- x " + x);
		System.out.println();
		
		long y = 2147483647;

		System.out.println("1.- y " + y * 2);

		y = y * 2;

		System.out.println("2.- y " + y); // en un long si cabe

		// En los siguientes casos se produce una conversión automática a decimal:
		// Representacion en hexadecimal:
		System.out.println("Hexadecimal " + 0x11C);
		
		// Representacion en octal:
		System.out.println("Octal " + 025);

		int numOctal = 025;
		System.out.println("Octal (variable) " + numOctal);
		
		System.out.println();
		
		// Representacion cientifica:
		System.out.println(7.433e6);
		System.out.println(76.433e6);
		
		System.out.println();
		
		// En java un numero real, por defecto es double
		System.out.println(21843.83F); // Se almacena usando 32 bits
		System.out.println(21843.83); // Se almacena usando 64 bits

		// float f = 3.14; error!!!

		float f = (float) 3.14;
		System.out.println("Float cast " + f);

		f = 3.14F;
		System.out.println("Float f " + f);
		f = 3.14f;
		System.out.println("Float F " + f);

		System.out.println();
		
		double v1 = 300000; // notacion normal
		System.out.println(v1);
		
		double v2 = 3.0e+5; // notacion cientifica
		System.out.println(v2);
		
		v2 = 3e+5; // notacion cientifica
		System.out.println(v2);
		
		System.out.println();

		// Caracteres especiales
		char arroba = '\u0040'; // unicode
		System.out.println(arroba);

		System.out.println((char) ('A' + 1)); // valor de 'A' es 65 en UNICODE -> B
		System.out.println('A' + 1); // valor de 'A' es 65 en UNICODE -> 66
		System.out.println("'A'" + 1); // no sumo ahora, sino que concateno una cadena con un número

		char a = '\u0041'; // 0041 en hexadecimal es 65
		System.out.println("'A' " + a);

		// Uso de constantes
		final double PI = 3.1415926536;
		float radio = 20.3f;
		System.out.println("Longitud circunferencia = " + 2 * PI * radio);

		// Una forma de formatear números:
		double z = 25.324178787878787878645454;
		
		DecimalFormat df = new DecimalFormat("0.00");		
		System.out.println(df.format(z));
		
		df = new DecimalFormat("000.000");
		System.out.println(df.format(z));
 
		//Mostrar un valor lógico 
		System.out.print("Valor lógico: "); 
		System.out.println(true); 

	} 
}
=======
package ejemplos2;

import java.text.DecimalFormat;

public class Tipos {
	
	public static void main(String args[]) { 
		
		// En java un numero entero, por defecto es int
		System.out.println("1.- Es un literal int " + 2147483647 * 2 ); 
		System.out.println("2.- Es un literal long " + 2147483647L * 2 );
		
		// 2147483647 es el valor mas grande que se puede almacenar en una variable de tipo int, 4 bytes
		// es representacion con signo. En el primer caso se desborda.
		int x = 2147483647;
		
		System.out.println("1.- x " + x ); 
		
		System.out.println("2.- x * 2 " + x * 2 ); 
		
		x = x * 2;
		
		System.out.println("3.- x " + x);
		System.out.println();
		
		long y = 2147483647;

		System.out.println("1.- y " + y * 2);

		y = y * 2;

		System.out.println("2.- y " + y); // en un long si cabe

		// En los siguientes casos se produce una conversión automática a decimal:
		// Representacion en hexadecimal:
		System.out.println("Hexadecimal " + 0x11C);
		
		// Representacion en octal:
		System.out.println("Octal " + 025);

		int numOctal = 025;
		System.out.println("Octal (variable) " + numOctal);
		
		System.out.println();
		
		// Representacion cientifica:
		System.out.println(7.433e6);
		System.out.println(76.433e6);
		
		System.out.println();
		
		// En java un numero real, por defecto es double
		System.out.println(21843.83F); // Se almacena usando 32 bits
		System.out.println(21843.83); // Se almacena usando 64 bits

		// float f = 3.14; error!!!

		float f = (float) 3.14;
		System.out.println("Float cast " + f);

		f = 3.14F;
		System.out.println("Float f " + f);
		f = 3.14f;
		System.out.println("Float F " + f);

		System.out.println();
		
		double v1 = 300000; // notacion normal
		System.out.println(v1);
		
		double v2 = 3.0e+5; // notacion cientifica
		System.out.println(v2);
		
		v2 = 3e+5; // notacion cientifica
		System.out.println(v2);
		
		System.out.println();

		// Caracteres especiales
		char arroba = '\u0040'; // unicode
		System.out.println(arroba);

		System.out.println((char) ('A' + 1)); // valor de 'A' es 65 en UNICODE -> B
		System.out.println('A' + 1); // valor de 'A' es 65 en UNICODE -> 66
		System.out.println("'A'" + 1); // no sumo ahora, sino que concateno una cadena con un número

		char a = '\u0041'; // 0041 en hexadecimal es 65
		System.out.println("'A' " + a);

		// Uso de constantes
		final double PI = 3.1415926536;
		float radio = 20.3f;
		System.out.println("Longitud circunferencia = " + 2 * PI * radio);

		// Una forma de formatear números:
		double z = 25.324178787878787878645454;
		
		DecimalFormat df = new DecimalFormat("0.00");		
		System.out.println(df.format(z));
		
		df = new DecimalFormat("000.000");
		System.out.println(df.format(z));
 
		//Mostrar un valor lógico 
		System.out.print("Valor lógico: "); 
		System.out.println(true); 

	} 
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
