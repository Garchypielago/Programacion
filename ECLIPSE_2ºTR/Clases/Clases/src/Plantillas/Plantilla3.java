<<<<<<< HEAD
/*
 * Esquema 3: fin de la entrada
 * Este es el esquema menos habitual. En él, simplemente, deja de haber datos en la entrada, algo así 
 * como si el teclado se desconectara. Esto no es demasiado natural cuando la entrada es el teclado, 
 * pero sí lo es cuando es un fichero.

 * Para probar los problemas que siguen este esquema, cuando decidas que no quieres introducir más 
 * datos por teclado deberás pulsar Ctrl+Z e "Intro" si usas Windows, y Ctrl+D si usas GNU/Linux o Mac.
 * 

 * El esqueleto que te proponemos para las soluciones a los problemas que usan este esquema es similar
 * al anterior. Implementaremos una función/método que procesa cada caso de prueba y que, además, 
 * indica si pudo hacerlo o no (se llegó al final).

 * Lo primero que hará será mirar si hay o no más datos de entrada. En algunos lenguajes (como C o C++),
 * para hacer eso hay primero que intentar leer algo y luego mirar si funcionó. En otros (como en Java)
 * se puede preguntar si queda algo en la entrada antes de leer. Una vez que se confirma que hay un
 * caso de prueba siguiente, se continua normalmente.

 * Este esquema lo usan por ejemplo los problemas 147 Las 15 cerillas o 149 San Fermines. 
 */
package Plantillas;

public class Plantilla3 {
	static java.util.Scanner in;

	public static boolean casoDePrueba() {
		if (!in.hasNext())
			return false;
		else {
			// CÓDIGO PRINCIPAL AQUÍ
			// (incluyendo la lectura del caso de prueba)
			return true;
		}
	} // casoDePrueba

	public static void main(String[] args) {
		in = new java.util.Scanner(System.in);
		while (casoDePrueba()) {
		}
	} // main
}
=======
/*
 * Esquema 3: fin de la entrada
 * Este es el esquema menos habitual. En él, simplemente, deja de haber datos en la entrada, algo así 
 * como si el teclado se desconectara. Esto no es demasiado natural cuando la entrada es el teclado, 
 * pero sí lo es cuando es un fichero.

 * Para probar los problemas que siguen este esquema, cuando decidas que no quieres introducir más 
 * datos por teclado deberás pulsar Ctrl+Z e "Intro" si usas Windows, y Ctrl+D si usas GNU/Linux o Mac.
 * 

 * El esqueleto que te proponemos para las soluciones a los problemas que usan este esquema es similar
 * al anterior. Implementaremos una función/método que procesa cada caso de prueba y que, además, 
 * indica si pudo hacerlo o no (se llegó al final).

 * Lo primero que hará será mirar si hay o no más datos de entrada. En algunos lenguajes (como C o C++),
 * para hacer eso hay primero que intentar leer algo y luego mirar si funcionó. En otros (como en Java)
 * se puede preguntar si queda algo en la entrada antes de leer. Una vez que se confirma que hay un
 * caso de prueba siguiente, se continua normalmente.

 * Este esquema lo usan por ejemplo los problemas 147 Las 15 cerillas o 149 San Fermines. 
 */
package Plantillas;

public class Plantilla3 {
	static java.util.Scanner in;

	public static boolean casoDePrueba() {
		if (!in.hasNext())
			return false;
		else {
			// CÓDIGO PRINCIPAL AQUÍ
			// (incluyendo la lectura del caso de prueba)
			return true;
		}
	} // casoDePrueba

	public static void main(String[] args) {
		in = new java.util.Scanner(System.in);
		while (casoDePrueba()) {
		}
	} // main
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
