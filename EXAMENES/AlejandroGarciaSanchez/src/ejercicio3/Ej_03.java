package ejercicio3;

import javax.swing.JOptionPane;

public class Ej_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int filas, columnas = 0;
		String input;

		do {
			input = JOptionPane.showInputDialog("De cuantas filas quieres la matriz (escribe 0 para finalizar)");
			filas = Integer.parseInt(input);

			if (filas != 0) {
				input = JOptionPane.showInputDialog("De cuantas columnas quieres la matriz (escribe 0 para finalizar)");
				columnas = Integer.parseInt(input);
			}
			if (filas != columnas) {
				JOptionPane.showMessageDialog(null, "La matriz debe ser cuadrada");
			}
		} while (filas != columnas);

		System.out.println("-----------Matriz Creada-----------");
		
		mostrarMatrizAst(crearMatrizAst(filas,columnas));
		
	}

	public static char[][] crearMatrizAst(int filas, int columnas) {
		char[][] matriz = new char[filas][columnas];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i!=j) {
					matriz[i][j]='-';
				} else {
					matriz[i][j]='*';
				}
			}
		}

		return matriz;
	}
	
	public static void mostrarMatrizAst(char[][]m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("%3s", m[i][j]);
			}
			System.out.println();
		}
	}

}
