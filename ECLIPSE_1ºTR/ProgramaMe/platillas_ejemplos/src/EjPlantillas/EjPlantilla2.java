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

El perímetro de un polígono es la suma de la longitud de todos sus lados. ¿Eres capaz de calcular
el perímetro de un rectángulo?
Entrada

La entrada consta de una serie de casos de prueba. Cada uno contiene, en una sola línea, la 
definición de un rectángulo. Un rectángulo se especifica proporcionando las coordenadas de la
esquina superior derecha. Se debe considerar que la esquina inferior izquierda está siempre en
el origen de coordenadas, es decir en (0, 0). Se garantiza que la longitud de un lado no 
superará 108. 
*/
package EjPlantillas;

public class EjPlantilla2 {
	static java.util.Scanner in;

	public static boolean casoDePrueba() {
		int x = in.nextInt(), y;
		if (x < 0)
			return false;
		else {
			y = in.nextInt();
			System.out.println(x * 2 + y * 2);
			return true;
		}
	} // casoDePrueba

	public static void main(String[] args) {
		in = new java.util.Scanner(System.in);
		while (casoDePrueba())
			;
	}
}
// main
