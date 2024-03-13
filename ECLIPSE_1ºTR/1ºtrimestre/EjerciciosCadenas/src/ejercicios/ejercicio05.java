package ejercicios;

import javax.swing.JOptionPane;

public class ejercicio05 {

	public static void main(String[] args) {
		String texto1, texto2;
		int i = 0;

		texto1 = JOptionPane.showInputDialog("Escribe la cadena en la que buscará: ");
		texto2 = JOptionPane.showInputDialog("Escribe la cadena que se buscará: ");

		int pos = texto1.indexOf(texto2);

		while (pos != -1) {
			i++;
			texto1 = texto1.replaceFirst(texto2, "");
			pos = texto1.indexOf(texto2);
		}

		JOptionPane.showInternalMessageDialog(null, i);

	}
}
