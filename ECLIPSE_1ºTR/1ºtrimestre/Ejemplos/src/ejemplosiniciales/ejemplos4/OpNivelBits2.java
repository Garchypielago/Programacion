package ejemplos4;

public class OpNivelBits2 {

	  public static void main(String args[]) {
		 // Un int son  4 bytes
	     int a = 60;	/* 60 = 0011 1100 */ 
	     int b = 13;	/* 13 = 0000 1101 */
	     int c = 0; 

	     c = a & b;       /* 12 = 0000 1100 */
	     System.out.println("a & b = " + c );

	     c = a | b;       /* 61 = 0011 1101 */
	     System.out.println("a | b = " + c );

	     c = a ^ b;       /* 49 = 0011 0001 */
	     System.out.println("a ^ b = " + c );

	     c = ~a;          /*-61 = 1100 0011 */
	     System.out.println("~a = " + c );
	     // ~ se escribe con altGr 4
	     
	     c = a << 2;     /* 240 = 1111 0000 */
	     System.out.println("a << 2 = " + c );

	     c = a >> 2;     /* 215 = 1111 */
	     System.out.println("a >> 2  = " + c );

	     c = a >>> 2;     /* 215 = 0000 1111 */
	     System.out.println("a >>> 2 = " + c );
	     	     
	     // Operador NOT de Bits

	     // Solo invierte los bits, es decir, convierte los ceros en unos y viceversa. 
	     // Observemos que es el unico de esta familia que tiene un solo operando.
	     int k = 132;   // k: 00000000000000000000000010000100
		 int m = ~k;    // m: 1111 1111 1111 1111 1111 1111 0111 1011 (coger solo 2 bytes en linux en la calculadora)
	     System.out.println("m = " + m );
	     System.out.println("m vale -133 = 1111 1111 0111 1011");
	     // El resultado da -133
	     
	     //>>>  de arriba es interesante con valores negativos:
	     System.out.println("m  en binario calculado por programa -> " + Integer.toBinaryString(m) ); 
	     c = m >> 2;     /* -133 = 1111 1111 1011 1101 */
	     System.out.println("m desplazado 2 bits a la dcha con signo -> " + c);
	     System.out.println("m >> 2 = " + Integer.toBinaryString(c) );
	     c = m >>> 2;
	     System.out.println("m desplazado 2 bits a la dcha sin signo -> " + c);
	     System.out.println("m >>> 2 = " + Integer.toBinaryString(c) );
	     
	     int mascara = -256; 			// mascara -256--------------  binario 00000000 00000000 00000001 00000000
	     int respuesta1 = mascara >>> 2; // respuesta 1073741760-----  binario 00000000 00000000 00000000 01000000
	     int respuesta2 = mascara >> 2;	 // respuesta 64-------------  binario 00000000 00000000 00000000 01000000
	     System.out.println("\nmascara = " + mascara + "          " + Integer.toBinaryString(mascara)); 
	     System.out.println("respuesta1 >>> rellena a la izda con 0s");
	     System.out.println("respuesta1 = " + respuesta1 + " " + Integer.toBinaryString(respuesta1));
	     System.out.println("respuesta2 >> rellena a la izda con 1s, conserva el signo");
	     System.out.println("respuesta2 = " + respuesta2 + "        " + Integer.toBinaryString(respuesta2) + "\n");
	     
	     // Como los enteros negativos en Java se representan con el metodo del complemento a dos, podemos realizar 
	     // un sencillo experimento de cambiarle el signo a un numero. Para realizarlo debemos aplicar a un entero 
	     // el operador NOT y sumarle uno.

		 int x = 123; 
		 System.out.println("x = " + x ); 
		 int y = ~x;   
		 int z = y + 1;
		 
		 System.out.println("y = " + y );
		 System.out.println("z = " + z );
		 //El resultado da -123,  11 1111 11100 00101
		 
		 // Con la m de arriba -133 + 1 -> -132
		 System.out.println("m = " + (m + 1) );
		 
	  }
	}
