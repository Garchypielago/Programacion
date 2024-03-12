<<<<<<< HEAD
package Basicos01;

import javax.swing.JOptionPane;

public class ejercicio11 {

	public static void main(String[] args) {
		int n, mayor, menor, m, resto;
		String input;

		input = JOptionPane.showInputDialog("Escribe tu primer número:");
		n = Integer.parseInt(input);

		input = JOptionPane.showInputDialog("Escribe tu segundo número");
		m = Integer.parseInt(input);

		mayor = Math.max(n, m);
		menor = Math.min(n, m);

		resto = mayor % menor;

		while (resto != 0) {

			mayor = menor;
			menor = resto;

			resto = mayor % menor;

		}

		JOptionPane.showMessageDialog(null, "El MCD es: " + menor);
	}

}
=======
package Basicos01;

import javax.swing.JOptionPane;

public class ejercicio11 {

	public static void main(String[] args) {
		int n, mayor, menor, m, resto;
		String input;

		input = JOptionPane.showInputDialog("Escribe tu primer número:");
		n = Integer.parseInt(input);

		input = JOptionPane.showInputDialog("Escribe tu segundo número");
		m = Integer.parseInt(input);

		mayor = Math.max(n, m);
		menor = Math.min(n, m);

		resto = mayor % menor;

		while (resto != 0) {

			mayor = menor;
			menor = resto;

			resto = mayor % menor;

		}

		JOptionPane.showMessageDialog(null, "El MCD es: " + menor);
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
