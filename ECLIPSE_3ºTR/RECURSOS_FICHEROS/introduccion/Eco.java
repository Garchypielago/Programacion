package introduccion;

import java.io.*;
public class Eco {
	public static void main(String[] args) {
		BufferedReader entradaEstandar = new BufferedReader(
				new InputStreamReader(System.in));
		String mensaje = null;
		System.out.println("Introducir una linea de texto:");
		
		try {
			mensaje = entradaEstandar.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Introducido: " + mensaje );
		
		
	}
}
