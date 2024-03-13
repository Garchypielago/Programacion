package ejercicios01;

import javax.swing.JOptionPane;

public class ejercicio04_05 {

	public static void main(String[] args) {
		int[] A = new int[10];
		int n;
		String texto;

		for (int i = 0; i < A.length; i++) {
			texto = JOptionPane.showInputDialog("Escribe tu " + (i + 1) + " número:");
			n = Integer.parseInt(texto);
			A[i] = n;
		}

		//copmrueba si los ha cogido bn
		System.out.println(A[0] + ", " + A[1] + ", " + A[2] + ", " + A[3] + ", " + A[4] + ", " + A[5] + ", " + A[6]
				+ ", " + A[7] + ", " + A[8] + ", " + A[9]);

		//ej4 Medias de positivos y negativos
		int po = 0, ne = 0;
		double  mediap = 0, median = 0, negativos = 0, positivos = 0;

		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0) {
				positivos = positivos + A[i];
				po++;
			} else if (A[i] < 0) {
				negativos = negativos + A[i];
				ne++;
			}
		}

		mediap = (double) (positivos / po);
		median = (double) (negativos / ne);

		System.out.println(mediap);
		System.out.println(median);
		
		//ej5 medias de posiciones pares
		double pares=0,par=0, mediapar=0;

		for (int i = 0; i < A.length; i++) {
			if (i%2==0){
				pares = pares + A[i];
				par++;
			}
		}
		mediapar=pares/par;
		System.out.println(mediapar);
		
	}
}
