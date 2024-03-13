package ejemplos2;

import java.util.Scanner;

public class Hexadecimal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// Nuestro programa va a convertir un decimal en hexadecimal de dos formas diferentes:
		System.out.print("Introduce un n�mero decimal: ");
		int decimal = teclado.nextInt();
		teclado.close();
		
		// 1� m�todo con toHexString 
		String hexadecimal = Integer.toHexString(decimal);
		System.out.printf("%nM�todo 1 -> Decimal: %d, Hexadecimal: %s", decimal, hexadecimal);
		
		// 2� m�todo con array
		char digitosH[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		String hexadecimal2 = "";
		int resto, aux = decimal;
		
		while(aux>0){
			resto = aux % 16;
			hexadecimal2 = digitosH[resto] + hexadecimal2;
			aux /= 16; 
		}
		
		System.out.printf("%n%nM�todo 2 -> Decimal: %d, Hexadecimal: %s", decimal, hexadecimal2);
	}
}