package ejercicios01;

import javax.swing.JOptionPane;

public class ejercicio07 {

	public static void main(String[] args) {
		int cantidad;
		double nota;
		String texto, nombre;

		//pregunto por la cantidad de variables de los array
		do {
			texto = JOptionPane.showInputDialog("Escribe el número de notas/alumnos");
			cantidad = Integer.parseInt(texto);
		} while (cantidad <= 0);

		//inicio los array
		double[] notas = new double[cantidad];
		String[] alumnos = new String[cantidad];
		String[] aprobados = new String[cantidad];
		
		//doy los valores de los array
		for (int i = 0; i < cantidad; i++) {
			
			//aqui doy valores al array de los nombres
			nombre = JOptionPane.showInputDialog("Escribe el nombre del " + (i + 1) + " alumno");
			alumnos[i] = nombre;
			
			//aqui doy valor al array de las notas
			do {
				texto = JOptionPane.showInputDialog("Escribe la nota de " + alumnos[i]);
				nota = Double.parseDouble(texto);
			} while (nota < 0 || nota > 10);
			notas[i] = nota;
			
			//aqui doy valor al array de los aprobados
			if (notas[i] >= 9) {
				aprobados[i] = "sobresaliente";
			} else if (notas[i] < 9 && notas[i] >= 7) {
				aprobados[i] = "notable";
			} else if (notas[i] < 7 && notas[i] >= 5) {
				aprobados[i] = "bien";
			} else {
				aprobados[i] = "suspenso";
			}
		}
		
		//imprimo los array en sentencia
		for (int t = 0; t < cantidad; t++) {
			System.out.println(alumnos[t] + " -> " + notas[t] + " : " + aprobados[t]);
		}

	}

}
