package Basicos01;

import javax.swing.JOptionPane;

public class ejercicio13 {

	public static void main(String[] args) {
		int n, suma = 0;
		String input, perfect;

		do {

			input = JOptionPane.showInputDialog("Escribe tu número para ssaber si es perfecto");
			n = Integer.parseInt(input);

			if (n != 0) {
				for (int i = 1; i < (n / 2) + 1; i++) {
					if (n % i == 0) {
						suma = suma + i;
					}
				}

				perfect = (n - suma == 0) ? ("El número es perfecto") : ("Vaya el número no es perfecto");
				suma = 0;

				JOptionPane.showMessageDialog(null, perfect);
			} else {
				JOptionPane.showMessageDialog(null, "Fin del programa");
			}
		} while (n != 0);

	}

}
