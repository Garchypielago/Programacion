package CalentamientoNavideno;

import java.util.Scanner;

public class Tutankamon661 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tam;

		do {
			String texto;
			tam = Integer.parseInt(sc.nextLine());
			
			String[][] objetos = new String[tam][3];

			for (int i = 0; i < tam; i++) {
				texto = sc.nextLine();
				String[] objeto = texto.split(" ");

				objetos[i] = objeto;
			}

			String[] ordenada = new String[tam];
			ordenada = ordenar(objetos);

			for (int i = 0; i < ordenada.length; i++) {
				if (i<ordenada.length-1)
					System.out.print(ordenada[i]+" ");
				if (i==ordenada.length-1)
					System.out.print(ordenada[i]+" ");
			}
		} while (tam > 0);
	}

	public static String[] objeto(String texto) {
		String[] objeto = texto.split(" ");
		for (int i = 0; i < objeto.length; i++) {
			objeto[i] = objeto[i].trim();
		}

		return objeto;
	}

	public static String[] ordenar(String[][] array) {
		int aux1 = 0, aux2 = 0, aux3 = 0;
		String[] ordenada = new String[array.length];
		int[] numeros = new int[array.length + 1];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {

				if (i > 0 && i < array.length - 1) {
					while (aux1 < Integer.parseInt(array[j][1]) && !ordenada[i - 1].equalsIgnoreCase(array[j][0])) {
						aux1 = Integer.parseInt(array[j][1]);
						aux2 = j;
						aux3 = Integer.parseInt(array[j][2]);
					}

					if (aux1 == Integer.parseInt(array[j][1])) {
						if (aux3 < Integer.parseInt(array[j][2])) {
							aux1 = Integer.parseInt(array[j][1]);
							aux2 = j;
							aux3 = Integer.parseInt(array[j][2]);
						} else if (aux3 == Integer.parseInt(array[j][2])) {
							for (int h = 0; aux3 != Integer.parseInt(array[j][2]); h++) {
								aux1 = Integer.parseInt(array[h][1]);
								aux2 = h;
								aux3 = Integer.parseInt(array[h][2]);
							}
						}

					}

				} else if (i == 0) {

					if (aux1 < Integer.parseInt(array[j][1])) {
						aux1 = Integer.parseInt(array[j][1]);
						aux2 = j;
						aux3 = Integer.parseInt(array[j][2]);
					} else if (aux1 == Integer.parseInt(array[j][1])) {
						if (aux3 > Integer.parseInt(array[j][2])) {
							aux1 = Integer.parseInt(array[j][1]);
							aux2 = j;
							aux3 = Integer.parseInt(array[j][2]);
						} else if (aux3 == Integer.parseInt(array[j][2])) {
							for (int h = 0; aux3 != Integer.parseInt(array[j][2]); h++) {
								aux1 = Integer.parseInt(array[h][1]);
								aux2 = h;
								aux3 = Integer.parseInt(array[h][2]);
							}
						}

					}

				} else {
					aux1 = Integer.parseInt(array[0][1]);
					if (aux1 > Integer.parseInt(array[j][1])) {
						aux1 = Integer.parseInt(array[j][1]);
						aux2 = j;
						aux3 = Integer.parseInt(array[j][2]);
					}
				}
			}
			ordenada[i] = array[aux2][0];
			numeros[i + 1] = Integer.parseInt(array[aux2][1]);
			array[aux2] = array[i];
			if (i == 0) {
				array[i] = array[1];
			}
			aux1 = 0;
			aux2 = 0;
			aux3 = 0;
		}

		return ordenada;
	}
}
