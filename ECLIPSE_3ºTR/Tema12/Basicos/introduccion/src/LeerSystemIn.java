//NOTA:
//
// Salto de linea en MAC y LINUX \n
// Salto de linea en WINDOWS \r\n
//
package src;

import java.io.IOException;

// Ejemplo de lectura de lineas entrada esta�ndar caracter a caracter
// hasta completar una linea.  
public class LeerSystemIn {
	public static void main(String args[]) {
		int c;
		int contador = 0;
		try {
			// Asi leemos hasta introducir el caracter de fin de fichero
			// (Ctrl+Z)

			while ((c = System.in.read()) != -1) {
				contador++;
				// System.out.print(" " + contador + " ");
				System.out.print((char) c);
			}

			System.out.println(); // Se escribe el fin de linea
			System.err.println("Contados " + contador + " bytes en total.");
		} catch (IOException e) {
			System.out.println(e);
		}

	}
}