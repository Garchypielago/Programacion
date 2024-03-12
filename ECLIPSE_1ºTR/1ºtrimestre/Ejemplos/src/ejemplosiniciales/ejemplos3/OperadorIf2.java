package ejemplos3;

import java.util.*;

public class OperadorIf2 {

	public static void main(String[] args) {
		String mensaje;
		int num;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce un n\u00famero ");
		num = teclado.nextInt();

		mensaje = (num >= 0) ? "Positivo" : "Negativo";

		System.out.println("Has introducido un n\u00famero " + mensaje);

		teclado.close();

	}

}
