package texto;

import java.io.*;

public class Ej6_1 {
	public static void main(String[] args) {
		String nom;
		double sum = 0;
		int cont = 0;
		BufferedReader br = null;
		final String FICHERO = "nombres.txt";

		try {
			br = new BufferedReader(new FileReader(FICHERO));

			/*
			 * nom=br.readLine(); while(nom!=null){ sum=sum+nom.length();
			 * System.out.println(nom+" longitud "+nom.length()); cont++; nom=br.readLine();
			 * }
			 */
			
			// mas compacto si lo hacemos asi:
			while ((nom = br.readLine()) != null) {
				sum = sum + nom.length();
				System.out.println(nom + " longitud " + nom.length());
				cont++;
			}

			System.out.println("La longitud media es " + sum / cont);

		} catch (Exception e) {
			System.out.println("ERROR DE LECTURA " + e);
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
