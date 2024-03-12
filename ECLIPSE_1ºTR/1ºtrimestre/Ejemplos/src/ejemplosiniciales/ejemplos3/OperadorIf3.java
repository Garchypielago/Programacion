package ejemplos3;

import java.util.*;

public class OperadorIf3 {

	public static void main(String[] args) {

		int num, resultado;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce un n\u00famero ");
		num = teclado.nextInt();

		resultado = (num % 2 == 0) ? num/2 : num*2;

		System.out.println("Resultado " + resultado);

		teclado.close();

	}

}
