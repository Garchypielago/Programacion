/*
 * Esquema 1: número de casos al principio
 * En este esquema de la entrada, el programa recibe un número inicial que indica cuantos casos 
 * de prueba deben procesarse. Es el esquema más sencillo. En el programa principal se lee ese 
 * número, y se realiza un bucle que repite el proceso tantas veces como se haya solicitado. 
 * Se usa, por ejemplo, en el problema 117 La fiesta aburrida o 216 Goteras. 
 */
// https://aceptaelreto.com/doc/firstproblem.php
// Ejercicio 595 acepta el reto
package EjPlantillas;

 public class EjPlantilla1 {
	static java.util.Scanner in;

    public static void casoDePrueba() {     
    	int numProblema = in.nextInt();
    	System.out.println(numProblema/100);
    } // casoDePrueba

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    } // main
} //
