import java.util.InputMismatchException;
import java.util.Scanner;

public class MainBucle {
	public static void main(String[] args) {
		// instancia a scanner
		Scanner entrada = new Scanner(System.in);
		// entero en el que se almacenara la edad
		int edad;
		boolean repetir = true;// bandera para indicar cuando el bucle debe terminar 
		
		// condicional para repetir la solicitud de edad
		while (repetir) {
			System.out.println("introduce edad");
			/*
			 * try catch para almacenar una excepcion en caso de que se introdusca una
			 * cadena
			 */
			try {
				edad = Integer.parseInt(entrada.nextLine());
				repetir = false;// cambiamos el valor de la bandera a false para que no se vuelva a repetir ya
								// que no se produjo una exception, recibiendo solo numeros
			} catch (NumberFormatException e) {				
				System.out.println("error ->" + e.toString());
			} catch (InputMismatchException e) {	//solo saltaria si hiciera nextInt() para leer	
				System.out.println("error ->" + e.toString());
			} // cierre del try catch
		} // cierre del while

		entrada.close();
	}// cierra metodo main
}
