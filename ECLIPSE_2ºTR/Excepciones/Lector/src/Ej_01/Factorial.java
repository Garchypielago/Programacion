package Ej_01;

import java.util.*;
import lector.*;

public class Factorial {

	public static void comprobarFactorial(int num) throws ExceptNegativos {
		if (num < 0) {
			throw (new ExceptNegativos("Número negativo, no se puede realizar."));
		}
		// java.lang.NumberFormatException
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, salir = 0;
		String fin = null;

		Scanner sc = new Scanner(System.in);

		do {
			try {
				numero = Lector.leeInt(sc, "Escribe tu número, para salir escribir un caracter.");
				comprobarFactorial(numero);
				fin = String.valueOf(factorial(numero));
			} catch (ExceptNegativos Error) {
				fin = Error.getMessage();
			} catch (NumberFormatException error) {
				System.out.println("Fin del programa");
				salir++;
			}

		} while (salir == 0);
	}

	public static int factorial(int num) {
		int i = 1;
		for (int j = 0; j < num; j++) {
			i = i * (j + 1);
		}
		return i;
	}
//hola
}
