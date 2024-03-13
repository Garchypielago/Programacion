package Basicos01;

import javax.swing.JOptionPane;

public class ejercicio12 {

	public static void main(String[] args) {
		int n, a, r, suma;
		String input;
		
		input = JOptionPane.showInputDialog("Introduce el número de términos:");
		n = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("Introduce el primer término:");
		a = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("Introduce la razón:");
		r = Integer.parseInt(input);
		
		suma = a;
		
		for (int i=1; i<n; i++) {
			a *= r;
			suma += a;
		}
		
		JOptionPane.showMessageDialog(null, "La suma de los términos de la serie es " + suma);

	}

}
