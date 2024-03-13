package ArrayBidimensionales;

import javax.swing.JOptionPane;

public class ejecicios {

	public static void main(String[] args) {

//		// ej01
//		System.out.println("-----------EJERCICIO 01-----------");
//		int[][] A = new int[4][4], B = new int[4][4];
//
//		A = aleatorizarMatriz(A, 0, 9);
//		B = aleatorizarMatriz(B, 0, 9);
//
//		System.out.println("--Matriz A------------------");
//		imprimirMatriz(A);
//
//		System.out.println("--Matriz B------------------");
//		imprimirMatriz(B);
//
//		System.out.println("--Matriz Suma---------------");
//		imprimirMatriz(sumarMatriz(A, B));
//
//		// ej02
//		System.out.println("\n-----------EJERCICIO 02-----------");
//		int[][] C = new int[4][5];
//		int n = (int) (Math.random() * 10);
//
//		C = aleatorizarMatriz(C, 0, 9);
//		imprimirPosicion(C, n);
//
//		// ej03
//		System.out.println("\n-----------EJERCICIO 03-----------");
//		int[][] D = new int[8][8], E;
//
//		System.out.println("--Matriz Inicial------------------");
//		D = aleatorizarMatriz(D, 0, 9);
//		imprimirMatriz(D);
//		System.out.println("--Matriz Copia------------------");
//		E = copiarMatriz(D);
//		imprimirMatriz(E);
//
//		// ej04
//		System.out.println("\n-----------EJERCICIO 04-----------");
//		int[][] F = new int[6][8];
//
//		F = aleatorizarMatriz(F, 1, 100);
//		imprimirMatriz(F);
//		System.out.println("\nEl valor maximo es: " + imprimirMaximo(F));
//		System.out.println("El valor minimo es: " + imprimirMinimo(F));
//
//		// ej05
//		System.out.println("\n-----------EJERCICIO 05-----------");
//		int[][] G = new int[5][5], H;
//		G = aleatorizarMatriz(G, 1, 5);
//		H = copiarMatriz(G);
//		System.out.println("--Matriz Inicial------------------");
//		imprimirMatriz(G);
//		System.out.println(
//				"--Matriz tras elevar al cuadrado los elementos situados por encima de la diagonal principal------------------");
//		imprimirMatriz(elevaEncimaDiagonal(H));
//		System.out.println("\nLa suma de los elementos situados por debajo de la diagonal principal es : "
//				+ sumarDebajaoDiagonal(H));
//		H = copiarMatriz(G);
//		System.out.println("\n--Matriz tras sumar 1 a los elementos de la diagonal principal------------------");
//		imprimirMatriz(sumarDiagonal(H));
//		H = copiarMatriz(G);
//		System.out.println("\n--Matriz tras multiplicar por 2 los elementos de la diagonal inversa.------------------");
//		imprimirMatriz(multiplicarDiagonalInversa(H));
//
//		// ej06
//		System.out.println("\n-----------EJERCICIO 06-----------");
//		int[][] I = new int[4][5];
//
//		aleatorizarMatriz(I, 0, 10);
//		sumarFila(I);
//
//		// ej07
//		System.out.println("\n-----------EJERCICIO 07-----------");
//		int[][] J = new int[5][5];
//		
//		aleatorizarMatriz(J, 0, 10);
//		System.out.println("--Matriz Inicial------------------");
//		imprimirMatriz(J);
//		System.out.println("--Matriz Transpuesta 1------------------");
//		imprimirMatriz(transponerMatriz1(J));
//		
//		int[][] K = new int[4][5];
//		
//		aleatorizarMatriz(K, 0, 10);
//		System.out.println("--Matriz Inicial------------------");
//		imprimirMatriz(K);
//		System.out.println("--Matriz Transpuesta 2------------------");
//		imprimirMatriz(transponerMatriz2(K));
//
//		// ej08
//		System.out.println("\n-----------EJERCICIO 08-----------");
//		int n;
//		String texto;
//
//		do {
//			texto = JOptionPane.showInputDialog("De cuantas presonas quieres guardar el nombre:");
//			n = Integer.parseInt(texto);
//		} while (n < 0);
//
//		String[] nombre = new String[n];
//		String[] ape1 = new String[n];
//		String[] ape2 = new String[n];
//
//		for (int i = 0; i < n; i++) {
//			texto = JOptionPane.showInputDialog((i + 1) + " nombre:");
//			nombre[i] = texto;
//
//			texto = JOptionPane.showInputDialog(nombre[i] + ", primer apellido:");
//			ape1[i] = texto;
//
//			texto = JOptionPane.showInputDialog(nombre[i] + " " + ape1[i] + ", segundo apellido:");
//			ape2[i] = texto;
//		}
//
//		String[] completo = new String[3];
//		for (int i = 0; i < n; i++) {
//			completo = unirNombres(nombre[i], ape1[i], ape2[i]);
//			for (int j = 0; j < 3; j++) {
//				System.out.print(completo[j] + " ");
//			}
//			System.out.println();
//		}
//
//		imprimirMatrizString(matrizNombres(nombre, ape1, ape2));

		// ej09
		System.out.println("\n-----------EJERCICIO 09-----------");

		int[][] EquipoAltura = new int[5][5];
		aleatorizarMatriz(EquipoAltura, 170, 220);

//		int[][] EquipoAltura= alturas(); //Esta es la forma correcta de hacerlo
		
		System.out.println("--Matriz Alturas------------------");
		System.out.println();
		imprimirEquipos(EquipoAltura);
		System.out.println();

		System.out.println("--Array de Medias------------------");
		for (int j = 0; j < alturaMedia(EquipoAltura).length; j++) {
			if (j == 0) {
				System.out.printf("%4s", "Equipo " + (j + 1) + ": ");
			} else {
				System.out.printf("%4s", ", Equipo " + (j + 1) + ": ");
			}
			System.out.print(alturaMedia(EquipoAltura)[j]);
		}
		System.out.println();
		System.out.println();
		System.out.println("--Array de Seleccion------------------");
		for (int j = 0; j < alturaMaxima(EquipoAltura).length; j++) {
			if (j == 0) {
				System.out.printf("%4s", jugadorAlto(EquipoAltura)[j] + ": ");
			} else {
				System.out.printf("%4s", ", " + jugadorAlto(EquipoAltura)[j] + ": ");
			}
			System.out.print(alturaMaxima(EquipoAltura)[j]);
		}

	}

	public static int columnasMatriz(int matriz[][]) {
		int j = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (; j < matriz[i].length; j++)
				;
		}
		return j;
	}

	public static int[][] aleatorizarMatriz(int matriz[][], int n1, int n2) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random() * (Math.max(n1, n2) - Math.min(n1, n2) + 1) + Math.min(n1, n2)); // maximo-min+1)+min
			}
		}
		return matriz;
	}

	public static void imprimirMatriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) { // número de filas
			for (int j = 0; j < matriz[i].length; j++) // número de columnas de cada fila
				System.out.printf("%4d", matriz[i][j]);
			System.out.println();
		}
	}

	public static int[][] sumarMatriz(int matrizA[][], int matrizB[][]) {
		int[][] matriz = new int[Math.max(matrizA.length, matrizB.length)][Math.max(columnasMatriz(matrizA),
				columnasMatriz(matrizB))];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (matrizA[i][j] + matrizB[i][j]);
			}
		}
		return matriz;
	}

	public static void imprimirPosicion(int matriz[][], int n) {
		for (int i = 0; i < matriz.length; i++) { // número de filas
			for (int j = 0; j < matriz[i].length; j++) // número de columnas de cada fila
				if (matriz[i][j] == n) {
					System.out.println("La posición de " + n + " en la matriz es: " + "[" + i + "]," + "[" + j + "].");
				}
		}
	}

	public static int[][] copiarMatriz(int matrizA[][]) {
		int[][] matriz = new int[matrizA.length][columnasMatriz(matrizA)];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = matrizA[i][j];
			}
		}
		return matriz;
	}

	public static int imprimirMaximo(int matriz[][]) {
		int n = matriz[0][0];
		for (int i = 0; i < matriz.length; i++) { // número de filas
			for (int j = 0; j < matriz[i].length; j++) // número de columnas de cada fila
				if (matriz[i][j] > n) {
					n = matriz[i][j];
				}
		}
		return n;
	}

	public static int imprimirMinimo(int matriz[][]) {
		int n = matriz[0][0];
		for (int i = 0; i < matriz.length; i++) { // número de filas
			for (int j = 0; j < matriz[i].length; j++) // número de columnas de cada fila
				if (matriz[i][j] < n) {
					n = matriz[i][j];
				}
		}
		return n;
	}

	public static int[][] elevaEncimaDiagonal(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) { // número de filas
			for (int j = 0; j < matriz[i].length; j++) // número de columnas de cada fila
				if (j >= i + 1) {
					matriz[i][j] = (int) Math.pow(matriz[i][j], 2);
				}
		}
		return matriz;
	}

	public static int sumarDebajaoDiagonal(int matriz[][]) {
		int n = 0;
		for (int i = 0; i < matriz.length; i++) { // número de filas
			for (int j = 0; j < matriz[i].length; j++) // número de columnas de cada fila
				if (j <= i - 1) {
					n = n + matriz[i][j];
				}
		}
		return n;
	}

	public static int[][] sumarDiagonal(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) { // número de filas
			for (int j = 0; j < matriz[i].length; j++) // número de columnas de cada fila
				if (j == i) {
					matriz[i][j] = matriz[i][j] + 1;
				}
		}
		return matriz;
	}

	public static int[][] multiplicarDiagonalInversa(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) { // número de filas
			for (int j = 0; j < matriz[i].length; j++) // número de columnas de cada fila
				if (j + i == matriz.length - 1) {
					matriz[i][j] = matriz[i][j] * 2;
				}
		}
		return matriz;
	}

	public static void sumarFila(int matriz[][]) {
		int fila = 0, filas = 0, columna = 0, columnas = 0;

		for (int i = 0; i < matriz.length; i++) { // número de filas
			for (int j = 0; j < matriz[i].length; j++) { // número de columnas de cada fila
				System.out.printf("%4d", matriz[i][j]);
				fila = fila + matriz[i][j];
			}
			System.out.printf("%4d", fila);
			System.out.println();
			filas = filas + fila;
			fila = 0;
		}

		for (int i = 0; i < columnasMatriz(matriz); i++) {
			for (int j = 0; j < matriz.length; j++) {
				columna = columna + matriz[j][i];
			}
			System.out.printf("%4d", columna);
			columnas = columnas + columna;
			columna = 0;
		}
		System.out.printf("%4d", (columnas + filas));
	}

	public static int[][] transponerMatriz2(int matriz[][]) {
		int[][] transpuesta = new int[columnasMatriz(matriz)][matriz.length];

		for (int i = 0; i < columnasMatriz(matriz); i++) {
			for (int j = 0; j < matriz.length; j++) {
				transpuesta[i][j] = matriz[j][i];
			}
		}
		return transpuesta;
	}

	public static int[][] transponerMatriz1(int matriz[][]) {

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++)
				if (j <= i - 1) {
					int n = 0;
					n = matriz[j][i];
					matriz[j][i] = matriz[i][j];
					matriz[i][j] = n;
				}
		}
		return matriz;
	}

	public static String[] unirNombres(String nombre, String ape1, String ape2) {
		String[] matriz = { nombre, ape1, ape2 };

		return matriz;
	}

	public static String[][] matrizNombres(String[] nombre, String[] ape1, String[] ape2) {
		String[][] matriz = new String[3][nombre.length];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == 0) {
					matriz[i][j] = nombre[j];
				} else if (i == 1) {
					matriz[i][j] = ape1[j];
				} else {
					matriz[i][j] = ape2[j];
				}
			}
		}

		return matriz;
	}

	public static void imprimirMatrizString(String matriz[][]) {
		for (int i = 0; i < matriz.length; i++) { // número de filas
			for (int j = 0; j < matriz[i].length; j++) { // número de columnas de cada fila
				System.out.printf("%4s", matriz[i][j]);
			}
			System.out.println();
		}
	}

	public static int[][] alturas() {
		int equipos, jugadores, altura;
		String texto;

		do {
			texto = JOptionPane.showInputDialog("Cuantos equipos juegan (deben ser mas de 1):");
			equipos = Integer.parseInt(texto);
		} while (equipos < 2);
		do {
			texto = JOptionPane.showInputDialog("Cuantos jugadores tienen (deben ser mas de 4):");
			jugadores = Integer.parseInt(texto);
		} while (jugadores < 5);

		int[][] EquipoAltura = new int[equipos][jugadores];

		for (int i = 0; i < equipos; i++) {
			for (int j = 0; j < jugadores; j++) {
				texto = JOptionPane.showInputDialog("Altura del jugador " + (j + 1) + " del equipo " + (i + 1));
				altura = Integer.parseInt(texto);
				EquipoAltura[i][j] = altura;
			}
		}

		return EquipoAltura;
	}

	public static int[] alturaMedia(int matriz[][]) {
		int[] medias = new int[matriz.length];

		int alturas = 0, media = 0;

		for (int i = 0, n = 1; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++, n++) {
				alturas = alturas + matriz[i][j];
			}
			media = alturas / n;
			medias[i] = media;
			media = 0;
		}
		return medias;
	}

	public static int[] alturaMaxima(int matriz[][]) {
		int[] seleccion = new int[matriz.length];

		int altura = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (altura < matriz[i][j]) {
					altura = matriz[i][j];
				}
			}
			seleccion[i] = altura;
			altura = 0;
		}
		return seleccion;
	}

	public static String[] jugadorAlto(int matriz[][]) {
		String[] seleccion = new String[matriz.length];

		int altura = 0, a = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (altura < matriz[i][j]) {
					altura = matriz[i][j];
					if (altura == matriz[i][j]) {
						a = j;
					}
				}
			}
			seleccion[i] = "E" + (i + 1) + ",J" + (a + 1);
			altura = 0;
			a = 0;
		}
		return seleccion;
	}

	public static void imprimirEquipos(int matriz[][]) {

		String formato = "%" + ("Equipo00".length()+4) + "s";

		for (int j = 0; j < columnasMatriz(matriz); j++) {
			if (j == 0) {
				System.out.printf(formato, "J" + (j + 1));
			} else {
				System.out.printf("%4s", "J" + (j + 1));
			}

		}
		System.out.println();

		for (int i = 0; i < matriz.length; i++) { // número de filas
			if (i < 10) {
				System.out.printf("%4s", "Equipo0" + (i + 1));
			} else {
				System.out.printf("%4s", "Equipo" + (i + 1));
			}
			for (int j = 0; j < matriz[i].length; j++) { // número de columnas de cada fila
				System.out.printf("%4d", matriz[i][j]);
			}
			System.out.println();
		}
	}
}
