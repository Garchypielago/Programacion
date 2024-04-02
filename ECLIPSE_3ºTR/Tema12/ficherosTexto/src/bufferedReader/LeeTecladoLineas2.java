package bufferedReader;

import java.io.*;

public class LeeTecladoLineas2{
    public static void main(String arg[]){
    int c;
		try { 
			BufferedReader entradaEstandar = new BufferedReader(new InputStreamReader(System.in));
			System.out.println ("Introducir una linea de texto:");
			c = entradaEstandar.read();
			System.out.println ("Introducido: \"" + c + "\"");
			while (entradaEstandar.ready()) {	// Problemas para usarlo con readLine()			
				c = entradaEstandar.read();
				System.out.println ("Introducido: \"" + c + "\"");
				System.out.println ("Introducir una linea de texto:");
				
			}
			
		} catch (IOException e) {
			System.out.println(e);
		}
		// Lo que se hace en este ejemplo es similar a usar la clase Scanner
	}
}
