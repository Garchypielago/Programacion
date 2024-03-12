<<<<<<< HEAD
package ejercicios;

import javax.swing.JOptionPane;

public class ejercicio03 {

	public static void main(String[] args) {
		String texto, invertida;

		texto = JOptionPane.showInputDialog("Escribe un número entero");

		invertida = esCapicua(texto);

		JOptionPane.showInternalMessageDialog(null, invertida);

	}

	public static String esCapicua(String texto) {
		Character nc;
		String invertida = "";

		for (int j = 0; j < texto.length(); j++) {
			nc = texto.toLowerCase().charAt(j);

			invertida =  nc + invertida;
		}

		return invertida;
	}
}
=======
package ejercicios;

import javax.swing.JOptionPane;

public class ejercicio03 {

	public static void main(String[] args) {
		String texto, invertida;

		texto = JOptionPane.showInputDialog("Escribe un número entero");

		invertida = esCapicua(texto);

		JOptionPane.showInternalMessageDialog(null, invertida);

	}

	public static String esCapicua(String texto) {
		Character nc;
		String invertida = "";

		for (int j = 0; j < texto.length(); j++) {
			nc = texto.toLowerCase().charAt(j);

			invertida =  nc + invertida;
		}

		return invertida;
	}
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
