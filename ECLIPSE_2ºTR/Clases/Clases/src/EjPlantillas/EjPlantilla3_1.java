/*
 * Esquema 3: fin de la entrada Este es el esquema menos habitual. En él,
 * simplemente, deja de haber datos en la entrada, algo así como si el teclado
 * se desconectara. Esto no es demasiado natural cuando la entrada es el
 * teclado, pero sí lo es cuando es un fichero.
 * 
 * Para probar los problemas que siguen este esquema, cuando decidas que no
 * quieres introducir más datos por teclado deberás pulsar Ctrl+Z e "Intro" si
 * usas Windows, y Ctrl+D si usas GNU/Linux o Mac.
 * 
 * 
 * El esqueleto que te proponemos para las soluciones a los problemas que usan
 * este esquema es similar al anterior. Implementaremos una función/método que
 * procesa cada caso de prueba y que, además, indica si pudo hacerlo o no (se
 * llegó al final).
 * 
 * Lo primero que hará será mirar si hay o no más datos de entrada. En algunos
 * lenguajes (como C o C++), para hacer eso hay primero que intentar leer algo y
 * luego mirar si funcionó. En otros (como en Java) se puede preguntar si queda
 * algo en la entrada antes de leer. Una vez que se confirma que hay un
 */
/*
* San Fermines
  Tiempo máximo: 1,000-3,000 s Memoria máxima: 4096 KiB

  Un buen corredor de San Fermines intenta mantener la emoción para fomentar el espectáculo.
  Este tipo de corredores está muy en forma y son capaces de correr mucho más deprisa que los toros.
  Sin embargo, para mantener la emoción, no lo hacen. Se limitan a mantener una velocidad adecuada
  para que los toros se mantenga siempre cerca, pero no lleguen a pillarles.

  El problema consiste en, dadas las velocidades de todos los toros que participan en los San Fermines
  (y que se suponen constantes), ¿a qué velocidad deben ir estos corredores expertos para mantener 
  el espectáculo conservando su integridad?
  
  Entrada

  La entrada consta de una serie de casos de prueba, cada uno en una línea. El primer número de la
  misma indica el número de toros que intervienen en la carrera (n ≥ 1). A continuación aparece un
  entero por cada uno de los toros, indicando la velocidad a la que correrá ese toro (recuerda, es
  velocidad constante). La velocidad es siempre positiva y no excede 109.
  Salida

  Para cada caso de prueba se mostrará una línea en la que aparecerá la velocidad a la que deberán ir
  los corredores expertos para mantener el espectáculo.
 */
package EjPlantillas;


import java.util.Scanner;

public class EjPlantilla3_1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int num = 0;
		int mayor;
		int total;

		while (s.hasNext()) {

			mayor = 0;
			total = s.nextInt();

			//if (total >= 1) {

				for (int i = 0; i < total; i++) {

					num = s.nextInt();

					if (num > mayor) {
						mayor = num;
					}

				}

				System.out.println(mayor);

			//}

		}
		s.close();
	}

}
//	7 1 9 8 7 10 3 12
//	1 10