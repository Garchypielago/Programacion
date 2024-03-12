/*
 * Esquema 2: caso de prueba que marca el final

 En este esquema de la entrada el programa debe ir procesando casos de prueba hasta que se encuentre 
 con uno especial que marca el final, y que debe ignorarse. El enunciado indica las características 
 de ese caso especial, que dependerá de cada problema. Es importante detectarlo bien, porque si la
 solución no se da cuenta de que ha leído el caso especial, seguirá "leyendo casos", lo que puede
 hacer que el programa termine con un TLE o con un RTE dependiendo de cómo reaccione la librería
 del lenguaje a la lectura por teclado de datos inexistentes.

 En el esqueleto de solución que te proponemos, se implementa una función/método que procesa cada
 caso de prueba y que, además, devuelve si lo hizo o se llegó al final. La función lee el caso 
 de prueba y si es el especial que marca el fin, termina devolviendo falso. En otro caso, procesa
 el caso de prueba y devuelve cierto.

 Este esquema de la entrada lo utilizan, por ejemplo, los problemas 155 Perímetro de un rectángulo
 o 239 Pi. Pi. Pi. Pi. Pi. Piiiii. 

 */
package Plantillas;

public class Plantilla2 {
	static java.util.Scanner in;

	public static boolean casoDePrueba() {
//        leer caso de prueba
//        if (es el caso que marca el final)
//            return false;
//        else {
//            // CÓDIGO PRINCIPAL AQUÍ
//            return true;
//         }
		return true;
    } // casoDePrueba

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main
} //
