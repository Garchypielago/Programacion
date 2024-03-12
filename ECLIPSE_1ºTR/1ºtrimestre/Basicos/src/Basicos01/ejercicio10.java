package Basicos01;

import javax.swing.JOptionPane;

public class ejercicio10 {

	public static void main(String[] args) {
		String texto;
		int n, c, pares = 0, impares = 1;

		texto = JOptionPane.showInputDialog("Cuantos números vas a escribir");
		c = Integer.parseInt(texto);

		for (int i = 1; i <= c; i++) {
			texto = JOptionPane.showInputDialog("Escribe el " + i + " número:");
			n = Integer.parseInt(texto);

			if (n % 2 == 0) {
				pares += n;
			} else {
				impares *= n;
			}
		}
		
		JOptionPane.showMessageDialog(null, "La suma de los pares es: " + pares + ", y el producto de los impares: " + impares);

	}

}
