package ejercicios;

import javax.swing.JOptionPane;

public class ejercicio04 {
	
	public static void main(String[] args) {
		String texto, invertida1="", espejocon;
		Character nc;

		texto = JOptionPane.showInputDialog("Escribe una sentencia");
		

		for (int j = 0; j < (texto.length()-1); j++) {
			nc = texto.toLowerCase().charAt(j);

			invertida1 =  nc + invertida1;
		}
		
		espejocon = texto + invertida1;

		JOptionPane.showInternalMessageDialog(null, espejocon);

	}
}
