<<<<<<< HEAD
package ejercicios;

import javax.swing.JOptionPane;

public class ejercicio02 {

	public static void main(String[] args) {
		String texto, invertida;
		

		texto = JOptionPane.showInputDialog("Escribe un número entero");

		invertida = ejercicio03.esCapicua(texto);
		
		String capicua = (texto.equalsIgnoreCase(invertida)) ? "Si es capicua" : "No es capicua";

		JOptionPane.showInternalMessageDialog(null, capicua);

	}

}
=======
package ejercicios;

import javax.swing.JOptionPane;

public class ejercicio02 {

	public static void main(String[] args) {
		String texto, invertida;
		

		texto = JOptionPane.showInputDialog("Escribe un número entero");

		invertida = ejercicio03.esCapicua(texto);
		
		String capicua = (texto.equalsIgnoreCase(invertida)) ? "Si es capicua" : "No es capicua";

		JOptionPane.showInternalMessageDialog(null, capicua);

	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
