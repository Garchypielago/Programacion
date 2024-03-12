package ArrayBidimensionales;

public class ejemplos {

	public static void main(String[] args) {
		int[][] m = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };

		for (int i = 0; i < m.length; i++) { // número de filas
			for (int j = 0; j < m[i].length; j++) // número de columnas de cada fila
				System.out.printf("%4d", m[i][j]);
			System.out.println();
		}

	}
}
