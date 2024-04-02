package introduccion;

import java.io.*;

public class Teclado {
	/** variable de clase asignada a la entrada estandar del sistema */
	public static BufferedReader entrada = new BufferedReader(
			new InputStreamReader(System.in));

	/**
	 * Creamos la conexion con la entrada estandar
	 * 
	 */
	public static void crear() {
			entrada = new BufferedReader(
					new InputStreamReader(System.in));
	}
	
	/**
	 * lee una cadena desde la entrada estandar
	 * 
	 * @return cadena de tipo String
	 */
	public static String leerLinea() {
		String cadena = "";

		try {
			cadena = entrada.readLine();
		} catch (IOException e) {
			System.out.println("Error de E/S " + e);
		}
		
		return cadena;
	}

	/**
	 * lee un numero entero desde la entrada estandar
	 * 
	 * @return numero entero de tipo int
	 */
	public static int leerInt() {
		int entero = 0;
		boolean error = false;

		do {
			try {
				error = false;
				//entero = Integer.valueOf(entrada.readLine());
				entero = Integer.parseInt(entrada.readLine());
			} catch (NumberFormatException e1) {
				error = true;
				System.out.println(
						"Error en el formato del número, intentelo de nuevo.");
			} catch (IOException e) {
				System.out.println("Error de E/S " + e);
			} catch (Exception e) {
				System.out.println("Error de E/S " + e);
			}
		} while (error);

		return entero;
	}
	
	/**
	 * Cerramos la entrada estandar
	 * 
	 */
	public static void cerrar() {
		try {
			entrada.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
} // final de la clase Teclado
