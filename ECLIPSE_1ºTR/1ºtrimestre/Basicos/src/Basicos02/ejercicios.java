package Basicos02;

import javax.swing.JOptionPane;

public class ejercicios {

	public static void main(String[] args) {
		String texto;

		// ej01
		System.out.println("-----------EJERCICIO 01-----------");

		ejercicio01();
		System.out.println();

		// ej02
		System.out.println("-----------EJERCICIO 02-----------");
		double ci, i;

		texto = JOptionPane.showInputDialog("Cual es tu capital inicial");
		ci = Integer.parseInt(texto);
		do {
			texto = JOptionPane.showInputDialog("Cual es tu tasa de interes mensual(entre 0. y 100");
			i = Integer.parseInt(texto);
		} while (i <= 0 || i > 100);

		System.out.println(
				"Tardaras " + interesCompuestoMensual(ci, i) + " meses en duplicar con tasa de " + (i / 100) + "%.");
		System.out.println();

		// ej03
		System.out.println("-----------EJERCICIO 03-----------");
		
		int ciudad;
		do {
			texto = JOptionPane.showInputDialog("Cuantas ciudades son(contando con la que se quiere alcanzar)");
			ciudad = Integer.parseInt(texto);
		} while (ciudad < 2);

		double[][] poblacion = new double[ciudad][2];

		for (int k = 0; k < poblacion.length; k++) {
			if(k==0) {
				texto = JOptionPane.showInputDialog("Cual es la población inicial de la ciudad que se quiere alcanzar" );
				poblacion[k][0] = Double.parseDouble(texto);
				texto = JOptionPane.showInputDialog("Y el crecimineto anual de la ciudad que se quiere alcanzar (entre 0 y 100)");
				poblacion[k][1] = Double.parseDouble(texto);
			} else {
				texto = JOptionPane.showInputDialog("Cual es la población inicial de la ciudad " + (k));
				poblacion[k][0] = Double.parseDouble(texto);
				texto = JOptionPane.showInputDialog("Y el crecimineto anual de la ciudad (entre 0 y 100)" + (k));
				poblacion[k][1] = Double.parseDouble(texto);
			}
		}
		
		
		
		
		

	}

	public static void ejercicio01() {
		int n = 2, s = n;

		do {
			System.out.println(n);
			n = n + 3;
			s = s + n;
			System.out.println(n);
			n = n + 2;
			s = s + n;
		} while (n <= 1800);
		System.out.println("La suma es de: " + s);
	}

	public static int interesCompuestoMensual(double ci, double i) {
		double cf = (2 * ci);
		int n = 1;
		i = i / 100;

		for (; cf > ci * (1 + i); n++) {
			ci = ci * (1 + i);
		}

		return n;
	}

	public static int interesCompuestoAnual(double ci, double i) {
		double cf = (2 * ci);
		int n = 1;
		i = i / 100;

		for (; cf > ci * (1 + i); n++) {
			ci = ci * (1 + i);
		}

		return n;
	}
	
	public static String[][] ciudades(double matriz[][]) {
		int superar= (int)(matriz[0][0]*matriz[0][1]), ciu=0;
		
		for (int i = 1; i < matriz.length; i++) {
				if ((int)(matriz[0][0])-(int)(matriz[i][0])<(int)(matriz[0][0]*matriz[0][1])-(int)(matriz[i][0]*matriz[i][1])) {
					ciu++;
				}
			
		}
		
		String[][] mayor = new String[ciu][2];
		
		for (int i = 0; i < mayor.length; i++) {
			for (int j=0; j < mayor[i].length; j++) {
				if (matriz[i][j]>superar) {
					ciu++;
				}
			}
		}
		
		
		
		
		return mayor;
	}

}
