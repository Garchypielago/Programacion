package ejercicio1;

public class Ej_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = crearArrayAleatorio();
		int[] B = crearArrayAleatorio();
		
		System.out.println("---------Array 01---------");
		mostrarArray(A);
		System.out.println("\n");
		
		System.out.println("---------Array 02---------");
		mostrarArray(B);
		System.out.println("\n");
		
		mostrarArray(devolverComunes(A,B));


	}

	public static int[] crearArrayAleatorio() {
		int[] array = new int[(int) (Math.random() * 10 + 1)];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 20 + 1);
		}

		return array;
	}

	public static void mostrarArray(int[] numeros) {

		for (int i = 0; i < numeros.length; i++) {
			if (i != numeros.length - 1) {
				System.out.printf("%4s", numeros[i] + ",");
			} else {
				System.out.printf("%4s", numeros[i] + ".");
			}
		}

	}

	public static boolean incluido(int num, int[] numeros) {
		boolean incluido = false;

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == num)
				incluido = true;
		}

		return incluido;
	}
	
	public static boolean repetido(int num, int[] numeros) {
		boolean repetido = false;

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				if (i!=j && numeros[i]==numeros[j] && numeros[i]!=21 && numeros[i]!=22) {
					repetido = true;
				}
			}
			
		}

		return repetido;
	}

	public static int[] devolverComunes(int[] numeros1, int[] numeros2) {
		int contador = 0;
		
		for (int i = 0; i < numeros1.length; i++) {
			if (repetido(numeros1[i], numeros1)) {
				numeros1[i]=21;
			}
			for (int j = 0; j < numeros2.length; j++) {
				if (repetido(numeros2[j], numeros2)) {
					numeros2[j]=22;
				}
				if (numeros1[i] == numeros2[j]) {
					contador++;
				}
			}
		}

		int[] repetidos = new int[contador];
		int k=0;
		for (int i = 0; i < numeros1.length; i++) {
			for (int j = 0; j < numeros2.length; j++) {
				if (numeros1[i]==numeros2[j]) {
					repetidos[k]=numeros1[i];
					k++;
				}
			}
		}


		System.out.println("Hay " + contador + " iguales.\n");
		
		System.out.println("---------Array Repetidos---------");
		
		return repetidos;
	}


}
