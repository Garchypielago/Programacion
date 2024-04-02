package introduccion;

import java.io.IOException;

public class LecturaDeLinea {
	public static void main(String args[]) throws IOException {
		int c;
		int contador = 0;
		// Se lee hasta encontrar el fin de linea
		while ((c = System.in.read()) != '\n') {
			contador++;
			System.out.print((char) c);
		}
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(); // Se escribe el fin de linea
		System.err.println("Contados " + contador + " bytes/caracteres en total.");
	}

}
